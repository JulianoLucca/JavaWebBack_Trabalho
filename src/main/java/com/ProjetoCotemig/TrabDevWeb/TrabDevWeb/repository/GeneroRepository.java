package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("GeneroRepository")
public interface GeneroRepository extends JpaRepository<Genero, Integer> {

    @Query(value = "SELECT * FROM GENERO WHERE id = ?1 limit 1", nativeQuery = true)
    Optional<Genero> getAllGeneroById(Integer id);
}
