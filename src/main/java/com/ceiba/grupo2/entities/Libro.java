package com.ceiba.grupo2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String isbn;
	@Column
	private String nombre;
	@Column
	private int ejemplar;
	@Column
	private String prestado;
	@Column
	private String polindromo;
	@Column
	private String isbn_mayor_30;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(int ejemplar) {
		this.ejemplar = ejemplar;
	}
	public String getPrestado() {
		return prestado;
	}
	public void setPrestado(String prestado) {
		this.prestado = prestado;
	}
	public String getPolindromo() {
		return polindromo;
	}
	public void setPolindromo(String polindromo) {
		this.polindromo = polindromo;
	}
	public String getIsbn_mayor_30() {
		return isbn_mayor_30;
	}
	public void setIsbn_mayor_30(String isbn_mayor_30) {
		this.isbn_mayor_30 = isbn_mayor_30;
	}


	

}
