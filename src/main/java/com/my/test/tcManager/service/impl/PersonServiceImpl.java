package com.my.test.tcManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.test.tcManager.model.Person;
import com.my.test.tcManager.repository.PersonRepository;
import com.my.test.tcManager.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public boolean verifyUser(String username, String password) {
		
		Person person = personRepository.findByUsername(username);
		//用户不存在
		if (person == null) {
			return false;
		}
		
		String passwd = person.getPassword();
		if (password.equals(passwd)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUser(String username, String password) {
		
		Person p = personRepository.findByUsername(username);
		//用户不存在
		if (p == null) {
			Person person = new Person(username, password);
			personRepository.save(person);
		}
		
	}
}
