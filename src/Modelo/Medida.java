/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author Jonathan
 */
public class Medida extends RegistroAuditoria{
    private int idMedida;
    private String descripcion;
    private String abreviatura;


    public Medida(){
    
    }
    
    public Medida(int idMedida, String abreviatura){
        this.idMedida = idMedida;
        this.abreviatura = abreviatura;
    
    }
    
    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String toString(){
        
        return this.abreviatura; 
    }
    
}
