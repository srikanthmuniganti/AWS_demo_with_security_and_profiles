package com.srikanth.aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

	@GetMapping
	public String GetLoginPage()
	{
		return "redirect:/api/message";
		//return "The Requested url not found on the server, plz clear cache, cookies and try again!!!!";
	}
	
}
