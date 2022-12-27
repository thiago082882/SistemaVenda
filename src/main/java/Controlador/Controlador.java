/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Funcionario;
import Modelo.FuncionarioDAO;
import Modelo.Produto;
import Modelo.ProdutoDAO;
import Modelo.Venda;
import Modelo.VendaDAO;
import config.GerarSerie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thiag
 */
public class Controlador extends HttpServlet {

    
 Funcionario fun = new Funcionario();
 FuncionarioDAO funDAO = new FuncionarioDAO();
 Cliente cli = new Cliente();
 ClienteDAO cliDAO = new ClienteDAO();
  Produto pd = new Produto();
  ProdutoDAO pdDAO = new ProdutoDAO();
   int ide;
  int idc;
   int idp;
   
   Venda v = new Venda();
   List<Venda>lista= new ArrayList<>();
  int item;
  int cod;
  String descricao;
  double preco;
  int qtd;
  double subtotal;
  double totalpagar;
String numeroserie;
VendaDAO vDAO=new VendaDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String menu=request.getParameter("menu");
        
        String accion = request.getParameter("accion");
        
        if(menu.equals("Principal")){
             
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
            }
        
        //FUNCIONARIO
        
        
        if(menu.equals("Funcionario")){
            switch (accion){
                case "Listar":
                    List lista = funDAO.listar();
                request.setAttribute("funcionarios", lista);
                    break;
                    
                    case "Agregar":
                String dni = request.getParameter("txtDni");
                 String nom = request.getParameter("txtNomes");
                  String tel = request.getParameter("txtTel");
                   String estado = request.getParameter("txtEstado");
                    String user = request.getParameter("txtUser");
                   
                   fun.setDni(dni);
                   fun.setNom(nom);
                   fun.setTel(tel);
                   fun.setEstado(estado);
                   fun.setUser(user);
                  funDAO.agregar(fun);                    
                   request.getRequestDispatcher("Controlador?menu=Funcionario&accion=Listar").forward(request,response);
                   break;
                   
            case "Editar":
                ide=Integer.parseInt(request.getParameter("id"));
                Funcionario f = funDAO.listarId(ide);
                request.setAttribute("funcionario", f);
                request.getRequestDispatcher("Controlador?menu=Funcionario&accion=Listar").forward(request, response);
                break;
                
            case "Atualizar":
                 String dni1 = request.getParameter("txtDni");
                 String nom1 = request.getParameter("txtNomes");
                  String tel1 = request.getParameter("txtTel");
                   String estado1 = request.getParameter("txtEstado");
                    String user1 = request.getParameter("txtUser");
                   fun.setDni(dni1);
                   fun.setNom(nom1);
                   fun.setTel(tel1);
                   fun.setEstado(estado1);
                   fun.setUser(user1);
                   fun.setId(ide);
                  funDAO.atualizar(fun);
                 request.getRequestDispatcher("Controlador?menu=Funcionario&accion=Listar").forward(request, response);
                break;
                
            case "Delete":
                  ide=Integer.parseInt(request.getParameter("id"));
                  funDAO.delete(ide);
                         request.getRequestDispatcher("Controlador?menu=Funcionario&accion=Listar").forward(request, response);
                break;
                default:
                    throw new AssertionError();
            }
             
                request.getRequestDispatcher("Funcionario.jsp").forward(request, response);
            }
        
        
        //CLIENTE
        
