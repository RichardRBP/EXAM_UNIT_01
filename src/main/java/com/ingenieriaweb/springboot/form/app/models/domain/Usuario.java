package com.ingenieriaweb.springboot.form.app.models.domain;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Usuario {

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String direccion;

	@NotEmpty
	private String telefono;
	
	@Autowired
	List<Prestamo>Item;
	

	public String getNombre() {
		return nombre;
	}
	
//	public Usuario(String nombre, String direccion, String telefono, List<Prestamo> item) {
//		this.nombre = nombre;
//		this.direccion = direccion;
//		this.telefono = telefono;
//		Item = item;
//	}
	
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
