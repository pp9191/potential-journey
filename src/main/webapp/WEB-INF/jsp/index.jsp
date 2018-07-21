<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello World!</h2>
	<c:if test="${empty author}">
		<a href="author/reg.form">注册作者</a><br />
	</c:if>
	<a href="baidu.form">百度一下</a>
	<p>${author.username}</p>
	<p>${author.phone}</p>
	<p>${author.email}</p>
	<p>${author.address}</p>
</body>
</html>