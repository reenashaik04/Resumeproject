package com.rshop.in.resume.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rshop.in.resume.entity.Projects;

@Service
public interface ProjectService {
	
	public List<Projects> getallProjects();
	public Optional<Projects> getbyProjects(Long id);
	public Projects saveProjects(Projects r);
	public List<Projects> saveallProjects(List<Projects> r);
	public Optional<Projects> savebyProjects (Long id);
	public void delall();
	public void delbyid(Long id);
	public Optional<Projects> findByName(String name);
	public Optional<Projects> getProjectsById(Long id);
	

}
