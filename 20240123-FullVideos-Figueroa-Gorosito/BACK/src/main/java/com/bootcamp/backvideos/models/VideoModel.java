package com.bootcamp.backvideos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="videos")
public class VideoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)
	private Integer id;
	
	private String title;
	private String description;
	private String url;
	private String category;
	private Integer views;
	private Integer likes;
	private Integer dislikes;
	private Double rating;
	
	public VideoModel() {
		
	}

	public VideoModel(Integer id, String title, String description, String url, String category, Integer views,
			Integer likes, Integer dislikes, Double rating) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.url = url;
		this.category = category;
		this.views = views;
		this.likes = likes;
		this.dislikes = dislikes;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getDislikes() {
		return dislikes;
	}

	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}
	
	
	
}
	
	
