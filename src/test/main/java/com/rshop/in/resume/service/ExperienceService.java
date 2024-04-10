package com.rshop.in.resume.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rshop.in.resume.entity.Experience;

@Service
public interface ExperienceService {
	
	public List<Experience> getallExperience();
	public Optional<Experience> getbyExperience(Long id);
	public Experience saveExperience(Experience r);
	public List<Experience> saveallExperience(List<Experience> r);
	public Optional<Experience> savebyExperience (Long id);
	public void delall();
	public void delbyid(Long id);
	public Optional<Experience> findByName(String name);
	public Optional<Experience> getExperienceById(Long id);
	

}
