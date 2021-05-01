package com.example.demo.controller;



import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Product;
import com.example.demo.model.Sale;
import com.example.demo.model.User;
import com.example.demo.services.ProductService;
import com.example.demo.services.SaleService;
import com.example.demo.services.UserService;




@Controller
public class Index {
	@Autowired
	SaleService saleService;
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public String index() {
		this.addDataUser();
		return "index.jsp";
	}
	

	@RequestMapping("/editUser/")
	public String editProduct(@RequestParam(value="userId",required=false) String userId,Model model) {
		System.out.println(userId);
	
		return "editUser.jsp";
	}
	
	
	@RequestMapping("/product")
	public String product() {
		this.addDataProduct();
		return "product.jsp";
	}
	
	@RequestMapping("/sale")
	public String sale() {
		this.addDataSale();
		return "sales.jsp";
	}
	
	
	public void addDataUser() {
		
		User user = new User();
		Long generatedLong = new Random().nextLong();
		user.setId(generatedLong);
		user.setNombre("name");
		user.setPassword("asddadas");
		user.setEdad(1);

		userService.saveUser(user);
		user.setId(generatedLong+1L);
		user.setNombre("name");
		user.setPassword("asddadas");
		user.setEdad(1);

		userService.saveUser(user);
		user.setId(generatedLong+2L);
		user.setNombre("name");
		user.setPassword("asddadas");
		user.setEdad(1);

		userService.saveUser(user);
	}
	public void addDataSale() {
		
		Sale sale = new Sale();
		Long generatedLong = new Random().nextLong();
		sale.setnSale(generatedLong);
		sale.setDescripcion("descripcion 1");
		sale.setUserId(1L);
		sale.setTotal(1000);
		saleService.saveSale(sale);
		sale.setnSale(generatedLong +1L);
		sale.setDescripcion("descripcion 2");
		sale.setUserId(2L);
		sale.setTotal(1010);
		saleService.saveSale(sale);
		sale.setnSale(generatedLong +2L);
		sale.setDescripcion("descripcion 3");
		sale.setUserId(3L);
		sale.setTotal(1010);
		saleService.saveSale(sale);
		
		
	}
	
	public void addDataProduct() {
		
		Product product = new Product();
		Long generatedLong = new Random().nextLong();
		product.setId(generatedLong);
		product.setNombre("name");
		product.setDescripcion("desc");
		product.setPrecio(100);
		productService.saveProduct(product);
		product.setId(generatedLong+2L);
		product.setNombre("name");
		product.setDescripcion("desc");
		product.setPrecio(100);
		productService.saveProduct(product);
		product.setId(generatedLong+1L);
		product.setNombre("name");
		product.setDescripcion("desc");
		product.setPrecio(100);
		productService.saveProduct(product);
	}

}
