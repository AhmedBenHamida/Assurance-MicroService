package com.wadiijh.deviscrud.service;



import java.util.List;

import com.wadiijh.deviscrud.entity.Devis;







public interface IDevis {

	

	Devis addDevis(Devis d);
	Devis updateDevis(Devis d);
	void deleteDevis(Long id);
	List<Devis> retrieveAllDevis();
	Devis retrieveDevis(Long id);


	


}


