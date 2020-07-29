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



<h1>agendar visita </h1>
estamos agendando una visita al cliente "${soli.getCliente().getRazonsocial()}", <br> 
	para realizar una "${soli.getTipo().getTipoVisita()}".
	
	cuando desea agendar esta visita?
	<form:form action="RegistrarVisita/${soli.getId()}" method="post">

		
		
		<form:hidden value="${12345678}"  path="rutProfesional"/>
		<br>
		
		
<!-- *************************************************************** -->
<!-- debemos validar la fecha de la visita en el front -->
<!-- *********************************************************** -->



		fecha:
		<form:input type="date" path="fecha"></form:input>
		<br>

		<button type="submit">AGENDAR</button>

	</form:form>



</body>
</html>