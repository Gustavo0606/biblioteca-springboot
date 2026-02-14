package com.gustavo.biblioteca_api.dto;


import jakarta.validation.constraints.NotBlank;

public record LivroRequest (
    @NotBlank(message = "Precisa de um título")
    String titulo,

    @NotBlank(message = "Precisa de um autor")
    String autor,
    String urlImagem


) {}
