<%-- 
    Document   : respuesta
    Created on : 4/02/2019, 07:33:56 PM
    Author     : sala8
--%>

<%@page import="modelo.DTOs.PersonaDTO"%>
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
<title>Consulta de Persona</title>
</head>
<body>
	<%
		List<PersonaDTO> datos= (List<PersonaDTO>) request.getAttribute("listaDatos");
	%>
	<div class="container-fluid">
		<hr>
		<div class="row-fluid">
			<div class="col-md-12">
				<a href='./paginas/crear.jsp' class="btn btn-success btn-xs">Crear Nuevo Cliente</a>
				<h4 class="text-center">Cliente Consultado</h4>
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Identificacion</th>
							<th>Nombre 1</th>
							<th>Nombre 2</th>
							<th>Apellido 1</th>
                                                        <th>Apellido 2</th>
                                                        <th>Genero</th>
                                                        <th>Telefono</th>
                                                        <th>Email</th>
                                                        <th>Fecha De Nacimiento</th>
							<th>Id Tipo De Persona</th>
						</tr>
					</thead>
					</tbody>
					<%
						for (PersonaDTO v : datos) {
							out.print("<tr><td>" + v.getIdentificacion() + "</td><td>" + v.getNombre_1() + "</td><td>" + v.getNombre_2() + "</td><td>"
									+ v.getApellido_1() + "</td><td>" + v.getApellido_2() + "</td><td>" + v.getGenero() + "</td><td>"
									+ v.getTelefono() + "</td><td>" + v.getEmail() + "</td><td>" + v.getFecha_nacimiento() + "</td><td>"
									+ v.getId_TipoP());
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