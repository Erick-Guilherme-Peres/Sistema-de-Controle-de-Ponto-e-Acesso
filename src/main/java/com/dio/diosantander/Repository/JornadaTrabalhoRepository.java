package com.dio.diosantander.Repository;

import com.dio.diosantander.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {
    Optional<JornadaTrabalho> findAllById(Long idJornada);
}
