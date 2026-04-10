package com.tuapp.umlapi.service;

import com.tuapp.umlapi.model.entity.Administrativo;
import com.tuapp.umlapi.repository.AdministrativoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// lógica de administrativos
@Service
public class AdministrativoService {

    private final AdministrativoRepository repository;

    public AdministrativoService(AdministrativoRepository repository) {
        this.repository = repository;
    }

    public Administrativo guardar(Administrativo administrativo) {
        return repository.save(administrativo);
    }

    public List<Administrativo> listar() {
        return repository.findAll();
    }

    // lógica de aprobación
    public String aprobarSolicitud(String codigo) {
        return "Solicitud " + codigo + " aprobada correctamente";
    }
}
