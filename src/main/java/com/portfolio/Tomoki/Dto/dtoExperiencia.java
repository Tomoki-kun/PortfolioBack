
package com.portfolio.Tomoki.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcionExp;
    
    //Constructor

    public dtoExperiencia() {
    }        
public dtoExperiencia(String nombreExp, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
    }
    
    
    //Getter & Setter

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }
}
