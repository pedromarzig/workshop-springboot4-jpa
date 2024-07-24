package com.pedromarzig.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromarzig.demo.entitties.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
