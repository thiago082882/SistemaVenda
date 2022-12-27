/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author thiag
 */
public class VendaDAO {
         Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public  String gerarSerie(){
        String numeroserie = "";
        String sql="select max(Numeroserie) from vendas";
        try{
             con = cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               numeroserie=rs.getString(1);
           }
           
        }catch(Exception e){
            
        }
        return numeroserie;
    }
    
    public  String IdVendas(){
        String idvendas="";
        String sql="select max(IdVendas) from vendas";
           try{
             con = cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
              idvendas=rs.getString(1);
           }
           
        }catch(Exception e){
            
        }
           return idvendas;
    }
    
    public int guardarVenda(Venda ve){
        
        String sql="insert into vendas (IdCliente,IdFuncionario,NumeroSerie,FechaVendas,Montante,Estado) values(?,?,?,?,?,?)";
        
         try{
             con = cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setInt(1, ve.getIdCliente());
           ps.setInt(2, ve.getIdFuncionario());
           ps.setString(3, ve.getNumeroSerie());  
           ps.setString(4, ve.getFechamento());
           ps.setDouble(5, ve.getPreco());
           ps.setString(6, ve.getEstado());
           ps.executeUpdate();
           while(rs.next()){
             
           }
           
        }catch(Exception e){
            
        }
           return r ;


    }
    
    public int guardarDetalheVendas(Venda venda){
        String sql="insert into detalhe_vendas (IdVendas,IdProduto,Quantidade,PrecoVenda) value(?,?,?,?)";
         try{
             con = cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setInt(1, venda.getId());
           ps.setInt(2, venda.getIdProduto());
           ps.setInt(3, venda.getQuantidade());  
           ps.setDouble(4, venda.getPreco());
           ps.executeUpdate();
           while(rs.next()){
             
           }
           
        }catch(Exception e){
            
        }
        
        return r;
        
     
    }
}
