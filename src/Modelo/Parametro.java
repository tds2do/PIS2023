/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public class Parametro extends RegistroAuditoria{
    private int idParametroGeneral;
    private String nombre;
    private String valor;
    private String abreviatura;
    
    public Parametro(){
    }

    public int getIdParametroGeneral() {
        return idParametroGeneral;
    }

    public void setIdParametroGeneral(int idParametroGeneral) {
        this.idParametroGeneral = idParametroGeneral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    
    

    
    
}
