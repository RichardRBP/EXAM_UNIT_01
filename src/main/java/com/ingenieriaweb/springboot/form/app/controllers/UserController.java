package com.ingenieriaweb.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.form.app.models.domain.Usuario;

@Controller
@RequestMapping({"/app","/",""})
public class UserController {
	
	@GetMapping("/usuario")
	public String usuarioIndex(Model model) {
//		Usuario usuario = new Usuario(null, null, null);
		model.addAttribute("titulo", "Formulario de Usuarios");
//		model.addAttribute("usuario",usuario);
		return "usuario/index";
	}
	
	
	@PostMapping("/app/usuario")
	public String procesarUsuario(@Valid Usuario usuario,BindingResult result, Model model) {
		 model.addAttribute("titulo", "Resultado Formulario Usuario");

	        if(result.hasErrors()) {
	            
	            return "usuario/index";
	        }
	        model.addAttribute("usuario", usuario);
			return "usuario/resultado";
	}

}
