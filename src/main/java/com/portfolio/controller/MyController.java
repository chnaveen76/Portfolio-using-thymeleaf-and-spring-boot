package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.entity.User;
import com.portfolio.service.MyService;

@Controller
public class MyController {
	@Autowired
	MyService service;
	
	@RequestMapping("/")
	public String open() {
		return "index";
	}
	
	@PostMapping("/save")
	public String gettingUserDetails(@ModelAttribute User user , Model model) {
		service.saving(user);
		model.addAttribute("user",user);
		return "response";
	}

}
