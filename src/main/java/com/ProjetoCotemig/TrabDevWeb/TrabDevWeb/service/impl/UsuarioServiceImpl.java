package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.impl;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Usuario;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository.UsuarioRepository;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {return usuarioRepository.findById(id);
    }

    @Override
    public Optional<Usuario> getUsuarioByName(String name) {return usuarioRepository.getAllUsuarioByName(name);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void deleteAllUsuario() {
        usuarioRepository.deleteAll();
    }

    @Override
    public void deleteUsuarioById(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void updateUsuarioById(Integer id, Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
