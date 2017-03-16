<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>注册成功</title>
</head>
<body>
<h3>JSR 303 校验测试</h3>
<div>登录名：${requestScope.customer.loginname}</div>
<div>密码：${requestScope.customer.password}</div>
<div>用户名：${requestScope.customer.username}</div>
<div>年龄：${requestScope.customer.age}</div>
<div>邮箱：${requestScope.customer.email}</div>
<div>电话：${requestScope.customer.phone}</div>
<div>生日：<fmt:formatDate value="${requestScope.customer.birthday}" pattern="yyyy年MM月dd日"/></div>
</body>
</html>