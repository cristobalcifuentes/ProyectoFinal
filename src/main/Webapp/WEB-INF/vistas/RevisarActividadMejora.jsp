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
<form:form action="guardarActividadMejora" method="post">

				<h2>Revisar Actividad Mejora</h2>
				<label for="revisaractividadmejora"> capacitacion:</label> <br>
				<form:input type="text" id="capacitacion" style="width : 600px;" name="capacitacion" path="capacitacion"/> 
				<form:hidden path="id"/><br>
				
				<input type="submit" class="waves-effect waves-light btn"
					value="guardar" />
			
	</form:form>
</body>
</html>