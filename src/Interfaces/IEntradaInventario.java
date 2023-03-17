/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Entrada;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IEntradaInventario {
    public Boolean registrar(Entrada entrada);
    public Boolean modificar(Entrada entrada);
    public Boolean eliminar(Entrada entrada);
    public List<Entrada> listar();
    public Entrada leer(int idEntrada);
}
