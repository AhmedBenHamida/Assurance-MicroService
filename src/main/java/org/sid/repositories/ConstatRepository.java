package org.sid.repositories;

import org.sid.entities.Constat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ConstatRepository extends JpaRepository< Constat,Long>,JpaSpecificationExecutor<Constat> {

}
