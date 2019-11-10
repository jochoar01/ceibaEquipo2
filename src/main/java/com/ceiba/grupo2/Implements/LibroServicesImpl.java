package com.ceiba.grupo2.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.grupo2.entities.Libro;
import com.ceiba.grupo2.interfaces.LibroRepository;
import com.ceiba.grupo2.interfaces.LibroService;

@Service

public class LibroServicesImpl implements LibroService {
	@Autowired

	private LibroRepository libroRepository;

	@Override
	public List<Libro> listar() {
		
		return libroRepository.findAll();
	}

	@Override
	public Libro listarId(int id) {
		
		return libroRepository.findOne(id);
	}

	@Override
	public Libro add(Libro l) {
		
		return libroRepository.save(l);
	}

	@Override
	public Libro edit(Libro l) {
		
		return libroRepository.save(l);
	}

	@Override
	public Libro delete(int id) {
		
		return null;
	}

}
