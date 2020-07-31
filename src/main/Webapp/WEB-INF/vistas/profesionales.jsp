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
<title>Profesionales</title>
</head>
<body>
	<c:if test="${succes eq true }">
		<script type="text/javascript">
			alert("Profesional Modificado Correctamente");
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
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
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
		<div class="card ">
			<div class="card-header bg-dark text-light ">
				<h4>Profesionales</h4>
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
									<th>Profesion</th>
									<th>Email</th>
									<th>Salud</th>
									<th>EditPro</th>
									<th>EditUsu</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${profesionales}" var="profesional">
									<tr>
										<td>${profesional.rut}</td>
										<td>${profesional.usuario.nombre}</td>
										<td>${profesional.profesion}</td>
										<td>${profesional.email}</td>
										<td>${profesional.salud}</td>
										<td><a
											href="/Admin/getProfesionales/editpro?rut=${profesional.rut}"
											class="btn btn-info btn-block">Editar</a></td>
										<td><a
											href="/Admin/getClientes/editusu?id=${profesional.usuario.id}"
											class="btn btn-info btn-block">Editar</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="card-footer text-muted bg-dark text-light text-right">
                Mantenedor Sistema Invo ®
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