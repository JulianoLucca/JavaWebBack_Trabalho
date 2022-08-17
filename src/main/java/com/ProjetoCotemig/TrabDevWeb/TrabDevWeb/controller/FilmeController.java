package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.controller;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Favoritos;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Filme;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.FavoritosService;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FilmeController {

    @Autowired
    FilmeService filmeService;

    @RequestMapping(value = "/filme", method = RequestMethod.POST)
    public void insert(@RequestBody Filme filme) {
        filmeService.insertFilmes(filme);
    }

    @RequestMapping(value = "/filme", method = RequestMethod.GET)
    public List<Filme> getAll() {
       return filmeService.getAllFilmes();
    }

    @RequestMapping(value = "/filme/{id}", method = RequestMethod.GET)
    public Optional<Filme> getById(@PathVariable Integer id) {
        return filmeService.getFilmesById(id);
    }

    @RequestMapping(value = "/filme/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        filmeService.deleteFilmesById(id);
    }

}
