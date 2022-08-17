package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.impl;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Filme;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository.FilmeRepository;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("FilmeService")
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    @Override
    public Optional<Filme> getFilmesById(Integer id) {return filmeRepository.findById(id);
    }

    @Override
    public Optional<Filme> getFilmesByName(String name) {return filmeRepository.getAllFilmesByName(name);
    }

    @Override
    public List<Filme> getAllFilmes() {
        return filmeRepository.findAll();
    }

    @Override
    public void deleteAllFilmes() {
        filmeRepository.deleteAll();
    }

    @Override
    public void deleteFilmesById(Integer id) {
        filmeRepository.deleteById(id);
    }

    @Override
    public void updateFilmesById(Integer id, Filme filme) {
        filmeRepository.save(filme);
    }

    @Override
    public void updateFilmes(Filme filme) {
        filmeRepository.save(filme);
    }

    @Override
    public void insertFilmes(Filme filme) {
        filmeRepository.save(filme);
    }
}
