/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface ICliente {
    public Boolean registrar(Cliente cliente);
    public Boolean modificar(Cliente cliente);
    public Boolean eliminar(Cliente cliente);
    public List<Cliente> consultar();        
}
