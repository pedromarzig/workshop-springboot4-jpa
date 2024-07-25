package com.pedromarzig.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromarzig.demo.entitties.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
