package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	//Guardar
	public Product saveProduct(Product product) {	
		return productRepository.save(product);
	}
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	public Optional <Product> findById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		productRepository.deleteById(id);;
	}
	
}
