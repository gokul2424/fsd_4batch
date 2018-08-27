package com.cts.springboot.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	
	static List<User> users = new ArrayList<>();
	static {
		users.add(new User(23, "Rosh", 29));
		users.add(new User(9, "Julliet", 27));
		users.add(new User(3, "Mia", 34));
	}
	
	public List<User> findAllUsers(){
		return users;
	}
	
	public User findUserById(int id){
		List<User> filteredUsers = users.stream()
		.filter(u -> u.getId()==id)
		.collect(Collectors.toList());
		
		if(filteredUsers.size()>1) return filteredUsers.get(0);
		return null;
	}

}
