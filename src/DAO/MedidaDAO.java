/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IMedida;
import Modelo.Categoria;
import Modelo.DataBase;
import Modelo.Medida;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class MedidaDAO implements IMedida{

    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(Medida medida) {
        String sql = "INSERT INTO Medida(`descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + medida.getDescripcion()+"','"
                + medida.getAbreviatura()+"','"
                + medida.getEstado()+"','"
                + medida.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +"','"
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
        String sql = "UPDATE Medida SET descripcion='"
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
    public List<Medida> listar() {
        String sql = "SELECT * FROM Medida WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Medida> medidas = new ArrayList();
        for(Map row : rows){
            Medida med = new Medida();
            med.setIdMedida((int) row.get("idMedida"));
            med.setAbreviatura((String) row.get("abreviatura"));
            med.setDescripcion((String) row.get("descripcion"));
            medidas.add(med);
        }
        return medidas;
    }

    @Override
    public Medida leer(int idMedida) {
        String sql = "SELECT * FROM Medida WHERE idMedida="+idMedida;
        List<Map> data = bd.execute(sql);
        Medida med = new Medida();
        for(Map da : data){
            med.setIdMedida((int) da.get("idMedida"));
            med.setAbreviatura((String) da.get("abreviatura"));
            med.setDescripcion((String) da.get("descripcion"));
        }
        return med;
    }
    
}
