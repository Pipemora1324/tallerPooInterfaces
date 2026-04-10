package com.tuapp.umlapi.model.entity;

import com.tuapp.umlapi.model.interfaces.Aprobador;
import com.tuapp.umlapi.model.interfaces.Notificable;
import jakarta.persistence.*;

@Entity
public class Administrativo extends Persona implements Aprobador, Notificable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String area;

    public Administrativo() {
    }

    public Administrativo(String nombre, String correo, String area) {
        super(nombre, correo);
        this.area = area;
    }

    public Long getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    @Override
    public void aprobarSolicitud(String codigoSolicitud) {
        System.out.println("Solicitud aprobada: " + codigoSolicitud);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación administrativa: " + mensaje);
    }
}
