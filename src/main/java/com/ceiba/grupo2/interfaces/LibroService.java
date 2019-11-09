package com.ceiba.grupo2.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ceiba.grupo2.entities.Libro;

public interface LibroService {

	List<Libro>listar();
	Libro listarId(int id);
	Libro add(Libro libro);
	Libro edit(Libro libro);
	Libro delete(int id);

}
