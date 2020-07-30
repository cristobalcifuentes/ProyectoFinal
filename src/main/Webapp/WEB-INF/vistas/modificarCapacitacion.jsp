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
        h2 {
  			color: #c62828;
  			font-weight: normal;
  			font-size: 40px;
  			font-family: Arial;
  			text-transform: uppercase;
			}
    </style>
    <title>Visita</title>
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
    						                       
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                M.AutoInit();
            });
        </script>
</body>

</html>

	<form:form action="guardarcapacitacion" method="post">

				<h2>Modifique Capacitaci�n</h2>
				<label for="capacitacion"> Capacitaci�n:</label> <br>
				<form:input type="text" id="capacitacion" style="width : 600px;" name="capacitacion" path="capacitacion"/> 
				<form:hidden path="id"/><br>
				
				<input type="submit" class="waves-effect waves-light btn"
					value="guardar" />
			
	</form:form>

</body>
</html>