         if(menu.equals("Clientes")){
             switch (accion){
                case "Listar":
                    List lista = cliDAO.listar();
                request.setAttribute("clientes", lista);
                    break;
                    
                    case "Agregar":
                String dni = request.getParameter("txtDni");
                 String nome = request.getParameter("txtNomes");
                  String endereco = request.getParameter("txtEndereco");
                   String estado = request.getParameter("txtEstado");
                   
                   cli.setDni(dni);
                   cli.setNome(nome);
                   cli.setEndereco(endereco);
                   cli.setEstado(estado);
                  cliDAO.agregar(cli);                    
                   request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request,response);
                   break;
                   
            case "Editar":
                idc=Integer.parseInt(request.getParameter("id"));
                Cliente c = cliDAO.listarId(idc);
                request.setAttribute("cliente", c);
                request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                break;
                
            case "Atualizar":
                 String dni1 = request.getParameter("txtDni");
                 String nome1 = request.getParameter("txtNomes");
                  String endereco1 = request.getParameter("txtEndereco");
                   String estado1 = request.getParameter("txtEstado");
                   cli.setDni(dni1);
                   cli.setNome(nome1);
                   cli.setEndereco(endereco1);
                   cli.setEstado(estado1);
                   cli.setId(idc);
                  cliDAO.atualizar(cli);
                 request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                break;
                
            case "Delete":
                  idc=Integer.parseInt(request.getParameter("id"));
                  cliDAO.delete(idc);
                         request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                break;
                default:
                    throw new AssertionError();
            }
                request.getRequestDispatcher("Clientes.jsp").forward(request, response);
            }
         
         
         // PRODUTO
         
          if(menu.equals("Produto")){
             switch (accion){
                case "Listar":
                    List lista = pdDAO.listar();
                request.setAttribute("produtos", lista);
                    break;
                    
                    case "Agregar":
                 String nome = request.getParameter("txtNomes");
                  double preco =Double.parseDouble( request.getParameter("txtPreco"));
                   int estoque =Integer.parseInt(request.getParameter("txtEstoque"));
                    String estado = request.getParameter("txtEstado");
                   
                   pd.setNome(nome);
                   pd.setPreco(preco);
                   pd.setEstoque(estoque);
                   pd.setEstado(estado);
                  pdDAO.agregar(pd);                    
                   request.getRequestDispatcher("Controlador?menu=Produto&accion=Listar").forward(request,response);
                   break;
                   
            case "Editar":
                idp=Integer.parseInt(request.getParameter("id"));
                Produto p = pdDAO.listarId(idp);
                request.setAttribute("produto", p);
                request.getRequestDispatcher("Controlador?menu=Produto&accion=Listar").forward(request, response);
                break;
                
            case "Atualizar":
                 String nome1 = request.getParameter("txtNomes");
                double preco1 = Double.parseDouble(request.getParameter("txtPreco"));
                  int estoque1 =Integer.parseInt( request.getParameter("txtEstoque"));
                   String estado1 = request.getParameter("txtEstado");
                   pd.setNome(nome1);
                   pd.setPreco(preco1);
                   pd.setEstoque(estoque1);
                   pd.setEstado(estado1);
                   pd.setId(idp);
                  pdDAO.atualizar(pd);
                 request.getRequestDispatcher("Controlador?menu=Produto&accion=Listar").forward(request, response);
                break;
                
            case "Delete":
                  idp=Integer.parseInt(request.getParameter("id"));
                  pdDAO.delete(idp);
                         request.getRequestDispatcher("Controlador?menu=Produto&accion=Listar").forward(request, response);
                break;
                default:
                    throw new AssertionError();
            }
                request.getRequestDispatcher("Produto.jsp").forward(request, response);
            }
          
          
          // REGISTRAR VENDA
          
           if(menu.equals("RegistrarVenda")){
               switch (accion) {
                   case "BuscarCliente":
                       String dni=request.getParameter("codigocliente");
                      cli.setDni(dni);
                        cli=cliDAO.buscar(dni);
                    request.setAttribute("cli", cli);
                    request.setAttribute("nserie", numeroserie);
                       break;
                       
                   case "BuscarProduto":
                     int id =Integer.parseInt( request.getParameter("codigoproduto"));
                      pd = pdDAO.listarId(id);
                       request.setAttribute("cli", cli);
                      request.setAttribute("produto", pd);
                       request.setAttribute("lista", lista);
                       request.setAttribute("totalpagar", totalpagar);
                        request.setAttribute("nserie", numeroserie);
                       break;
                       
                       case"Agregar":
                            request.setAttribute("nserie", numeroserie);
                           request.setAttribute("cli", cli);
                           totalpagar=0.0;
                           item++;
                           cod=pd.getId();
                           descricao=request.getParameter("nomeproduto");
                          preco=Double.parseDouble(request.getParameter("preco"));
                          qtd=Integer.parseInt(request.getParameter("qtd"));
                          subtotal= preco*qtd;
                          v=new Venda();
                          v.setItem(item);
                          v.setIdProduto(cod);
                          v.setDescricao(descricao);
                          v.setPreco(preco);
                          v.setQuantidade(qtd);
                          v.setSubtotal(subtotal);
                          lista.add(v);
                          for(int i=0;i < lista.size(); i++){
                              totalpagar=totalpagar+lista.get(i).getSubtotal();
                          }
                          request.setAttribute("totalpagar", totalpagar);
                          request.setAttribute("lista", lista);
                          
                           break;
                       case "GerarVenda":
                           
                           //Atualizar Estoque
                           
                           for(int i=0;i < lista.size(); i++){
                               Produto pr=new Produto();
                               int qtd=lista.get(i).getQuantidade();
                               int idpd=lista.get(i).getIdProduto();
                               ProdutoDAO pDAO=new ProdutoDAO();
                               pr=pDAO.buscar(idpd);
                               int sac = pr.getEstoque() - qtd;
                               pDAO.atualizarstock(idpd, sac);
                               
                           }
                           
                                 //Guardar Vendas
                           
                           v.setIdCliente(cli.getId());
                           v.setIdFuncionario(2);
                           v.setNumeroSerie(numeroserie);
                           v.setFechamento("2022-12-24");
                           v.setMontante(totalpagar);
                           v.setEstado("1");
                           vDAO.guardarVenda(v);
                           
                           //Guardar Detalhes de Vendas 
                           int idv=Integer.parseInt(vDAO.IdVendas());
                            for(int i=0;i < lista.size(); i++){
                              v=new Venda();
                              v.setId(idv);
                              v.setIdProduto(lista.get(i).getIdProduto());
                              v.setQuantidade(lista.get(i).getQuantidade());
                              v.setPreco(lista.get(i).getPreco());
                              vDAO.guardarDetalheVendas(v);
                          }
                           break;
                   default:             
               numeroserie=vDAO.gerarSerie();
               if(numeroserie==null){
                   numeroserie="00000001";
                   request.setAttribute("nserie", numeroserie);
                   
               }else{
                   int incrementar=Integer.parseInt(numeroserie);
                   GerarSerie gs = new GerarSerie();
                   numeroserie=gs.numeroSerie(incrementar);
                      request.setAttribute("nserie", numeroserie);
                   
               }
               request.getRequestDispatcher("RegistrarVenda.jsp").forward(request, response);
            }
               request.getRequestDispatcher("RegistrarVenda.jsp").forward(request, response);
           }
        
        }
        
           
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
