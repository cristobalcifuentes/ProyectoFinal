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
			<th>idasesoria</th>
			<th>id</th>
			<th>idestadomejora</th>
			<th>descripcion</th>

		</tr>

		<c:forEach items="${lista}" var="list">
			<tr>
				<td>${list.getIdasesoria()}</td>
				<td>${list.getId()}</td>
				<td>${list.getIdestadomejora()}</td>
				<td>${list.getDescripcion()}</td>
				<td><a href="EliminarActividadMejora/${list.getId()}">eliminar</a></td>
				<td><a href="editarActividadMejora/${list.getId()}">editar</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>