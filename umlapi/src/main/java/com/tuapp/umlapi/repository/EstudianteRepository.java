package com.tuapp.umlapi.repository;

import com.tuapp.umlapi.model.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

// repository para manejar estudiantes en la BD
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
