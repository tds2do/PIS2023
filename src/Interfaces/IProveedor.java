/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Proveedor;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IProveedor {
    public Boolean registrar(Proveedor proveedor);
    public Boolean modificar(Proveedor proveedor);
    public Boolean eliminar(Proveedor proveedor);
    public List<Proveedor> listar();  
    public Proveedor leer(int idProveedor);
}
