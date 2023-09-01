package com.learning.petstore.controller;

import com.learning.petstore.repository.CategoryRepository;
import com.learning.petstore.repository.PetRepository;
import com.learning.petstore.repository.TagRepository;
import com.learning.petstore.repository.entities.Category;
import com.learning.petstore.repository.entities.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PetController {
    @Autowired
    private PetRepository repository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/pet")
    public List<Pet> getAllPets() {
        List<Pet> pets = repository.findAll();
        for (Pet pet : pets) {
            Optional<Category> category = categoryRepository.findById(pet.getId());
            if (category.isPresent()) {
                pet.setCategory(category.get());
            }
        }
        return pets;
    }


    @PostMapping("/pet")
    public void addPet(@RequestBody Pet pet) {
        repository.save(pet);
        categoryRepository.save(pet.getCategory());
        tagRepository.saveAll(pet.getTags());
    }
}
