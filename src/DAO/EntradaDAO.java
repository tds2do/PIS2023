/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IEntradaInventario;
import Modelo.Categoria;
import Modelo.DataBase;
import Modelo.Entrada;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class EntradaDAO implements IEntradaInventario{
    
    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(Entrada entrada) {
        String sql = "INSERT INTO entradaproducto(`codigo`, `idProveedor`, `fechaEntrada`, `subtotal`, `valorIva`, `valorDescuento`, `total`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + entrada.getCodigo()+"','"
                + entrada.getIdProveedor()+"','"
                + entrada.getFechaEntrada().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"','"
                + entrada.getSubtotal()+"','"
                + entrada.getValorIva()+"','"
                + entrada.getValorDescuento()+"','"
                + entrada.getTotal()+"','"
                + entrada.getEstado()+"','"
                + entrada.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"','"
                + entrada.getUsuarioIngreso()+"', "
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
    public Boolean modificar(Entrada entrada) {
        String sql = "UPDATE entradaproducto SET codigo='"
                + entrada.getCodigo()+"',idproveedor='"
                + entrada.getIdProveedor()+"',fechaEntrada='"
                + entrada.getFechaEntrada()+"',subtotal='"
                + entrada.getSubtotal()+"',valorIva='"
                + entrada.getValorIva()+"',valorDescuento='"
                + entrada.getValorDescuento()+"',total='"
                + entrada.getTotal()+"',fechaModifica='"
                + entrada.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioModifica='"
                + entrada.getUsuarioModifica()+"' WHERE idEntradaProducto="
                + entrada.getIdEntradaProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(Entrada entrada) {
        String sql = "UPDATE entradaproducto SET estado='"
                + entrada.getEstado()+"',fechaElimina='"
                + entrada.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioElimina='"
                + entrada.getUsuarioElimina()+"' WHERE idEntradaProducto="
                + entrada.getIdEntradaProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Entrada> listar() {
        String sql = "SELECT * FROM entradaproducto WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Entrada> entradas = new ArrayList();
        for(Map row : rows){
            Entrada ent = new Entrada();
            ent.setIdEntradaProducto((int) row.get("idEntradaProducto"));
            ent.setCodigo((String) row.get("codigo"));
            ent.setIdProveedor((String) row.get("idProvedor"));
            ent.setFechaEntrada((LocalDate) row.get("fechaEntrada"));
            ent.setSubtotal((float) row.get("subtotal"));
            ent.setValorIva((float) row.get("valoIva"));
            ent.setValorDescuento((float) row.get("valorDescuento"));
            ent.setTotal((float) row.get("total"));
            entradas.add(ent);
        }
        return entradas;
    }

    @Override
    public Entrada leer(int idEntrada) {
        String sql = "SELECT * FROM entradaproducto WHERE idEntradaProducto="+idEntrada;
        List<Map> data = bd.execute(sql);
        Entrada ent = new Entrada();
        for(Map da : data){
            ent.setIdEntradaProducto((int) da.get("idEntradaProducto"));
            ent.setCodigo((String) da.get("codigo"));
            ent.setIdProveedor((String) da.get("idProvedor"));
            ent.setFechaEntrada((LocalDate) da.get("fechaEntrada"));
            ent.setSubtotal((float) da.get("subtotal"));
            ent.setValorIva((float) da.get("valoIva"));
            ent.setValorDescuento((float) da.get("valorDescuento"));
            ent.setTotal((float) da.get("total"));            
        }
        return ent;
    }
    
}
