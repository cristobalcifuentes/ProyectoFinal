<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form:form action="guardarcapacitacion" method="post">

				<h2>modifique su capacitacion</h2>
				<label for="capacitacion"> capacitacion:</label> <br>
				<form:input type="text" id="capacitacion" style="width : 600px;" name="capacitacion" path="capacitacion"/> 
				<form:hidden path="id"/><br>
				
				<input type="submit" class="waves-effect waves-light btn"
					value="guardar" />
			
	</form:form>


</body>
</html>