/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiag
 */
public class FuncionarioDAO {
     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
      int r;
    
    
    public Funcionario controladorvalidar(String user,String dni){
       
        Funcionario fun = new Funcionario();
        String sql = "select * from funcionario where User=? and Dni=?";
       
        try{
            
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2,dni);
            rs= ps.executeQuery();
            
            while(rs.next()){
                
                fun.setId(rs.getInt("IdFuncionario"));
                fun.setUser(rs.getString("User"));
                fun.setDni(rs.getString("Dni"));
               fun.setNom(rs.getString("Nomes"));
                
            }
        }catch(Exception e){
            
        }
         return fun;
    }
    
    //operacao crud
    
    public List listar(){
        String sql = "select * from funcionario";
       List<Funcionario>lista = new ArrayList<>();
       try{
           con = cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               Funcionario fun= new Funcionario();
               
               fun.setId(rs.getInt(1));
                fun.setDni(rs.getString(2));
                 fun.setNom(rs.getString(3));
                  fun.setTel(rs.getString(4));
                   fun.setEstado(rs.getString(5));
                    fun.setUser(rs.getString(6));
                 lista.add(fun);
           }
       }catch(Exception e){
           
       }
        return lista;
    }
    
public int agregar(Funcionario fun){
    
    String sql= "insert into funcionario (Dni, Nomes, Telefone, Estado, User ) values (?,?,?,?,?)";
        
    try{
           con = cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setString(1,fun.getDni());
            ps.setString(2,fun.getNom());
             ps.setString(3,fun.getTel());
              ps.setString(4,fun.getEstado());
               ps.setString(5,fun.getUser());
           ps.executeUpdate();
            
        }catch(Exception e){
            
        }
        return r;
}
public Funcionario listarId(int id){
        Funcionario func=new Funcionario();
        String sql = "select * from funcionario where IdFuncionario="+id;
        try{
            con = cn.Conexion();
            ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               func.setDni(rs.getString(2));
                func.setNom(rs.getString(3));
                 func.setTel(rs.getString(4));
                  func.setEstado(rs.getString(5));
                   func.setUser(rs.getString(6));
   
           }  
           
        }catch(Exception e){
                   
        }
        return func;
            
    }

public int atualizar(Funcionario fun){
    String sql="update funcionario set Dni=?,Nomes=?,Telefone=?,Estado=?,User=? where IdFuncionario=?";
          
          try{
           con = cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setString(1,fun.getDni());
            ps.setString(2,fun.getNom());
             ps.setString(3,fun.getTel());
              ps.setString(4,fun.getEstado());
               ps.setString(5,fun.getUser());
                ps.setInt(6,fun.getId());
               ps.executeUpdate();     
        
        }catch(Exception e){
            
        }
        return r;
}

public void delete(int id){
   String sql = "delete from funcionario where IdFuncionario="+id;
        try{
            con=cn.Conexion();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        
        
    }catch(Exception e){
        
    } 
}
}

