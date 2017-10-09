<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:choose>
 <c:when test="${sidebarStatus == 'yes' }">
   <body id="body" class="body">
 </c:when>
	<c:otherwise>
	  <body id="body" class="body-fullscreen">
	</c:otherwise>

</c:choose>

 
  <!--<![endif]-->
<div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                        <!--
                    <if condition="$sidebarStatus == 'yes'" >
						<li class="doSidebarClz"><a href="#" class="hidden-phone visible-tablet visible-desktop" role="button">
						关闭侧栏<i class="icon-step-backward"></i>
						</a></li>
					<else />
						<li class="doSidebarClz"><a href="#" class="hidden-phone visible-tablet visible-desktop" role="button">
						打开侧栏<i class="icon-step-forward"></i>
						</a></li>
					</if>
					 
					<if condition = "isset($user_info.setting)">
                    <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
							<i class="icon-cog"></i>设置<i class="icon-caret-down"></i>
						</a>
                        <ul class="dropdown-menu">
                            <li><a href="_ADMIN_/panel/setting.php">系统设置</a></li>
                        </ul>
                    </li>
					</if>
					
					<li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
							
                            选择模板
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
							<volist name="osa_templates" key='key' id='name'>
                            <li><a href="_ADMIN_/panel/set.php?t=<{$key}>"><{$name}></a></li>
							</volist>
                        </ul>
                    </li>
					-->
					<li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> ${user_info.user_name}
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                           <!-- <li><a tabindex="-1" href="_ADMIN_/panel/profile">我的账号</a></li>-->
                            <li><a tabindex="1" href="${ctxPage}/logOut">登出</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand" href="${ctxPage}/index"><span class="first"></span> <span class="second"><{$Think.config.COMPANY_NAME}></span></a>
        </div>
</div>