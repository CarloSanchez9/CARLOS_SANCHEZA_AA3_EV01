package com.proyecto.springproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springproyecto.controllers.Informacionproyectoaprendiz;

@RestController
@SpringBootApplication
public class SpringproyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringproyectoApplication.class, args);
	}

@GetMapping("/proyectoaprendiz")
public Informacionproyectoaprendiz messageView(){

	return new Informacionproyectoaprendiz();

}

}
