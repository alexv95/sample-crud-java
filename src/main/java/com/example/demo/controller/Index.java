package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;






@Controller
public class Index {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	

	@RequestMapping("/editUser/")
	public String editProduct(@RequestParam(value="userId",required=false) String userId,Model model) {
		System.out.println(userId);
		model.addAttribute("id",userId);
		return "editUser.jsp";
	}
	
	
	@RequestMapping("/product")
	public String product() {
		return "product.jsp";
	}
	
		

}
