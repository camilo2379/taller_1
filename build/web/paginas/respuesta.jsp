<%-- 
    Document   : respuesta
    Created on : 4/02/2019, 07:33:56 PM
    Author     : sala8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
%--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona</title>
    </head>
    <body>
        <%
            String miNombre =  (String) request.getAttribute("parametroservlet");
        %>
        <h1>El Usuario <%=miNombre%> Se Ha Creado Correctamente</h1>
        <a href="./index.html"> Volver</a>
    </body>
</html>
