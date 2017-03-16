<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Convert JSON</title>
<script src="js/jquery-1.11.0.min.js"></script>
<!-- <script src="js/json2.js"></script> -->
<script>

$(document).ready(function(){
	testRequestBody();
	getRequestBody();
});

function testRequestBody(){
	$.ajax("${pageContext.request.contextPath}/json/testRequestBody",{ // 发送请求的URL字符串。
		dataType: "json", // 预期服务器返回的数据类型。
		type: "post", //  请求方式 POST或GET
		contentType: "application/json", //  发送信息至服务器时的内容编码类型
		data: JSON.stringify({id:1, name:"Spring MVC企业应用实战"}),
		async: true,
		success: function(data){ // 请求成功后的回调函数。
			console.log(data);
			$("#id").html(data.id);
			$("#name").html(data.name);
			$("#author").html(data.author);
		},
		error: function(){  // 请求出错时调用的函数
			alert("数据发送失败！")
		}
	});
}

function getRequestBody() {
	$.post("${pageContext.request.contextPath}/json/getRequestBody", null, function(data){
		$.each(data, function(){
			var tr = $("<tr align='center'/>");
			$("<td/>").html(this.id).appendTo(tr);
			$("<td/>").html(this.name).appendTo(tr);
			$("<td/>").html(this.author).appendTo(tr);
			$("#booktable").append(tr);
		});
	}, "json");
}

</script>
</head>

<body>
编号： <span id="id"></span><br>
书名： <span id="name"></span><br>
作者： <span id="author"></span><br>

<br>

<table id="booktable" border="1" style="border-collapse: collapse;">
	<tr align="center">
		<th>编号</th>
		<th>书名</th>
		<th>作者</th>
	</tr>
</table>

</body>
</html>