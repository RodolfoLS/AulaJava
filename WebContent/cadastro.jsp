<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head> 	
<body>
<div class="container">
	<h1>Cadastro de Aluno</h1>
	<br>
	<a href="index.jsp">Inicial</a>&nbsp;&nbsp;
	<a href="cadastro.jsp">Cadastro</a>&nbsp;&nbsp;
	<a href="ControleAluno">Consulta</a>&nbsp;&nbsp;
	
	<form action="ControleAluno" method="post" class="form-group">
		Nome:<input type="text" name="nome" class="form-control" placeholder="Digite seu nome"><br><br>
		Email:<input type="text" name="email" class="form-control" placeholder="Digite seu email"><br><br>
		Nascimento:<input type="text" name="nascimento" class="form-control" placeholder="Digite sua data de nascimento"><br><br>
		<h2>Informe o endereco do aluno</h2>
		Rua:<input type="text" name="rua" class="form-control" placeholder="Digite o nome da rua"><br><br>
		Bairro:<input type="text" name="bairro" class="form-control" placeholder="Digite o nome do bairro"><br><br>
		Cidade:<input type="text" name="cidade" class="form-control" placeholder="Digite o nome da cidade"><br><br>
		<input type="submit" value="Enviar" class="btn btn-info">
	</form>
</div>
</body>
</html>