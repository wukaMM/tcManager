package com.my.test.tcManager.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
	
	 @Id
	 @GeneratedValue
	 private Long id;
	 
	 private String name;
	 
	 @OneToMany(mappedBy = "product")
	 private List<TcIteration> tcIterations;
	 
	 protected Product() {}
	 
	 public Product(String name) {
		 this.name = name;
	 }
	 
}
