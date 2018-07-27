<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/My97DatePicker/WdatePicker.js"></script>
<%-- <link href="${pageContext.request.contextPath}/My97DatePicker/skin/WdatePicker.css" rel="stylesheet" type="text/css"> --%>
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
	<p>姓名：<form:input path="username" /></p>
	<p>密码：<form:password path="password"/></p>
	<p>性别：<form:radiobutton path="sex" value="男"/>男<form:radiobutton path="sex" value="女"/>女</p>
	<p>生日：<input type="text" name="birthday" class="Wdate" onclick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd'})" /></p>
	<p>手机号：<form:input path="phone" /></p>
	<p>邮箱：<form:input path="email" /></p>
	<p>地址：<form:input path="address" /></p>
	<p><input type="submit" value="提交"/></p>
	
</form:form>
</body>
</html>