package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Sale;

@Repository
public interface SaleRepository extends  CrudRepository<Sale, Long> {
	List<Sale> findAll();
}
