/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Categoria;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface ICategoria {
    public Boolean registrar(Categoria categoria);
    public Boolean modificar(Categoria categoria);
    public Boolean eliminar(Categoria categoria);
    public List<Categoria> consultar();
}
