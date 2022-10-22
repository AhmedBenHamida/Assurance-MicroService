package com.example.esprit.micro.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser implements IserviceUser {
	@Autowired
	UserRepository rp;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	@Override
	public List<User> retrieveAllUsers() {
		List<User> list = (List<User>) rp.findAll();
		System.out.println("test linas");
		return list;		
	}

	@Override
	public User addUser(User c) {
		
		passwordEncoder =new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(c.getPassword());
		c.setPassword(encodedPassword);
		
		return rp.save(c);

	}

	@Override
	public void deleteUser(Long id) {
          rp.deleteById(id);		
	}

	@Override
	public User updateUser(User c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User retrieveUser(Long id) {
		return rp.findById(id).orElse(null) ;
	}

}
