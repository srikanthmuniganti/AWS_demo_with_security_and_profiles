package com.srikanth.aws.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AWSController {

	@GetMapping("/message")
	@ResponseBody
	@PreAuthorize("hasRole('ADMIN')")
	public String  getMessage() {
		
		return "Welcome to <b> Srikanth Muniganti</b>'s Website";
	}
	
	@GetMapping("/message2")
	@PreAuthorize("hasRole('USER')")
	@ResponseBody
	public String  getMessage2() {
		
		return "Welcome to <b> Srikanth Muniganti message2 </b> Website";
	}
	
}
