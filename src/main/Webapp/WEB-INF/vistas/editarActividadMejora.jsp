<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h2>Editar Actividad de Mejora</h2>
		<form:form action="save" method="post" modelAttribute="actividadmejora">
			<table>
				<tr>
					<td>ID: </td>
					<td>${ActividadMejora.id}
						<form:hidden path="id"/>
					</td>
				</tr>			
				<tr>
					<td>Id Asesoria: </td>
					<td><form:input path="idasesoria" /></td>
				</tr>
				<tr>
					<td>Id Estado Mejora: </td>
					<td><form:input path="idestadomejora" /></td>
				</tr>
				<tr>
					<td>Descripción: </td>
					<td><form:input path="descripcion" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>