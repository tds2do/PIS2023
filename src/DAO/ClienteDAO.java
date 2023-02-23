/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.ICliente;
import Modelo.Cliente;
import Modelo.DataBase;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class ClienteDAO implements ICliente{

   DataBase bd = new DataBase();
    
    @Override
    public Boolean registrar(Cliente cliente) {
        
        String sql = "INSERT INTO Cliente(`ruc`, `razonSocial`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `correo`, `direccion`, `telefono`, `celular`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + cliente.getRuc()+"','"
                + cliente.getRazonSocial()+"','"
                + cliente.getPrimerNombre()+"','"
                + cliente.getSegundoNombre()+"','"
                + cliente.getPrimerApellido()+"','"
                + cliente.getSegundoApellido()+"','"
                + cliente.getCorreo()+"','"
                + cliente.getDireccion()+"','"
                + cliente.getTelefono()+"','"
                + cliente.getCelular()+"','"                
                + cliente.getEstado()+"','"
                + cliente.getFechaIngreso()+"','"
                + cliente.getUsuarioIngreso()+"','"
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
    public Boolean modificar(Cliente cliente) {
        String sql = "UPDATE Cliente SET ruc='"
                + cliente.getRuc()+"',razonSocial='"
                + cliente.getRazonSocial()+"',primerNombre='"
                + cliente.getPrimerNombre()+"',segundoNombre='"
                + cliente.getSegundoNombre()+"',primerApellido='"
                + cliente.getPrimerApellido()+"',segundoApellido='"
                + cliente.getSegundoApellido()+"',correo='"
                + cliente.getCorreo()+"',direccion='"
                + cliente.getDireccion()+"',telefono='"
                + cliente.getTelefono()+"',celular='"                
                + cliente.getCelular()+"',estado='"
                + cliente.getEstado()+"',fechaIngreso='"
                + cliente.getFechaIngreso()+"',usuarioIngreso='"
                + cliente.getUsuarioIngreso()+"',fechaModifica='"
                + cliente.getFechaModifica()+"',usuarioModifica='"
                + cliente.getUsuarioModifica()+"',fechaElimina='"
                + cliente.getFechaElimina()+"',usuarioElimina='"
                + cliente.getUsuarioElimina()+"' WHERE idProveedor="
                + cliente.getIdCliente();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }        

    @Override
    public Boolean eliminar(Cliente cliente) {

        String sql = "UPDATE Cliente SET estado='"
                + cliente.getEstado()+"',fechaElimina='"
                + cliente.getFechaElimina()+"',usuarioElimina='"
                + cliente.getUsuarioElimina()+"' WHERE idCliente="
                + cliente.getIdCliente();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Cliente> consultar() {
        
        String sql = "SELECT * FROM Cliente WHERE estado = 1";
        List rows = bd.execute(sql);
        return rows;
        
    }    
}
