package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sale;

import com.example.demo.repositories.SaleRepository;


@Service
public class SaleService {
	@Autowired
	SaleRepository saleRepository;
	public Sale saveSale(Sale sale) {	
		return saleRepository.save(sale);
		
	}
	public List<Sale> allSales() {
		// TODO Auto-generated method stub
		return saleRepository.findAll();
	}
	public Optional <Sale> findSalesById(Long id) {
		// TODO Auto-generated method stub
		return saleRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		saleRepository.deleteById(id);;
	}
	
}
