/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IRol;
import Modelo.Rol;
import Modelo.DataBase;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class RolDAO implements IRol{
    
    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(Rol rol) {
        String sql = "INSERT INTO Rol(`nombre`, `abreviatura`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + rol.getNombre()+"','"
                + rol.getAbreviatura()+"','"
                + rol.getDescripcion()+"','"
                + rol.getEstado()+"','"
                + rol.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"','"
                + rol.getUsuarioIngreso()+"', "
                + null+", "
                + null+", "
                + null+", "
                + null+") ";
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean modificar(Rol rol) {
        String sql = "UPDATE Rol SET nombre='"
                + rol.getNombre()+"',abreviatura='"
                + rol.getAbreviatura()+"',descripcion='"
                + rol.getDescripcion()+"',fechaModifica='"
                + rol.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioModifica='"
                + rol.getUsuarioModifica()+"' WHERE idRol="
                + rol.getIdRol();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(Rol rol) {
        String sql = "UPDATE Rol SET estado='"
                + rol.getEstado()+"',fechaElimina='"
                + rol.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioElimina='"
                + rol.getUsuarioElimina()+"' WHERE idRol="
                + rol.getIdRol();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Rol> listar() {
        String sql = "SELECT * FROM Rol WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Rol> Rols = new ArrayList();
        for(Map row : rows){
            Rol rol = new Rol();
            rol.setIdRol((int) row.get("idRol"));
            rol.setNombre((String) row.get("nombre"));
            rol.setAbreviatura((String) row.get("abreviatura"));
            rol.setDescripcion((String) row.get("descripcion"));
            Rols.add(rol);
        }
        return Rols;
    }

    @Override
    public Rol leer(int idRol) {
        String sql = "SELECT * FROM Rol WHERE idRol="+idRol;
        List<Map> data = bd.execute(sql);
        Rol rol = new Rol();
        for(Map da : data){
            rol.setIdRol((int) da.get("idRol"));
            rol.setNombre((String) da.get("nombre"));
            rol.setAbreviatura((String) da.get("abreviatura"));
            rol.setDescripcion((String) da.get("descripcion"));
        }
        return rol;
    }
    
    
}
