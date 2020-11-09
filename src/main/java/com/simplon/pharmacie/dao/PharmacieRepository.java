package com.simplon.pharmacie.dao;

import com.simplon.pharmacie.entities.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "pharmacie", path = "pharmacie")
public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {
    List<Pharmacie> findAll();
    List<Pharmacie> findAllByEtat(@Param("etat") String etat);
    Pharmacie findByNom(@Param("nom") String nom);
}
