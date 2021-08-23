<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Hello</title>
	</head>
	<body>
		<h1>${titulo}</h1>
		<fmt:parseDate value="2021-08-12" type="DATE" pattern="yyyy-MM-dd" 
		var="dtCriacaoJsp"/> 
		<p>Data de criação dessa JSP: <fmt:formatDate value="${dtCriacaoJsp}" pattern="dd/MM/yyyy"/></p>
	</body>
</html>