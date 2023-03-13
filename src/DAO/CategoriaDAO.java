/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.ICategoria;
import Modelo.Categoria;
import Modelo.DataBase;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
                + categoria.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"','"
                + categoria.getUsuarioIngreso()+"', "
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
    public Boolean modificar(Categoria categoria) {
        String sql = "UPDATE Producto SET nombre='"
                + categoria.getNombre()+"',abreviatura='"
                + categoria.getAbreviatura()+"',descripcion='"
                + categoria.getDescripcion()+"',fechaModifica='"
                + categoria.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioModifica='"
                + categoria.getUsuarioModifica()+"' WHERE idCategoria="
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
                + categoria.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"',usuarioElimina='"
                + categoria.getUsuarioElimina()+"' WHERE idCategoria="
                + categoria.getIdCategoria();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Categoria> listar() {
        String sql = "SELECT * FROM Categoria WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Categoria> Categorias = new ArrayList();
        for(Map row : rows){
            Categoria cat = new Categoria();
            cat.setIdCategoria((int) row.get("id"));
            cat.setNombre((String) row.get("nombre"));
            cat.setAbreviatura((String) row.get("abreviatura"));
            cat.setDescripcion((String) row.get("descripcion"));
            Categorias.add(cat);
        }
        return Categorias;
    }

    @Override
    public Categoria leer(int idCategoria) {
        String sql = "SELECT * FROM Categoria WHERE idCategoria="+idCategoria;
        List<Map> data = bd.execute(sql);
        Categoria cat = new Categoria();
        for(Map da : data){
            cat.setIdCategoria((int) da.get("idCategoria"));
            cat.setNombre((String) da.get("nombre"));
            cat.setAbreviatura((String) da.get("abreviatura"));
            cat.setDescripcion((String) da.get("descripcion"));
        }
        return cat;
    }
    
    
}
