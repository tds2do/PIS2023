/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Jonathan
 */
public class MariaDb {
    
    protected static final String URL = "jdbc:mysql://localhost:3306/pruebajava";
    protected static final String USER = "root";
    protected static final String CLAVE = "";
    private static Connection cnx =  null;
    
    public static Connection conectar(){
        
        if(cnx == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnx = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                //System.out.println("Error: " + e.getMessage());
            }
        }
        return cnx;
    
    }
    
    public static void desconectar(){
        if(cnx != null){
            try{
                cnx.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                //System.out.println("Error: " + e.getMessage());  
            }
            
        }
    
    
    }
    
}
