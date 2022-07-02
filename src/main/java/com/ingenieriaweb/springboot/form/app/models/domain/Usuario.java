package com.ingenieriaweb.springboot.form.app.models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Usuario {

	//private String codigoUsuario;
	private String codigoUsuario;
	private String nombre;
	private String direccion;
	private String telefono;
	@Autowired
	List<Prestamo>Item;
	
	
	//public Usuario(String nombre, String direccion, String telefono) {
	//}

	public String getNombre() {
		return nombre;
	}
	public Usuario(String codigoUsuario,String nombre, String direccion, String telefono, List<Prestamo> item) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		Item = item;
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
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	
	
}
