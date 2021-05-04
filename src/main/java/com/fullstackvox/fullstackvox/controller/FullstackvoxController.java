package com.fullstackvox.fullstackvox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fullstackvox.fullstackvox.model.Post;
import com.fullstackvox.fullstackvox.service.FullstackvoxService;

@Controller
public class FullstackvoxController {
	
	@Autowired
	FullstackvoxService fullstackvoxService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = fullstackvoxService.findAll();
		
		mv.addObject("posts", posts);
		return mv;
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
	public ModelAndView getPostDetails() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = fullstackvoxService.findAll();
		
		mv.addObject("posts", posts);
		return mv;
	}
	


	

}
