package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.impl;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Favoritos;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository.FavoritosRepository;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("FavoritosService")
public class FavoritosServiceImpl implements FavoritosService {

    @Autowired
    FavoritosRepository favoritosRepository;

    @Override
    public Optional<Favoritos> getFavoritosById(Integer id) {return favoritosRepository.findById(id);}

    @Override
    public List<Favoritos> getAllFavoritos() {
        return favoritosRepository.findAll();
    }

    @Override
    public void deleteAllFavoritos() {
        favoritosRepository.deleteAll();
    }

    @Override
    public void deleteFavoritosById(Integer id) {
        favoritosRepository.deleteById(id);
    }

    @Override
    public void updateFavoritosById(Integer id, Favoritos favoritos) {
        favoritosRepository.save(favoritos);
    }

    @Override
    public void updateFavoritos(Favoritos favoritos) {
        favoritosRepository.save(favoritos);
    }

    @Override
    public void insertFavoritos(Favoritos favoritos) {
        favoritosRepository.save(favoritos);
    }
}
