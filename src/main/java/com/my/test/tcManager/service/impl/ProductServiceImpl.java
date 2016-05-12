package com.my.test.tcManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.test.tcManager.model.Product;
import com.my.test.tcManager.repository.ProductRepository;
import com.my.test.tcManager.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired 
	private ProductRepository productRepository;

	public void addProduct(String name) {
		
		Product pro = productRepository.findByName(name);
        if (pro == null) {
        	Product product = new Product(name);
    		productRepository.save(product);
        }
		
	}

}
