package com.bootcamp.newtodolist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.newtodolist.models.TaskModel;
import com.bootcamp.newtodolist.repositories.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	// GET Task
	public List<TaskModel> getTasks() {
		return taskRepository.findAll();
	}

	public Optional<TaskModel> getTaskByid(int id) {
		return taskRepository.findById(id);
	}

	public String createTask(TaskModel newTask) {
		taskRepository.save(newTask);
		return "Created Success";
	}

	public String deleteTask(int id) {
		taskRepository.deleteById(id);
		return "Delete Success";
	}

	public String updateTask(int id, TaskModel taskEdit) {
		TaskModel t = taskRepository.findById(id).get();
		if (t!=null) {
			t.setName(taskEdit.getName());
			t.setDescription(taskEdit.getDescription());
			t.setState(taskEdit.isState());
			taskRepository.save(t);
			return "Update Success";
		}
		return "error";
	}
	
}
