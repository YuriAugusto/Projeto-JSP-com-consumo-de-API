<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>&#x1F37F Detalhes do Filme</title>
		<!-- adição do bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" 
			rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" 
			crossorigin="anonymous">
	</head>
	<body>
		<nav class="navbar navbar-light bg-light">
			<div class="container-fluid">
			<a href="/projeto-jsp-base/home" class="navbar-brand">&#x1F37F Home</a> <!-- redireciona a home -->
			</div>
		</nav>	
		
		<div class="position-absolute top-50 start-50 translate-middle">
        	<div class="card mb-3" style="width: 1200px;">
            	<div class="row g-0">
                <div class="col-md-4">
                    <img src="${filmeDetalhado.getCaminhoDoPoster()}"
                        class="img-fluid rounded-start" alt="${filmeDetalhado.getTitulo()}">
                </div>
                	<div class="col-md-8">
						<div class="card-body">
	                        <h3 class="card-title">Título traduzido</h3>
	                        <p class="card-text">&#x270F; ${filmeDetalhado.getTitulo()}</p>
	
	                        <h4 class="card-title">Título original</h4>
	                        <p class="card-text">&#x270F; ${filmeDetalhado.getTituloOriginal()}</p>
	
	                        <h4 class="card-title">Visão geral</h4>
	                        <p class="card-text">&#x1F4D2; ${filmeDetalhado.getVisaoGeral()}</p>
	
	                        <h4 class="card-title">Data de lançamento</h4>
	                        <p class="card-text">&#x1F4C6; ${filmeDetalhado.getDataDeLancamento()}</p>
	
	                        <h4 class="card-title">Média de votos</h4>
	                        <p class="card-text">&#x2B50; ${filmeDetalhado.getMediaDeVotos()}</p>
                    	</div>
                	</div>
            	</div>
        	</div>
		</div>
	</body>
</html>