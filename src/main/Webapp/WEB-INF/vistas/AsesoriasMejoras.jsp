<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Asesorias</title>
</head>
<body>

	<h1>LISTA DE ASESORIAS REALIZADAS</h1>

	<table>

		<tr>
			<th>cliente</th>
			<th>profesional</th>
			<th>fecha</th>
			<th>revisar</th>



		</tr>
		<c:forEach items="${asesorias}" var="a">
			<tr>
				<td>${a.getVisita().getSolicitud().getCliente().getRazonsocial()}</td>
				<td>${a.getVisita().getRutProfesional().getUsuario().getNombre()}
					${a.getVisita().getRutProfesional().getUsuario().getApellido()}</td>
				<td>${a.getVisita().getFecha()}</td>
				<td><a href="revisar/${a.getId()}">revisar </a></td>
			<tr>
		</c:forEach>


	</table>







</body>
</html>