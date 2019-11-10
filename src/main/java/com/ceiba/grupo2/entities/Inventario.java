package com.ceiba.grupo2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventario")

public class Inventario {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int isbn; 
	@Column
	private int cantidad_prestados; 
	@Column
	private int cantidad_disponibles; 
	@Column
	private int cantidad_total; 
	@Column
	private int id_biblioteca;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getCantidad_prestados() {
		return cantidad_prestados;
	}
	public void setCantidad_prestados(int cantidad_prestados) {
		this.cantidad_prestados = cantidad_prestados;
	}
	public int getCantidad_disponibles() {
		return cantidad_disponibles;
	}
	public void setCantidad_disponibles(int cantidad_disponibles) {
		this.cantidad_disponibles = cantidad_disponibles;
	}
	public int getCantidad_total() {
		return cantidad_total;
	}
	public void setCantidad_total(int cantidad_total) {
		this.cantidad_total = cantidad_total;
	}
	public int getId_biblioteca() {
		return id_biblioteca;
	}
	public void setId_biblioteca(int id_biblioteca) {
		this.id_biblioteca = id_biblioteca;
	}
	


	

}
