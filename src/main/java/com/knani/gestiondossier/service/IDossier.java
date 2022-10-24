package com.knani.gestiondossier.service;

import java.util.List;

import com.knani.gestiondossier.entity.Dossier;

public interface IDossier {
	Dossier addDossier(Dossier d);
	Dossier updateDossier(Dossier d);
	void deleteDossier(Long id);
	List<Dossier> retrieveAllDossier();
	Dossier retrieveDossier(Long id);


}