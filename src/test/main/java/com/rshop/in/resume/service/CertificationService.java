package com.rshop.in.resume.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rshop.in.resume.entity.Certifications;


@Service
public interface CertificationService {
	
	public List<Certifications> getallCertifications();
	public Optional<Certifications> getbyCertifications(Long id);
	public Certifications saveCertifications(Certifications r);
	public List<Certifications> saveallCertifications(List<Certifications> r);
	public Optional<Certifications> savebyCertifications (Long id);
	public void delall();
	public void delbyid(Long id);
	public Optional<Certifications> findByName(String name);
	public Optional<Certifications> getCertificationsById(Long id);
	

}
