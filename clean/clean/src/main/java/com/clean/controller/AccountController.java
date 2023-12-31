package com.clean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clean.dto.AccountPDto;
import com.clean.service.AccountService;

@Controller
@RequestMapping(path = { "account" })
public class AccountController {

	@Autowired
	private AccountService accountservice;
	
	@GetMapping(path = { "/register" })
	public String registerForm(@ModelAttribute("pMember") AccountPDto pMember) {
		return "account/register";
	}
	
	@PostMapping(path = { "register" })
	public String register(@ModelAttribute("pMember") AccountPDto pMember) {
		accountservice.register(pMember);
		
		return "home";
		//return "redirect:/account/login";
	}
	
}
