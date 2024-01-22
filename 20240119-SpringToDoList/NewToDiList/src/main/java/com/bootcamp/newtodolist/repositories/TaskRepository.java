package com.bootcamp.newtodolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.newtodolist.models.TaskModel;

public interface TaskRepository extends JpaRepository<TaskModel, Integer>{
	
}
