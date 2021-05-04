package com.fullstackvox.fullstackvox.service;

import java.util.List;

import com.fullstackvox.fullstackvox.model.Post;

public interface FullstackvoxService {
	
	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);
	
	
}
