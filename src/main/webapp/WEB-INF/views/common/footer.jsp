<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	request.setCharacterEncoding("utf-8");
%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	p{
		font-size:20px;
		text-align:center;
	}
</style>
<title>하단 부분</title>
</head>
<body>
	<p>e-mail:admin@test.com</p>
	<p>회사주소:서울시 강동구</p>
	<p>찾아오는 길:<a href="#">약도</a></p>
</body>
</html>