package com.simplon.pharmacie.dao;

import com.simplon.pharmacie.entities.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@CrossOrigin("*")
/*@RepositoryRestResource(collectionResourceRel = "pharmacie", path = "pharmacie")*/
@RepositoryRestResource
public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {

    List<Pharmacie> findAll();

    Pharmacie findById(@Param("id") int id);

    List<Pharmacie> findAllByEtat(@Param("etat") String etat);

    Pharmacie findByNom(@Param("nom") String nom);

    List<Pharmacie> findByVilleAndEtat(@Param("ville") String ville, @Param("etat") String etat);

    List<Pharmacie> findByVille(@Param("ville") String ville);

}
