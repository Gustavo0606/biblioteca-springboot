package com.gustavo.biblioteca_api.config;

import com.gustavo.biblioteca_api.model.Livro;
import com.gustavo.biblioteca_api.repository.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final LivroRepository livroRepository;
    public DataInitializer (LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        livroRepository.save (new Livro("Dom Casmurro", "Machado de Assis", null, false));
        livroRepository.save (new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", null, false));
        livroRepository.save(new Livro("1984", "George Orwell", null, false));
    }



}
