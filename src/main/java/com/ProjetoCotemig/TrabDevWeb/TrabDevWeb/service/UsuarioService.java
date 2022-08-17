package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> getUsuarioById(Integer id);
    Optional<Usuario> getUsuarioByName(String name);
    List<Usuario> getAllUsuario();
    void deleteAllUsuario();
    void deleteUsuarioById(Integer id);
    void updateUsuarioById(Integer id, Usuario usuario);
    void updateUsuario(Usuario usuario);
    void insertUsuario(Usuario usuario);
}
