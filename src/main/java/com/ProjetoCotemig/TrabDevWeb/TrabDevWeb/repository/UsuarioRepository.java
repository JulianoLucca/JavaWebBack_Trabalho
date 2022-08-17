package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository;


import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("UsuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "SELECT * FROM USUARIO WHERE id = ?1 limit 1", nativeQuery = true)
    Optional<Usuario> getAllUsuarioByName(String name);
}
