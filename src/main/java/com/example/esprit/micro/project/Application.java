package com.example.esprit.micro.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
@Component
@SpringBootApplication
@EnableEncryptableProperties
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
