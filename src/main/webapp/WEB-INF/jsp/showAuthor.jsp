<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ui.jqgrid.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/grid.locale-en.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.jqGrid.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>
</head>
<body>
	<div>
		<a href="reg.form" target="_blank">注册作者</a><br />
	</div>
	<table id="myTable"></table>
	<div id="pager"></div>

	<script type="text/javascript">
		$(document).ready(function() {
			var operateFormat = function(cellValue, options, rowData){
				console.log(rowData);
				console.log(cellValue);
				console.log(options);
				return '<a href="javascript:">编辑</a><a href="javascript:">删除</a>';
			};
			jQuery("#myTable").jqGrid({
				url: 'getAuthorPageList.form',//请求数据的地址
				datatype: "json",
			   	colNames: ['操作','Id','姓名','性别', '出生日', '手机号'],
				//jqgrid主要通过下面的索引信息与后台传过来的值对应
			   	colModel: [
			   		{name:'operate',sortable: false,width:50,formatter: operateFormat},
			   		{name:'id',index:'id', width:50},
			   		{name:'username',index:'username', width:100},
			   		{name:'sex',index:'sex', width:100},
			   		{name:'birthday',index:'birthday', width:100},
			   		{name:'phone',index:'phone', width:100}
			      	],
			   	caption: "我是jqgrid的标题",
				rowNum: 10,
			    rowList: [ 10, 20, 30 ],
			    pager: 'pager',
			    sortname: 'id',
			    recordpos: 'right',
			    height: 300,
			    multiselect: true,
			    viewrecords: true,
			    sortable: true
			});
		});
	</script>
</body>
</html>