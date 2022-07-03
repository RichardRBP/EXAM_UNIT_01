package com.ingenieriaweb.springboot.form.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ingenieriaweb.springboot.form.app.models.domain.Autor;
import com.ingenieriaweb.springboot.form.app.models.domain.DetalleAutor;
import com.ingenieriaweb.springboot.form.app.models.domain.Ejemplar;
import com.ingenieriaweb.springboot.form.app.models.domain.Libro;
import com.ingenieriaweb.springboot.form.app.models.domain.Prestamo;
import com.ingenieriaweb.springboot.form.app.models.domain.Usuario;

@Configuration
public class AppConfig {

    @Bean("Autor")
    public static List<Autor> registrarA(){
        Autor autor1 = new Autor("A01","juan jose perez");
        Autor autor2 = new Autor("02","carlos mendez");
    return Arrays.asList(autor1,autor2);
    }
 
    @Bean("itemsAutor")
    public static List<DetalleAutor> listaAutores(){
        Autor autor1 = new Autor("A01","juan jose perez");
        Autor autor2 = new Autor("02","carlos mendez");

        DetalleAutor detAut1= new DetalleAutor(autor1);
        DetalleAutor detAut2= new DetalleAutor(autor2);
    return Arrays.asList(detAut1,detAut2);
    }
    
    @Bean("Libro")
    public static List<Libro> listaLibros(){
        Libro libro1 = new Libro("L01","ciencias","isb1","santillana",200,listaAutores());
    return Arrays.asList(libro1);
    }

     @Bean("Ejemplar1")
    public static List<Ejemplar> listaEjemplares1(){
        Libro libro1 = new Libro("L01","ciencias","isb1","santillana",200,listaAutores());
        Ejemplar ejemplar1 = new Ejemplar(libro1,"E01 ciencias","Biblioteca");
        Ejemplar ejemplar2 = new Ejemplar(libro1,"E01 ciencias","Biblioteca");
       
    return Arrays.asList(ejemplar1,ejemplar2);
    }
    @Bean("Ejemplar")
    public static List<Ejemplar> listaEjemplares(){
        Libro libro1 = new Libro("L01","ciencias","isb1","santillana",200,listaAutores());
        Ejemplar ejemplar1 = new Ejemplar(libro1,"E01 ciencias","Biblioteca");
        Ejemplar ejemplar2 = new Ejemplar(libro1,"E02 ciencias","Biblioteca");
        return Arrays.asList(ejemplar1,ejemplar2);
    }
    @Bean("itemsPrestamo")
    public static List<Prestamo> listaPrestamos(){
        Libro libro1 = new Libro("L01","ciencias","isb1","santillana",200,listaAutores());
    
        Ejemplar ejemplar1 = new Ejemplar(libro1,"E01 ciencias","Biblioteca");
        Ejemplar ejemplar2 = new Ejemplar(libro1,"E01 ciencias","Biblioteca");
   
        Prestamo prestamo1= new Prestamo(ejemplar1,"02/07/2022","22/07/2022");
        Prestamo prestamo2= new Prestamo(ejemplar2,"02/07/2022","25/07/2022");
    return Arrays.asList(prestamo1,prestamo2);
    }

    
    @Bean("Usuario")
    public static List<Usuario> listaUsuarios(){
    Usuario usuario1= new Usuario("U01","leandro","av los laureles","953168423", listaPrestamos());
    Usuario usuario2= new Usuario("U02","juanjose","av la llegada","65327819", listaPrestamos());
    return Arrays.asList(usuario1,usuario2);
    }

}
