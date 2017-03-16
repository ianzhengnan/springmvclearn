<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Person Register</title>
</head>
<body>
<h3>注册页面</h3>
<form action="register" method="post">
	<table>
		<tr>
			<td><label>登录名：</label></td>
			<td><input type="text" id="loginname" name="loginname"></td>
		</tr>
		<tr>
			<td><label>生日：</label></td>
			<td><input type="text" id="birthday" name="birthday"></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册"></td>
		</tr>
	</table>
</form>
</body>
</html>