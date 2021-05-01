package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {
	//Inyeccion dependencia repository
	@Autowired
	UserRepository userRepository;
	public User saveUser(User user) {	
		return userRepository.save(user);
		
	}
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	public Optional <User> findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		userRepository.deleteById(id);;
	}
	
	

}
