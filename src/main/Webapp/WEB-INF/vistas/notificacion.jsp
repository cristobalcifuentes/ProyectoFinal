<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <title>Enviar Notificaciones</title>
</head>

<body>
	<c:if test="${mensaje}">
		<c:out value="${mensaje }"></c:out>
	</c:if>
  <div class="container-fluid">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <a class="navbar-brand" href="#">Administrador</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
        aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <a class="nav-item nav-link" href="#">CerrarSession</a>
        </div>
      </div>
    </nav>
  </div>
  <div class="container" id="app">
    <div class="container mt-4">
      <div class="row">
        <div class="col-sm-12">
          <div class="card" style="width: 18rem;">
            <img src="https://www.winzip.com/static/images/feature-pages/send-large-files.png" class="card-img-top" alt="...">
            <div class="card-body">
              <form action="Notificaciones" method="POST" class="form-group">
                <input type="email" name="correo" placeholder="Ingrese E-mail" class="form-control mt-1" maxlength="30" required>
                <input type="text" name="asunto" placeholder="Ingrese Asunto" class="form-control mt-1" maxlength="30" required>
                <textarea name="mensaje" id="mensaje" cols="32" rows="6" maxlength="250" placeholder="Ingrese Mensaje" class="mt-1"></textarea>
                <button type="submit" class="btn btn-success btn-block">Enviar Correo</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>


  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <!--  <script>
     $(document).ready(function () {
       $('#mytable').DataTable();
    })
  </script>-->
</body>

</html>