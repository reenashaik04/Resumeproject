package com.rshop.in.resume.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rshop.in.resume.entity.User;

@Service
public interface UserService {
	public List<User> getallUser();
	public Optional<User> getbyUser(Long id);
	public User saveUser(User r);
	public List<User> saveallUser(List<User> r);
	public Optional<User> savebyUser (Long id);
	public void delall();
	public void delbyid(Long id);
	public Optional<User> findByName(String name);
	public Optional<User> getUserById(Long id);
	

}
