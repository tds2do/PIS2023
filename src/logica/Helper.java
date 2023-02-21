/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jonathan
 */
public class Helper {
    
    
    public static ResultSet select(String sql){
        ResultSet res = null;
        
        try{
            Connection cnx = MariaDb.conectar();
            Statement query = cnx.createStatement();
            res = query.executeQuery(sql);
            
        }catch(SQLException e){
            
            System.out.println("Error: " + e.getMessage());
        }
        return res;
    }
    
}