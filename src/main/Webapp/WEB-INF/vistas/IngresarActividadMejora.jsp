<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ingresar Actividad Mejora</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<style type="text/css">
body{
body {
            background-image: url(https://c.wallhere.com/photos/ce/36/1920x1200_px_General-1197902.jpg!d);
            background-size: cover;
            color: #fff;
        }
        
        .acme {
            margin-top: 100px;
        }

        .acme .card {
            background: rgba(0, 0, 0, .6);
        }
        
        .acme label {
            font-size: 16px;
            color: #ccc;
        }

        .acme input {
            font-size: 22px !important;
            color: #fff;
        }

        .acme button:hover {
            padding: 0px 40px;

        }
</style>
</head>
<body>
<div class="row acme">
        <div class="col s12 l4 offset-l4">
            <div class="card">
                <div class="card-action blue white-text">
                
		<h4>Ingresar Actividad Mejora</h4>
		</div>
		<form:form action="guardarActividadMejora" method="post">
			<table>
				<tr>
					<td>Id de Asesoria: </td>
					<td><form:input path="idasesoria"/></td>
				</tr>
				<tr>
					<td>Id de Estado de Mejora: </td>
					<td><form:input path="idestadomejora" /></td>
				</tr>
				<tr>
					<td>Descripción: </td>
					<td><form:input path="descripcion" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Ingresar"></td>
					
				    
				
				</tr>
				<tr>
				<td colspan="2"><a href="/index">Volver al inicio</a>
				</tr>
									
			</table>
			
<%-- 		</form:form> --%>
<%-- 		<form action="index"> --%>
<!--         <table> -->
<!--     		<tr> -->
<!--     		<td colspan="2"><input type="submit" value="Inicio"/> </td> -->
<!--     		</tr> -->
<!--     	</table>  -->
<%-- 		</form> --%>
        </div>
        </div>
    </div>
    
</body>
</html>