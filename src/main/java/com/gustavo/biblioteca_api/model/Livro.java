package com.gustavo.biblioteca_api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "livros")
@NoArgsConstructor
@Data
public class Livro {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;
    private String urlImagem;
    private boolean emprestado;


    public Livro(String titulo, String autor, String urlImagem, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.urlImagem = urlImagem;
        this.emprestado = emprestado;
    }

}
