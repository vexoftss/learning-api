package com.learning.petstore.repository.entities;

import javax.persistence.*;

@Entity(name = "tag")
public class Tag {
    @Column(name = "id")
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;

    public Tag() {
    }

    public Tag(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

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
