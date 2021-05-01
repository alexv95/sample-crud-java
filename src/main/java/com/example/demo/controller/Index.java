package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
	
	@RequestMapping("/api")
	public String index() {
		return "desde el index";
		
	}
	@RequestMapping("/another")
	public String anotherMsg() {
		return "desde otro mensaje";
	}
	

}
