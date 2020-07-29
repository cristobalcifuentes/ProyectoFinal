<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">


</head>
<body>

<div class="container mt-4">
          <h4>Listado Actividad Mejora</h4>
          <div class="row">
              <div class="col-sm-12 col-md-8 col-lg-10">
                <table class="table thead-light" id="mytable">
    <thead>
		<tr>
			<th>idasesoria</th>
			<th>id</th>
			<th>idestadomejora</th>
			<th>descripcion</th>
			<th>Edición</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${lista}" var="list">
	
			<tr>
				<td align="right">${list.getIdasesoria()}</td>
				<td align="right">${list.getId()}</td>
				<td align="center">${list.getIdestadomejora()}</td>
				<td align="center">${list.getDescripcion()}</td>
				<%-- <td><a href="eliminarActividadMejora/${list.getId()}">eliminar</a></td> --%>
				<td align="right"><a href="editarActividadMejora/${list.getId()}">editar</a></td>
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
</html>