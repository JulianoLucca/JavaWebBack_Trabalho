package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private String name;
    private String passwaord;
    private String email;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Usuario> usuarios;

    @ManyToOne
    @JoinColumn(name = "favoritos_id")
    private Favoritos favoritos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswaord() {
        return passwaord;
    }

    public void setPasswaord(String passwaord) {
        this.passwaord = passwaord;
    }

    public String getEmail() {
        return email;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public Favoritos getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Favoritos favoritos) {
        this.favoritos = favoritos;
    }
}
