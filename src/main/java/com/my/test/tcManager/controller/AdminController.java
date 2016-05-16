package com.my.test.tcManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.test.tcManager.model.Person;
import com.my.test.tcManager.service.PersonService;

@Controller
public class AdminController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(Person person, Model model) {
//		model.addAttribute("username", "dddddd");
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Person person, Model model) {
		
		boolean verifyRes = personService.verifyUser(person.getUsername(), person.getPassword());
		if (verifyRes == true) {
			return "homepage";
		} else {
			return "login";
		}
		
	}
	
}
