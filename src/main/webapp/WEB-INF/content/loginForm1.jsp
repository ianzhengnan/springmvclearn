<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>loginForm1</title>
</head>
<body>
<h3>测试@ModelAttribute(value="")注释返回具体类的方法</h3>
<form action="login1" method="post">
	<table>
		<tr>
			<td><label>登录名：</label></td>
			<td><input type="text" id="loginname" name="loginname"></td>
		</tr>
		<tr>
			<td><input type="submit" id="submit" value="登录"></td>
		</tr>
	</table>
</form>
</body>
</html>