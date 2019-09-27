package com.smartinm.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.smartinm.backendninja.model.Persona;
import com.smartinm.backendninja.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	
	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

	@Override
	public List<Persona> getListPersonas() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Pablo", 33));
		personas.add(new Persona("Pedro", 25));
		personas.add(new Persona("Juan", 18));
		personas.add(new Persona("Lucas", 10));
		personas.add(new Persona("Maria", 30));
		personas.add(new Persona("Elisa", 48));
		LOG.info("Hello From service");
		return personas;
	}

}
