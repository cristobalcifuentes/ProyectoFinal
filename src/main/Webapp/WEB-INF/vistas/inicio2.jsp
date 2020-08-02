<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<title>Inicio</title>
</head>

<body>
	<nav class="nav-wrapper blue lighten-1">
		<a href="#" data-target="slide-out" class="sidenav-trigger"><i
			class="material-icons">menu</i></a> <a href="#" class="brand-logo">Sistema</a>
		<ul id="nav-mobile" class="right  hide-on-med-and-down">
			<li><a class="cs" href="logout">Cerrar Sesión</a></li>
		</ul>
	</nav>
	<ul id="slide-out" class="sidenav">
		<li>
			<div class="user-view">
				<div class="background">
					<img src="https://picsum.photos/300/300?random=1">
				</div>
				<a href="#user"><img class="circle"
					src="https://picsum.photos/200/300?random=2"></a> <a
					href="perfil.jsp"><span class="white-text name">John Doe</span></a>
				<a href="#email"><span class="white-text email">jdandturk@gmail.com</span></a>
			</div>
		</li>
		<li><a class="cs" href="logout">Cerrar Sesión</a></li>
	</ul>

	<div class="container">
		<div class="row">
			<c:if test="${rol == 'cliente'}">
				<div class="col s12 m4">
					<div class="card">
						<div class="card-image">
							<img src="/images/cliente.jpg"> <span class="card-title">ACCESO
								CLIENTES</span>
						</div>
						<div class="card-content">
							<p>I am a very simple card. I am good at containing small
								bits of information. I am convenient because I require little
								markup to use effectively.</p>
						</div>
						<div class="card-action">
							<a href="Cliente">Ingresar</a>
						</div>
					</div>
				</div>
				<div>
					<div class="col s12 m8">
						<h1>Bienvenido al Sistema</h1>
						<h1>
							<c:out value="${usuario.nombre}"></c:out>
						</h1>
					</div>
				</div>
			</c:if>
			<c:if test="${rol == 'profesional'}">
				<div class="col s12 m4">
					<div class="card">
						<div class="card-image">
							<img src="/images/profe.png"> <span class="card-title">ACCESO
								PROFESIONALES</span>
						</div>
						<div class="card-content">
							<p>I am a very simple card. I am good at containing small
								bits of information. I am convenient because I require little
								markup to use effectively.</p>
						</div>
						<div class="card-action">
							<a href="Profesional">Ingresar</a>
						</div>
					</div>
				</div>
				<div>
					<div class="col s12 m8">
						<h1>Bienvenido al Sistema</h1>
						<h1>
							<c:out value="${usuario.nombre}"></c:out>
						</h1>
					</div>
				</div>
			</c:if>
			<c:if test="${rol == 'administrador'}">
				<div class="col s12 m4">
					<div class="card">
						<div class="card-image">
							<img src="/images/admin.jpg"> <span class="card-title">ACCESO
								ADMINISTRADORES</span>
						</div>
						<div class="card-content">
							<p>I am a very simple card. I am good at containing small
								bits of information. I am convenient because I require little
								markup to use effectively.</p>
						</div>
						<div class="card-action">
							<a href="Admin">Ingresar</a>
						</div>
					</div>
				</div>
				<div>
					<div class="col s12 m8">
						<h1>Bienvenido al Sistema</h1>
						<h1>
							<c:out value="${usuario.nombre}"></c:out>
						</h1>
					</div>
				</div>
			</c:if>
		</div>
	</div>
	<!- Compiled and minified JavaScript -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	<script>
		document.addEventListener('DOMContentLoaded', function() {
			M.AutoInit();
		});
	</script>
</body>

</html>