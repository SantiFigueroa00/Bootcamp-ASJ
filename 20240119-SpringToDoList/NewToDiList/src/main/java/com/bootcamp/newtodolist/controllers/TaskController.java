package com.bootcamp.newtodolist.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.newtodolist.models.TaskModel;
import com.bootcamp.newtodolist.services.TaskService;

@RestController
@RequestMapping("/tasks") //localhost:8080/tasks
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@GetMapping("/test")
	public ResponseEntity<String> testing() {
		//return new ResponseEntity<>("Hola Mundo", HttpStatus.CREATED);
		return ResponseEntity.ok("Test ok");
	}
	
	
	@GetMapping()
	public ResponseEntity<List<TaskModel>> getTasks() {
		return ResponseEntity.ok(taskService.getTasks());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<TaskModel>> getTaskById(@PathVariable int id) {
		return ResponseEntity.ok(taskService.getTaskByid(id));
	}
	
	@PostMapping()
	public ResponseEntity<String> createTask(@RequestBody TaskModel newTask) {
		//TODO: process POST request
		
		return ResponseEntity.ok(taskService.createTask(newTask));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateTask(@PathVariable int id ,@RequestBody TaskModel taskEdit) {
		
		return ResponseEntity.ok(taskService.updateTask(id,taskEdit));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable int id ) {
		
		return ResponseEntity.ok(taskService.deleteTask(id));
	}
	
}
