/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IParametro;
import Modelo.DataBase;
import Modelo.Parametro;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class ParametroDAO implements IParametro{

    DataBase bd = new DataBase();
    
    @Override
    public Boolean registrar(Parametro categoria) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Boolean modificar(Parametro categoria) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Boolean eliminar(Parametro categoria) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Parametro> listar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Parametro leer(String abreviatura) {
        String sql = "SELECT * FROM ParametroGeneral WHERE abreviatura='"+abreviatura+"' AND estado=1";
        List<Map> data = bd.execute(sql);
        Parametro param = new Parametro();
        for(Map da : data){
            param.setIdParametroGeneral((int) da.get("idParametroGeneral"));
            param.setNombre((String) da.get("nombre"));
            param.setAbreviatura((String) da.get("abreviatura"));
            param.setValor((String) da.get("valor"));
        }
        return param;
    }
    
}
