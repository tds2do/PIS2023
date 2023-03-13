/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IMedida;
import Modelo.DataBase;
import Modelo.Medida;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class MedidaDAO implements IMedida{

    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(Medida medida) {
        String sql = "INSERT INTO Categoria(`descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + medida.getDescripcion()+"','"
                + medida.getAbreviatura()+"','"
                + medida.getEstado()+"','"
                + medida.getFechaIngreso()+"','"
                + medida.getUsuarioIngreso()+"', "
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
    public Boolean modificar(Medida medida) {
        String sql = "UPDATE Producto SET descripcion='"
                + medida.getDescripcion()+"',abreviatura='"
                + medida.getAbreviatura()+"',fechaModifica='"
                + medida.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioModifica='"
                + medida.getUsuarioModifica()+"' WHERE idMedida="
                + medida.getIdMedida();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(Medida medida) {
        String sql = "UPDATE Medida SET estado='"
                + medida.getEstado()+"',fechaElimina='"
                + medida.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioElimina='"
                + medida.getUsuarioElimina()+"' WHERE idMedida="
                + medida.getIdMedida();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Medida> consultar() {
        String sql = "SELECT * FROM Categoria WHERE estado = 1";
        List rows = bd.execute(sql);
        return rows;
    }
    
}
