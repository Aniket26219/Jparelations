package com.jparelations.Jparelations.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    public Integer id;
    public String name;

    @ManyToMany(mappedBy = "publisherSet",cascade = CascadeType.ALL)
    public Set<Book> books=new HashSet<>();

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
}
