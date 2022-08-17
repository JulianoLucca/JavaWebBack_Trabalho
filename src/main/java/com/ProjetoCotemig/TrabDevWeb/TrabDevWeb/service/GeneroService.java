package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Genero;

import java.util.List;
import java.util.Optional;

public interface GeneroService {
    Optional<Genero> getGeneroById(Integer id);
    List<Genero> getAllGenero();
    void deleteAllGenero();
    void deleteGeneroById(Integer id);
    void updateGeneroById(Integer id, Genero genero);
    void updateGenero(Genero genero);
    void insertGenero(Genero genero);
}
