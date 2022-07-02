package com.ingenieriaweb.springboot.form.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ingenieriaweb.springboot.form.app.models.domain.Autor;
import com.ingenieriaweb.springboot.form.app.models.domain.DetalleAutor;
import com.ingenieriaweb.springboot.form.app.models.domain.Ejemplar;
import com.ingenieriaweb.springboot.form.app.models.domain.Prestamo;
import com.ingenieriaweb.springboot.form.app.models.domain.Libro;
import com.ingenieriaweb.springboot.form.app.models.domain.Usuario;

@Configuration
public class AppConfig {

    @Bean("itemsAutor")
    public List<DetalleAutor> registrarItemsA(){
        Autor autor1 = new Autor("A01","juan jose perez");
       // Autor autor2 = new Autor("02","carlos mendez");
        DetalleAutor detAut1= new DetalleAutor(autor1);
        DetalleAutor detAut2= new DetalleAutor(autor1);
    return Arrays.asList(detAut1,detAut2);
    }
    
    Libro libro1 = new Libro("L01","ciencias","isb1","santillana",200);
    
    @Bean("itemsPrestamo")
    public List<Prestamo> registrarItems(){
        Ejemplar ejemplar1 = new Ejemplar(libro1,"E01","Biblioteca");
        Ejemplar ejemplar2 = new Ejemplar(libro1,"E02","Biblioteca");
        Prestamo prestamo1= new Prestamo(ejemplar1,"02/07/2022","22/07/2022");
        Prestamo prestamo2= new Prestamo(ejemplar2,"02/07/2022","25/07/2022");
    return Arrays.asList(prestamo1,prestamo2);
    }

    Usuario usuario1= new Usuario("leandro","av los laureles","953168423");



}
