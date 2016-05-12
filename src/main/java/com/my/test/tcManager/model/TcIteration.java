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
	
}
