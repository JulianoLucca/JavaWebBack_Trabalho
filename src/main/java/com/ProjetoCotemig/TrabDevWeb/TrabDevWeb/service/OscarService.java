package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Oscar;

import java.util.List;
import java.util.Optional;

public interface OscarService {
    Optional<Oscar> getOscarById(Integer id);
    List<Oscar> getAllOscar();
    void deleteAllOscar();
    void deleteOscarById(Integer id);
    void updateOscarById(Integer id, Oscar oscar);
    void updateOscar(Oscar oscar);
    void insertOscar(Oscar oscar);
}
