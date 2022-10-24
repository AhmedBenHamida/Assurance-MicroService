package com.knani.gestiondossier.repository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.knani.gestiondossier.entity.Dossier;
import com.knani.gestiondossier.repository.DossierRepository;
import com.knani.gestiondossier.service.IDossier;

@RestController
@CrossOrigin
public class DossierController {
	@Autowired
	IDossier dossierService;

	@PostMapping("/add")

	public Dossier addDossier(@RequestBody Dossier d) {
		Dossier dossier = dossierService.addDossier(d);
		return dossier;
	}

	@PutMapping("/modify-dossier")
	@ResponseBody
	public Dossier modifyDossier(@RequestBody Dossier d) {
		return dossierService.updateDossier(d);
	}

	@DeleteMapping("/remove-dossier/{dossier-id}")
	@ResponseBody
	public void removeDossier(@PathVariable("dossier-id") Long id) {

		dossierService.deleteDossier(id);
		System.out.println("Deleted successfuly");
	}

	@GetMapping("/retrieve-all-dossier")
	@ResponseBody
	public List<Dossier> getDevis() {
		List<Dossier> listDossier = dossierService.retrieveAllDossier();
		return listDossier;
	}
	
	@GetMapping("/retrieve-dossier/{dossier-id}")
	@ResponseBody
	public Dossier retrieveDossier(@PathVariable("dossier-id")Long id) {
		return dossierService.retrieveDossier(id);
		}

}