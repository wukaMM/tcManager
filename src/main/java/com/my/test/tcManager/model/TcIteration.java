package com.my.test.tcManager.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class TcIteration {
	@Id
	@GeneratedValue
	private Long id;
	 
	private String name;
	 
	@ManyToOne
	private Product product;
	
	@OneToMany(mappedBy = "tcIteration")
    private List<TestCase> testCases;
	
	protected TcIteration() {}
	
	public TcIteration(String name, Product product) {
		this.name = name;
		this.product = product;
	}
	
	public void setProduct(Product p) {
		this.product = p;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
