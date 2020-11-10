package com.simplon.pharmacie.controller;

import com.simplon.pharmacie.dao.PharmacieRepository;
import com.simplon.pharmacie.entities.Pharmacie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PharmacieController {

    @Autowired
    PharmacieRepository pharmacieRepos;

    @GetMapping("/ville/{ville}")
    public List<Pharmacie> findByVille(@PathVariable String ville){
        return pharmacieRepos.findByVille(ville);
    }

    @GetMapping("/etat/{etat}")
    public List<Pharmacie> findByEtat(@PathVariable String etat){
        return pharmacieRepos.findAllByEtat(etat);
    }

    @GetMapping("/list")
    public List<Pharmacie> findAll(){
        return pharmacieRepos.findAll();
    }

    @GetMapping("/pharm/{id}")
    public Pharmacie findById(@PathVariable int id){return pharmacieRepos.findById(id);}

    @GetMapping("/villetat/{ville}/{etat}")
    public List<Pharmacie> findByVilleAndEtat(@PathVariable String ville, @PathVariable String etat){
        return pharmacieRepos.findByVilleAndEtat(ville,etat);
    }

    @GetMapping("/nom/{nom}")
    public Pharmacie findByNom(@PathVariable String nom){return pharmacieRepos.findByNom(nom);}
}
