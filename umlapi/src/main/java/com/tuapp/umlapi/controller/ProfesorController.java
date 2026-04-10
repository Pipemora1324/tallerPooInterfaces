package com.tuapp.umlapi.controller;

import com.tuapp.umlapi.model.entity.Profesor;
import com.tuapp.umlapi.service.ProfesorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// endpoints de profesor
@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorService service;

    public ProfesorController(ProfesorService service) {
        this.service = service;
    }

    // crear profesor
    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return service.guardar(profesor);
    }

    // listar profesores
    @GetMapping
    public List<Profesor> listar() {
        return service.listar();
    }

    // evaluar
    @PostMapping("/evaluar")
    public String evaluar(@RequestParam double nota) {
        return service.evaluar(nota);
    }
}
