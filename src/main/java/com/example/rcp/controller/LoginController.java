package com.example.rcp.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/members")
public class LoginController {
	
	

	@GetMapping("/")
	public String loginForm() {
		return "login";
	}

	
	

}
