/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class DataBase{

    protected final String URL = "jdbc:mysql://localhost:3307/inventario";
    protected final String USER = "root";
    protected final String CLAVE = "";
    private Connection cnx =  null;
    
    private Connection conectar(){
        
        if(cnx == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnx = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
                //System.out.println("Conectado...");  
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return cnx;
    
    }
    
    private void desconectar(){
        if(cnx != null){
            try{
                cnx.close();
            }catch(SQLException e){
                System.out.println("Error: " + e.getMessage());  
            }
            
        }
    }
    
    public List execute(String sql){
        
        List result = new ArrayList();
        
        try{
            Connection cnx = conectar();
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            result = getListResult(rs);
            desconectar();
        }catch(SQLException e){
            e.printStackTrace();
            //System.out.println("Error: " + e.getMessage());
        }
        return result;
    }
    
    
    public int update(String sql){
        
        try{
            Connection cnx = conectar();
            Statement stm = cnx.createStatement();
            int result = stm.executeUpdate(sql);
            desconectar();
            return result; 
            
        }catch(SQLException e){
            e.printStackTrace();
            //System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }
    
    private List getListResult(ResultSet rs){

        List datos = new ArrayList();
        try{
            ResultSetMetaData rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            while (rs.next()) {
                HashMap row = new HashMap(columns);
                for (int i = 1; i <= columns; ++i) {
                    row.put(rsmd.getColumnName(i), rs.getObject(i));
                }
                datos.add(row);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return datos;
    }
    
    
    public boolean excuteProcedure(String nombre){
        
        try{
            // Ejecutar procedimiento almacenado (Store Procedure)
            CallableStatement cs = cnx.prepareCall("{call "+nombre+"}");
            return cs.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return false;
        
    }
    
}