package com.bootcamp.backvideos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.backvideos.models.VideoModel;

public interface VideoRepository extends JpaRepository<VideoModel, Integer>{

	List<VideoModel> findByCategory(String category);
}
