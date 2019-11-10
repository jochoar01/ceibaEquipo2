package com.ceiba.grupo2.interfaces;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.ceiba.grupo2.entities.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer> {

	List<Persona>findAll();
	/*Persona findOne(int id);*/
	Persona save(Persona p);
	void delete(Persona p);
}
