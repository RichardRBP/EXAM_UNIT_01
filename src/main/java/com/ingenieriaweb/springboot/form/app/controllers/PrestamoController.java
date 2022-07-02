package com.ingenieriaweb.springboot.form.app.controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.form.app.models.domain.Prestamo;

@Controller
@RequestMapping({"/app","/",""})
public class PrestamoController {
    
	@GetMapping({ "/prestamo" }) // 
	public String prestamoIndex(Model model) {
		Prestamo prestamo = new Prestamo(null, null, null);
		model.addAttribute("titulo", "EXAMEN INGENIERIA WEB");
		model.addAttribute("prestamo", prestamo);
		return "prestamo/index";
	}
	
	@PostMapping({"/app/prestamo"})
	public String procesar(@Valid Prestamo prestamo,BindingResult result , Model model    ) {

        model.addAttribute("titulo", "Resultado Formulario Prestamo");

        if(result.hasErrors()) {
            
            return "prestamo/index";
        }
        model.addAttribute("prestamo", prestamo);
		return "prestamo/resultado";
}






}
