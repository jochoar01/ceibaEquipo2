package com.ceiba.grupo2.interfaces;

import java.util.List;

import com.ceiba.grupo2.entities.Libro;
import com.ceiba.grupo2.entities.Persona;

public interface LibroService {

	List<Libro> listar();

	Libro listarId(int id);

	Libro add(Libro libro);

	Libro edit(Libro p);

	Libro delete(int id);

}
