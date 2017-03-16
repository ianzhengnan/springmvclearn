<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>用户：${ requestScope.user.username }</title>
</head>
<body>
<h2>登录名： ${ requestScope.user.loginname } <br></h2>
<h2>密码： ${ requestScope.user.password } <br></h2>
<h2>姓名： ${ requestScope.user.username } <br></h2>

</body>
</html>