package com.ingenieriaweb.springboot.form.app.models.domain;

public class Ejemplar {

	private Libro libro;
	private String codigoEjemplar;
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
