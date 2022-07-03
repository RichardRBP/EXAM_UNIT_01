package com.ingenieriaweb.springboot.form.app.models.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

public class Ejemplar {

	@Autowired
	private Libro libro;
	@NotEmpty
	@Size(min=3,max=10)
	private String codigoEjemplar;
	@NotEmpty
	private String localizacion;
	
    public Ejemplar(Libro libro, @NotEmpty @Size(min = 3, max = 10) String codigoEjemplar,
			@NotEmpty String localizacion) {
		this.libro = libro;
		this.codigoEjemplar = codigoEjemplar;
		this.localizacion = localizacion;
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
