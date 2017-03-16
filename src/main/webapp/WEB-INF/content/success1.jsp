<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>注册成功</title>
</head>
<body>

<h3>测试表单数据格式化</h3>
<form:form modelAttribute="data" method="post" action="">
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<td>日期类型：</td>
			<td><form:input path="birthday"/></td>
		</tr>
		<tr>
			<td>整数类型：</td>
			<td><form:input path="total"/></td>
		</tr>
		<tr>
			<td>百分数类型：</td>
			<td><form:input path="discount"/></td>
		</tr>
		<tr>
			<td>货币类型：</td>
			<td><form:input path="money"/></td>
		</tr>
	</table>
</form:form>

</body>
</html>