package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.Sale;
import com.example.demo.services.SaleService;

@RestController
public class SaleController {

	@Autowired
	SaleService saleService;
	@RequestMapping("/api/sales")
	public List<Sale> saleList(){
		List<Sale> userList = saleService.allSales();
		return userList;
	}
	
	@RequestMapping("/api/sales/create")
	public RedirectView newSale(
			@RequestParam(value="name") String nombre,
			@RequestParam(value="password") String pass,
			@RequestParam(value="age") String age,
			
			Model model) {
		try {
			Long num = Long.parseLong(pass);
			int tot = Integer.parseInt(age);
			Sale sale = new Sale();
			sale.setDescripcion(nombre);
			sale.setUserId(num);
			sale.setTotal(tot);
			sale = saleService.saveSale(sale);
			return new RedirectView("http://localhost:8080/sale");
		}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			return new RedirectView("http://localhost:8080/sale");
		}
	}
	
	
	
	@RequestMapping("/api/sales/delete/{id}")
	public RedirectView  deleteById(@PathVariable("id") Long id){
		saleService.deleteById(id);
		return new RedirectView("http://localhost:8080/sale");
	}
	
	
	@RequestMapping("/api/sales/edit")
	public RedirectView editSale(@RequestParam(value="userId") String userId,
			@RequestParam(value="name") String nombre,
			@RequestParam(value="password") String pass,
			@RequestParam(value="age") String age,
			Model model
			) {
		try {
			Long nSale = Long.parseLong(userId);
			Long num = Long.parseLong(pass);
			int tot = Integer.parseInt(age);
			Sale sale = new Sale();
			sale.setnSale(nSale);
			sale.setDescripcion(nombre);
			sale.setUserId(num);
			sale.setTotal(tot);
			sale = saleService.saveSale(sale);

			return new RedirectView("http://localhost:8080/");
		}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			return new RedirectView("http://localhost:8080/");
		}
	}
	
	
	
}
