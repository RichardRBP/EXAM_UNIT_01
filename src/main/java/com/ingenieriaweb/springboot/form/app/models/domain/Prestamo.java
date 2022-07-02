package com.ingenieriaweb.springboot.form.app.models.domain;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;

public class Prestamo {

	@Autowired
	private Ejemplar ejemplar;
	@NotEmpty
	private String fechaPrestamo;
	@NotEmpty
	private String fechaDevolucion;
	
	 
	public Prestamo(Ejemplar ejemplar, String fechaPrestamo, String fechaDevolucion) {
	}
	public Ejemplar getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	public String getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
 
	
	
	
}
