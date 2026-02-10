package com.gustavo.biblioteca_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gustavo.biblioteca_api.model.Livro;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
