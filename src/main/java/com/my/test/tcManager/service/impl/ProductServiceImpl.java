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
	
	@Override
	public Product findProById(String pId) {
		Product product = productRepository.findProById(pId);
		return product;
	}
	
	@Override
	public Product findProByName(String name) {
		Product product = productRepository.findProByName(name);
		return product;
	}
	
	public void addProduct(String name) {
		Product product = new Product(name);
		productRepository.save(product);
	}
}
