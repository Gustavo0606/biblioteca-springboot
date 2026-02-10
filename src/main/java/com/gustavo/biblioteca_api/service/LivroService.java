package com.gustavo.biblioteca_api.service;
import com.gustavo.biblioteca_api.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {


    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }
}
