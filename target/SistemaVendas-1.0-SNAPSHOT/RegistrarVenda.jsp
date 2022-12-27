
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>VENDAS</title>        
        <style>
            @media  print {
                .parte01, .btn,.accion{
                 display: none
                        
                }
            }
        </style>
        
    </head>
    
    <body>
        <div class="d-flex">
            <div class="col-lg-5 parte01">
                <div class="card">
                    <form action="Controlador?menu=RegistrarVenda" method="POST">                                  
                    <div class="card-body">     
                          <!-- DADOS DO CLIENTE -->
                          
                        <div class="form-group ">                                                 
                            <label>Dados Cliente</label>
                        </div>
                        <div class="form-group d-flex ">                  
                            <div class="col-sm-6 d-flex">
                                <input type="text" name="codigocliente" value="${cli.getDni()}" class="form-control" placeholder="Codigo">
                                <button type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info">Buscar</button>
                             </div> 
                            <div class="col-sm-6">
                                <input type="text" name="nomescliente"  value="${cli.getNome()}" placeholder="Dados Clientes" class="form-control" >
                            </div>                                                                                                              
                        </div>
                                    <!-- DADOS DO PRODUTO -->
                        <div class="form-group ">                                         
                            <label>Dados Produto</label>
                        </div>
                        
                        <div class="form-group d-flex ">                            
                             <div class="col-sm-6 d-flex">
                                <input type="text" name="codigoproduto" value="${produto.getId()}"  class="form-control" placeholder="Código">
                                <button type="submit" name="accion" value="BuscarProduto" class="btn btn-outline-info">Buscar</button>
                             </div> 
                            <div class="col-sm-6">
                                <input type="text" name="nomeproduto"  value="${produto.getNome()}" class="form-control" placeholder="Dados Produto">
                            </div>   
                        </div>
                        
                        <div class="form-group d-flex ">
                            
                            <div class="col-sm-6 d-flex">
                                <input type="text" name="preco" value="${produto.getPreco()}" class="form-control" placeholder="R$ 0.00">
                             
                             </div> 
                            <div class="col-sm-3">
                                <input type="number" value="1"  name="qtd"  class="form-control" >
                            </div>   
                             <div class="col-sm-3">
                                <input type="text" name="estoque" value="${produto.getEstoque()}"  class="form-control" placeholder="Estoque">
                            </div>   
                        </div>
                                   <!-- BOTAO REGISTRAR PRODUTO AO REGISTRO -->
                        <div class="form-group">
                            <div class="col-sm">
                            <button type="submit" name="accion" value="Agregar" class="btn btn-outline-info">Agregar Produto</button>
                            </div>
                        </div>
                        </div>  
                      </form>                        
                    </div>
                </div>
            <div class="col-sm-7">
                <div class="card parte02">
                <div class="card-body">
                    <div class="d-flex  ml-auto col-sm-6">
                        <label class="text-right mt-2 col-sm-6">Nro. SERIE</label>    
                        <input  readonly="" type="text" name="numeroserie"  value="${nserie}" class="form-control">
                </div>
                    <br>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Numero</th>
                                <th>Código</th>
                                <th>Descrição</th>
                                <th>Preço</th>
                                <th>Quantidade</th>
                                <th>SubTotal</th>
                                <th class="accion">Ações</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="list" items="${lista}">
                            <tr>
                                <td>${list.getItem()}</td>
                                <td>${list.getIdProduto()}</td>
                                <td>${list.getDescricao()}</td>
                                <td>${list.getPreco()}</td>
                                <td>${list.getQuantidade()}</td>
                                <td>${list.getSubtotal()}</td>
                                <td class="d-flex">
                                     <a class="btn  btn-warning" href="#">Editar</a> 
                                     <a class="btn btn-danger" href="#" style="margin-left: 10px">Delete</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    </div>
                    <div class="card-footer ">
                        <div class="row">
                        <div class="col-sm-6">
                            <a href="Controlador?menu=RegistrarVenda&accion=GerarVenda" onclick="print()" class="btn btn-success">Gerar Venda</a>
                        
                              <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                        </div>
                        <div class="col-sm-6 ml-auto d-flex">
                            <label class="col-sm-6 text-right mt-2">Total a Pagar</label>
                            <input type="text" name="txtTotal" value="R$ ${totalpagar}0" class="form-control text-center font-weight">
                        </div>
                    </div>
                      </div>  
                        </div>
            </div>
            </div>
                          
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
