<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>注册成功</title>
</head>
<body>
<div>登录名：${requestScope.person.loginname}</div>
<div>生日：<fmt:formatDate value="${requestScope.person.birthday}" pattern="yyyy年MM月dd日"/></div>
</body>
</html>