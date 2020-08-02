<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <title>Hello, world!</title>
</head>

<body>
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Administrador</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link" href="/logout">Cerrar Sesion</a>
                </div>
            </div>
        </nav>
    </div>
    
    
    <div class="container mt-4" id="app">
        <div class="card">
            <div class="card-header bg-dark text-light ">
                <h4>Editar Cliente</h4>
            </div>
            <div class="card-body bg-light">
                <form action="editcli" method="post" name="formulario">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="razon">Razon Social</label>
                            <input type="hidden" id="rut" name="rut" value="${cliente.rut}" />
                            <input type="hidden" id="idusu" name="idusu" value="${cliente.usuario.id}" />
                            <input type="text" class="form-control" name="razon" id="razon"
                                value="${cliente.razonsocial}" />
                        </div>
                        <div class="form-group col-md-6">
                            <label for="direccion">Direccion</label>
                            <input type="text" class="form-control" id="direccion" name="direccion"
                                value="${cliente.direccion}" />
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <label for="comuna">Comuna</label>
                            <input type="text" class="form-control" id="comuna" name="comuna" value="${cliente.comuna}">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="telefono">Telefono</label>
                            <input type="number" class="form-control" id="telefono" name="telefono"
                                value="${cliente.telefono}">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="email">Email</label>
                            <input type="text" class="form-control" id="email" name="email" value="${cliente.email}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="economica">Act.Economica</label>
                        <input type="text" class="form-control" id="economica" name="economica"
                            value="${cliente.actividadEco}">
                    </div>
                    <div class="form-group">
                        <label for="tipo">Tipo Empresa</label>
                        <input type="text" class="form-control" id="tipo" name="tipo" value="${cliente.tipEmpresa}">
                    </div>
                    <button type="submit" class="btn btn-warning" id="boton">
                        Modificar
                    </button>
                </form>
            </div>
            <div class="card-footer text-muted bg-dark text-light text-right">
                Mantenedor Sistema Invo ®
              </div>
        </div>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <script src="/js/validarCliente.js"></script>
</body>

</html>