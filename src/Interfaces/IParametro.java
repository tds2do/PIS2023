/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Parametro;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IParametro {

    public Boolean registrar(Parametro categoria);
    public Boolean modificar(Parametro categoria);
    public Boolean eliminar(Parametro categoria);
    public List<Parametro> listar();
    public Parametro leer(String abreviatura);

}
