<%-- 
    Document   : index
    Created on : 21 de dez. de 2022, 23:40:43
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
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">           
                   <div class="card-body">
            
                       <form class="form-sign" action="ControladorValidar" method="POST">
                           <div class="form-group text-center">
                                <h3>Login</h3>
                               <img src="img/logo.png" alt="200" width="320"/>
                               <label>Seja Bem-Vindo ao Sistema</label>
                           </div>
                           <div class="form-group">
                               <label>Usuario:</label>
                              <input type="text" name="txtuser" class="form-control">
                           </div>
                           <div class="form-group">
                               <label>Password:</label>
                              <input type="password" name="txtpass" class="form-control">
                           </div>
                            <input type="submit" name="accion" value="Ingressar" class="btn btn-primary btn-block">
                       </form>
                    </div> 
               </div>    
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
