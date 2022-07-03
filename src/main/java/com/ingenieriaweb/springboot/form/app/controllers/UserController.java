package com.ingenieriaweb.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.form.app.AppConfig;
import com.ingenieriaweb.springboot.form.app.models.domain.Usuario;

@Controller
@RequestMapping({ "/app", "/", "" })
public class UserController {

	@Autowired
	private Usuario usuario;

	@GetMapping("/usuario")
	public String usuarioIndex(Model model) {
		model.addAttribute("titulo", "Formulario de Usuarios");
		model.addAttribute("usuario", usuario);
		model.addAttribute("prestamos",AppConfig.listaPrestamos());	
		return "usuario/index";
	}

	@PostMapping("/app/usuario")
	public String procesarUsuario(@Valid Usuario usuario, BindingResult result, Model model) {
		model.addAttribute("titulo", "Resultado Formulario Usuario");
		model.addAttribute("prestamo", "Lista de Préstamos");
		model.addAttribute("listaPrestamo",AppConfig.listaPrestamos());	

		if (result.hasErrors()) {

			return "usuario/index";
		}
		model.addAttribute("usuario", usuario);
		return "usuario/resultado";
	}
}
