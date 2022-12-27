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
<form action="Controlador?menu=Produto" method="POST">
                    <div class="form-group">
                         <label>Nome</label>
                         <input type="text" value="${produto.getNome()}" name="txtNomes" class="form-control">
                    </div>
                    <div class="form-group">
                         <label>Preço</label>
                         <input type="text" value="${produto.getPreco()}" name="txtPreco" class="form-control">
                    </div>
                    <div class="form-group">
                         <label>Estoque</label>
                         <input type="text" value="${produto.getEstoque()}" name="txtEstoque" class="form-control">
                    </div>
                    <div class="form-group">
                         <label>Estado</label>
                         <input type="text" value="${produto.getEstado()}" name="txtEstado" class="form-control">                       
                    </div >
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
                        <th>NOMES</th>
                        <th>PRECO</th>
                        <th>ESTOQUE</th>
                        <th>ESTADO</th>
                        <th>AÇÕES</th>
                    </tr>
                </thead>
                <tbody>
          
                    <c:forEach var="pd"  items="${ produtos }">
                        <tr>
                        <td>${pd.getId()}</td>
                        <td>${pd.getNome()}</td>
                        <td>${pd.getPreco()}</td>
                        <td>${pd.getEstoque()}</td>
                        <td>${pd.getEstado()}</td>
                    <td>
                        <a class="btn  btn-warning" href="Controlador?menu=Produto&accion=Editar&id=${pd.getId()}">Editar</a> 
                          <a class="btn btn-danger" href="Controlador?menu=Produto&accion=Delete&id=${pd.getId()}">Delete</a>
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

