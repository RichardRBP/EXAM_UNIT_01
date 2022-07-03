
package com.ingenieriaweb.springboot.form.app.controllers;

import javax.validation.Valid;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.form.app.AppConfig;
import com.ingenieriaweb.springboot.form.app.models.domain.Libro;
 
@Controller
@RequestMapping({ "/app", "/", "" })
public class LibroController {

	 
	@GetMapping("/libro")
	public String libroIndex(Model model) {
        Libro libro = new Libro(null, null,null, null,null, null);
		model.addAttribute("titulo", "Formulario de Libros");
		model.addAttribute("libro", libro);
		return "libro/index";
	}

	@PostMapping("/app/libro")
	public String procesarLibro(@Valid Libro libro, BindingResult result, Model model) {
		model.addAttribute("titulo", "Resultado Formulario Libro");
		model.addAttribute("prestamos",  AppConfig.listaAutores()); 
        model.addAttribute("prestamos",  AppConfig.listaAutor()); 
		if (result.hasErrors()) {

			return "autor/index";
		}
		model.addAttribute("libro", libro);
		return "autor/resultado";
	}
}
