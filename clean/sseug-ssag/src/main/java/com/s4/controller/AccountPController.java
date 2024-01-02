package com.s4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.s4.dto.AccountPDto;
import com.s4.service.AccountPService;

@Controller
@RequestMapping(path = { "/account" })
public class AccountPController {

	@Autowired
	private AccountPService accountPService;
	
	@GetMapping(path = { "/register" })
	public String registerForm(@ModelAttribute("pMember") AccountPDto pMember) {
		return "account/register";
	}
	
	@PostMapping(path = { "register" })
	public String register(@ModelAttribute("pMember") AccountPDto pMember) {
		accountPService.register(pMember);
		
		return "home";
		//return "redirect:/account/login";
	}
	
}
