package com.ceiba.grupo2.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.grupo2.entities.Biblioteca;
import com.ceiba.grupo2.interfaces.BibliotecaRepository;
import com.ceiba.grupo2.interfaces.BibliotecaService;

@Service

public class BibliotecaServicesImpl implements BibliotecaService {
	@Autowired

	private BibliotecaRepository bibliotecaRepository;

	@Override
	public List<Biblioteca> listar() {
		
		return bibliotecaRepository.findAll();
	}

	@Override
	public Biblioteca listarId(int id) {
		
		return bibliotecaRepository.getOne(id);
	}

	@Override
	public Biblioteca add(Biblioteca l) {
		
		return bibliotecaRepository.save(l);
	}

	@Override
	public Biblioteca edit(Biblioteca l) {
		
		return bibliotecaRepository.save(l);
	}

	@Override
	public Biblioteca delete(int id) {
		
		return null;
	}

}
