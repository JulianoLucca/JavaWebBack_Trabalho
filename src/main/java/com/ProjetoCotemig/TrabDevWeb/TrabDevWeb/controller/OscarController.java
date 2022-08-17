package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.controller;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Genero;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Oscar;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.GeneroService;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.OscarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OscarController {

    @Autowired
    OscarService oscarService;

    @RequestMapping(value = "/oscar", method = RequestMethod.POST)
    public void insert(@RequestBody Oscar oscar) {
        oscarService.insertOscar(oscar);
    }

    @RequestMapping(value = "/oscar", method = RequestMethod.GET)
    public List<Oscar> getAll() {
       return oscarService.getAllOscar();
    }

    @RequestMapping(value = "/oscar/{id}", method = RequestMethod.GET)
    public Optional<Oscar> getById(@PathVariable Integer id) {
        return oscarService.getOscarById(id);
    }

    @RequestMapping(value = "/oscar/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        oscarService.deleteOscarById(id);
    }

}
