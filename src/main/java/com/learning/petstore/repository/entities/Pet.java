package com.learning.petstore.repository.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Transient
    private Category category;
    @Column(name = "name")
    private String name;
    @Column(name = "photoUrls")
    private String photoUrls;
    @Transient
    private List<Tag> tags;
    @Column(name = "status")
    private String status;

    public Pet() {
    }

    public Pet(Integer id, Category category, String name, String photoUrls, List<Tag> tags, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", photoUrls='" + photoUrls + '\'' +
                ", Tags=" + tags +
                ", status='" + status + '\'' +
                '}';
    }
}
