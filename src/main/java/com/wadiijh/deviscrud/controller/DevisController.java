package com.wadiijh.deviscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wadiijh.deviscrud.entity.Devis;
import com.wadiijh.deviscrud.service.IDevis;




@RestController
@CrossOrigin

public class DevisController {
	@Autowired
	IDevis devisService;

	@PostMapping("/add")

	@ResponseBody

	public Devis addDevis(@RequestBody Devis d) {
		Devis devis = devisService.addDevis(d);
		return devis;
	}

	@PutMapping("/modify-devis")
	@ResponseBody
	public Devis modifyFacture(@RequestBody Devis d) {
		return devisService.updateDevis(d);
	}
	
	
		@DeleteMapping("/remove-devis/{devis-id}")
		@ResponseBody
		public void removeDevis (@PathVariable("devis-id") Long id) {
			
		devisService.deleteDevis(id);
		System.out.println("Deleted successfuly");
		}
		
		// http://localhost:8088/SpringMVC/servlet/retrieve-all-factures
				@GetMapping("/retrieve-all-devis")		
				@ResponseBody
				public List<Devis> getDevis(){
					List<Devis> listDevis = devisService.retrieveAllDevis();
					return listDevis;
				}
				
				
				@GetMapping("/retrieve-devis/{devis-id}")
				@ResponseBody
				public Devis retrieveDevis(@PathVariable("devis-id")Long id) {
					return devisService.retrieveDevis(id);
					}
}
