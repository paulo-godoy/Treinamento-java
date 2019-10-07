<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.aluragerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<div class="container">
	<table class="table table-hover">
		<thead>
			<tr>
			  <th scope="col">Nome</th>
			  <th scope="col">Endereço</th>
			  <th scope="col">Cidade</th>
			  <th scope="col">Estado</th>
			  </tr>
		</thead>
		<h3 style="color: #fff; border: 1px solid #ccc; background: #054f77; padding: 10px; ">Empresas cadastradas</h3><br />
		
		<c:forEach items="${ empresas }" var="empresa">
			<tbody>
				<tr>
				<td> ${ empresa.nome } </td>
				<td> ${ empresa.endereco } </td>
			    <td> ${ empresa.cidade } </td>
				<td> ${ empresa.estado } </td>
			</tbody>
		</c:forEach>
		</table>
		
		<a class="btn btn-primary" href="/gerenciador/formNovaEmpresa.html" role="button">Voltar ao cadastro</a>
		</div>
		
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		

</body>
</html>