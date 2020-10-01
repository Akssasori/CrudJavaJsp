<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produtos Xing Ling</title>

<!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" >

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</head>

<body>

	<h1 class="text-center bg-dark text-white p-5">Produtos Xing Ling</h1>

	<div class="container">
	
	<div class="card col-md-6 offset-md-3 mt-5 shadow border-dark">
		<div class="card-header">
			<h3>Cadastro de Produtos</h3>
		</div>
		<div class="card-body">
			
			<form role="form">
					<label for='idProduto'>Id do Produto</label><br> <input
						type="number" name="idProduto" id="idProduto"
						placeholder="Digite o Id do produto" required="required"
						class="form-control">
			
					<label for='nome'>Nome do Produto:</label><br> <input type="text"
						name="nome" id="nome" placeholder="Digite o NOme do produto"
						required="required" class="form-control"> 
					
					<label for='descricao'>Descricao
						do Produto</label><br> <input type="text" name="descricao"
						id="descricao" placeholder="Digite uma descricao para o produto"
						required="required" class="form-control"> 
					
					<label for='preco'>Preço
						do Produto</label><br> <input type="number" name="preco" id="preco"
						placeholder="Digite o preço do produto" required="required"
						class="form-control">
			
					<label for='imagem'>Imagem do Produto</label><br> <input
						type="text" name="imagem" id="imagem"
						placeholder="Digite a URL da Imagem" required="required"
						class="form-control">
			
					<br>
					<button type="submit" class="btn btn-success">Gravar</button>

			</form>
	
		</div>
	</div>

	
	
</div>


	
<h3 class="text-center text-info bg-light p-5 mt-5">Tabela dos Produtos</h3>
	
	<div class="container">

	
	<table class="mt-5 table table-bordered table-hover table-dark shadow mb-5">
		<thead class="bg-info">
			<tr class="text-center">
				<th>Id Produto</th>
				<th>Nome</th>
				<th>Descricao</th>
				<th>Preco</th>
				<th>Imagem</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>10</td>
				<td>Havaiana</td>
				<td>Não solta as tiras</td>
				<td>50.00</td>
				<td><img src="https://havainas.vteximg.com.br/arquivos/ids/251575-583-439/4000029-5735-A-HAVAIANAS-TOP-LARANJA.jpg"
				class="w-25"></td>
			</tr>
		</tbody>
	</table>
</div>
</body>
</html>