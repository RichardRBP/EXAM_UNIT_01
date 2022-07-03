package com.ingenieriaweb.springboot.form.app.models.domain;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;

public class Libro {

	//private DetalleAutor detalleAutor;
	@NotEmpty
	private String codigoLibro;
	@NotEmpty
	private String titulo;
	@NotEmpty
	private String isbn;
	@NotEmpty
	private String editorial;
	
	private Integer nroPaginas;
	@Autowired
	List<DetalleAutor>Item;
 
	public String getCodigoLibro() {
		return codigoLibro;
	}

	public Libro(String codigoLibro, String titulo, String isbn, String editorial, Integer nroPaginas,
			List<DetalleAutor> item) {
		this.codigoLibro = codigoLibro;
		this.titulo = titulo;
		this.isbn = isbn;
		this.editorial = editorial;
		this.nroPaginas = nroPaginas;
		Item = item;
	}

	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Integer getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(Integer nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public List<DetalleAutor> getItem() {
		return Item;
	}

	public void setItem(List<DetalleAutor> item) {
		Item = item;
	}
	
	
	
	
}

