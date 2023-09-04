package com.libray.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.libray.entity.User;
import com.libray.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@PostMapping("saveUser")
	public String saveUserDetails(User user) {
		userService.saveUser(user);
		return null;
		
	}

	@GetMapping("display")
	public String display(String str) {
		System.out.println("Tejas a asass  ....");
		return "dashboard"; 
	}
}
