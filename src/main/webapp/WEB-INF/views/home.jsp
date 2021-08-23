<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>&#x1F37F Home</title>
		<!-- adição do bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" 
			rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" 
			crossorigin="anonymous">
	</head>
	<body>
		<nav class="navbar navbar-light bg-light">
			<div class="container-fluid">
				<a href="/projeto-jsp-base/home" class="navbar-brand">&#x1F37F Home</a><!-- redireciona a home -->
			</div>
		</nav>
		<div class="row align-items-start ml-5 mr-5 mb-5">
			<!-- iteração da lista -->
			<c:forEach items="${listaDeFilmes}" var="filme">
				<div class="card m-2" style="width: 18rem;">
					<img src="${filme.getCaminhoDoPoster()}" class="card-img-top" alt="${filme.getTitulo()}">
					<div class="card-body">
						<!-- faço redirecionamento para a view de detalhes e junto a isso informo o ID do file-->
						<h5 class="card-title"><a href="detalharfilme/${filme.getId()}">${filme.getTitulo()}</a></h5>
						<p class="card-text">${filme.getVisaoGeral()}</p>
					</div>
				</div>	
			</c:forEach>
		</div>
	</body>
</html>		
