package com.example.esprit.micro.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IserviceUser us;

	
	
	// http://localhost:8089/SpringMVC/user/retrieve-all-users
		@GetMapping("/retrieve-all-users")
		@ResponseBody
		@CrossOrigin
		public List<User> retrieveAllUsers() {
			List<User> list = us.retrieveAllUsers();
			return list;
		}
		
		// http://localhost:8089/SpringMVC/user/add-user
		@PostMapping("/add-user")
		@ResponseBody
		public User addUser(@RequestBody User user) {
		
			return us.addUser(user);
		}
		
		
		// http://localhost:8089/SpringMVC/user/retrieve-user/5
		@GetMapping("/retrieve-user/{user-id}")
		@ResponseBody
		@CrossOrigin
		public User retrieveUser(@PathVariable("user-id") Long userId) {
			return us.retrieveUser(userId);
		}
		
		
		// http://localhost:8089/SpringMVC/user/remove-user/{user-id}
		@DeleteMapping("/remove-user/{user-id}")
		@ResponseBody
		public void removeUser(@PathVariable("user-id") Long userId) {
			us.deleteUser(userId);
		}
}
