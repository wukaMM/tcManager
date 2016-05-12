package com.my.test.tcManager.service;

import com.my.test.tcManager.model.Product;

public interface ProductService {
	public Product findProById(String pId);
	
	public Product findProByName(String name);
	
	public void addProduct(String name);
	
}
