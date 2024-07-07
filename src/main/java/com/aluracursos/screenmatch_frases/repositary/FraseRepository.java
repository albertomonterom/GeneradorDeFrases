package com.aluracursos.screenmatch_frases.repositary;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query(value = "SELECT * FROM frases\n" +
            "ORDER BY RANDOM()\n" +
            "LIMIT 1", nativeQuery = true)
    Frase obtenerFraseAleatoria();
}
