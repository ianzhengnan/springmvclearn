<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>JSR 303 校验</title>
</head>
<body>
<h3>JSR 303 校验测试--注册页面</h3>
<form:form modelAttribute="customer" method="post" action="register">
	<table>
		<tr>
			<td>登录名：</td>
			<td><form:input path="loginname"/></td>
			<td><form:errors path="loginname" cssStyle="color: red;"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><form:input path="password"/></td>
			<td><form:errors path="password" cssStyle="color: red;"/></td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><form:input path="username"/></td>
			<td><form:errors path="username" cssStyle="color: red;"/></td>
		</tr>
		<tr>
			<td>年龄：</td>
			<td><form:input path="age"/></td>
			<td><form:errors path="age" cssStyle="color: red;"/></td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td><form:input path="email"/></td>
			<td><form:errors path="email" cssStyle="color: red;"/></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><form:input path="birthday"/></td>
			<td><form:errors path="birthday" cssStyle="color: red;"/></td>
		</tr>
		<tr>
			<td>电话：</td>
			<td><form:input path="phone"/></td>
			<td><form:errors path="phone" cssStyle="color: red;"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
		</tr>
	</table>
</form:form>
</body>
</html>