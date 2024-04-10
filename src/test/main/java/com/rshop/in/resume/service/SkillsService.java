package com.rshop.in.resume.service;

import java.util.List;
import java.util.Optional;
import com.rshop.in.resume.entity.Skills;

import jakarta.persistence.Entity;

@Entity
public interface SkillsService {
	public List<Skills> getallSkills();
	public Optional<Skills> getbySkills(Long id);
	public Skills saveSkills(Skills r);
	public List<Skills> saveallSkills(List<Skills> r);
	public Optional<Skills> savebySkills (Long id);
	public void delall();
	public void delbyid(Long id);
	public Optional<Skills> findByName(String name);
	public Optional<Skills> getSkillsById(Long id);
	

}
