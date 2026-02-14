package com.gustavo.biblioteca_api.controller;


import com.gustavo.biblioteca_api.dto.LivroEditarRequest;
import com.gustavo.biblioteca_api.dto.LivroRequest;
import com.gustavo.biblioteca_api.dto.LivroResponse;
import com.gustavo.biblioteca_api.service.LivroService;
import jakarta.validation.Valid;
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
    public LivroResponse criarLivro (@Valid @RequestBody LivroRequest request){
        return livroService.criarLivro(request);
    }

    @PutMapping("/atualizar/{id}")
    public LivroResponse atualizarLivro (@PathVariable UUID id,@Valid @RequestBody LivroEditarRequest request){
        return livroService.editarLivro(id, request);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarLivro (@PathVariable UUID id){
        livroService.excluirLivro(id);
    }
}
