package com.tuapp.umlapi.model.entity;

import com.tuapp.umlapi.model.interfaces.Autenticable;
import com.tuapp.umlapi.model.interfaces.Notificable;
import jakarta.persistence.*;

// esta clase ahora sí es una tabla en la BD
@Entity
public class Estudiante extends Persona implements Autenticable, Notificable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    public Estudiante() {
    }

    public Estudiante(String nombre, String correo, String codigo) {
        super(nombre, correo);
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public boolean login(String usuario, String password) {
        return usuario.equals(getCorreo()) && password.equals("1234");
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación para estudiante: " + mensaje);
    }
}
