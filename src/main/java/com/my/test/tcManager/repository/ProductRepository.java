package com.my.test.tcManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.my.test.tcManager.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	Product findProById(String pId);
	
	Product findProByName(String name);
}
