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
	
	protected TestCase() {}
	
	public TestCase(String name, TcIteration tcIteration) {
		this.name = name;
		this.tcIteration = tcIteration;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTcIteration(TcIteration tcI) {
		this.tcIteration = tcI;
	}
}
