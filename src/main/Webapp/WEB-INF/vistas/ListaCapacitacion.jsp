<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			
			<th>capacitacion</th>
			<th>eliminar</th>
			<th>editar</th>
			<th>detalle</th>

		</tr>

		<c:forEach items="${lista}" var="list">
			<tr>
				
				<td>${list.getCapacitacion()}</td>
				<td><a href="elimnarCapacitacion/${list.getId()}">eliminar</a></td>
				<td><a href="editarCapacitacion/${list.getId()}">editar</a></td>
				<td><a href="detalleCapacitacion/${list.getId()}">detalle</a></td>
			</tr>
		</c:forEach>













	</table>



</body>
</html>