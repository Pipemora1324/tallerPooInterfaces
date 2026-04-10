package com.tuapp.umlapi.model.entity;

import com.tuapp.umlapi.model.interfaces.Evaluador;
import jakarta.persistence.*;

// esta clase es una entidad de la BD
@Entity
public class Profesor extends Persona implements Evaluador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String especialidad;

    public Profesor() {
    }

    public Profesor(String nombre, String correo, String especialidad) {
        super(nombre, correo);
        this.especialidad = especialidad;
    }

    public Long getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // implementación correcta de la interfaz
    @Override
    public void evaluar(double nota) {
        if (nota >= 3.0) {
            System.out.println("Estudiante aprobado");
        } else {
            System.out.println("Estudiante reprobado");
        }
    }
}
