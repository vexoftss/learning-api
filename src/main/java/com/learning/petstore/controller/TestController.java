package com.learning.petstore.controller;

import com.learning.petstore.repository.TestRepo;
import com.learning.petstore.repository.entities.TestEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author Robert Pirvanus
 * <p>
 * 8/28/2023
 */
@RestController
@Tag(name = "Test endpoints")
public class TestController {

	@Autowired
	private TestRepo repository;

	@GetMapping
	public String testMethod() {
		return "it works!";
	}
	@GetMapping("/test2")
	public String testMethod2() {
		return "it works2!";
	}

	@PostMapping
	public void testPost(@RequestBody String anything) {

		String testId = LocalDateTime.now().toString();

		repository.save(new TestEntity(testId, anything));

	}

}

