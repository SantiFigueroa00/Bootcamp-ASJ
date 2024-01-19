package com.example.pruebaSpring.holaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	@GetMapping("/saludo/{nombre}") //localhost:8080/saludo/Flecha [GET]
	public String holaMundo(@PathVariable String nombre) {
		return "Hola Mundo! " +nombre;
	}
}
