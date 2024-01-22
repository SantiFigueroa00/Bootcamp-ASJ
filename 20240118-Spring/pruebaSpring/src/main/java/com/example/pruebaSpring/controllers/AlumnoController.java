package com.example.pruebaSpring.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.pruebaSpring.models.Alumno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class AlumnoController {
	
	List<Alumno> alumnos = new ArrayList<Alumno>(
			List.of(new Alumno(1,"Bob","Patiño",9.5),
					new Alumno(2,"Moe","Sczyslak",4),
					new Alumno(3,"Troy","McLure",2.6),
					new Alumno(4,"Edna","Krabaples",8.7))
	);
	
	@GetMapping("/alumnos")
	public List<Alumno> listPersonas() {
		return alumnos;
	}
	
	@GetMapping("/alumnos/{id}")
	public Alumno getAlumnoById(@PathVariable int id) {
		for (Alumno alumno : alumnos) {
			if (alumno.getId()==id) {
				return alumno;
			}
		}
		return null;
	}
	
	@DeleteMapping("/alumnos/{id}")
	public String deleteAlumnoById(@PathVariable int id){
		for (Alumno alumno : alumnos) {
			if (alumno.getId()==id) {
				alumnos.remove(alumno);
	            return "Eliminando el alumno " + id;
			}
		}
		return "Eliminando el alumno "+id;
	}
	
	@PostMapping("/alumnos")
	public String postMethodName(@RequestBody Alumno newAlumno) {
		if (alumnos.stream().anyMatch(alumno -> alumno.getId() == newAlumno.getId())) {
	        return "Error: Ya existe un alumno con el ID " + newAlumno.getId();
	    }
		
		newAlumno.setId(alumnos.getLast().getId()+1);
		alumnos.add(newAlumno); 
		return "Creando un Alumno: " + newAlumno.toString();
	}
	
	@PutMapping("/alumnos/{id}")
    public String putMethodName(@PathVariable int id, @RequestBody Alumno alumnoActualizado) {
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                // Actualizar la información del alumno existente con la nueva información
                alumno.setNombre(alumnoActualizado.getNombre());
                alumno.setApellido(alumnoActualizado.getApellido());
                alumno.setNota(alumnoActualizado.getNota());
                return "Actualizando el alumno con ID " + id;
            }
        } 
        return "No se encontró el alumno con el ID: " + id;
    }
	
	
}
