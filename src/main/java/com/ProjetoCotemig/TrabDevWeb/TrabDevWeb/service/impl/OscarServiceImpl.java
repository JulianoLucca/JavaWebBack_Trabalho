package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.impl;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Oscar;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository.OscarRepository;
import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.service.OscarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("OscarService")
public class OscarServiceImpl implements OscarService {

    @Autowired
    OscarRepository oscarRepository;

    @Override
    public Optional<Oscar> getOscarById(Integer id) {return oscarRepository.findById(id);
    }

    @Override
    public List<Oscar> getAllOscar() {
        return oscarRepository.findAll();
    }

    @Override
    public void deleteAllOscar() {
        oscarRepository.deleteAll();
    }

    @Override
    public void deleteOscarById(Integer id) {
        oscarRepository.deleteById(id);
    }

    @Override
    public void updateOscarById(Integer id, Oscar oscar) {
        oscarRepository.save(oscar);
    }

    @Override
    public void updateOscar(Oscar oscar) {
        oscarRepository.save(oscar);
    }

    @Override
    public void insertOscar(Oscar oscar) {
        oscarRepository.save(oscar);
    }
}
