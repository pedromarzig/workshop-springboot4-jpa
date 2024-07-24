package com.pedromarzig.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromarzig.demo.entitties.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
