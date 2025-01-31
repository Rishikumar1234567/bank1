package com.sri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	@GetMapping("/welcome")
	public String WelcomePage()
	{
		
		return "welcome Mr Rishikumar";
	}

}
