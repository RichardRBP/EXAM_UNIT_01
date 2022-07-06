
package com.ingenieriaweb.springboot.form.app.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.form.app.AppConfig;
import com.ingenieriaweb.springboot.form.app.models.domain.DetalleAutor; 
@Controller
@RequestMapping({ "/app", "/", "" })
public class DetalleAutorController {

	@Autowired
    List<DetalleAutor> detalleAutores1; 

	//	List<Autor> li = new ArrayList<>(autores1);
		


	@GetMapping("/detalleAutor")
	public String libroIndex(Model model) {
        DetalleAutor detalleAutor = new DetalleAutor(null);
		model.addAttribute("titulo", "Formulario de Detalle autor");
		model.addAttribute("detalleAutor", detalleAutor);
		//List<Autor> detAut = new ArrayList<>(autores1);
	//	model.addAttribute("autores", detAut);

		model.addAttribute("libros",AppConfig.listaLibros());	//enviamos los libros a la vista index
		model.addAttribute("autores", AppConfig.listaAutor());	//enviamos los usuarios a la vista index
		
		return "detalleAutor/index";
	}

	@PostMapping("/app/detalleAutor")
	public String procesarDetalleAutor(@Valid DetalleAutor detalleAutor, BindingResult result, Model model) {
		model.addAttribute("titulo", "Resultado Formulario Detalle autor");
		model.addAttribute("detalleautor",  AppConfig.listaAutores()); 
		if (result.hasErrors()) {

			return "detalleAutor/index";
		}
		model.addAttribute("detalleAutor", detalleAutor);
		return "detalleAutor/resultado";
	}
}
