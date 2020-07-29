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
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
<title>Enviar Notificaciones</title>
</head>

<body>
	<c:if test="${mensaje}">
		<c:out value="${mensaje }"></c:out>
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
	<div class="container" id="app">
		<h4>Clientes</h4>
		<div class="row">
			<div class="col-sm-12 col-md-8 col-lg-10">
				<table class=" table table-striped
					table-bordered" style="width: 100%" " id="mytable">
					<thead>
						<tr>
							<th>Rut</th>
							<th>EnviarNotificacion</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${deudores}" var="cliente">
							<tr>
								<td>${cliente}</td>
								<td>
									<button type="button" class="btn btn-warning"
										data-toggle="modal" data-target="#modalDeudor" id="btn" value="${cliente}">
										Enviar</button>
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
							<div class="modal-body">ENVIAR nOTIFICACION?</div>
							<form action="/Admin/Notificaciones/enviar" method="post">
								<input type="hidden" name="rut" id="rutenv">
							</form>
							<div class="modal-footer">
								<button type="button" class="btn btn-danger"
									data-dismiss="modal">No</button>
								<button type="submit" class="btn btn-success">Si</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		 <script src="//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
	<script>
     $(document).ready(function () {
       $('#mytable').DataTable();
    })
 	 </script>
</body>

</html>