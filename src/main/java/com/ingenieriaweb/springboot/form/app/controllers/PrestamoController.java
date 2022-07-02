package com.ingenieriaweb.springboot.form.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ingenieriaweb.springboot.form.app.models.domain.Prestamo;

@Controller
public class PrestamoController {
    
     

    @ModelAttribute("prestamos")
	public List<Prestamo> poblarPrestamos(){
		List<Prestamo> prestamos =new ArrayList<> ();
	//   prestamos.add(new Prestamo(2,"06/07/2022","30/07/2022"));
	//	prestamos.add(new Prestamo(2,"06/07/2022","30/07/2022"));
	//	prestamos.add(new Prestamo(1,"06/07/2022","30/07/2022"));
	//	prestamos.add(new Prestamo(1,"06/07/2022","30/07/2022"));
	
		return prestamos;
	}

}
