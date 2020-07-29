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
    <title>Hello, world!</title>
  </head>
  <body>
  	<c:if test="${succes eq true }">
  		<script type="text/javascript">
  			alert("Cliente Modificado Correctamente");
  		</script>
  	</c:if>
  	<c:if test="${succesusu eq true }">
  		<script type="text/javascript">
  			alert("Usuario Modificado Correctamente");
  		</script>
  	</c:if>
      <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Administrador</a>
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
          <h4>Clientes</h4>
          <div class="row">
              <div class="col-sm-12 col-md-8 col-lg-10">
                <table class="class="table table-striped table-bordered" style="width:100%"" id="mytable">
                    <thead>
                        <tr>
                            <th>Rut</th>
                            <th>RazonSocial</th>
                            <th>Direccion</th>
                            <th>Comuna</th>
                            <th>Telefono</th>
                            <th>Act.Economica</th>
                            <th>Tip.Empresa</th>
                            <th>EditarUsuario</th>
                            <th>EditarCliente</th>
                        </tr>
                    </thead>
                    <tbody>
                   	<c:forEach items="${clientes}" var="cliente">
                   		<tr>
                   			<td>${cliente.rut}</td>
                   			<td>${cliente.razonsocial}</td>
                   			<td>${cliente.direccion}</td>
                   			<td>${cliente.comuna}</td>
                   			<td>${cliente.telefono}</td>
                   			<td>${cliente.actividadEco}</td>
                   			<td>${cliente.tipEmpresa}</td>
                   			<td><a href="/Admin/getClientes/editusu?id=${cliente.usuario.id}">Editar</td>
                   			<td><a href="/Admin/getClientes/editcli?rut=${cliente.rut}">Editar</td>
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
            $('#mytable').DataTable(
            );
        });
    </script>
</body>
</html>