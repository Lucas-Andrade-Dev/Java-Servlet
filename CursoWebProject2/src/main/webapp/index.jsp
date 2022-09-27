<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
 <c:url value="AutenticarLogin" var="AL" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="css/editar.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.rtl.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-utilities.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>

    
       <form action="${AL}" method="post"> 
          <h2 class="h2">Usuario: </h2><br><input class="col-6" type="text" name="usuario"><br>
          <h2 class="h2">Senha: </h2><br><input class="col-6" type="password" name="senha"><br>
          <br>
          <div class="d-grid gap-2">
            <button type="submit" class="col-6 btn btn-primary btn-lg" name="acao" value="logar">Buscar</button>
          </div>
       </form>
   



</body>
</html>