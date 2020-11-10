package com.simplon.pharmacie;

import com.simplon.pharmacie.dao.PharmacieRepository;
import com.simplon.pharmacie.entities.Pharmacie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PharmacieApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PharmacieApplication.class, args);
    }

  /*  @Autowired
    private PharmacieRepository pharmacieRepos;*/

    @Override
    public void run(String... args) throws Exception {
       /* Pharmacie p=new Pharmacie();
        p.setEtat("FERMEE");
        p.setNom("Oriental");
        p.setQuartier("HLM3");
        p.setVille("Tambacounda");
        pharmacieRepos.save(p);*/
    }
}
