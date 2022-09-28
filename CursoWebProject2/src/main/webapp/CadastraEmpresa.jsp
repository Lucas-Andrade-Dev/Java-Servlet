<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <c:url value="NovaEmpresa" var="NE" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Empresa</title>

<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.rtl.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-utilities.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
    
      <header>
     
     <nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item navegar">
          <a class="nav-link"  href="/CursoWebProject2/Buscar.jsp">Buscar</a>
        </li>
        <li class="nav-item navegar">
          <a class="nav-link"  href="/CursoWebProject2/CadastraEmpresa.jsp">Cadastrar</a>
        </li>
        <li class="nav-item navegar">
          <a class="nav-link"  href="/CursoWebProject2/ListaEmpresa">Lista</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
      
    
    </header>
    
   <form action="${NE}" method="post"> 
       <h2 class="h2">Nome: </h2><br><input class="col-6" type="text" name="nome" ><br>
    <h2 class="h2">Data: </h2> <br><input class="col-6" type="text" name="data"><br>
    <br>
      <div class="d-grid gap-2">
         <button type="submit" class="col-6 btn btn-primary btn-lg" value="Enviar">Salvar</button>
         <a href="/CursoWebProject2/ListaEmpresa"><button class="col-6 btn btn-secondary btn-lg" type="button" value="Lista">
         Lista</button></a> 
      </div>
   </form>
   
    

</body>
</html>