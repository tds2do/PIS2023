/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.ResultSet;

/**
 *
 * @author Jonathan
 */
public class Usuario {
    
    private String username = "";
    private String password = "";
    
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void login(){
        String sql = "SELECT * FROM usuario WHERE username='"+this.username+"' AND password='"+this.password+"'";
        ResultSet res = Helper.select(sql);
        
    }
    
    public void logout(){
        
    }
    
}
