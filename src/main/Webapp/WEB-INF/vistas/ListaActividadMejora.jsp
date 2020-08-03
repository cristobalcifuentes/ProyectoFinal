<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link rel="stylesheet"
	href="//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">


</head>
<body>

<nav class="nav-wrapper blue lighten-1">
		<a href="#" data-target="slide-out" class="sidenav-trigger"><i
			class="material-icons">menu</i></a> <a href="#" class="brand-logo">Sistema</a>
		<ul id="nav-mobile" class="right  hide-on-med-and-down">
			<li><c:out value="${usuario.nombre }"></c:out></li>
			<li><a href="/Profesional">Inicio</a></li>
			<li><a class="cs" href="/logout">Cerrar Sesión</a></li>
		</ul>
	</nav>
	<ul id="slide-out" class="sidenav">
		<li>
			<div class="user-view">
				<div class="background">
					<img src="https://picsum.photos/300/300?random=1">
				</div>
				<a href="#user"><img class="circle"
					src="https://picsum.photos/200/300?random=2"></a> <a href="#"><span
					class="white-text name"><c:out value="${usuario.nombre}"></c:out></span></a>
				<a href="#email"><span class="white-text email"></span></a>
			</div>
		</li>
		<li><c:out value="${usuario.nombre}"></c:out></li>
		<li>
			<div class="divider"></div>
		</li>
		<li><a href="/Profesional">Inicio</a></li>
		<li><a class="cs" href="/logout">Cerrar Sesión</a></li>
	</ul>
	<div class="container mt-4">
		<h4>Listado Actividad Mejora</h4>
		<div class="row">
			<div class="col-sm-12 col-md-8 col-lg-10">
				<table class="table thead-light" id="mytable">
					<thead>
						<tr>
							<th>idasesoria</th>
							<th>id</th>
							<th>idestadomejora</th>
							<th>descripcion</th>
							<th>Edición</th>
							<th>aprobar</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${lista}" var="list">

							<tr>
								<td align="right">${list.getIdasesoria().getId()}</td>
								<td align="right">${list.getId()}</td>
								<td align="center">${list.getIdestadomejora()}</td>
								<td align="center">${list.getDescripcion()}</td>
								<%-- <td><a href="eliminarActividadMejora/${list.getId()}">eliminar</a></td> --%>
								<td align="right"><a
									href="Profesional/editarActividadMejora/${list.getId()}">editar</a></td>
								<td align="right"><a
									href="Profesional/aprobarActividadMejora/${list.getId()}">aprobar</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
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
	<script src="//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
	<!- Compiled and minified JavaScript -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	<script>
		document.addEventListener('DOMContentLoaded', function() {
			M.AutoInit();
		});
	</script>
	<script>
		$(document).ready(function() {
			$('#mytable').DataTable();
		});
	</script>
</html>