<%-- 
    Document   : respuesta
    Created on : 4/02/2019, 07:33:56 PM
    Author     : sala8
--%>

<%@page import="modelo.DTOs.VentaDTO"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Consulta de Venta</title>
</head>
<body>
	<%
		List<VentaDTO> datos= (List<VentaDTO>) request.getAttribute("listaDatos2");
	%>
	<div class="container-fluid">
		<hr>
		<div class="row-fluid">
			<div class="col-md-12">
				<a href='./paginas/crearVenta.jsp' class="btn btn-success btn-xs">Crear Nueva Venta</a>
				<h4 class="text-center">Lista de venta</h4>
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Numero</th>
							<th>Precio Total</th>
							<th>Id Cliente</th>
							<th>Id Vehiculo</th>
							
						</tr>
					</thead>
					</tbody>
					<%
						for (VentaDTO v : datos) {
							out.print("<tr><td>" + v.getNumero() + "</td><td>" + v.getPrecio_total() + "</td><td>" + v.getId_persona() + "</td><td>"
									+ v.getId_vehiculo() );
						}
					%>
					</tbody>
				</table>
                                        <a href='./index.html' class="btn btn-success btn-xs">Volver</a>
			</div>
		</div>
                                        
	</div>                                    
</body>
</html>
<%-- 
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuesta Consulta Venta</title>
    </head>
    <body>
        <%
            ArrayList lista =  (ArrayList) request.getAttribute("listaDatos2");
        %>
        <h1>Vengo de la servlet.....<%=lista.get(0)%></h1>
        <a href="./index.html"> Volver</a>
    </body>
</html>
--%>