package com.rshop.in.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rshop.in.resume.entity.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume , Long> {
	
	

}

