package com.example.esprit.micro.project;

import java.util.List;

import org.springframework.stereotype.Service;

public interface IserviceUser {
	
	
	List<User> retrieveAllUsers();

	User addUser(User c);

	void deleteUser(Long id);

	User updateUser(User c);

	User retrieveUser(Long id);
}
