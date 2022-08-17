package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.repository;

import com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model.Oscar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("OscarRepository")
public interface OscarRepository extends JpaRepository<Oscar, Integer> {

    @Query(value = "SELECT * FROM OSCAR WHERE id = ?1 limit 1", nativeQuery = true)
    Optional<Oscar> getAllOscarById(Integer id);
}
