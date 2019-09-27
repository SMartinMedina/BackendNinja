package com.smartinm.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smartinm.backendninja.components.ExampleComponent;
import com.smartinm.backendninja.model.Persona;
import com.smartinm.backendninja.service.ExampleService;

@Controller
@RequestMapping(value="/example")
public class ExampleController {
	
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	
	public static String EXAMPLE_VIEW = "example";
	@GetMapping("exampleString")
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("personas", exampleService.getListPersonas());
		return EXAMPLE_VIEW;
	}
	@GetMapping("exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("personas", exampleService.getListPersonas());
		return mav;
	}
	
	public List<Persona> getPersonas(){
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Pablo", 33));
		personas.add(new Persona("Pedro", 25));
		personas.add(new Persona("Juan", 18));
		personas.add(new Persona("Lucas", 10));
		personas.add(new Persona("Maria", 30));
		personas.add(new Persona("Elisa", 48));
		
		return personas;
	}
}
