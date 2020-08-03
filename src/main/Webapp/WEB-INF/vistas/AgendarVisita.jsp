<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.bundle.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.js"></script>
    <style>
        .cs:hover {
            background-color: #c62828;
            color: whitesmoke;
        }
    </style>
    <title>Agendar Visita</title>
</head>

<body>
    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <a href="#" class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
            <li>
                <c:out value="${usuario.nombre }"></c:out>
            </li>
            <li><a href="/Profesional">Inicio</a></li>
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
                <a href="#"><span class="white-text name">
                        <c:out value="${usuario.nombre}"></c:out>
                    </span></a>
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
    <div class="container">
        <h1>Agendar Visita</h1>
        <p>estamos agendando una visita al cliente "${soli.getCliente().getRazonsocial()}",
            para realizar una "${soli.getTipo().getTipoVisita()}".
        </p>
	
	<h4>cuando desea agendar esta visita?</h4>
	<form:form action="RegistrarVisita/${soli.getId()}" method="post">
    	<form:hidden value="${profesional}"  path="rutProfesional"/> 
		<br>
		fecha:
		<form:input type="date" path="fecha"></form:input>
		<br>
		<button type="submit" class="btn waves-effect waves-light">AGENDAR</button>
	</form:form>


    </div>
    <script src="js/admin.js"></script>
    <!- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                M.AutoInit();
            });
        </script>
</body>