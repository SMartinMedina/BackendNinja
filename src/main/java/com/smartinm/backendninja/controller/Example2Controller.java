package com.smartinm.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {
	public static final String EXAMPLE_VIEW2 = "example2";
	//localhost:8080/example2/request1?nm=NombreDeEjemplo
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm",required=false,defaultValue="NULL") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW2);
		mav.addObject("nm_in",name);		
		return mav;		
	}
	//localhost:8080/example2/request2/NombreDeEjemplo	
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm")String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW2);
		mav.addObject("nm_in", name);
		return mav;
	}

}
