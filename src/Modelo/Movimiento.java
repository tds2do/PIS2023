/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Movimiento extends RegistroAuditoria{
    
    private String codigo;
    private float subtotal;
    private float valorIva;
    private float valorDescuento;
    private float total;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getValorIva() {
        return valorIva;
    }

    public void setValorIva(float valorIva) {
        this.valorIva = valorIva;
    }

    public float getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(float valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
