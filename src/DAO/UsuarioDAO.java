/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.DataBase;
import Modelo.Hash;
import Modelo.Usuario;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author Jonathan
 */
public class UsuarioDAO {
    
    DataBase bd = new DataBase();
    
    public boolean login(Usuario user){
        
        Hash hs = new Hash(user.getPassword());
        String sql = "SELECT * FROM usuario AS u INNER JOIN rol AS r ON u.idRol=r.idRol "
                + "WHERE u.username='"+user.getUsername()+"' AND u.password='"+hs.generate()+"' AND u.estado=1";
        List res = bd.execute(sql);

        if(!res.isEmpty()){
            HashMap row = (HashMap) res.get(0);
            user.setIdUsuario((int) row.get("idUsuario"));
            user.setPrimerNombre((String) row.get("primerNombre"));
            user.setSegundoNombre((String) row.get("segundoNombre"));
            user.setPrimerApellido((String) row.get("primerApellido"));
            user.setSegundoApellido((String) row.get("segundoApellido"));
            user.setCargo((String) row.get("cargo"));
            user.setDepartamento((String) row.get("departamento"));
            user.setIdRol((int) row.get("idUsuario"));
            user.setNombreRol((String) row.get("abreviatura"));
            //System.out.print(row.get("password"));
            return true;
        }
        
        return false;
    }
    
    public void logout(){
        
    }
    
}
