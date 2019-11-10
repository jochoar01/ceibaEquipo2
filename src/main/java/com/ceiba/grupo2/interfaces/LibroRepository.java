package com.ceiba.grupo2.interfaces;

import java.util.List;

import org.springframework.data.repository.Repository;






import com.ceiba.grupo2.entities.Libro;

public interface LibroRepository extends Repository<Libro, Integer>{

	List<Libro>findAll();
	//Libro findOne(int id);
	Libro save(Libro libro);
	void delete(Libro libro);
	
}
