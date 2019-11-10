package com.ceiba.grupo2.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prestamo")

public class Prestamo {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column 
	String isbn;
	@Column
	private int ejemplar;
	@Column
	private int cedula_persona;
	@Column
	private Date fecha_prestamo;
	@Column
	private Date fecha_entrega_maxima;
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
	public int getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(int ejemplar) {
		this.ejemplar = ejemplar;
	}
	public int getCedula_persona() {
		return cedula_persona;
	}
	public void setCedula_persona(int cedula_persona) {
		this.cedula_persona = cedula_persona;
	}
	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}
	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	public Date getFecha_entrega_maxima() {
		return fecha_entrega_maxima;
	}
	public void setFecha_entrega_maxima(Date fecha_entrega_maxima) {
		this.fecha_entrega_maxima = fecha_entrega_maxima;
	}
	
	
	
}
