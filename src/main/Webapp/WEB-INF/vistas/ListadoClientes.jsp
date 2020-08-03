<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<tr>
		<th>cliente</th>
		<th></th>
	</tr>
	<c:forEach items="${clientes}" var="c">
		<tr>

			<td>${c.getRazonsocial()}</td>
			<td><a href="Admin/reporte/${c.getRut()}">reporte</a></td>
		</tr>
	</c:forEach>

</body>
</html>