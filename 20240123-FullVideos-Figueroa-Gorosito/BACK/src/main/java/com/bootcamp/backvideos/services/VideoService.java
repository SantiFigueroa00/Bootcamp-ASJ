package com.bootcamp.backvideos.services;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.backvideos.models.VideoModel;
import com.bootcamp.backvideos.repositories.VideoRepository;

@Service
public class VideoService {
	@Autowired
	VideoRepository videoRepository;
		
	public List<VideoModel> getVideos() {
		return videoRepository.findAll();
	}

	public Optional<VideoModel> getVideoByid(int id) {
		
		Optional<VideoModel> v = videoRepository.findById(id);
		
		Integer likes = v.get().getLikes();
		Integer dislikes =  v.get().getDislikes();
		Double promedio = (double) likes / (dislikes + likes) * 10;
		double roundedPromedio = Math.round(promedio * 10.0) / 10.0;
		

        v.get().setRating(roundedPromedio);
        
		return v;
	}

	public String createVideo(VideoModel newVideo) {
		videoRepository.save(newVideo);
		return "Created Success";
	}

	public String deleteVideo(int id) {
		videoRepository.deleteById(id);
		return "Delete Success";
	}

	public String updateVideo(int id, VideoModel videoEdit) {
		VideoModel v = videoRepository.findById(id).get();
		if (v!=null) {
			v.setViews(videoEdit.getViews());
			v.setLikes(videoEdit.getLikes());
			v.setDislikes(videoEdit.getDislikes());
			v.setRating(videoEdit.getRating());
			videoRepository.save(v);
			return "Update Success";
		}
		return "error";
	}

	public List<VideoModel> getVideoByCategory(String category) {
		return videoRepository.findByCategory(category);
	}
}
