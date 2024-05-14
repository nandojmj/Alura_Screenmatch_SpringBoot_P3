package com.aluracurso.screenmatch.dto;

import com.aluracurso.screenmatch.model.Categoria;

// Data Tranfers Object puede contener información de múltiples fuentes o tablas y concentrarlas en una única clase simple.

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double evaluacion,
                       String poster,
                       Categoria genero,
                       String actores,
                       String sinopsis) {
}
