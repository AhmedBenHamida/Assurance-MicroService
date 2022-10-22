package com.example.esprit.micro.project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
	private UserRepository repo;
	
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreatUser() {
		User user = new User();
		user.setEmail("azeazegghamida290@gmail.com");
		user.setPassword("ahmed123");
		user.setFullName("ahmed ben hmida");
		user.setAddress("first add dar chaben fehri");
		user.setCin(51511515);
		
		User userSaved = repo.save(user);
		
		User existUser = entityManager.find(User.class, userSaved.getId());
		
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
		
	}
	/*
	@Test
	public void findUserByEmail() {
		String email ="azeeebamida290@gmail.com";
		User user =repo.findByEmail(email);
		assertThat(user).isNotNull(); 
	}*/
}
