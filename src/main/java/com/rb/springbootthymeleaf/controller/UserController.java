package com.rb.springbootthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rb.springbootthymeleaf.entity.User;
import com.rb.springbootthymeleaf.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userSerivce;

	@PostMapping(value = "/jgdapp/user", produces = "application/json")
	public String saveUser(@RequestBody User user, Model model){
		userSerivce.saveUser(user);
		
		return "user";
	}
	
	@GetMapping(value = "/jgdapp/user/roleId/{roleId}", produces = "application/json")
	public String getUserByRoleId(@PathVariable int roleId, Model model){
		User user = userSerivce.getUserByRoleId(roleId);
		
		model.addAttribute("users", user);
		
		return "userResult";
	}
} 
