package com.simplon.pharmacie.entities;

import javax.persistence.*;

@Entity
public class Pharmacie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nom;

    @Column
    private String quartier;

    @Column
    private String ville;

    @Column
    private String etat;

    public Pharmacie() {
    }

    public Pharmacie(String nom, String quartier, String ville, String etat) {
        this.nom = nom;
        this.quartier = quartier;
        this.ville = ville;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
