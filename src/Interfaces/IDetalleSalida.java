/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.DetalleSalida;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IDetalleSalida {
    public Boolean registrar(DetalleSalida detalle);
    public Boolean modificar(DetalleSalida detalle);
    public Boolean eliminar(DetalleSalida detalle);
    public List<DetalleSalida> consultar();    
}
