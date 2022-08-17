package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.controller;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Oscar;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Usuario;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.OscarService;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public void insert(@RequestBody Usuario usuario) {
        usuarioService.insertUsuario(usuario);
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> getAll() {
       return usuarioService.getAllUsuario();
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
    public Optional<Usuario> getById(@PathVariable Integer id) {
        return usuarioService.getUsuarioById(id);
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        usuarioService.deleteUsuarioById(id);
    }

}
