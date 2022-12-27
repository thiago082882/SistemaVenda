<%-- 
    Document   : Principal
    Created on : 21 de dez. de 2022, 23:41:14
    Author     : thiag
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-light bg-info">
  <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
    <ul class="navbar-nav">
      <li class="nav-item">
       <a style="margin-left: 10px;border: none;color: #ffffff" class="btn btn-outline-light" href="#">Home</a>
      </li>
      <li class="nav-item">
        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="Controlador?menu=Produto&accion=Listar" target="myFrame">Produto</a>
      </li>
      <li class="nav-item">
       <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="Controlador?menu=Funcionario&accion=Listar" target="myFrame">Funcionario</a>
      </li>
      
      <li class="nav-item">
        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="Controlador?menu=Clientes&accion=Listar" target="myFrame">Clientes</a>
      </li>
      
      <li class="nav-item">
      <a style="margin-left: 10px;border: none"  class="btn btn-outline-light" href="Controlador?menu=RegistrarVenda&accion=default" target="myFrame">Nova Venda</a>
      </li>
    </ul>
  </div>
      <div class="dropdown">
          <button style="margin-left: 38px;border: none" class="btn btn-outline-light" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
     ${usuario.getNom()}
  </button>
  <div  class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
      <a  class="dropdown-item" href="#">
          
          <img src="img/user.png" alt="60" width="60"/>
      </a>
      <a   class="dropdown-item" href="#">${usuario.getUser()}</a>
    <a   class="dropdown-item" href="#"><a class="dropdown-item" href="#">usuario@gmail.com</a></a>
      <div class="dropdown-divider"></div>
        <form action="ControladorValidar" method="POST">
      
        <button name="accion" value="Sair" class="dropdown-item" href="#">Sair</button>
    </form>
<!--          <a class="dropdown-item"  href="ControladorValidar?accion=Sair">Sair</a>-->
  </div>
</div>
</nav>
    
    <div class="m-4" style="height: 530px;">
        <iframe name="myFrame" style="height: 100%;width: 100%;border: none"></iframe>   
    </div>   
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
