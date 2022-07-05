package com.srikanth.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apierror")
public class LoginController {

	@GetMapping
	@ResponseBody
	public String GetLoginPage()
	{
		return "The Requested url not found on the server, plz clear cache, cookies and try again!!!!";
	}
	
}
