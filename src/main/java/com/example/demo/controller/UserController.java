package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.User;
import com.example.demo.services.UserService;


@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/api/users/{id}")
	public  Optional<User> findById(@PathVariable("id") Long id){
		Optional <User> user = userService.findById(id);
		return user;
	}
	@RequestMapping("/api/users/create")
	public RedirectView newUser(
			@RequestParam(value="name") String nombre,
			@RequestParam(value="password") String pass,
			@RequestParam(value="age") String age,
			
			Model model) {
		try {
			int number = Integer.parseInt(age);
			User user = new User();
			user.setNombre(nombre);
			user.setPassword(pass);
			user.setEdad(number);
			user = userService.saveUser(user);
			return new RedirectView("http://localhost:8080/");
		}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			return new RedirectView("http://localhost:8080/");
		}
	}
	
	
	@RequestMapping("/api/users/edit")
	public RedirectView editUser(@RequestParam(value="userId") String userId,
			@RequestParam(value="name") String nombre,
			@RequestParam(value="password") String pass,
			@RequestParam(value="age") String age,
			Model model
			) {
		try {
			int number = Integer.parseInt(age);
			User user = new User();
			user.setId(Long.parseLong(userId));
			user.setNombre(nombre);
			user.setPassword(age);
			user.setEdad(number);
			userService.saveUser(user);
			model.addAttribute("id",user.getId());
			return new RedirectView("http://localhost:8080/");
		}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			return new RedirectView("http://localhost:8080/");
		}
	}
	
	@RequestMapping("/api/users/delete/{id}")
	public RedirectView  deleteById(@PathVariable("id") Long id){
		userService.deleteById(id);
		return new RedirectView("http://localhost:8080/");
	}
	
	@RequestMapping("/api/users")
	public List<User> userList(){
		List<User> userList = userService.allUsers();
		return userList;
	}
	
	
	
	
	

}
