package com.my.test.tcManager.service;

public interface PersonService {
	
	public boolean verifyUser(String username, String password);
	
	public void addUser(String username, String password);
	
}
