package com.rshop.in.resume.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



public class Projects {
	private Long id;
	private String name;
	private String description;
	
	 @JsonIgnore
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JsonIgnoreProperties("Resume")
	 @JoinColumn(name="Resume_id")

	 private Resume resume;
	
	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	



}
