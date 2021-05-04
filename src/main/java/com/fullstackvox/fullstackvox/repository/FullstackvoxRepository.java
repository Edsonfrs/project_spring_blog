package com.fullstackvox.fullstackvox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackvox.fullstackvox.model.Post;

public interface FullstackvoxRepository extends JpaRepository<Post, Long>{

}
