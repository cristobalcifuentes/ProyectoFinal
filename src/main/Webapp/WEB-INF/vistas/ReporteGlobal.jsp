<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.5/css/responsive.bootstrap4.min.css">
    <title>Reporte Global</title>
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
        <div class="card ">
            <div class="card-header bg-dark text-light">
                <h4>Reportes</h4>
            </div>
            <div class="card-body bg-light">
                <div class="row">
                    <div class="col-sm-12">
                        <h1>Reporte Global</h1>
                        <div class="row">
                            <div class="col-sm-12">
                                <h2>Ultimos 30 Dias</h2>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card-footer text-muted bg-dark text-light text-right">
                Mantenedor Sistema Invo ®
            </div>
        </div>
        <div class="card text-center mt-2">
            <div class="card-header bg-info text-light">
                <h4>Cantidad De Accidentes </h4>
            </div>
            <div class="card-body">
                <h1>${accidentes}</h1>
            </div>
            <div class="card-footer text-muted">
                Mantenedor Sistema Invo ®
            </div>
        </div>
        <div class="card text-center mt-2 my-4">
            <div class="card-header bg-info text-light">
                <h4>Cantidad De Solicitudes</h4>
            </div>
            <div class="card-body">
                <h1>${solicitudes}</h1>
            </div>
            <div class="card-footer text-muted">
                Mantenedor Sistema Invo ®
            </div>
        </div>

        <div class="card text-center mt-2 my-4">
            <div class="card-header bg-info text-light">
                <h4>Cantidad De Capacitaciones Solicitadas</h4>
            </div>
            <div class="card-body">
                <h1>${capacitaciones}</h1>
            </div>
            <div class="card-footer text-muted">
                Mantenedor Sistema Invo ®
            </div>
        </div>

        <div class="card text-center mt-2 my-4">
            <div class="card-header bg-info text-light">
                <h4>Cantidad De Asesorias Solicitadas</h4>
            </div>
            <div class="card-body">
                <h1>${asesorias} </h1>
            </div>
            <div class="card-footer text-muted">
                Mantenedor Sistema Invo ®
            </div>
        </div>

        <div class="card text-center mt-2 my-4">
            <div class="card-header bg-info text-light">
                <h4>Cantidad De Asesorias Especiales Solicitadas</h4>
            </div>
            <div class="card-body">
                <h1>${asesoriasE}</h1>
            </div>
            <div class="card-footer text-muted">
                Mantenedor Sistema Invo ®
            </div>
        </div>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>

</html>