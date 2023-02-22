/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Jonathan
 */
public class RegistroAuditoria {
    
    private int estado;
    private LocalDateTime fechaIngreso;
    private String usuarioIngreso;
    private LocalDateTime fechaModifica;
    private String usuarioModifica;    
    private LocalDateTime fechaElimina;
    private String usuarioElimina;
    

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    public LocalDateTime getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(LocalDateTime fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public LocalDateTime getFechaElimina() {
        return fechaElimina;
    }

    public void setFechaElimina(LocalDateTime fechaElimina) {
        this.fechaElimina = fechaElimina;
    }

    public String getUsuarioElimina() {
        return usuarioElimina;
    }

    public void setUsuarioElimina(String usuarioElimina) {
        this.usuarioElimina = usuarioElimina;
    }


    
    
}
