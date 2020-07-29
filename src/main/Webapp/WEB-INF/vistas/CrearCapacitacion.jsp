<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
  <script>tinymce.init({selector:'textarea'});</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="guardarcapacitacion" method="post">
		<div class="row">
			<div class="col s12 m3">
				<h2>Crear Capacitación</h2>
				
				<label for="capacitacion"><h4>TUTILO CAPACITACION</h4></label> <br>
				
				<form:input type="text" id="capacitacion" name="capacitacion" style="width : 600px; heigth : 3px" path="capacitacion"/> <br><br><br><br><br>
				
				<label for="contenido"><h4> CAPACITACION</h4></label> <br>
				<textarea name="contenido" id="contenido"></textarea>
<%-- 				<form:input type="textarea" path="contenido"/> --%>
				
				<input type="submit" class="waves-effect waves-light btn"
					value="guardar" />
			</div>
		</div>
	</form:form>
<!-- <script src='https://cloud.tinymce.com/stable/tinymce.min.js'></script> -->
</body>
</html>