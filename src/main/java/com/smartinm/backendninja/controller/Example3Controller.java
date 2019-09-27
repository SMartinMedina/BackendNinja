package com.smartinm.backendninja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.smartinm.backendninja.model.Persona;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

	public final static String FORM_VIEW = "form";
	public final static String RESULT_VIEW = "result";
	
	@GetMapping("/showform")
	public String requestForm(Model model) {
		model.addAttribute("persona", new Persona());
		//int i = 6 / 0;
		
		return FORM_VIEW;
	}
//	@GetMapping("/")
//	public String redirect() {
//		return "redirect:/example3/showform";
//	}
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/example3/showform");
	}
	
	@PostMapping("/addpersona")
	public ModelAndView addPersona(@Valid @ModelAttribute("persona") Persona persona, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();
		if(bindingResult.hasErrors()) {
			mav = new ModelAndView(FORM_VIEW);
		}else {
			mav = new ModelAndView(RESULT_VIEW);
			mav.addObject("persona", persona);
		}
		return	mav;
	}
	
}
