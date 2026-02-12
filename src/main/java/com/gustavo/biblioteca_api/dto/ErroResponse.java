package com.gustavo.biblioteca_api.dto;

import java.time.LocalDateTime;

public record ErroResponse(
        int status,
        String message,
        LocalDateTime timestamp
) {}
