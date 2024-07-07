package com.aluracursos.screenmatch_frases.dto;

import com.aluracursos.screenmatch_frases.model.Frase;

public record FraseDTO(
        String titulo,
        String frase,
        String personaje,
        String poster
) {
}
