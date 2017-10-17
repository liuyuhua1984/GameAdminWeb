<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<%@include file="sys/header.jsp"%>
<%@include file="sys/navibar.jsp"%>
<%@include file="sys/sidebar.jsp"%>
<!-- 
<div class="btn-toolbar" style="margin-bottom:2px;">
	<a href="${ctxPage}/noticeboard/add_view" class="btn btn-primary">
		<i class="icon-plus"></i>
		添加公告
	</a>
</div>
 -->
<div class="block">
	<a href="#page-stats" class="block-heading" data-toggle="collapse">${page_title}</a>
	<div id="page-stats" class="block-body collapse in">
		<table class="table table-striped table-bordered table-condensed">
			<thead>
				<tr>

					<th style="width :100px">代理ID</th>
					<th style="width :140px">代理名称</th>
					<th style="width :100px">电话</th>
					<th style="width :100px">邀请码</th>
					<th style="width :100px">代理等级</th>
					<th style="width :100px">上级代理</th>
					<th style="width :100px">房卡</th>
					<th style="width :100px">银行卡</th>
					<th style="width :100px">注册时间</th>
					<th style="width :30px">操作</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${list}" var="item">
					<tr>

						<td>${item.id}</td>
						<td>
							[
							<a href="${ctxPage}/proxy/see_sub_proxyt?id=${item.id}">查看下级代理</a>
							] ${item.userName}
						</td>
						<td>${item.mobile}</td>
						<td>${item.inviteCode}</td>
						<td>${item.proxyLevel}</td>
						<td>${item.fatherName}</td>
						<td>${item.remainMoney}</td>
						<td>${item.bank}</td>
						<td>${item.fatherName}</td>
						<td>
							<fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />
						</td>
						<td>
							<c:if test="${ !empty name}">
								<a href="${ctxPage}/proxy/recharge_sub_proxy?id=${item.id} &myName=name">充值</a>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<!--- START 分页模板 --->
		${pages}
		<!--- END --->
	</div>
</div>

<%@include file="sys/footer.jsp"%>