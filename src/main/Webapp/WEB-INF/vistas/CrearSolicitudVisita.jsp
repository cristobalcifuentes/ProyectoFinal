<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





	<form:form action="guardarsolicitud" method="post">

		<form:radiobutton path="tipo" value="${cap}" /> <br/> Capacitaci�n
		<form:radiobutton path="tipo" value="${ase}"/> <br/> Asesoria
		<form:radiobutton path="tipo" value="${asee}" /> <br/> Asesoria Especial
		<form:input name="tipo" path="tipo" />


		<input type="submit" value="guardar" />

	</form:form>
</body>
</html>