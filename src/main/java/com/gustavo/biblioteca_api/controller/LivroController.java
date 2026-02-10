package com.gustavo.biblioteca_api.controller;


import com.gustavo.biblioteca_api.dto.LivroRequest;
import com.gustavo.biblioteca_api.dto.LivroResponse;
import com.gustavo.biblioteca_api.service.LivroService;
import org.springframework.web.bind.annotation.*;
import com.gustavo.biblioteca_api.model.Livro;
import java.util.List;
import java.util.UUID;


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

    @GetMapping("/buscar/{id}")
    public Livro buscarPorId (@PathVariable UUID id){
        return livroService.buscarPorId(id);
    }

    @PostMapping("/criar")
    public LivroResponse criarLivro (@RequestBody LivroRequest request){
        return livroService.criarLivro(request);
    }
}
