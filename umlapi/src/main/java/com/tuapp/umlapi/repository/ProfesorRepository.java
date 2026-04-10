package com.tuapp.umlapi.repository;

import com.tuapp.umlapi.model.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

// repository para profesor
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
