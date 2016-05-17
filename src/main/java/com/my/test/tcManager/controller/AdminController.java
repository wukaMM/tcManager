package com.my.test.tcManager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.test.tcManager.model.Person;
import com.my.test.tcManager.service.PersonService;

@Controller
public class AdminController {
	
	@Autowired
	private PersonService personService;
	
	protected final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(Person person, Model model) {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Person person, Model model) {
		
		boolean verifyRes = personService.verifyUser(person.getUsername(), person.getPassword());
		if (verifyRes == true) {
			 model.addAttribute("person", new Person());
			return "homepage";
		} else {
			return "login";
		}
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String addUserPage(Person person, Model model) {
		model.addAttribute("person", new Person());
		return "user";
		
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public void addUser(Person person, Model model) {
		
		personService.addUser(person.getUsername(), person.getPassword());
		
	}
	
}
