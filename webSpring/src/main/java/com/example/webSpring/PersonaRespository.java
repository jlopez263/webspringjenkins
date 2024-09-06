package com.example.webSpring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonaRespository {

	private List<Persona> personas = new ArrayList<Persona>();

	public PersonaRespository() {

		personas.add(new Persona("Ana"));
	}

	public void add(Persona persona) {

		personas.add(persona);
	}

	public void remove(Persona persona) {

		personas.remove(persona);
	}

	public  List<Persona> buscarTodos() {

		return personas;
	}

}