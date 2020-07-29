<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title></title>
</head>
<body>

	<h1>ASESORIA INGRESA CON EXITO</h1>

	<h3>DATOS DE LA ASESORIA</h3>

	- Chek que no cumplen ${noCumple} <br/> 
	- Chek que cumple ${cumple} <br/> <br/> <br/> <br/>
	<h3>detalle	de la asesoria </h3><br/>

	<table>

		<tr>
			<th>DESCRIPCION</th>

			<th>ESTADO</th>

		</tr>

		<c:forEach items="${chekAsesoria}" var="chek">
			<tr>
				<td>${chek.getCheklist().getChek() }</td>
				<td>${chek.getChek().getEstado() }</td>

			</tr>
		</c:forEach>
	</table>
	
	
	<a href="index">volver al inicio
</a><br/>







</body>
</html>