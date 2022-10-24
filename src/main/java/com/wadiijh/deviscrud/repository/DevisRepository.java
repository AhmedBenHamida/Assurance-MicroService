package com.wadiijh.deviscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wadiijh.deviscrud.entity.Devis;

@Repository
public interface DevisRepository extends JpaRepository<Devis, Long> {

}
