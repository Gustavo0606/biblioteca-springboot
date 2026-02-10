package com.gustavo.biblioteca_api.controller;


import com.gustavo.biblioteca_api.service.LivroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/biblioteca")
@RestController
public class LivroController {


    private final LivroService livroService;

    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }


}
