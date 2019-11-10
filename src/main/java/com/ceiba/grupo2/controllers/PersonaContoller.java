package com.ceiba.grupo2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.grupo2.entities.Persona;
import com.ceiba.grupo2.interfaces.PersonaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/personas" })
public class PersonaContoller {

	@Autowired
	PersonaService personaService;
	
	@GetMapping
	public List<Persona> listar() {
		return personaService.listar();
	}
	
	@PostMapping 
	public Persona agregar(@RequestBody Persona p) {
		return personaService.add(p);
		
		
	}
	
	@GetMapping(path = {"/{id}"})
	public Persona listarId(@PathVariable("id") int id ) {
		return personaService.listarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Persona editar(@RequestBody Persona p, @PathVariable("id") int id ) {
		p.setId(id);
		return personaService.edit(p);
	}

}
