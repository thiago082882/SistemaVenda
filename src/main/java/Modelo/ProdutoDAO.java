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
public class ProdutoDAO {
    
     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
      int r;
      
      
      
      public  Produto buscar(int id){
          Produto pd = new Produto();
          String sql="select * from produto where IdProduto=" + id;
          try{
            con = cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               
               pd.setId(rs.getInt(1));
                pd.setNome(rs.getString(2));
                pd.setPreco(rs.getDouble(3));
                 pd.setEstoque(rs.getInt(4));
                   pd.setEstado(rs.getString(5));
           }
          }catch(Exception e){
              
          }
          return pd;
      }
      public int atualizarstock(int id, int stock){
    String sql="update produto set Estoque=? where IdProduto=?";
          
          try{
           con = cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setInt(1,stock);
            ps.setInt(2,id);
            ps.executeUpdate();     
        
        }catch(Exception e){
            
        }
        return r;
}
      
       public List listar(){
        String sql = "select * from produto";
       List<Produto>lista = new ArrayList<>();
       try{
           con = cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               Produto pd= new Produto();
               
               pd.setId(rs.getInt(1));
                pd.setNome(rs.getString(2));
                  pd.setPreco(rs.getDouble(3));
                   pd.setEstoque(rs.getInt(4));
                    pd.setEstado(rs.getString(5));
                 lista.add(pd);
           }
       }catch(Exception e){
           
       }
        return lista;
    }
    
public int agregar(Produto pd){
    
    String sql= "insert into produto (Nomes, Preco, Estoque, Estado ) values (?,?,?,?)";
        
    try{
           con = cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setString(1,pd.getNome());
            ps.setDouble(2,pd.getPreco());
             ps.setInt(3,pd.getEstoque());
              ps.setString(4,pd.getEstado());
           ps.executeUpdate();
            
        }catch(Exception e){
            
        }
        return r;
}
public Produto listarId(int id){
        Produto pd=new Produto();
        String sql = "select * from produto where IdProduto="+id;
        try{
            con = cn.Conexion();
            ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
                pd.setId(rs.getInt(1));
               pd.setNome(rs.getString(2));
                pd.setPreco(rs.getDouble(3));
                 pd.setEstoque(rs.getInt(4));
                  pd.setEstado(rs.getString(5));
   
           }  
           
        }catch(Exception e){
                   
        }
        return pd;
            
    }

public int atualizar(Produto pd){
    String sql="update produto set Nomes=?,Preco=?,Estoque=?,Estado=? where IdProduto=?";
          
          try{
           con = cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setString(1,pd.getNome());
            ps.setDouble(2,pd.getPreco());
             ps.setInt(3,pd.getEstoque());
              ps.setString(4,pd.getEstado());
                ps.setInt(5,pd.getId());
               ps.executeUpdate();     
        
        }catch(Exception e){
            
        }
        return r;
}

public void delete(int id){
   String sql = "delete from produto where IdProduto="+id;
        try{
            con=cn.Conexion();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        
        
    }catch(Exception e){
        
    } 
}
}
