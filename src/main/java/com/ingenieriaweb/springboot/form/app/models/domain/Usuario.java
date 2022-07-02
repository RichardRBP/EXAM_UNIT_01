package com.ingenieriaweb.springboot.form.app.models.domain;

import java.util.List;

import javax.validation.constraints.NotEmpty;

public class Usuario {

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String direccion;

	@NotEmpty
	private String telefono;

	List<Prestamo> Item;

	public Usuario(String nombre, String direccion, String telefono) {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Prestamo> getItem() {
		return Item;
	}

	public void setItem(List<Prestamo> item) {
		Item = item;
	}

}
