/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author Jonathan
 */
public class Categoria extends RegistroAuditoria{
    
    private int idCategoria;
    private String nombre;
    private String abreviatura;
    private String descripcion;

    
    public Categoria(){

    }
    
    public Categoria(int idCategoria, String nombre){
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public String toString(){
        
        return this.nombre; 
    }
    
    
}
