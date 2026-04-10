package com.tuapp.umlapi.controller;

import com.tuapp.umlapi.model.entity.Estudiante;
import com.tuapp.umlapi.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// endpoints del estudiante
@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    // crear estudiante
    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return service.guardar(estudiante);
    }

    // listar estudiantes
    @GetMapping
    public List<Estudiante> listar() {
        return service.listar();
    }

    // login
    @PostMapping("/login")
    public boolean login(@RequestParam String correo,
                         @RequestParam String password) {

        return service.login(correo, password);
    }
}
