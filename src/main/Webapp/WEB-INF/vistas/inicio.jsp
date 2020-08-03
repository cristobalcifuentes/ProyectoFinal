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
    <style>
        .cs:hover{
            background-color: #c62828;
            color: whitesmoke;
        }
    </style>
    <title>Inicio</title>
</head>

<body>
	<c:if test="${confirmacion eq true }">
		<script type="text/javascript">
			alert("Solicitud Ingresada");
		</script>
	</c:if>
    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <a href="#" class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
            <li><a href="perfil.jsp"><c:out value="${usuario.nombre}"></c:out></a></li>
            <li><a href="/Cliente/formularios">Solicitar Visita</a></li>
            <li><a class="cs" href="/logout">Cerrar Sesion</a></li>
        </ul>
    </nav>
    <ul id="slide-out" class="sidenav">
        <li>
            <div class="user-view">
                <div class="background">
                    <img src="https://picsum.photos/300/300?random=1">
                </div>
                <a href="#user"><img class="circle" src="https://picsum.photos/200/300?random=2"></a>
                <a href="perfil.jsp"><span class="white-text name">John Doe</span></a>
                <a href="#email"><span class="white-text email">jdandturk@gmail.com</span></a>
            </div>
        </li>
        <li><a href="#">Perfil</a></li>
        <li><a href="/Cliente/formulario">Solicitar Visita</a></li>
        <li>
            <div class="divider"></div>
        </li>
        <li><a class="cs" href="logout">Cerrar Sesion</a></li>
    </ul>
    
    <div class="container">
        <div class="row">
            <div class="col sm-12 md-8 lg-12">
                <div class="card">
                    <div class="card-image waves-effect waves-block waves-light">
                      <img class="activator" src="/images/Notificaciones.png">
                    </div>
                    <div class="card-content">
                      <span class="card-title activator grey-text text-darken-4">Notificaciones<i class="material-icons right">more_vert</i></span>
                      <p><a href="#">IR</a></p>
                    </div>
                    <div class="card-reveal">
                      <span class="card-title grey-text text-darken-4">Notificaciones<i class="material-icons right">close</i></span>
                      <p>Usted no posee Ningun tipo de Notificaciones, Que tenga una Buena Experiencia</p>
                    </div>
                  </div>
            </div>
        </div>
      </div>
    <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                M.AutoInit();
            });
        </script>
</body>

</html>