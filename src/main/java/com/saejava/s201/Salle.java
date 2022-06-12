package com.saejava.s201;

public class Salle {

    //Définition des attributs de la classe Salle
    private String nom;
    private int capacite;
    private int nbOrdinateur;
    private int nbTableau;
    private boolean projecteur;
    private boolean climatisation;
    private boolean disponible;

    //Création du constructeur de la classe Salle
    public Salle(String nom, int capacite, int nbOrdinateur, int nbTableau, boolean projecteur, boolean climatisation, boolean disponible) {
        this.nom = nom;
        this.capacite = capacite;
        this.nbOrdinateur = nbOrdinateur;
        this.nbTableau = nbTableau;
        this.projecteur = projecteur;
        this.climatisation = climatisation;
        this.disponible = disponible;
    }

    //Création des getters et setters des attributs de la classe Salle
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNbOrdinateur() {
        return nbOrdinateur;
    }

    public void setNbOrdinateur(int nbOrdinateur) {
        this.nbOrdinateur = nbOrdinateur;
    }

    public int getNbTableau() {
        return nbTableau;
    }

    public void setNbTableau(int nbTableau) {
        this.nbTableau = nbTableau;
    }

    public boolean isProjecteur() {
        return projecteur;
    }

    public void setProjecteur(boolean projecteur) {
        this.projecteur = projecteur;
    }

    public boolean isClimatisation() {
        return climatisation;
    }

    public void setClimatisation(boolean climatisation) {
        this.climatisation = climatisation;
    }

    @Override
    public String toString() {
        return this.nom;
    }
}
