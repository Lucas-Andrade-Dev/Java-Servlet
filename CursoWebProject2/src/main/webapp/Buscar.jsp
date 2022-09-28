<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
 
 <c:url value="EmpresaControler" var="EC" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscar</title>
<link rel="stylesheet" href="css/editar.css">
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
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav navegar">
        <li class="nav-item navegar">
         <a class="nav-link" href="/CursoWebProject2/Buscar.jsp">Buscar</a>
        </li>
        <li class="nav-item navegar">
          <a class="nav-link" href="/CursoWebProject2/CadastraEmpresa.jsp">Cadastrar</a>
        </li>
        <li class="nav-item navegar">
          <a class="nav-link" href="/CursoWebProject2/ListaEmpresa">Lista</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
      
    
    </header>
    
    <form action="${EC}" method="get"> 
       <h2 class="h2">Buscar </h2><br><input class="col-6" type="text" name="search" ><br>
      <br>
      <div class="d-grid gap-2">
         <button type="submit" class="col-6 btn btn-primary btn-lg" name="acao" value="buscar">Buscar</button>
      </div>
   </form>
   
   <c:if test="${tem == true}">
   
      <table class="table" border=1>
          
           <tr class="table-dark table-hover">
               <td>Id</td>
               <td>Nome</td>
               <td>Data</td>
               <td></td>
               <td></td>
               <td></td>
           </tr>
           
               <tr class="dados">
                    <td>${id}</td>
                    <td>${nome}</td>
                    <td><f:formatDate value="${data}" pattern="dd/MM/yyyy" /></td>
                    <td><a href="/CursoWebProject2/EmpresaControler?search=${id}&acao=excluirPbusca"><input type="button" value="Excluir">
                    </a></td>
                    <td><c:set var="id" value="${id}"></c:set>  
                        <input type="button" value="Editar" onclick="Editar(${id})">
                    
                    </td>
                    <td>
                    <div class="editar" id="${id}">
                     
                      <form action="${EC}?search=${id}&acao=editarPbusca" method="post"> 
                           Nome: <br><input type="text" name="nome" value="${nome}" ><br>
                           Data: <br><input type="text" name="data" value="<f:formatDate value="${data}" pattern="dd/MM/yyyy" />"><br>
                          <input type="submit" value="Alterar">
                      </form>
                     
                    </div>
                    <script>
                        var num =''
                        function Editar(num){
                        	var display = document.getElementById(num).style.display;
                        	if(display == "none"){
                        		document.getElementById(num).style.display = 'block';
                        	}else{
                        		document.getElementById(num).style.display = 'none';
                        	}
                          }

                    </script>
                    
                    </td>
               </tr>
              
           
       </table>
   
   </c:if>
   
   <c:if test="${tem == false}"> Não Encontrado </c:if>



</body>
</html>