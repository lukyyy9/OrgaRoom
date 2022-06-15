/*
    Nom de classe : Salle

    Description : Cette classe a pour objectif de créer toutes les méthodes en relation avec une salle.

    Version : 1.0

    Date: 13/06/2022
 */

package com.saejava.s201;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.List;

class Salle {

    //Définition des attributs de la classe Salle
    public String nom;
    public int capacite;
    public int nbOrdinateur;
    public int nbTableau;
    public boolean projecteur;
    public boolean climatisation;
    public boolean disponible;

    public List list;

    public final ObservableList<Salle> liste = FXCollections.observableArrayList();

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

    public void creationSalle(String nom, int capacite, int nbOrdinateur, int nbTableau, boolean projecteur, boolean climatisation, boolean disponible) {
        new Salle(nom, capacite, nbOrdinateur, nbTableau, projecteur, climatisation, disponible);


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


