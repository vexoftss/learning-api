package com.learning.petstore.repository.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Robert Pirvanus
 * <p>
 * 8/28/2023
 */
@Entity
@Table(name = "test_table")
public class TestEntity {

	@Id
	private String id;
	private String testString;

	public TestEntity(String id, String testString) {
		this.id = id;
		this.testString = testString;
	}

	public TestEntity() {
	}

	public String getId() {
		return id;
	}

	public TestEntity setId(String id) {
		this.id = id;
		return this;
	}

	public String getTestString() {
		return testString;
	}

	public TestEntity setTestString(String testString) {
		this.testString = testString;
		return this;
	}
}
