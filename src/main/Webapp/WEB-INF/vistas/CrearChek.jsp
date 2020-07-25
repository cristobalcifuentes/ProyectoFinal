<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>crear nuevo cheklist</title>
</head>
<body>

	<h1>crear nuevo cheklist</h1>

	<form:form action="crearChek" method="post">

		<h4>Crear Capacitación</h4>
				<label for="chek">Ingrese cheklist</label> <br>
				<form:input type="chek" id="chek" name="chek" style="width : 600px; heigth : 3px" path="chek"/> 



		<input type="submit" 
			value="guardar" />
	</form:form>





</body>
</html>