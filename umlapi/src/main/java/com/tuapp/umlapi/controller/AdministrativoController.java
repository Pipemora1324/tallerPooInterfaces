package com.tuapp.umlapi.controller;

import com.tuapp.umlapi.model.entity.Administrativo;
import com.tuapp.umlapi.service.AdministrativoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// endpoints administrativos
@RestController
@RequestMapping("/administrativos")
public class AdministrativoController {

    private final AdministrativoService service;

    public AdministrativoController(AdministrativoService service) {
        this.service = service;
    }

    // crear administrativo
    @PostMapping
    public Administrativo crear(@RequestBody Administrativo administrativo) {
        return service.guardar(administrativo);
    }

    // listar administrativos
    @GetMapping
    public List<Administrativo> listar() {
        return service.listar();
    }

    // aprobar solicitud
    @PostMapping("/aprobar")
    public String aprobar(@RequestParam String codigo) {
        return service.aprobarSolicitud(codigo);
    }
}
