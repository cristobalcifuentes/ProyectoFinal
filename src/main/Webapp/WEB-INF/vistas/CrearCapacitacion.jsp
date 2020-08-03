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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
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

    <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
    <script>
        tinymce.init({
            selector: 'textarea'
        });
    </script>
</head>

<body>

    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a> <a href="#"
            class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
            <li><a href="/Profesional">Inicio</a></li>
            <li><a class="cs" href="logout">Cerrar Sesion</a></li>
        </ul>
    </nav>
    <ul id="slide-out" class="sidenav">
        <li><a href="/Profesional">Inicio</a></li>
        <li>
            <div class="divider"></div>
        </li>
        <li><a class="cs" href="logout">Cerrar Sesionn</a></li>
    </ul>
    <div class="container">
        <form:form action="guardarcapacitacion" method="post">
            <div class="row">
                <div class="col s12 m6">
                    <h2 class="center-align">Crear Capacitacion</h2>
                    <h4>Titulo De  Capacitación</h4>
                   <br>
                    <form:input type="text" id="capacitacion" name="capacitacion" 
                        path="capacitacion" />
                    <br> <br> <br> <br> <br> <label for="contenido">
                        <h4>CAPACITACION</h4>
                    </label><br>
                    <textarea style="width : 800px; min-height : 500px;" name="contenido" id="contenido"></textarea>
                    <input type="submit" class="waves-effect waves-light btn" value="guardar" />
                </div>
            </div>
        </form:form>
    </div>

<script src='https://cloud.tinymce.com/stable/tinymce.min.js'></script>
<script>
    tinymce.init({
        selector: 'textarea'
    });
</script>
</body>

</html>
