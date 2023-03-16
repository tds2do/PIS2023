/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IUsuario;
import Modelo.Cliente;
import Modelo.DataBase;
import Modelo.Hash;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Jonathan
 */
public class UsuarioDAO implements IUsuario{
    
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

    @Override
    public Boolean registrar(Usuario usuario) {
        String sql = "INSERT INTO Usuario(`userName`, `password`, `codigoEmpleado`, `cedula`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `Cargo`, `Departamento`, `idRol`, `fechaNacimiento`, `direccion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + usuario.getUsername()+"','"
                + usuario.getPassword()+"','"
                + usuario.getCodigoEmpleado()+"','"
                + usuario.getCedula()+"','"
                + usuario.getPrimerNombre()+"','"
                + usuario.getSegundoNombre()+"','"
                + usuario.getPrimerApellido()+"','"
                + usuario.getSegundoApellido()+"','"
                + usuario.getCargo()+"','"
                + usuario.getDepartamento()+"','"
                + usuario.getIdRol()+"','"
                + usuario.getFechaNacimiento().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +"','"    
                + usuario.getDireccion()+"','"  
                + usuario.getEstado()+"','"
                + usuario.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "','"
                + usuario.getUsuarioIngreso()+"', "
                + null+", "
                + null+", "
                + null+", "
                + null+")";
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean modificar(Usuario usuario) {
        String sql = "UPDATE Usuario SET password='"
                + usuario.getPassword()+"',codigoEmpleado='"
                + usuario.getCodigoEmpleado()+"',cedula='"
                + usuario.getCedula()+"',primerNombre='"
                + usuario.getPrimerNombre()+"',segundoNombre='"
                + usuario.getSegundoNombre()+"',primerApellido='"
                + usuario.getPrimerApellido()+"',segundoApellido='"
                + usuario.getSegundoApellido()+"',Cargo='"
                + usuario.getCargo()+"',Departamento='"
                + usuario.getDepartamento()+"',idRol='"
                + usuario.getIdRol()+"',fechaNacimiento='"
                + usuario.getFechaNacimiento().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +"',direccion='"    
                + usuario.getDireccion()+"',fechaModifica='"
                + usuario.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +"',usuarioModifica='"
                + usuario.getUsuarioModifica()+"' WHERE idUsuario="
                + String.valueOf(usuario.getIdUsuario());
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(Usuario usuario) {
        String sql = "UPDATE Usuario SET estado='"
                + usuario.getEstado()+"',fechaElimina='"
                + usuario.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +"',usuarioElimina='"
                + usuario.getUsuarioElimina()+"' WHERE idUsuario="
                + usuario.getIdUsuario();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Usuario> listar() {
        String sql = "SELECT * FROM Usuario WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Usuario> usuarios = new ArrayList();
        for(Map row : rows){
            Usuario usu = new Usuario();
            usu.setIdUsuario((int) row.get("idUsuario"));
            usu.setUsername((String) row.get("username"));
            usu.setCodigoEmpleado((String) row.get("codigoEmpleado"));
            usu.setCedula((String) row.get("cedula"));
            usu.setPrimerNombre((String) row.get("primerNombre"));
            usu.setSegundoNombre((String) row.get("segundoNombre"));
            usu.setPrimerApellido((String) row.get("primerApellido"));
            usu.setSegundoApellido((String) row.get("segundoApellido"));  
            usu.setDepartamento((String) row.get("departamento"));
            usu.setDireccion((String) row.get("direccion"));  
            usu.setCargo((String) row.get("cargo"));
            usu.setFechaNacimiento((LocalDate) row.get("fechaNacimiento"));              
            usuarios.add(usu);
        }
        return usuarios;
    }

    @Override
    public Usuario leer(int idUsuario) {
        String sql = "SELECT * FROM Usuario WHERE idUsuario="+String.valueOf(idUsuario);
        List<Map> data = bd.execute(sql);
        Usuario usu = new Usuario();
        for(Map da : data){
            usu.setIdUsuario((int) da.get("idUsuario"));
            usu.setPrimerNombre((String) da.get("primerNombre"));
            usu.setSegundoNombre((String) da.get("segundoNombre"));
            usu.setPrimerApellido((String) da.get("primerApellido"));
            usu.setSegundoApellido((String) da.get("segundoApellido"));
            usu.setCodigoEmpleado((String) da.get("codigoEmpleado"));
            usu.setCedula((String) da.get("cedula"));
            usu.setCargo((String) da.get("cargo"));
            usu.setDireccion((String) da.get("direccion"));
            usu.setDepartamento((String) da.get("departamento"));
            usu.setFechaNacimiento((LocalDate) da.get("fechaNacimiento"));
        }
        return usu;
    }
    
}
