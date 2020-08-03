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
            <li><a href="/Cliente">Inicio</a></li>
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
        <li><a href="/Cliente">Inicio</a></li>
        <li>
            <div class="divider"></div>
        </li>
        <li><a class="cs" href="/Cliente/formularios">Formularios</a></li>
        <li><a class="cs" href="/logout">Cerrar Sesion</a></li>
    </ul>
    <div class="container">
        <h1>Solicitar Asesorias</h1>
        <div class="row">
            <div class="col s12 m6">
                <div class="card">
                    <div class="card-image">
                        <img src="/images/asesorias.jpg">
                        <span class="card-title">Seleccione Asesoria</span>
                    </div>
                    <div class="card-content">
                        <form action="guardarsolicitud" method="post">
                            <p>
                                <label>
                                    <input name="ti" type="radio" value="1" />
                                    <span>Capacitacion</span>
                                </label>
                            </p>
                            <p>
                                <label>
                                    <input name="ti" type="radio" value="2" />
                                    <span>Asesoria</span>
                                </label>
                            </p>
                            <p>
                                <label>
                                    <input name="ti" type="radio" value="3" />
                                    <span>Asesoria Especial</span>
                                </label>
                            </p>
                            <hr>
                            <button type="submit" value="Solicitar"
                                class="waves-effect waves-light btn">Solicitar</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col s12 m6">
                <div class="card">
                    <div class="card-content">
                        <h5>
                            Modulo Especifico para Solicitar
                            Asesorias.
                        </h5>
                    </div>
                </div>
            </div>
        </div>
    </div>
<!--  Compiled and minified JavaScript-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                M.AutoInit();
            });
        </script>
</body>

</html>