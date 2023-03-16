/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.ICliente;
import Modelo.Cliente;
import Modelo.DataBase;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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
                + cliente.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "','"
                + cliente.getUsuarioIngreso()+"', "
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
                + cliente.getCelular()+"',fechaModifica='"
                + cliente.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +"',usuarioModifica='"
                + cliente.getUsuarioModifica()+"' WHERE idCliente="
                + String.valueOf(cliente.getIdCliente());
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }        

    @Override
    public Boolean eliminar(Cliente cliente) {

        String sql = "UPDATE Cliente SET estado='"
                + cliente.getEstado()+"',fechaElimina='"
                + cliente.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +"',usuarioElimina='"
                + cliente.getUsuarioElimina()+"' WHERE idCliente="
                + cliente.getIdCliente();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Cliente> listar() {
        
        String sql = "SELECT * FROM Cliente WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Cliente> clientes = new ArrayList();
        for(Map row : rows){
            Cliente cli = new Cliente();
            cli.setIdCliente((int) row.get("idCliente"));
            cli.setRuc((String) row.get("ruc"));
            cli.setRazonSocial((String) row.get("razonSocial"));
            cli.setPrimerNombre((String) row.get("primerNombre"));
            cli.setSegundoNombre((String) row.get("segundoNombre"));
            cli.setPrimerApellido((String) row.get("primerApellido"));
            cli.setSegundoApellido((String) row.get("segundoApellido"));  
            cli.setCorreo((String) row.get("correo"));
            cli.setDireccion((String) row.get("direccion"));  
            cli.setTelefono((String) row.get("telefono"));
            cli.setCelular((String) row.get("celular"));              
            clientes.add(cli);
        }
        return clientes;
        
    }    

    @Override
    public Cliente leer(int idCliente) {
        String sql = "SELECT * FROM Cliente WHERE idCliente="+String.valueOf(idCliente);
        List<Map> data = bd.execute(sql);
        Cliente cli = new Cliente();
        for(Map da : data){
            cli.setIdCliente((int) da.get("idCliente"));
            cli.setPrimerNombre((String) da.get("primerNombre"));
            cli.setSegundoNombre((String) da.get("segundoNombre"));
            cli.setPrimerApellido((String) da.get("primerApellido"));
            cli.setSegundoApellido((String) da.get("segundoApellido"));
            cli.setRuc((String) da.get("ruc"));
            cli.setRazonSocial((String) da.get("razonSocial"));
            cli.setCorreo((String) da.get("correo"));
            cli.setDireccion((String) da.get("direccion"));
            cli.setTelefono((String) da.get("telefono"));
            cli.setCelular((String) da.get("celular"));
        }
        return cli;
    }
    
    
    
}
