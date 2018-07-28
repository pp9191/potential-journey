<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>
<form:form modelAttribute="author" action="logAuthor.form">
	<form:errors path="*" cssStyle="color:red;" element="div"></form:errors>
	<p>姓名：<form:input path="username" /></p>
	<p>密码：<form:password path="password" /></p>
	<p><input type="submit" value="登陆"/></p>
</form:form>
</body>
</html>