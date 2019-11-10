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

import com.ceiba.grupo2.entities.Libro;
import com.ceiba.grupo2.entities.Persona;
import com.ceiba.grupo2.interfaces.LibroService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/libros" })
public class LibroController {

	@Autowired
	LibroService libroService;

	@GetMapping
	public List<Libro> listar() {
		return libroService.listar();
	}
	
	@PostMapping 
	public Libro agregar(@RequestBody Libro l) {
		return libroService.add(l);
		
		
	}
	
	@GetMapping(path = {"/{id}"})
	public Libro listarId(@PathVariable("id") int id ) {
		return libroService.listarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Libro editar(@RequestBody Libro l, @PathVariable("id") int id ) {
		l.setId(id);
		return libroService.edit(l);
	}


}
