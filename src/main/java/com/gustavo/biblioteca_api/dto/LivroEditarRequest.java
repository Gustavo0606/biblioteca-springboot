package com.gustavo.biblioteca_api.dto;

public record LivroEditarRequest(
       String titulo,
       String autor,
       String urlImagem,
       boolean emprestado
) {}
