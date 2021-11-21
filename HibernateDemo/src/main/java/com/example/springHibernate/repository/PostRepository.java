package com.example.springHibernate.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springHibernate.model.Post;

public interface PostRepository extends CrudRepository<Post , Integer> {
	

}
