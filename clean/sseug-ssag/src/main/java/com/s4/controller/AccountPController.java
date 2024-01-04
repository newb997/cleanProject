package com.s4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.s4.dto.AccountPDto;
import com.s4.service.AccountPService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = { "/account" })
public class AccountPController {

	@Autowired
	private AccountPService accountPService;
	
	//회원가입
	@GetMapping(path = { "/register" })
	public String registerForm(@ModelAttribute("pMember") AccountPDto pMember) {
		return "account/register";
	}
	//회원가입
	@PostMapping(path = { "/register" })
	public String register(@ModelAttribute("pMember") AccountPDto pMember) {
		accountPService.register(pMember);
		
		return "home";
		//return "redirect:/account/login";
	}
	
	//로그인
	@GetMapping(path = { "/login" })
	public String loginFrm() {
		return "account/login";
	}
	
	@PostMapping(path = { "/login" })
	public String pLogin(AccountPDto accountPDto, HttpSession session, Model model) {
		AccountPDto loginPMember = accountPService.findloginPMember(accountPDto);
		
		if(loginPMember != null) {
			session.setAttribute("loginPuser", loginPMember);
//			model.addAttribute("loginsuccess", loginPMember);
			return "redirect:/home";
		} else {
			model.addAttribute("loginfail", true);
			return "account/login";
		}
	}
	
}




