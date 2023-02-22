/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.DetalleEntrada;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IDetalleEntrada {
    public Boolean registrar(DetalleEntrada detalle);
    public Boolean modificar(DetalleEntrada detalle);
    public Boolean eliminar(DetalleEntrada detalle);
    public List<DetalleEntrada> consultar();    
}
