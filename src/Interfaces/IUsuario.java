/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IUsuario {
    public Boolean registrar(Usuario usuario);
    public Boolean modificar(Usuario usuario);
    public Boolean eliminar(Usuario usuario);
    public List<Usuario> listar();        
    public Usuario leer(int idUsuario);
}
