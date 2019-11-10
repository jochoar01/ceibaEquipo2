package com.ceiba.grupo2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.grupo2.entities.Persona;
import com.ceiba.grupo2.interfaces.PersonaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/persona" })
public class PersonaContoller {

	@Autowired
	PersonaService personaService;
	
	@GetMapping
	public List<Persona> listar() {
		return personaService.listar();
	}

}
