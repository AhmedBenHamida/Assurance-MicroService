package com.knani.gestiondossier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knani.gestiondossier.entity.Dossier;
import com.knani.gestiondossier.repository.DossierRepository;

@Service
public class DossierService implements IDossier {
	@Autowired
	private DossierRepository dossierRepository;
	@Override
	public Dossier addDossier(Dossier d) {
		// TODO Auto-generated method stub
		dossierRepository.save(d);
		return d;
	}

	@Override
	public Dossier updateDossier(Dossier s) {
		// TODO Auto-generated method stub
		return dossierRepository.save(s);	}
	
	
	@Override
	public void deleteDossier(Long id) {
		// TODO Auto-generated method stub
		dossierRepository.deleteById(id);
	}

	@Override
	public List<Dossier> retrieveAllDossier() {
	
		List<Dossier> dossier= (List<Dossier>) dossierRepository.findAll();
		return dossier;
	}
	@Override
	public Dossier retrieveDossier(Long id) {
		// TODO Auto-generated method stub
		Dossier devis= dossierRepository.findById(id).orElse(null);
		return devis;
	}

}