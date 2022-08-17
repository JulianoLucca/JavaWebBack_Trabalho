package com.ProjetoCotemig.TrabDevWeb.TrabDevWeb.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private Date releaseYear;
    private String resume;

    @OneToMany
    @JoinColumn(name = "filme_id")
    private List<Filme> filmes;

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

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }


}
