package com.pedromarzig.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromarzig.demo.entitties.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
