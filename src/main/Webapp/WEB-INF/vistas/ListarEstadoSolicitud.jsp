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
			<th>id</th>
			<th>Estado Solicitud</th>
			<th>Eliminar</th>
			<th>Editar</th>

		</tr>

		<c:forEach items="${lista}" var="list">
			<tr>
				<td>${list.getId()}</td>
				<td>${list.getEstadosolicitud()}</td>
				<td><a href="eliminarEstadoSolicitud/${list.getId()}">Eliminar</a></td>
				<td><a href="editarEstadoSolicitud/${list.getId()}">Editar</a></td>
			</tr>
		</c:forEach>
