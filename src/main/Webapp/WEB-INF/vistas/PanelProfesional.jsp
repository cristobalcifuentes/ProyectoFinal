<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<% HttpSession sesion = request.getSession(); 
	String rol ="";
    if(sesion.getAttribute("rol") != null && sesion.getAttribute("rol").toString().equalsIgnoreCase("profesional")){
    	rol = sesion.getAttribute("rol").toString();
    }else{
    	response.sendRedirect("/");
    }%>
    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <a href="#" class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
        	<li><%out.print(rol.toUpperCase());%></li>
            <li><a  href="index.html">Inicio</a></li>
            <li><a class="cs" href="login.html">Cerrar Sesi�n</a></li>
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
        <li><a href="perfil.jsp">Perfil</a></li>
        <li><a href="checklist.jsp">Ingresar CheckList</a></li>
        <li><a href="PlanificarVisita.jsp">Planificar Visita</a></li>
        <li>
            <div class="divider"></div>
        </li>
        <li><a class="cs" href="logout">Cerrar Sesi�n</a></li>
    </ul>
    <div class="container">
    	<div class="row">
	        <div class="col s12 m10">
	            <h4 class="header">crear capacitacion</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/checklist.jpg">
	                </div> 
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la evaluaci�n de Solicitudes
	                            de clientes los cuales tengan la necesidad de ingresar al sistema
	                        </p>
	                    </div>
	                    <div class="card-action">
	                        <a href="crearcapacitacion">Ir</a>
	                    </div>
	                </div>
	            </div>
	        </div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">lista de capacitaciones</h4>
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
	            <h4 class="header">crearChek</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="crearChek">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">planificar visita</h4>
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
	            <h4 class="header">Listar/Editar Actividad de Mejora</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="imagenes/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="listaActividadMejora">IR</a>
	                    </div>
	                </div>
	            </div>
        	</div>
    	</div>
    	<div class="row">
    		<div class="col s12 m10">
	            <h4 class="header">ingresar actividad de mejora</h4>
	            <div class="card horizontal hoverable">
	                <div class="card-image">
	                    <img src="/images/Usuario.jpg">
	                </div>
	                <div class="card-stacked">
	                    <div class="card-content">
	                        <p>Modulo especifico para la mantencion de Usuarios.</p>
	                    </div>
	                    <div class="card-action">
	                        <a href="nuevaActividadMejora">IR</a>
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