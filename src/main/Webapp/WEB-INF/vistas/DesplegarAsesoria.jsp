<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<body>

<h1>INGRESO ASESORIA</h1>

    <form action="RescatarAsesoria" method="post">
    
       <table>
            <tr>

               

                <th></th>

                <th>NO CUMPLE</th>

                <th>CUMPLE</th>

                <th>NO APLICA</th>

            </tr>
            
            <c:forEach items="${lista}" var="list">

                <tr>

                 
                    <td>${list.getChek()}</td>
                    <td><input type="radio" name="${list.getId()}" value="1" ></td>
                    <td><input type="radio" name="${list.getId()}" value="2" ></td>
                    <td><input type="radio" name="${list.getId()}" value="3" ></td>
    
                    </tr>

            </c:forEach>

        </table>
        
        

        <input type="submit" name="enviar" value="Enviar" />
        
        

    </form>
    
    
   
</a><br/>

</body>
</html>