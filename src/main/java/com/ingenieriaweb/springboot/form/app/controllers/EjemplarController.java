package com.ingenieriaweb.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ingenieriaweb.springboot.form.app.models.domain.Ejemplar;

@Controller
@RequestMapping({"/app","/",""})
public class EjemplarController {
	@GetMapping({ "/ejemplar" }) 
	public String ejemplarIndex(Model model) {
		Ejemplar ejemplar = new Ejemplar();
		model.addAttribute("titulo", "EXAMEN INGENIERIA WEB");
		model.addAttribute("ejemplar", ejemplar);
		return "ejemplar/index";
	}
	
	@PostMapping({"/ejemplar"})
	public String procesar(@Valid Ejemplar ejemplar,BindingResult result , Model model    ) {

        model.addAttribute("titulo", "Resultado Formulario de Ejemplar");

        if(result.hasErrors()) {
            
            return "ejemplar/index";
        }
        model.addAttribute("ejemplar", ejemplar);
		return "ejemplar/resultado";
}
}
