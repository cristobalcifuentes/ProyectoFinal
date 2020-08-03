<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <title>EditarProfesional</title>
</head>

<body>
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="/Admin">Administrador</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link" href="/logout">Cerrar Sesión</a>
                </div>
            </div>
        </nav>
    </div>
    <div class="container mt-4" id="app">
        <div class="card">
            <div class="card-header bg-dark text-light ">
                <h4>Editar Profesional</h4>
            </div>
            <div class="card-body bg-light">
                <form action="editpro" method="post" name="formulario">
                    <div class="form-row">
                        <div class="form-group col-md-12">
                            <label for="profesion">Profesion</label>
                            <input type="hidden" id="rut" name="rut" value="${profesional.rut}" />
                            <input type="hidden" id="idpro" name="idpro" value="${profesional.usuario.id}" />
                            <input type="text" class="form-control" name="profesion" id="profesion"
                                value="${profesional.profesion}" />
                        </div>
                        <div class="form-group col-md-12">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email" name="email"
                                value="${profesional.email}" />
                        </div>
                        <div class="form-group col-md-12">
                            <label for="salud">Salud</label>
                            <select name="salud" id="salud" class="custom-select">
                                <option value="fonasa" selected>Fonasa</option>
                                <option value="isapre">Isapre</option>  
                            </select>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-warning" id="boton">
                        Modificar
                    </button>
                </form>
            </div>

        </div>
        <div class="card-footer text-muted bg-dark text-light text-right">
            Mantenedor Sistema Invo ®
        </div>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <script src="/js/validarProfesional.js"></script>
</body>

</html>