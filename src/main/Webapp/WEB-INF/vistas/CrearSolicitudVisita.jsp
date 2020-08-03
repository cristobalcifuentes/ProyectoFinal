<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
    <script>tinymce.init({ selector: 'textarea' });</script>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
<!--   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"> -->
    <style>
        .cs:hover {
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
    <title>CREAR CAPACITACION</title>
</head>

<body>

    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a> <a href="#"
            class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
            <li><a href="/Cliente">Inicio</a></li>
            <li><a class="cs" href="/logout">Cerrar Sesi�n</a></li>
        </ul>
    </nav>
    <ul id="slide-out" class="sidenav">
        <li><a href="/Cliente">Inicio</a></li>
        <li>
            <div class="divider"></div>
        </li>
        <li><a class="cs" href="/logout">Cerrar Sesion</a></li>
    </ul>
    <div class="container">
    
        <form:form action="guardarsolicitud" method="post">
        
            <form:radiobutton path="tipo" value="${cap}" /> Capacitaci�n <br/>
            <form:radiobutton path="tipo" value="${ase}"/>  Asesoria <br/>
            <form:radiobutton path="tipo" value="${asee}" /> Asesoria Especial<br/>
            
            <input type="submit" value="Solicitar" />

        </form:form>
    </div>

</body>

</html>