<%-- 
    Document   : Funcionario
    Created on : 22 de dez. de 2022, 09:04:03
    Author     : thiag
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
            <div class="card-body">
<form action="Controlador?menu=Funcionario" method="POST">
                    <div class="form-group">
                         <label>Dni</label>
                         <input type="text" value="${funcionario.getDni()}" name="txtDni" class="form-control">
                    </div>
                    <div class="form-group">
                         <label>Nomes</label>
                         <input type="text" value="${funcionario.getNom()}" name="txtNomes" class="form-control">
                    </div>
                    <div class="form-group">
                         <label>Telefone</label>
                         <input type="text" value="${funcionario.getTel()}" name="txtTel" class="form-control">
                    </div>
                    <div class="form-group">
                         <label>Estado</label>
                         <input type="text" value="${funcionario.getEstado()}" name="txtEstado" class="form-control">
                       
                    </div >
                    <div class="form-group">
                         <label>Usuario</label>
                         <input type="text" value="${funcionario.getUser()}" name="txtUser" class="form-control">
                    </div>
            <input type="submit" name="accion" value="Agregar" class="btn btn-info">
            <input type="submit" name="accion" value="Atualizar" class="btn btn-success"> 
                </form>
        </div>
        </div>
        <div class="col-sm-8">
            <table class="table table-hover" >
                <thead>
                    <tr>
                       <th>ID</th>
                        <th>DNI</th>
                        <th>NOMES</th>
                        <th>TELEFONE</th>
                        <th>ESTADO</th>
                        <th>USER</th>
                        <th>AÇÕES</th>
                    </tr>
                </thead>
                <tbody>
          
                    <c:forEach var="fun"  items="${ funcionarios }">
                        <tr>
                        <td>${fun.getId()}</td>
                        <td>${fun.getDni()}</td>
                        <td>${fun.getNom()}</td>
                        <td>${fun.getTel()}</td>
                        <td>${fun.getEstado()}</td>
                        <td>${fun.getUser()}</td>
                    <td>
                        <a class="btn  btn-warning" href="Controlador?menu=Funcionario&accion=Editar&id=${fun.getId()}">Editar</a> 
                          <a class="btn btn-danger" href="Controlador?menu=Funcionario&accion=Delete&id=${fun.getId()}">Delete</a>
                </td>
                    </tr>
                </c:forEach>
                   
                </tbody>
            </table>

        </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
