package com.jparelations.Jparelations.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    public Integer id;
    public String name;

    @ManyToMany
    @JoinTable(name = "book_publisher",
            joinColumns =@JoinColumn(name = "book_id",referencedColumnName = "id"),
            inverseJoinColumns =@JoinColumn(name = "publisher_id",referencedColumnName = "id") )
    public Set<Publisher> publisherSet;

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
