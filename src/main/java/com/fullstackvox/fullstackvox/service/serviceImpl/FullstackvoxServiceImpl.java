package com.fullstackvox.fullstackvox.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstackvox.fullstackvox.model.Post;
import com.fullstackvox.fullstackvox.repository.FullstackvoxRepository;
import com.fullstackvox.fullstackvox.service.FullstackvoxService;


@Service
public class FullstackvoxServiceImpl implements FullstackvoxService {
	
	@Autowired
	FullstackvoxRepository fullstackvoxRepository;
	
	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return fullstackvoxRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		// TODO Auto-generated method stub
		return fullstackvoxRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return fullstackvoxRepository.save(post);
	}
	
	
	
	

}
