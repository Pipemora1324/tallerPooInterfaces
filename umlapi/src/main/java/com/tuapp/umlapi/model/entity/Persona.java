package com.tuapp.umlapi.model.entity;

import jakarta.persistence.*;

// esta clase NO es tabla, pero se hereda
@MappedSuperclass
public abstract class Persona {

    protected String nombre;
    protected String correo;

    public Persona() {
    }

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}
