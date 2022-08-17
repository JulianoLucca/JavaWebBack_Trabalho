package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Filme;
import java.util.List;
import java.util.Optional;

public interface FilmeService {
    Optional<Filme> getFilmesById(Integer id);
    Optional<Filme> getFilmesByName(String name);
    List<Filme> getAllFilmes();
    void deleteAllFilmes();
    void deleteFilmesById(Integer id);
    void updateFilmesById(Integer id, Filme filme);
    void updateFilmes(Filme filme);
    void insertFilmes(Filme filme);
}
