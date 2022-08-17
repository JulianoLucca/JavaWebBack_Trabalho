package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("FilmeRepository")
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

    @Query(value = "SELECT * FROM FILME WHERE id = ?1 limit 1", nativeQuery = true)
    Optional<Filme> getAllFilmesByName(String name);
}
