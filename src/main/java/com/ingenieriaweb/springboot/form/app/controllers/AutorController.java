package com.ingenieriaweb.springboot.form.app.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.form.app.AppConfig;
import com.ingenieriaweb.springboot.form.app.models.domain.Autor;

@Controller
@RequestMapping({ "/app", "/", "" })
public class AutorController {

 
	 
	@GetMapping("/autor")
	public String autorIndex(Model model) {
        Autor autor = new Autor(null, null);
		model.addAttribute("titulo", "Formulario de Autores");
		model.addAttribute("autor", autor);
		return "autor/index";
	}

	@PostMapping("/app/autor")
	public String procesarAutor(@Valid Autor autor, BindingResult result, Model model) {
		model.addAttribute("titulo", "Resultado Formulario Autor");
		if (result.hasErrors()) { return "autor/index"; }
		model.addAttribute("autor", autor);
		List<Autor> lista = new ArrayList<>(AppConfig.autores2);
		lista.add(autor);
		AppConfig.autores2 = lista;
	    model.addAttribute("autores", lista);
		
		
		return "autor/resultado";
	}
}
