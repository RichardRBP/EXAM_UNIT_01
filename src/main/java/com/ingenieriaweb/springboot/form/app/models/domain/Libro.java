package com.ingenieriaweb.springboot.form.app.models.domain;

import java.util.List;

public class Libro {

	//private DetalleAutor detalleAutor;
	private String codigoLibro;
	private String titulo;
	private String isbn;
	private String editorial;
	private Integer nroPaginas;
	List<DetalleAutor>Item;

	
	public String getCodigoLibro() {
		return codigoLibro;
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

