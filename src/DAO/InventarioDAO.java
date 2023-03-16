/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.DataBase;
import Modelo.Salida;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class InventarioDAO {
    
    DataBase bd = new DataBase();
    
    public List<Salida> listar() {
        String sql = "SELECT * FROM salidaproducto WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Salida> salidas = new ArrayList();
        for(Map row : rows){
            Salida ent = new Salida();
            ent.setIdSalidaProducto((int) row.get("idEntradaProducto"));
            ent.setCodigo((String) row.get("codigo"));
            ent.setIdCliente((String) row.get("idCliente"));
            ent.setFechaSalida((LocalDate) row.get("fechaSalida"));
            ent.setSubtotal((float) row.get("subtotal"));
            ent.setValorIva((float) row.get("valoIva"));
            ent.setValorDescuento((float) row.get("valorDescuento"));
            ent.setTotal((float) row.get("total"));
            salidas.add(ent);
        }
        return salidas;
    }
}
