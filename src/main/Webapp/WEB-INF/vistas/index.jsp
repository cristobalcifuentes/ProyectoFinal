<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
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
        .image {
            width: 100%;
            height: auto;
        }
        
        p {
  			font-size: 1rem;
  			text-align: left;
		}
		h1 {
  			color: #c62828;
  			font-weight: normal;
  			font-size: 40px;
  			font-family: Arial;
  			text-transform: uppercase;
}
        
    </style>
    <title>Ingresos</title>
</head>

<body>

    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <a href="#" class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
            <li><a href="index.jsp">Inicio</a></li>
            <li><a class="cs" href="logout">Cerrar Sesi�n</a></li>
        </ul>
    </nav>
    <ul id="slide-out" class="sidenav">
        <li><a href="index.jsp">Inicio</a></li>
            <li>
                <div class="divider"></div>
            </li>
        <li><a class="cs" href="logout">Cerrar Sesi�n</a></li>
    </ul>
       <h1>Ingresos</h1>
     	

<a href="crearcapacitacion">crear capacitacion
</a><br/>
<a href="listaCapacitacion">lista de capacitaciones
</a><br/>
<a href="crearChek">crearChek
</a><br/>
<a href="solicitudesPendientes">planificar visita
</a><br/>
<a href="solicitudesAgendadas">ingresar asesoria
</a><br/>
<a href="crearActividadMejora">Ingresar Actividad Mejora
</a><br/>

<a href="listaActividadMejora">Listar/Editar Actividad de Mejora
</a><br/>
<br>
<p><a href="crearcapacitacion">Crear Capacitacion</a></p>
<p><a href="listaCapacitacion">Lista de Capacitaciones</a></p>
<p><a href="crearestadosolicitud">Crear Estado de Solicitud</a></p>
<p><a href="listaEstadoSolictud">Listar Estado de Solicitud</a></p>

                       
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                M.AutoInit();
            });

        </script>
</body>

</html>




















