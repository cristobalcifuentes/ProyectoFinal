<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.21/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/responsive/2.2.5/css/responsive.bootstrap4.min.css">
<title>Clientes</title>
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
			<a class="navbar-brand" href="/Admin">Administrador</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-item nav-link" href="logout">Cerrar Sesi�n</a>
				</div>
			</div>
		</nav>
	</div>
	
		<div class="container mt-4" id="app">
			<div class="card ">
				<div class="card-header bg-dark text-light">
					<h4>Clientes</h4>
				</div>
				<div class="card-body bg-light">
					<div class="row">
						<div class="col-sm-12">
							<table
								class="table table-striped table-bordered dt-responsive nowrap"
								style="width: 100%" id="mytable">
								<thead>
									<tr>
										<th>Rut</th>
										<th>Nombre</th>
										<th>Tel</th>
										<th>Act.Eco</th>
										<th>Tip.Emp</th>
										<th>Email</th>
										<th>EditarUsu</th>
										<th>EditarCli</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${clientes}" var="cliente">
										<tr>
											<td>${cliente.rut}</td>
											<td>${cliente.usuario.nombre}</td>
											<td>${cliente.telefono}</td>
											<td>${cliente.actividadEco}</td>
											<td>${cliente.tipEmpresa}</td>
											<td>${cliente.email}</td>
											<td><a
												href="/Admin/getClientes/editusu?id=${cliente.usuario.id}"
												class="btn btn-info btn-block">-></a></td>
											<td><a
												href="/Admin/getClientes/editcli?rut=${cliente.rut}"
												class="btn btn-info btn-block">-></a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="card-footer text-muted bg-dark text-light text-right">
                Mantenedor Sistema Invo �
              </div>
			</div>
		</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.21/js/dataTables.bootstrap4.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.2.5/js/dataTables.responsive.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.2.5/js/responsive.bootstrap4.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#mytable').DataTable();
		});
	</script>
</body>
</html>