<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
</head>
<body>
<h3>注册页面</h3>
<form:form modelAttribute="user" method="post" action="register">
	<table>
		<tr>
			<td><label>登录名：</label></td>
			<td><form:input path="loginname"/></td>
			<td><font color="red"><form:errors path="loginname"/></font></td>
		</tr>
		<tr>
			<td><label>密码：</label></td>
			<td><form:password path="password"/></td>
			<td><font color="red"><form:errors path="password"/></font></td>
		</tr>
		<tr>
			<td><label>姓名：</label></td>
			<td><form:input path="username" /></td>
			<td><font color="red"><form:errors path="username"/></font></td>
		</tr>
		<tr>
			<td><input type="submit" id="submit" value="注册"></td>
		</tr>
	</table>
</form:form>


<%-- <form action="register" method="post">
	<table>
		<tr>
			<td><label>登录名：</label></td>
			<td><input type="text" id="loginname" name="loginname"></td>
		</tr>
		<tr>
			<td><label>密码：</label></td>
			<td><input type="password" id="password" name="password"></td>
		</tr>
		<tr>
			<td><label>姓名：</label></td>
			<td><input type="text" id="username" name="username"></td>
		</tr>
		<tr>
			<td><input type="submit" id="submit" value="注册"></td>
		</tr>
	</table>
</form> --%>
</body>
</html>