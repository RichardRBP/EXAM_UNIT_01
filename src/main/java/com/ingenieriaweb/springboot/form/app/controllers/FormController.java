package com.ingenieriaweb.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller // 
@RequestMapping({"/app","/",""}) // RUTA PRIMER NIVEL_importo, 
public class FormController {

	@GetMapping({ "/index", "/login", "/home", "/","" }) // 
	public String index(Model model) {
		model.addAttribute("titulo", "EXAMEN INGENIERIA WEB");
		return "index";
	}
	 
	
	

}
