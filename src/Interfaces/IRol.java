/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Rol;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IRol {
    public Boolean registrar(Rol rol);
    public Boolean modificar(Rol rol);
    public Boolean eliminar(Rol rol);
    public List<Rol> listar();
    public Rol leer(int idRol);
}
