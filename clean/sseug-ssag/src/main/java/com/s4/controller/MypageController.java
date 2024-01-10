package com.s4.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.s4.dto.AccountPDto;

@Controller
@RequestMapping(path = { "/account" })
public class MypageController {

//	@Autowired
//	private MypageService mypageService;
	
//	@Autowired
//	@Qualifier("mypageService")
//	public void setMypageService(MypageService mypageService) {
//		this.mypageService = mypageService;
//	}
	
	@GetMapping(path = { "/mypage" })
	public String mypageForm(HttpSession session) {
		
		AccountPDto loginPuser = (AccountPDto)session.getAttribute("loginPuser");
		if(loginPuser == null) {
			return "redirect:/account/login";
		}
		return "account/mypage";
	}
}
