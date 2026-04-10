package com.tuapp.umlapi.service;

import com.tuapp.umlapi.model.entity.Profesor;
import com.tuapp.umlapi.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// lógica del profesor
@Service
public class ProfesorService {

    private final ProfesorRepository repository;

    public ProfesorService(ProfesorRepository repository) {
        this.repository = repository;
    }

    public Profesor guardar(Profesor profesor) {
        return repository.save(profesor);
    }

    public List<Profesor> listar() {
        return repository.findAll();
    }

    // lógica de evaluación
    public String evaluar(double nota) {

        if (nota >= 3.0) {
            return "Estudiante aprobado";
        } else {
            return "Estudiante reprobado";
        }
    }
}
