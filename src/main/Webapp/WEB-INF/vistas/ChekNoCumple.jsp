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
			
			
			<th>chek no cumple</th>
			<th>agregar mejora</th>


		</tr>
		<c:forEach items="${listado}" var="l">
			<tr>
				<td>${l.getCheklist().getChek()}</td>
	
				<td><a href="${l.getAsesoria().getId()}/crearActividadMejora/">agregar mejora </a></td>
			<tr>
		</c:forEach>


	</table>





</body>
</html>