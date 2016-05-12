package com.my.test.tcManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.my.test.tcManager.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	Product findById(String pId);
	
	Product findByName(String name);
}
