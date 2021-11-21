package com.example.springHibernate.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
	private Integer id;
	private LocalDateTime postDate;
	private User user;
	private String details;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getPostDate() {
		return postDate;
	}
	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Post(Integer id, LocalDateTime postDate, User user, String details) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.user = user;
		this.details = details;
	}
	
	
	
	
	
	
}

