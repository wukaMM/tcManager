package com.my.test.tcManager.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.test.tcManager.model.Product;
import com.my.test.tcManager.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> addProduct(@RequestParam String name) {
		Map<String, Object> response = new LinkedHashMap<>();
		
        Product pro = productService.findProByName(name);
        if (pro != null) {
        	response.put("productname", "existed");
        	return response;
        }
		
        productService.addProduct(name);
        
        response.put("productname", name);
        return response;
    }

}
