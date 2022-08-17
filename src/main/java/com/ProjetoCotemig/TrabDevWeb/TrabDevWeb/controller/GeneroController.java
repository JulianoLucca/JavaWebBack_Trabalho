package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.controller;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Filme;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Genero;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.FilmeService;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GeneroController {

    @Autowired
    GeneroService generoService;

    @RequestMapping(value = "/genero", method = RequestMethod.POST)
    public void insert(@RequestBody Genero genero) {
        generoService.insertGenero(genero);
    }

    @RequestMapping(value = "/genero", method = RequestMethod.GET)
    public List<Genero> getAll() {
       return generoService.getAllGenero();
    }

    @RequestMapping(value = "/genero/{id}", method = RequestMethod.GET)
    public Optional<Genero> getById(@PathVariable Integer id) {
        return generoService.getGeneroById(id);
    }

    @RequestMapping(value = "/genero/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        generoService.deleteGeneroById(id);
    }

}
