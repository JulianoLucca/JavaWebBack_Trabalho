package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.controller;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Favoritos;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository.FavoritosRepository;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class FavoritosController {

    @Autowired
    FavoritosService favoritosService;

    @RequestMapping(value = "/favoritos", method = RequestMethod.POST)
    public void insert(@RequestBody Favoritos favoritos) {
        favoritosService.insertFavoritos(favoritos);
    }

    @RequestMapping(value = "/favoritos", method = RequestMethod.GET)
    public List<Favoritos> getAll() {
       return favoritosService.getAllFavoritos();
    }

    @RequestMapping(value = "/favoritos/{id}", method = RequestMethod.GET)
    public Optional<Favoritos> getById(@PathVariable Integer id) {
        return favoritosService.getFavoritosById(id);
    }

    @RequestMapping(value = "/favoritos/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        favoritosService.deleteFavoritosById(id);
    }








}
