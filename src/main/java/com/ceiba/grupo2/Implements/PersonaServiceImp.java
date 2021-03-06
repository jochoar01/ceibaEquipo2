package com.ceiba.grupo2.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.grupo2.entities.Persona;
import com.ceiba.grupo2.interfaces.PersonaRepositorio;
import com.ceiba.grupo2.interfaces.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {

	@Autowired
	private PersonaRepositorio personaRepositorio;

	@Override
	public List<Persona> listar() {
		return personaRepositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		
		return personaRepositorio.getOne(id);
	}

	@Override
	public Persona add(Persona p) {
		
		return personaRepositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		
		return personaRepositorio.save(p);
	}

	@Override
	public Persona delete(int id) {
		
		return null;
	}

}
