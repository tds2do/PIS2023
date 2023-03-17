/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IProducto;
import Modelo.Cliente;
import Modelo.DataBase;
import Modelo.Producto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class ProductoDAO implements IProducto{
    
    DataBase bd = new DataBase();
    
    @Override
    public boolean registrar(Producto producto) {
        
        String sql = "INSERT INTO Producto(`codigo`, `nombre`, `descripcion`, `idCategoria`, `idMedida`, `precio`, `porcentajeIva`, `fechaCaducidad`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + producto.getCodigo()+"','"
                + producto.getNombre()+"','"
                + producto.getDescripcion()+"','"
                + producto.getIdCategoria()+"','"
                + producto.getIdMedida()+"','"
                + producto.getPrecio()+"','"
                + producto.getPorcentajeIva()+"','"
                + producto.getFechaCaducidad()+"','"
                + producto.getEstado()+"','"
                + producto.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"','"
                + producto.getUsuarioIngreso()+"', "
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
    public boolean modificar(Producto producto) {
        String sql = "UPDATE Producto SET codigo='"
                + producto.getCodigo()+"',nombre='"
                + producto.getNombre()+"',descripcion='"
                + producto.getDescripcion()+"',idCategoria='"
                + producto.getIdCategoria()+"',idMedida='"
                + producto.getIdMedida()+"',precio='"
                + producto.getPrecio()+"',porcentajeIva='"
                + producto.getPorcentajeIva()+"',fechaCaducidad='"
                + producto.getFechaCaducidad()+"',fechaModifica='"
                + producto.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioModifica='"
                + producto.getUsuarioModifica()+"' WHERE idProducto="
                + producto.getIdProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }        

    @Override
    public boolean eliminar(Producto producto) {

        String sql = "UPDATE Producto SET estado='"
                + producto.getEstado()+"',fechaElimina='"
                + producto.getFechaElimina()+"',usuarioElimina='"
                + producto.getUsuarioElimina()+"' WHERE idProducto="
                + producto.getIdProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Producto> listar() {
        String sql = "SELECT * FROM Producto WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Producto> productos = new ArrayList();
        for(Map row : rows){
            Producto pro = new Producto();
            pro.setIdProducto((int) row.get("idProducto"));
            pro.setCodigo((String) row.get("codigo"));
            pro.setNombre((String) row.get("nombre"));
            pro.setDescripcion((String) row.get("descripcion"));
            pro.setIdCategoria((int) row.get("idCategoria"));
            pro.setIdMedida((int) row.get("idMedida"));
            pro.setPrecio((float) row.get("precio"));  
            pro.setPorcentajeIva((int) row.get("porcentajeIva"));
            pro.setFechaCaducidad(LocalDate.parse(row.get("fechaCaducidad").toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));  
            productos.add(pro);
        }
        return productos;
    }

    @Override
    public Producto leer(int idProducto) {

        String sql = "SELECT * FROM Producto WHERE idProducto="+idProducto;
        List<Map> data = bd.execute(sql);
        Producto pro = new Producto();
        for(Map da : data){
            pro.setIdProducto((int) da.get("idProducto"));
            pro.setCodigo((String) da.get("codigo"));
            pro.setNombre((String) da.get("nombre"));
            pro.setDescripcion((String) da.get("descripcion"));
            pro.setIdCategoria((int) da.get("idCategoria"));
            pro.setIdMedida((int) da.get("idMedida"));
            pro.setPrecio((float) da.get("precio"));  
            pro.setPorcentajeIva((int) da.get("porcentajeIva"));
            pro.setFechaCaducidad(LocalDate.parse(da.get("fechaCaducidad").toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd"))); 
        }
        return pro;
        
    }
        
        
    


    
}
