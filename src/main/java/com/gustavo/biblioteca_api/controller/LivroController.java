package com.gustavo.biblioteca_api.controller;


import com.gustavo.biblioteca_api.service.LivroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gustavo.biblioteca_api.model.Livro;
import java.util.List;


@RequestMapping("/biblioteca")
@RestController
public class LivroController {


    private final LivroService livroService;

    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }
    @GetMapping
    public List<Livro> exibirLivros() {
        return livroService.exibirLivros();
    }


}
