package com.example.webSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	private PersonaService personaService;

	
	public void add(Persona persona) {
		personaService.add(persona);
	}

	public void remove(Persona persona) {
		personaService.remove(persona);
	}

	@GetMapping 
	public List<Persona> buscarTodos() {
		return personaService.buscarTodos();
	}

	
	
}
