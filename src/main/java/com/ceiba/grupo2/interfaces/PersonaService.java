package com.ceiba.grupo2.interfaces;

import java.util.List;

import com.ceiba.grupo2.entities.Persona;

public interface PersonaService {
	List<Persona> listar();

	Persona listarId(int id);

	Persona add(Persona p);

	Persona edit(Persona p);

	Persona delete(int id);
}
