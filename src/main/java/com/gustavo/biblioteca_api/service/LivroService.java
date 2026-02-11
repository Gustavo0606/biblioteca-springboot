package com.gustavo.biblioteca_api.service;

import com.gustavo.biblioteca_api.dto.LivroEmprestimoRequest;
import com.gustavo.biblioteca_api.dto.LivroRequest;
import com.gustavo.biblioteca_api.dto.LivroResponse;
import com.gustavo.biblioteca_api.mapper.LivroMapper;
import com.gustavo.biblioteca_api.model.Livro;
import com.gustavo.biblioteca_api.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    private final LivroMapper livroMapper;

    public LivroService(LivroRepository livroRepository, LivroMapper livroMapper) {
        this.livroRepository = livroRepository;
        this.livroMapper = livroMapper;
    }


    public List<Livro> exibirLivros() {
        return livroRepository.findAll();
    }

    public Livro buscarPorId(UUID id) {
        return livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    public LivroResponse criarLivro(LivroRequest dto){
        Livro livro = livroMapper.toEntity(dto);
        livro.setEmprestado(false);
        Livro salvo = livroRepository.save(livro);
        return livroMapper.toResponse(salvo);
    }

    public LivroResponse editarLivro(UUID id, LivroEmprestimoRequest dto){
        Livro existente = buscarPorId(id);
        livroMapper.toEntityEdit(dto, existente);
        Livro atualizado = livroRepository.save(existente);
        return livroMapper.toResponse(atualizado);

    }
    public void excluirLivro(UUID id){
        Livro existente = buscarPorId(id);
        livroRepository.delete(existente);
    }


}
