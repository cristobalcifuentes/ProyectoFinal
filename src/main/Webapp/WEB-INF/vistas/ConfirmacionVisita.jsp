<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONFIRMACION VISITA</title>
</head>
<body>

	<h1>CONFIRMACION VISITA</h1>

	Ha agendado una visita a ${soli.getCliente().getRazonsocial()} 
	de tipo ${soli.getTipo().getTipoVisita() }
	el dia ${visita.getFecha()} 

<a href="index">VOLVER A INICIO
</a><br/>

<a href="solicitudesPendientes">PLANIFICAR OTRA VISITA
</a><br/>


</body>
</html>