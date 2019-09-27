package com.smartinm.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	
//	@GetMapping("/")
//	public String error404() {
//		return "404"; 
//	}

	@GetMapping("/")
	public String error500() {
		return "500"; 
	}
}
