/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IProveedor;
import Modelo.Cliente;
import Modelo.DataBase;
import Modelo.Proveedor;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
                + proveedor.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "','"
                + proveedor.getUsuarioIngreso()+"', "
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
    public Boolean modificar(Proveedor proveedor) {
        String sql = "UPDATE Proveedor SET ruc='"
                + proveedor.getRuc()+"',razonSocial='"
                + proveedor.getRazonSocial()+"',primerNombre='"
                + proveedor.getPrimerNombre()+"',segundoNombre='"
                + proveedor.getSegundoNombre()+"',primerApellido='"
                + proveedor.getPrimerApellido()+"',segundoApellido='"
                + proveedor.getSegundoApellido()+"',correo='"
                + proveedor.getCorreo()+"',direccion='"
                + proveedor.getDireccion()+"',telefono='"
                + proveedor.getTelefono()+"',celular='"                
                + proveedor.getCelular()+"',fechaModifica='"
                + proveedor.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +"',usuarioModifica='"
                + proveedor.getUsuarioModifica()+"' WHERE idProveedor="
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
                + proveedor.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +"',usuarioElimina='"
                + proveedor.getUsuarioElimina()+"' WHERE idProveedor="
                + proveedor.getIdProveedor();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Proveedor> listar() {
        
        String sql = "SELECT * FROM Proveedor WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Proveedor> proveedores = new ArrayList();
        for(Map row : rows){
            Proveedor pro = new Proveedor();
            pro.setIdProveedor((int) row.get("idProveedor"));
            pro.setRuc((String) row.get("ruc"));
            pro.setRazonSocial((String) row.get("razonSocial"));
            pro.setPrimerNombre((String) row.get("primerNombre"));
            pro.setSegundoNombre((String) row.get("segundoNombre"));
            pro.setPrimerApellido((String) row.get("primerApellido"));
            pro.setSegundoApellido((String) row.get("segundoApellido"));  
            pro.setCorreo((String) row.get("correo"));
            pro.setDireccion((String) row.get("direccion"));  
            pro.setTelefono((String) row.get("telefono"));
            pro.setCelular((String) row.get("celular"));              
            proveedores.add(pro);
        }
        return proveedores;
        
    }    

    @Override
    public Proveedor leer(int idProveedor) {
        String sql = "SELECT * FROM Proveedor WHERE idProveedor="+String.valueOf(idProveedor);
        List<Map> data = bd.execute(sql);
        Proveedor pro = new Proveedor();
        for(Map da : data){
            pro.setIdProveedor((int) da.get("idProveedor"));
            pro.setPrimerNombre((String) da.get("primerNombre"));
            pro.setSegundoNombre((String) da.get("segundoNombre"));
            pro.setPrimerApellido((String) da.get("primerApellido"));
            pro.setSegundoApellido((String) da.get("segundoApellido"));
            pro.setRuc((String) da.get("ruc"));
            pro.setRazonSocial((String) da.get("razonSocial"));
            pro.setCorreo((String) da.get("correo"));
            pro.setDireccion((String) da.get("direccion"));
            pro.setTelefono((String) da.get("telefono"));
            pro.setCelular((String) da.get("celular"));
        }
        return pro;
    }
    



        

    
}
