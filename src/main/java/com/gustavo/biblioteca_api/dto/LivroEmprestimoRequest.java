package com.gustavo.biblioteca_api.dto;

public record LivroEmprestimoRequest (
       String titulo,
       String autor,
       String urlImagem,
       boolean emprestado
) {}
