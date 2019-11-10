package com.ceiba.grupo2.interfaces;

import java.util.List;

import com.ceiba.grupo2.entities.Biblioteca;


public interface BibliotecaService {
	List<Biblioteca> listar();

	Biblioteca listarId(int id);

	Biblioteca add(Biblioteca b);

	Biblioteca edit(Biblioteca b);

	Biblioteca delete(int id);
}
