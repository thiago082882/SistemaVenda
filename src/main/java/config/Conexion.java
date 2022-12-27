/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author thiag
 */
public class Conexion {
    
    Connection con;
    String Url = "jdbc:mysql://localhost:3306/bd_vendas";
    String User = "root";
    String Pass = ""; 
    public Connection Conexion(){
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            con = DriverManager.getConnection(Url,User,Pass);
        } catch (Exception e) {
        }
        return con;
    }
    
}