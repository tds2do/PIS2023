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
public class Salida extends Movimiento{
    private int idSalidaProducto;
    private String idCliente;
    private LocalDate fechaSalida;

    public int getIdSalidaProducto() {
        return idSalidaProducto;
    }

    public void setIdSalidaProducto(int idSalidaProducto) {
        this.idSalidaProducto = idSalidaProducto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
}
