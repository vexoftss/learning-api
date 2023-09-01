package com.learning.petstore.repository;

import com.learning.petstore.repository.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Integer> {
}
