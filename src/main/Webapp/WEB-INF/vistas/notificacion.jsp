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
	<style type="text/css">
		.logout:hover{
			color:#FFFFFF;
			background:red;
			border-radius:5px;
		}
	
	</style>
<title>Enviar Notificaciones</title>
</head>

<body>
	<c:if test="${correo eq true}">
		<script type="text/javascript">
			alert("Notificacion Enviada Exitosamente");
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
					<a class="nav-item nav-link logout" href="/logout">Cerrar Sesion</a>
				</div>
			</div>
		</nav>
	</div>
	<div class="container" id="app">
		<h4>Deudores</h4>
		<div class="card ">
			<div class="card-header bg-dark text-light">
				<h4>Deudores</h4>
			</div>
			<div class="card-body bg-light">
				<div class="row">
					<div class="col-sm-12 col-md-8 col-lg-10">
						<table
								class="table table-striped table-bordered dt-responsive nowrap"
								style="width: 100%" id="mytable">
							<thead>
								<tr>
									<th>Rut</th>
									<th>RazonSocial</th>
									<th>Telefono</th>
									<th>Email</th>
									<th>EnviarNotificacion</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${deudores}" var="cliente">
									<tr>
										<td>${cliente.rut}</td>
										<td>${cliente.razonsocial}</td>
										<td>${cliente.telefono}</td>
										<td>${cliente.email}</td>
										<td>
											<button type="button" class="btn btn-info btn-block boton"
												data-toggle="modal" data-target="#modalDeudor" id="btn"
												value="${cliente.rut}">Enviar</button>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<!-- Modal -->
						<div class="modal fade" id="modalDeudor" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Advertencia</h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">ENVIAR NOTIFICACION?</div>
									<form action="/Admin/Notificaciones" method="post">
										<input type="hidden" name="rut" id="rutenv" value="">

										<div class="modal-footer">
											<button type="button" class="btn btn-danger"
												data-dismiss="modal">No</button>
											<button type="submit" class="btn btn-success">Si</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="card-footer text-muted bg-dark text-light text-right">
				Mantenedor Sistema Invo �</div>
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
			$('#mytable').DataTable({});
		});
		$('.boton').click(function() {
			$('#rutenv').val($(this).prop('value'));
		});
	</script>
</body>

</html>