/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Medida;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IMedida {
    public Boolean registrar(Medida medida);
    public Boolean modificar(Medida medida);
    public Boolean eliminar(Medida medida);
    public List<Medida> consultar();
}
