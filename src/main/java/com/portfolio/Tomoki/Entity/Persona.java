package com.portfolio.Tomoki.Entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id
    private int id;
    
    
    @Size(min = 0, max = 100, message = "no cumple con la longitud")
    private String nombre;
    
    
    @Size(min = 0, max = 100, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    private String descripcion;
    
    private String img;

    
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.descripcion = "";
        this.img = "";
        this.id = 1;
    }
    public Persona(String nombre, String apellido, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
        this.id = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    
}
