package com.ingenieriaweb.springboot.form.app.models.domain;

import javax.validation.constraints.NotEmpty;

public class Autor {

	@NotEmpty
	private String codigoAutor;
	@NotEmpty
	private String nombre;
	
	 
	public Autor(String codigoAutor, String nombre) {
		this.codigoAutor = codigoAutor;
		this.nombre = nombre;
	}
	public String getCodigoAutor() {
		return codigoAutor;
	}
	public void setCodigoAutor(String codigoAutor) {
		this.codigoAutor = codigoAutor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 
	
	
	
}
