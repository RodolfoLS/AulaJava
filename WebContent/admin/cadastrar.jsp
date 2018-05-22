<jsp:include page="topo.jsp"></jsp:include>

<!--  El - Expression Laguage -->
${msg }

<form action="cadastrar.html" class="form-group">
	Informe o nome : <input type="text" name="nome" id="nome"
		class="form-control" /> <br>
	<br> Informe E-mail :<input type="text" name="email"
		id="email" class="form-control" /> <br>
	<br> Informe Cpf :<input type="text" name="cpf"
		id="cpf" class="form-control" /> <br>
	<br> Salário :<input type="text" name="salario"
		id="salario" class="form-control" /> <br>
	<br> Informe o Nascimento :<br> <input type="text"
		name="nascimento" id="nascimento" class="form-control" /> <br>
	<br> <input type="submit" value="Enviar" id="btn"
		class="btn btn-info" /> 
</form>


<jsp:include page="rodape.jsp"></jsp:include>