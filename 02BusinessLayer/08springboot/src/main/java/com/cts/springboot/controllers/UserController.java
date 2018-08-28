package com.cts.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping(path="/users/{id}")
	public User getUser(@PathVariable("id") int id) throws UserNotFoundException{
//		User user = new User(id, "Ravi", 34);
		User user = service.findUserById(id);
		if(user==null) throw new UserNotFoundException("id-" + id + " not available");
		return user;
		
	}
	@GetMapping(path="/users")
	public List<User> getAllUsers(){
		return service.findAllUsers();
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<Void> saveUser(@RequestBody User user){
		service.saveUser(user);
		ResponseEntity<Void> rs = new ResponseEntity<>(HttpStatus.CREATED);
		return rs;
	}

}
