package com.ceiba.grupo2.interfaces;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ceiba.grupo2.entities.Biblioteca;

public interface BibliotecaRepository extends Repository<Biblioteca, Integer> {

	List<Biblioteca> findAll();

	Biblioteca getOne(int id);
 
	Biblioteca save(Biblioteca Biblioteca);

	void delete(Biblioteca Biblioteca);

}
