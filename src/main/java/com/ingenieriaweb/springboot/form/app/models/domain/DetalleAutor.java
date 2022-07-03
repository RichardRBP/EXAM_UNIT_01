package com.ingenieriaweb.springboot.form.app.models.domain;
import org.springframework.beans.factory.annotation.Autowired;
public class DetalleAutor {

	@Autowired
	private Autor autor;
	public DetalleAutor(Autor autor) {
		this.autor = autor;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
