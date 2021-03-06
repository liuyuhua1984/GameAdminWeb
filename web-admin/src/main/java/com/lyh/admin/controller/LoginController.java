package com.lyh.admin.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyh.admin.controller.sys.MessageController;
import com.lyh.admin.entity.ShiroSysUser;
import com.lyh.admin.service.OsaUserService;
import com.lyh.admin.shiro.UsernamePasswordLoginToken;

/**
 * ClassName:LoginController <br/>
 * TODO: Date: 2017年10月5日 下午3:48:53 <br/>
 * 
 * @author lyh
 * @version
 */
@Controller
public class LoginController extends BaseController {
	
	/**
	 * login:(). <br/>
	 * TODO().<br/>
	 * 
	 * @author lyh
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpSession session, HttpServletRequest request, Model model) throws Exception {
		// 如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
		// String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		// if (exceptionClassName !=null){
		// if (exceptionClassName.equals("randomCodeError")){
		// throw new MyWebException("验证码错误!");
		// }
		// }
		// //根据shiro返回的异常类路径判断，抛出指定异常信息
		// if(exceptionClassName!=null){
		// if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
		// //最终会抛给异常处理器
		// throw new MyWebException("账号不存在");
		// } else if (IncorrectCredentialsException.class.getName().equals(
		// exceptionClassName)) {
		// throw new MyWebException("用户名/密码错误");
		// } else if("randomCodeError".equals(exceptionClassName)){
		// throw new MyWebException("验证码错误 ");
		// }else {
		// throw new Exception();//最终在异常处理器生成未知错误
		// }
		// }
		// 取出session的验证码（正确的验证码）
		// String validateCode = (String) session.getAttribute("validateCode");
		
		// 取出页面的验证码
		// 输入的验证和session中的验证进行对比
		// String randomcode = request.getParameter("verify_code");
		// if (randomcode != null && validateCode != null && randomcode.equals(validateCode)) {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		boolean rememberMe = request.getParameter("rememberMe") == null ? false : true;
		String ip = getIpAddr(request);
		Subject currentUser = SecurityUtils.getSubject();
		
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordLoginToken token = new UsernamePasswordLoginToken(userName, password, rememberMe, ip, "1");
			try {
				currentUser.login(token);
				ShiroSysUser.getShiroSubject().getOsaUser().setLoginIp(ip);
				userService.update(ShiroSysUser.getShiroSubject().getOsaUser());
				// session.setAttribute("sysUser", currentUser.getPrincipal());
			} catch (AuthenticationException e) {
				
				String exceptionClassName = e.getMessage();
				// (String) request.getAttribute("shiroLoginFailure");
				logger.error("登录错误:" + exceptionClassName);
				if (exceptionClassName.equals("null")) {
					return MessageController.exitWithMsg(null, "查无此人", "登录", "/index", 3, model);
				} else if (exceptionClassName.equals("user")) {
					return MessageController.exitWithMsg(null, "查无此人!", "登录", "/index", 3, model);
				} else if (exceptionClassName.equals("password")) {
					return MessageController.exitWithMsg(null, "密码有问题!", "登录", "/index", 3, model);
				} else if (exceptionClassName.equals("status")) {
					return MessageController.exitWithMsg(null, "此用户被禁!", "登录", "/index", 3, model);
				}
			}
		}
		
		// 此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
		// 登陆失败还到login页面
		return "redirect:/index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request) {
		Subject currentUser = SecurityUtils.getSubject();
		if (currentUser.isAuthenticated()) {
			currentUser.logout();
			request.removeAttribute("sysUser");
		}
		return "redirect:/index";
	}
}
