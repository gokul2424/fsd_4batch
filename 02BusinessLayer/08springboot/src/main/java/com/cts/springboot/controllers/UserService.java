package com.cts.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
	
	
	@Autowired
	UserRepository userRepository;
//	static List<User> users = new ArrayList<>();
//	static {
//		users.add(new User(23, "Rosh", 29));
//		users.add(new User(9, "Julliet", 27));
//		users.add(new User(3, "Mia", 34));
//	}
	
	public List<User> findAllUsers(){
		 List<User> users = new ArrayList<>();
		 return userRepository.findAll();
	}
	
	public User findUserById(int id){
//		User user = userRepository.findAllById(id)
//		System.out.println(user);
		User user = userRepository.findById(id);
		return user;
	}
	
	@Transactional
	public void saveUser(User user){
		userRepository.save(user);
	}

}
