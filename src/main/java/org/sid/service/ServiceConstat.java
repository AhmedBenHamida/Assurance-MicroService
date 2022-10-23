package org.sid.service;

import java.util.List;

import org.sid.entities.Constat;
import org.sid.repositories.ConstatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/assurance")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ServiceConstat {
	
	@Autowired
	ConstatRepository constatRepo;
	
	@GetMapping("/constat")
	@ResponseBody
	public List<Constat> getConstats(){
		System.out.println("test");
		return constatRepo.findAll();
	}
	
	@PostMapping("/addConstat")
	@ResponseBody
	public Constat addReclamation(@RequestBody Constat c) {
		return constatRepo.save(c);
	}

}
