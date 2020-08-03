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

REPORTE CLIENTE<br><br><br><br>

CLIENTE:<br>
${cliente.getRut()} ${cliente.getRazonsocial()} <br><br>

cantidad accidentes: ${cantAccidente}<br>
cantidad solicitudes: ${cantSolicitudes}<br>



</body>
</html>