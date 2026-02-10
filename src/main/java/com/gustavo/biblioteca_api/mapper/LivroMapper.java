package com.gustavo.biblioteca_api.mapper;

import com.gustavo.biblioteca_api.dto.LivroRequest;
import com.gustavo.biblioteca_api.dto.LivroResponse;
import com.gustavo.biblioteca_api.model.Livro;
import org.springframework.stereotype.Component;

@Component
public class LivroMapper {
    public Livro toEntity(LivroRequest dto){
        Livro livro = new Livro();
        livro.setTitulo(dto.titulo());
        livro.setAutor(dto.autor());
        livro.setUrlImagem(dto.urlImagem());
        return livro;
    }

    public LivroResponse toResponse(Livro salvo){
        return new LivroResponse(
                salvo.getId(),
                salvo.getTitulo(),
                salvo.getAutor(),
                salvo.getUrlImagem(),
                salvo.isEmprestado()
        );

    }


}
