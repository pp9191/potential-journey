<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>

<body>
<h2>注册作者</h2>
<form:form modelAttribute="author" action="regAuthor.form" method="post">

	<form:errors path="*" element="div" cssClass="error"></form:errors>
	<p>姓名：<input type="text" name="username" /></p>
	<p>密码：<input type="password" name="password" /></p>
	<p>性别：<input type="radio" name="sex" value="男" />男 &nbsp;&nbsp;<input type="radio" name="sex" value="女" /></p>
	<p>年龄：<input type="number" name="age" /></p>
	<p>手机号：<input type="text" name="phone" /></p>
	<p>邮箱：<input type="text" name="email" /></p>
	<p>地址：<input type="text" name="address" /></p>
	<p><input type="submit" value="提交"/></p>
	
</form:form>
</body>
</html>