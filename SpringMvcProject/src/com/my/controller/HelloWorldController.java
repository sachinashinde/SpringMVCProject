package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.form.Contact;
@Controller
public class HelloWorldController {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		System.out.println("I am in welcome controller");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3> Hello World, Spring MVC </h3>This message is coming from controller </div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/contacts")
	public ModelAndView helloWorldContacts() {
		System.out.println("I am in welcome controller contact method");
		return new ModelAndView("contacts", "contact", new Contact());
	}
}
