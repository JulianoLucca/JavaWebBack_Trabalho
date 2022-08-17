package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model;

import javax.persistence.*;

@Entity
public class Favoritos {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
