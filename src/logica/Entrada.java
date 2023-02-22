/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Entrada extends Movimiento{
    private int idEntradaProducto;
    private String idProveedor;
    private LocalDate fechaEntrada;


    public int getIdEntradaProducto() {
        return idEntradaProducto;
    }

    public void setIdEntradaProducto(int idEntradaProducto) {
        this.idEntradaProducto = idEntradaProducto;
    }


    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


    
    
}
