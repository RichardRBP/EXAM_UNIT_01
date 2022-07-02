package com.ingenieriaweb.springboot.form.app.models.domain;

import javax.validation.constraints.NotEmpty;

public class Ejemplar {

	private Libro libro;
	@NotEmpty
	private String codigoEjemplar;
	@NotEmpty
	private String localizacion;
	
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public String getCodigoEjemplar() {
		return codigoEjemplar;
	}
	public void setCodigoEjemplar(String codigoEjemplar) {
		this.codigoEjemplar = codigoEjemplar;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
	
	
}
