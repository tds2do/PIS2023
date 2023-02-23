/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.ICategoria;
import Modelo.Categoria;
import Modelo.DataBase;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class CategoriaDAO implements ICategoria{
    
    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(Categoria categoria) {
        String sql = "INSERT INTO Categoria(`nombre`, `abreviatura`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + categoria.getNombre()+"','"
                + categoria.getAbreviatura()+"','"
                + categoria.getDescripcion()+"','"
                + categoria.getEstado()+"','"
                + categoria.getFechaIngreso()+"','"
                + categoria.getUsuarioIngreso()+"','"
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
    public Boolean modificar(Categoria categoria) {
        String sql = "UPDATE Producto SET nombre='"
                + categoria.getNombre()+"',abreviatura='"
                + categoria.getAbreviatura()+"',descripcion='"
                + categoria.getDescripcion()+"',estado='"
                + categoria.getEstado()+"',fechaIngreso='"
                + categoria.getFechaIngreso()+"',usuarioIngreso='"
                + categoria.getUsuarioIngreso()+"',fechaModifica='"
                + categoria.getFechaModifica()+"',usuarioModifica='"
                + categoria.getUsuarioModifica()+"',fechaElimina='"
                + categoria.getFechaElimina()+"',usuarioElimina='"
                + categoria.getUsuarioElimina()+"' WHERE idCategoria="
                + categoria.getIdCategoria();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(Categoria categoria) {
        String sql = "UPDATE Categoria SET estado='"
                + categoria.getEstado()+"',fechaElimina='"
                + categoria.getFechaElimina()+"',usuarioElimina='"
                + categoria.getUsuarioElimina()+"' WHERE idCategoria="
                + categoria.getIdCategoria();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Categoria> consultar() {
        String sql = "SELECT * FROM Categoria WHERE estado = 1";
        List rows = bd.execute(sql);
        return rows;
    }
    
}
