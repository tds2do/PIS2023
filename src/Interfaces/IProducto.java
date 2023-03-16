/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IProducto {
    
    public boolean registrar(Producto producto);
    public boolean modificar(Producto producto);
    public boolean eliminar(Producto producto);
    public List<Producto> listar();        
    public Producto leer(int idProducto);
    
    
}
