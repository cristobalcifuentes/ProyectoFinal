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
    <link rel="stylesheet" href="//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
    <title>Lista Estado Solicitud</title>
  </head>
  <body>
      <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Profesional</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
              <div class="navbar-nav">
                <a class="nav-item nav-link" href="#">CerrarSession</a>
              </div>
            </div>
          </nav>
      </div>
      <div class="container mt-4">
          <h4>Listado de Capacitaciones</h4>
          <div class="row">
              <div class="col-sm-12 col-md-8 col-lg-10">
                <table class="table thead-light" id="mytable">
                    <thead>
                        <tr>
                          <th>capacitacion</th>
                          <th>eliminar</th>
                          <th>editar</th>
                          <th>detalle</th>

						</tr>
                    </thead>
                    <tbody>
                   	<c:forEach items="${lista}" var="list">
			<tr>
				
				<td>${list.getCapacitacion()}</td>
				<td><a href="elimnarCapacitacion/${list.getId()}">eliminar</a></td>
				<td><a href="editarCapacitacion/${list.getId()}">editar</a></td>
				<td><a href="detalleCapacitacion/${list.getId()}">detalle</a></td>
			</tr>
		</c:forEach>
                    </tbody>
                </table>
              </div>
          </div>
      </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <script src="//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
    <script>
        $(document).ready( function () {
            $('#mytable').DataTable();
        });
    </script>
</body>
</html>