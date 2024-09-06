package com.example.webSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

	@Autowired
	private PersonaRespository personaRespository;

	public void add(Persona persona) {
		personaRespository.add(persona);
	}

	public void remove(Persona persona) {
		personaRespository.remove(persona);
	}

	public List<Persona> buscarTodos() {
		return personaRespository.buscarTodos();
	}
	

}
