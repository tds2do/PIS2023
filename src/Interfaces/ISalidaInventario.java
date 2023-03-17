/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Salida;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface ISalidaInventario {
    public Boolean registrar(Salida salida);
    public Boolean modificar(Salida salida);
    public Boolean eliminar(Salida salida);
    public List<Salida> listar();
    public Salida leer(int idSalida);
}
