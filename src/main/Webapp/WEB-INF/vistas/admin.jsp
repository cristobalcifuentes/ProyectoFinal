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
<title>Panel Administrador</title>
</head>

<body>
	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">Administrador</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-item nav-link" href="logout">CerrarSession</a>
				</div>
			</div>
		</nav>
	</div>
	<div class="container" id="app">
		<div class="container mt-4">
			<div class="row">
				<div class="col-sm-12">
					<div class="card mb-3">
						<img src="images/Background-2.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Clientes</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<a href="/Admin/getClientes" class="btn btn-info">Ingresar</a>
						</div>
					</div>
				</div>
				<div class="col-sm-12">
					<div class="card mb-3">
						<img src="images/Background-2.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Profesionales</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<a href="/Admin/getProfesionales" class="btn btn-info">Ingresar</a>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<div class="card mb-3">
						<img src="images/Background-2.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Reportes Globales</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<a href="Admin/Globales" class="btn btn-info">Ingresar</a>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="card mb-3">
							<img src="images/Background-2.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Reportes cliente</h5>
								<p class="card-text">This is a wider card with supporting
									text below as a natural lead-in to additional content. This
									content is a little bit longer.</p>
								<a href="Admin/Cliente" class="btn btn-info">Ingresar</a>
							</div>
						</div>
					</div>
					<div class="col-sm-12">
						<div class="card mb-3">
							<img src="images/Background-2.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Estadisticas Accidentabilidad</h5>
								<p class="card-text">This is a wider card with supporting
									text below as a natural lead-in to additional content. This
									content is a little bit longer.</p>
								<a href="" class="btn btn-info">Ingresar</a>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="card mb-3">
							<img src="images/Background-2.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Notificar Deudas</h5>
								<p class="card-text">This is a wider card with supporting
									text below as a natural lead-in to additional content. This
									content is a little bit longer.</p>
								<a href="Admin/Notificaciones" class="btn btn-info">Ingresar</a>
							</div>
						</div>
					</div>
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
		<script>
			$(document).ready(function() {
				$('#mytable').DataTable();
			})
		</script>
</body>

</html>