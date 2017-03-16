<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>所有用户</title>
</head>
<body>
<h3>所有用户：</h3>

<table border="1">
	<tr>
		<th>登录名</th>
		<th>密码</th>
		<th>姓名</th>
	</tr>
	<c:forEach items="${ requestScope.users }" var="user">
		<tr>
			<td>${ user.loginname }</td>
			<td>${ user.password }</td>
			<td>${ user.username }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>