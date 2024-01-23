package com.bootcamp.backvideos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootcamp.backvideos.models.VideoModel;
import com.bootcamp.backvideos.services.VideoService;


@Controller
@RequestMapping("/videos") 
public class VideoController {
	@Autowired
	VideoService videoService;
	
	@GetMapping("/test")
	public ResponseEntity<String> testing() {
		return ResponseEntity.ok("Test ok");
	}
	
	
	@GetMapping()
	public ResponseEntity<List<VideoModel>> getVideos() {
		return ResponseEntity.ok(videoService.getVideos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<VideoModel>> getVideoById(@PathVariable int id) {
		return ResponseEntity.ok(videoService.getVideoByid(id));
	}
	
	@GetMapping("/byCategory/{category}")
	public ResponseEntity<List<VideoModel>> getVideoByCategory(@PathVariable String category) {
		return  ResponseEntity.ok(videoService.getVideoByCategory(category));
	}
	
	@PostMapping()
	public ResponseEntity<String> createVideo(@RequestBody VideoModel newVideo) {
		//TODO: process POST request
		
		return ResponseEntity.ok(videoService.createVideo(newVideo));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateVideo(@PathVariable int id ,@RequestBody VideoModel videoEdit) {
		
		return ResponseEntity.ok(videoService.updateVideo(id,videoEdit));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteVideo(@PathVariable int id ) {
		
		return ResponseEntity.ok(videoService.deleteVideo(id));
	}
}
