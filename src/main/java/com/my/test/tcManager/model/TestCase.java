package com.my.test.tcManager.model;

import javax.persistence.*;


@Entity
public class TestCase {
	@Id
	@GeneratedValue
	private Long id;
	 
	private String name;
	 
	@ManyToOne
	private TcIteration tcIteration;
	
	public TestCase() {}
}
