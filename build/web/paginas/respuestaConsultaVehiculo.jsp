<%-- 
    Document   : respuesta
    Created on : 4/02/2019, 07:33:56 PM
    Author     : sala8
--%>

<%@page import="modelo.DTOs.VehiculoDTO"%>
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
<title>Consulta de Vehiculo</title>
</head>
<body>
	<%
		List<VehiculoDTO> datos= (List<VehiculoDTO>) request.getAttribute("listaDatos1");
	%>
	<div class="container-fluid">
		<hr>
		<div class="row-fluid">
			<div class="col-md-12">
				<a href='./paginas/crearVehiculo.jsp' class="btn btn-success btn-xs">Crear Nuevo Vehiculo</a>
				<h4 class="text-center">Vehiculo Consultado</h4>
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Matricula</th>
							<th>Nombre vehiculo</th>
							<th>Modelo</th>
							<th>Color</th>
                                                        <th>Precio</th>
                                                        <th>Disponible</th>
                                                        <th>Id Tipo De Vehiculo</th>
                                                        <th>Id Tipo De Marca</th>
						</tr>
					</thead>
					</tbody>
					<%
						for (VehiculoDTO v : datos) {
							out.print("<tr><td>" + v.getMatricula() + "</td><td>" + v.getNombre_v() + "</td><td>" + v.getModelo() + "</td><td>"
									+ v.getColor() + "</td><td>" + v.getPrecio() + "</td><td>" + v.getDisponible() + "</td><td>"
									+ v.getId_TipoV() + "</td><td>" + v.getId_marca());
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