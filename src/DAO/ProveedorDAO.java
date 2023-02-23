/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IProveedor;
import Modelo.DataBase;
import Modelo.Proveedor;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class ProveedorDAO implements IProveedor{

    DataBase bd = new DataBase();
    
    @Override
    public Boolean registrar(Proveedor proveedor) {
        
        String sql = "INSERT INTO Proveedor(`ruc`, `razonSocial`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `correo`, `direccion`, `telefono`, `celular`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + proveedor.getRuc()+"','"
                + proveedor.getRazonSocial()+"','"
                + proveedor.getPrimerNombre()+"','"
                + proveedor.getSegundoNombre()+"','"
                + proveedor.getPrimerApellido()+"','"
                + proveedor.getSegundoApellido()+"','"
                + proveedor.getCorreo()+"','"
                + proveedor.getDireccion()+"','"
                + proveedor.getTelefono()+"','"
                + proveedor.getCelular()+"','"                
                + proveedor.getEstado()+"','"
                + proveedor.getFechaIngreso()+"','"
                + proveedor.getUsuarioIngreso()+"','"
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
    public Boolean modificar(Proveedor proveedor) {
        String sql = "UPDATE Producto SET ruc='"
                + proveedor.getRuc()+"',razonSocial='"
                + proveedor.getRazonSocial()+"',primerNombre='"
                + proveedor.getPrimerNombre()+"',segundoNombre='"
                + proveedor.getSegundoNombre()+"',primerApellido='"
                + proveedor.getPrimerApellido()+"',segundoApellido='"
                + proveedor.getSegundoApellido()+"',correo='"
                + proveedor.getCorreo()+"',direccion='"
                + proveedor.getDireccion()+"',telefono='"
                + proveedor.getTelefono()+"',celular='"                
                + proveedor.getCelular()+"',estado='"
                + proveedor.getEstado()+"',fechaIngreso='"
                + proveedor.getFechaIngreso()+"',usuarioIngreso='"
                + proveedor.getUsuarioIngreso()+"',fechaModifica='"
                + proveedor.getFechaModifica()+"',usuarioModifica='"
                + proveedor.getUsuarioModifica()+"',fechaElimina='"
                + proveedor.getFechaElimina()+"',usuarioElimina='"
                + proveedor.getUsuarioElimina()+"' WHERE idProveedor="
                + proveedor.getIdProveedor();
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }        

    @Override
    public Boolean eliminar(Proveedor proveedor) {

        String sql = "UPDATE Proveedor SET estado='"
                + proveedor.getEstado()+"',fechaElimina='"
                + proveedor.getFechaElimina()+"',usuarioElimina='"
                + proveedor.getUsuarioElimina()+"' WHERE idProveedor="
                + proveedor.getIdProveedor();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Proveedor> consultar() {
        
        String sql = "SELECT * FROM Proveedor WHERE estado = 1";
        List rows = bd.execute(sql);
        return rows;
        
    }


        

    
}
