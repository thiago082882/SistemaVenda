/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Funcionario;
import Modelo.FuncionarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thiag
 */
public class ControladorValidar extends HttpServlet {
    
     //Necessita Implementar a Entidade FuncionarioDAO e Funcionario
    FuncionarioDAO funDAO = new FuncionarioDAO();
    Funcionario fun= new Funcionario();

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                               String accion = request.getParameter("accion");
     if(accion.equalsIgnoreCase("Ingressar")){
            String User=request.getParameter("txtuser");
            String Pass = request.getParameter("txtpass");
            fun = funDAO.controladorvalidar(User, Pass);
            
            if(fun.getUser()  != null){
                request.setAttribute("usuario", fun);
                request.getRequestDispatcher("Controlador?menu=Principal").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
       }else{
           request.getRequestDispatcher("index.jsp").forward(request, response);
       }
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
