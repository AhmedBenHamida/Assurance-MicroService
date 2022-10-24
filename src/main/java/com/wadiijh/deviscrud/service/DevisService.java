package com.wadiijh.deviscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wadiijh.deviscrud.entity.Devis;
import com.wadiijh.deviscrud.repository.DevisRepository;








@Service
public class DevisService implements IDevis {
	@Autowired
	private DevisRepository devisRepository;
	@Override
	public Devis addDevis(Devis d) {
		// TODO Auto-generated method stub
		devisRepository.save(d);
		return d;
	}

	@Override
	public Devis updateDevis(Devis s) {
		// TODO Auto-generated method stub
		return devisRepository.save(s);	}
	
	
	@Override
	public void deleteDevis(Long id) {
		// TODO Auto-generated method stub
		devisRepository.deleteById(id);
	}

	@Override
	public List<Devis> retrieveAllDevis() {
	
		List<Devis> devis= (List<Devis>) devisRepository.findAll();
		return devis;
	}
	
	@Override
	public Devis retrieveDevis(Long id) {
		// TODO Auto-generated method stub
		Devis devis= devisRepository.findById(id).orElse(null);
		return devis;
	}

}
