package com.smartinm.backendninja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartinm.backendninja.repository.CursoJpaRepository;

@Controller
@RequestMapping("/say")
public class HelloWorldController {

	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJpaRepository cursoJpaRepository; 
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		cursoJpaRepository.findAll();
		return "helloworld";
	}
}
