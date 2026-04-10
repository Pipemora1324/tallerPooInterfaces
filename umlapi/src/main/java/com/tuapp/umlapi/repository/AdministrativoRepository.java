package com.tuapp.umlapi.repository;

import com.tuapp.umlapi.model.entity.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;

// repository para administrativos
public interface AdministrativoRepository extends JpaRepository<Administrativo, Long> {
}
