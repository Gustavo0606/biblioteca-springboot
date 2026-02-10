package com.gustavo.biblioteca_api.dto;

import java.util.UUID;

public record LivroResponse (
    UUID id,
    String titulo,
    String autor,
    String urlImagem,
    boolean emprestado

){}
