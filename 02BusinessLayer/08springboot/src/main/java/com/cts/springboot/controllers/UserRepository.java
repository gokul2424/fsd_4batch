package com.cts.springboot.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findById(int id);
	public User findByName(String name);

}
