package com.rshop.in.resume.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Certifications {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String name;
	 private Long year;
	 
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

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}
	

}
