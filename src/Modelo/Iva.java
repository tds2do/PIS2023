/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public class Iva {
    
    private String clave;
    private float valor;

    public Iva(){
    
    }

    public Iva(String clave, float valor) {
        this.clave = clave;
        this.valor = valor;
    }
    
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    public String toString(){
        return this.clave;
    
    }
    
    
    
}
