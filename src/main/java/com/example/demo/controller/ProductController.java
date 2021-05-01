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

import com.example.demo.model.Product;

import com.example.demo.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/api/product/{id}")
	public  Optional<Product> findProductById(@PathVariable("id") Long id){
		Optional <Product> product = productService.findById(id);
		return product;
	}
	
	@RequestMapping("/api/product/create")
	public RedirectView newProduct(
			@RequestParam(value="name") String nombre,
			@RequestParam(value="password") String pass,
			@RequestParam(value="age") String age,
			
			Model model) {
		try {
			int number = Integer.parseInt(age);
			Product product = new Product();
			product.setNombre(nombre);
			product.setDescripcion(pass);
			product.setPrecio(number);
			product = productService.saveProduct(product);
			return new RedirectView("http://localhost:8080/product");
		}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			return new RedirectView("http://localhost:8080/product");
		}
	}
	@RequestMapping("/api/products")
	public List<Product> productList(){
		List<Product> productList = productService.allProducts();
		return productList;
	}
	
	@RequestMapping("/api/product/delete/{id}")
	public RedirectView  deleteProductById(@PathVariable("id") Long id){
		productService.deleteById(id);
		return new RedirectView("http://localhost:8080/product");
	}
	

}
