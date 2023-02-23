/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IProducto;
import Modelo.DataBase;
import Modelo.Producto;
import java.util.List;

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
                + producto.getFechaIngreso()+"','"
                + producto.getUsuarioIngreso()+"','"
                + null+"','"
                + null+"','"
                + null+"','"
                + null+"')";
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
                + producto.getPrecio()+"',procentajeIva='"
                + producto.getPorcentajeIva()+"',fechaCaducidad='"
                + producto.getFechaCaducidad()+"',estado='"
                + producto.getEstado()+"',fechaIngreso='"
                + producto.getFechaIngreso()+"',usuarioIngreso='"
                + producto.getUsuarioIngreso()+"',fechaModifica='"
                + producto.getFechaModifica()+"',usuarioModifica='"
                + producto.getUsuarioModifica()+"',fechaElimina='"
                + producto.getFechaElimina()+"',usuarioElimina='"
                + producto.getUsuarioElimina()+"' WHERE idProducto="
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
    public List<Producto> consultar() {
        
        String sql = "SELECT * FROM Producto WHERE estado = 1";
        List rows = bd.execute(sql);
        return rows;
        
    }
        
        
    


    
}
