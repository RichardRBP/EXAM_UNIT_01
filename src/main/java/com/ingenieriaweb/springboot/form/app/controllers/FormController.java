package com.ingenieriaweb.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller // importo
@RequestMapping({"/app","/",""}) // RUTA PRIMER NIVEL_importo, ruta de mi controlador que quiero mapear
public class FormController {

	@GetMapping({ "/index", "/login", "/home", "/","" }) // importo-ruta entre llaves de index
	public String index(Model model) {
		model.addAttribute("titulo", "EXAMEN INGENIERIA WEB");
		return "index";
	}
	 
	
	

}
