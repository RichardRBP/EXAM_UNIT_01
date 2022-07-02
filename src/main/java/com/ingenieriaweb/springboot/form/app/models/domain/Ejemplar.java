package com.ingenieriaweb.springboot.form.app.models.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Ejemplar {

	private Libro libro;
	@NotEmpty
	@Size(min=3,max=5)
	private String codigoEjemplar;
	@NotEmpty
	private String localizacion;
	
	
	 
    public Ejemplar(Libro libro, String codigoEjemplar, String localizacion) {
    }
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
