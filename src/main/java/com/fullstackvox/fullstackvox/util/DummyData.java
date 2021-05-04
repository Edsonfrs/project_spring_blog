package com.fullstackvox.fullstackvox.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fullstackvox.fullstackvox.model.Post;
import com.fullstackvox.fullstackvox.repository.FullstackvoxRepository;

@Component
public class DummyData {
	
	@Autowired
	FullstackvoxRepository fullstackvoxRepository;
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Edson");
		post1.setData(LocalDate.now());
		post1.setTitulo("Linux");
		post1.setTag("SO");
		post1.setCategoria("Open Source");
		post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt mauris sit amet nisi varius laoreet. Pellentesque dapibus malesuada ipsum eu iaculis. Sed dapibus luctus auctor. Etiam diam ligula, vehicula pulvinar dui imperdiet, viverra tristique sapien. Etiam consequat eget nibh a vehicula. Aenean commodo risus vitae tincidunt imperdiet. Suspendisse sit amet arcu condimentum, rhoncus quam ac, sollicitudin nisi. Aliquam et tempor ex. Donec iaculis ultrices mauris non sagittis. Maecenas bibendum lorem eget ipsum hendrerit, vel semper nisl feugiat. Phasellus lobortis nulla et turpis ornare ultricies. Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		
		Post post2 = new Post();
		post2.setAutor("Edson");
		post2.setData(LocalDate.now());
		post2.setTitulo("Lambda");
		post2.setTag("Java");
		post2.setCategoria("Java");
		post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt mauris sit amet nisi varius laoreet. Pellentesque dapibus malesuada ipsum eu iaculis. Sed dapibus luctus auctor. Etiam diam ligula, vehicula pulvinar dui imperdiet, viverra tristique sapien. Etiam consequat eget nibh a vehicula. Aenean commodo risus vitae tincidunt imperdiet. Suspendisse sit amet arcu condimentum, rhoncus quam ac, sollicitudin nisi. Aliquam et tempor ex. Donec iaculis ultrices mauris non sagittis. Maecenas bibendum lorem eget ipsum hendrerit, vel semper nisl feugiat. Phasellus lobortis nulla et turpis ornare ultricies. Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		
		postList.add(post1);
		postList.add(post2);
		
		for (Post post: postList) {
			Post postSaved = fullstackvoxRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}
	

}
