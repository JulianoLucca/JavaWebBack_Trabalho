package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.impl;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Genero;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository.GeneroRepository;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GeneroService")
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    GeneroRepository generoRepository;

    @Override
    public Optional<Genero> getGeneroById(Integer id) {return generoRepository.findById(id);
    }

    @Override
    public List<Genero> getAllGenero() {
        return generoRepository.findAll();
    }

    @Override
    public void deleteAllGenero() {
        generoRepository.deleteAll();
    }

    @Override
    public void deleteGeneroById(Integer id) {
        generoRepository.deleteById(id);
    }

    @Override
    public void updateGeneroById(Integer id, Genero genero) {
        generoRepository.save(genero);
    }

    @Override
    public void updateGenero(Genero genero) {
        generoRepository.save(genero);
    }

    @Override
    public void insertGenero(Genero genero) {
        generoRepository.save(genero);
    }
}
