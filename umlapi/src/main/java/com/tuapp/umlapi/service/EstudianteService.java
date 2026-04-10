package com.tuapp.umlapi.service;

import com.tuapp.umlapi.model.entity.Estudiante;
import com.tuapp.umlapi.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// lógica de negocio del estudiante
@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    // guardar estudiante
    public Estudiante guardar(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    // listar estudiantes
    public List<Estudiante> listar() {
        return repository.findAll();
    }

    // login (lógica real va aquí, no en controller)
    public boolean login(String correo, String password) {

        List<Estudiante> estudiantes = repository.findAll();

        for (Estudiante e : estudiantes) {
            if (e.getCorreo().equals(correo) && password.equals("1234")) {
                return true;
            }
        }

        return false;
    }
}
