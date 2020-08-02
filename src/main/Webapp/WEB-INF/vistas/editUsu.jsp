<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<title>Hello, world!</title>
</head>

<body>
	<!-- Nav -->
	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="/Admin">Administrador</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-item nav-link" href="/logout">CerrarSession</a>
				</div>
			</div>
		</nav>
	</div>

	<!--Formulario-->
	<div class="container mt-4" id="app">
		<div class="card ">
			<div class="card-header bg-dark text-light ">
				<h4>Editar Usuario</h4>
			</div>
			<div class="card-body bg-light">
				<form action="editusu" method="post" name="formulario">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="nombre">Nombre</label> <input type="hidden" id="id"
								name="id" value="${usuario.id }" /> <input type="hidden"
								id="idusu" name="idusu" value="${usuario.rol.id}" /> <input
								type="text" class="form-control" name="nombre" id="nombre"
								value="${usuario.nombre }" />
						</div>
						<div class="form-group col-md-6">
							<label for="apellido">Apellido</label> <input type="text"
								class="form-control" id="apellido" name="apellido"
								value="${usuario.apellido}" />
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="password">Password</label> <input type="password"
								class="form-control" id="password" name="password"
								value="${usuario.password}">
						</div>
						<div class="form-group col-md-4">
							<label for="pas">Repita Password</label> <input
								type="password" class="form-control" name="pas" id="pas"
								value="">
						</div>
						<div class="form-group col-md-4">
							<label for="login">Login(Nombre Usuario)</label> <input
								type="text" class="form-control" id="login" name="login"
								value="${usuario.login}">
						</div>
					</div>
					<button type="submit" class="btn btn-warning" id="boton">
						Modificar</button>
				</form>
			</div>
			<div class="card-footer text-muted bg-dark text-light text-right">
                Mantenedor Sistema Invo ®
              </div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	<script src="/js/validarUsuario.js"></script>
</body>