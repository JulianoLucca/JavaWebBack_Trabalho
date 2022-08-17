package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Favoritos;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("FavoritosRepository")
public interface FavoritosRepository extends JpaRepository<Favoritos, Integer> {

    @Query(value = "SELECT * FROM FAVORITOS WHERE id = ?1 limit 1", nativeQuery = true)
    Optional<Filme> getAllFavoritosById(Integer id);
}
