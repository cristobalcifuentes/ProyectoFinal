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
    <div class="container">
    	<div class="row">
	        <div class="col s12 m10">
	            <h4 class="header">Crear Checklist</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/checklist.jpg">
	                </div> 
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la evaluación de Solicitudes
	                            de clientes los cuales tengan la necesidad de ingresar al sistema
	                        </p>
	                    </div>
	                    <div class="card-action">
	                        <a href="crearChek">Ir</a>
	                    </div>
	                </div>
	            </div>
	        </div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">Planificar Visita</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="solicitudesPendientes">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">Crear Capacitación</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="crearcapacitacion">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">Listar Capacitación</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="listaCapacitacion">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">Ingresar Asesoria</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="solicitudesAgendadas">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">Ingresar Asesoria</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="solicitudesAgendadas">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">Ingresar Asesoria</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="/images/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="solicitudesAgendadas">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    </div>
       
    <div class="row container">
        <hr>
        <p>Estadisticas del Sistema</p>
        <div class="col s12 m4 l4">
            <canvas id="estausu1" width="200" height="200"></canvas>
        </div>
        <div class="col s12 m4 l4">
            <canvas id="estausu2" width="200" height="200"></canvas>
        </div>
        <div class="col s12 m4 l4">
            <canvas id="estausu3" width="200" height="200"></canvas>
        </div>
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

</html>