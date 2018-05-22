
<jsp:include page="topo.jsp"></jsp:include>

<h3 class="page-header">Sistema de Gerenciamento de Funcionários</h3>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>

	<div class="container">
		<div class="col-xs-12">
			<form action="Login" method="post">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3>SISTEMA DE LOGIN</h3>
					</div>
					<div class="panel-body">
						<div class="form-group">
							Login: 
							<input type="text" name="login" class="form-control" value="${login }">
						</div>
						<div class="form-group">
							Senha: 
							<input type="password" name="senha" class="form-control">
						</div>
					</div>
					<div class="panel-footer">
						<input type="submit" value="LOGAR" class="btn btn-info">
					</div>
				</div>
			</form>
			${msg }
		</div>
	</div>

</body>
</html>

<jsp:include page="rodape.jsp"></jsp:include>