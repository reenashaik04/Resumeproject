package com.rshop.in.resume.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rshop.in.resume.entity.Resume;
@Service
public interface ResumeService {
	
	public List<Resume> getallResume();
	public Optional<Resume> getbyResume(Long id);
	public Resume saveresume(Resume r);
	public List<Resume> saveallresume(List<Resume> r);
	public Optional<Resume> savebyresume (Long id);
	public void delall();
	public void delbyid(Long id);
	public Optional<Resume> findByName(String name);
	public Optional<Resume> getResumeById(Long id);
	
	
	
	

}
