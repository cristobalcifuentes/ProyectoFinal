<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
    <style>
        .cs:hover {
            background-color: #c62828;
            color: whitesmoke;
        }
    </style>
    <title>PanelProfesional</title>
</head>

<body>
    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <a href="#" class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
        	<li><c:out value="${usuario.nombre }"></c:out></li>
            <li><a  href="/Profesional">Inicio</a></li>
            <li><a class="cs" href="logout">Cerrar Sesión</a></li>
        </ul>
    </nav>
    <ul id="slide-out" class="sidenav">
        <li>
            <div class="user-view">
                <div class="background">
                    <img src="https://picsum.photos/300/300?random=1">
                </div>
                <a href="#user"><img class="circle" src="https://picsum.photos/200/300?random=2"></a>
                <a href="#"><span class="white-text name"><c:out value="${usuario.nombre}"></c:out></span></a>
                <a href="#email"><span class="white-text email"></span></a>
            </div>
        </li>
        <li><a href="perfil.jsp">Perfil</a></li>
        <li><a href="checklist.jsp">Ingresar CheckList</a></li>
        <li><a href="PlanificarVisita.jsp">Planificar Visita</a></li>
        <li>
            <div class="divider"></div>
        </li>
        <li><a class="cs" href="logout">Cerrar Sesión</a></li>
    </ul>

    <div class="container ">
		<h4>Listado de Capacitaciones</h4>
		<div class="row">
			<div class="s12 m8 l10">
				<table class="table" id="mytable">
					<thead>
						<tr>
							<th>capacitacion</th>
							<th>eliminar</th>
							<th>editar</th>
							<th>detalle</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${lista}" var="list">
							<tr>
								<td>${list.getCapacitacion()}</td>
								<td><a href="elimnarCapacitacion/${list.getId()}">eliminar</a></td>
								<td><a href="editarCapacitacion/${list.getId()}">editar</a></td>
								<td><a href="detalleCapacitacion/${list.getId()}">detalle</a></td>
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
	<script src="//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#mytable').DataTable();
		});
	</script>
</body>

</html>