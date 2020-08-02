<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>LISTA SOLICITUDES PENDIENTES</h3>
	<table>



		<tr>

			<th>RUT CLIENTE</th>
			<th>RAZON SOCIAL</th>
			<th>TIPO DE SOLICITUD</th>
			<th>FECHA AGENDADA</th>
			<th></th>


		</tr>
		<c:forEach items="${solicitudesPendientes}" var="sol">

			<tr>

				<form:form
					action="Profesional/ingresarAsesoria/${sol.getVisitaAsociada().getId()}/${sol.getId()}"
					method="post">

					<td>${sol.getCliente().getRut() }</td>
					<td>${sol.getCliente().getRazonsocial() }</td>
					<td>${sol.getTipo().getTipoVisita() }</td>
					<td>${sol.getVisitaAsociada().getFecha() }</td>

					<td>
						<button type="submit" name="ingresar">ingresar</button>
					</td>
				</form:form>
			</tr>

		</c:forEach>

	</table>

	<br />
</body>
</html>