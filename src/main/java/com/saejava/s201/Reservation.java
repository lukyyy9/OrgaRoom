package com.saejava.s201;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservation {

    String heureDepart;
    String heureFin;
    String jour;
    LocalDate date;
    Salle salle;

    // Création du constructeur de la classe Reservation
    public Reservation(Salle salle, String heureDepart, String heureFin, String jour) {

        this.salle = salle;
        this.heureDepart = heureDepart;
        this.heureFin = heureFin;
        this.jour = jour;

    }

    @Override
    public String toString() {
        return "La salle " + salle + " a ete reservee le " + jour + " de " + heureDepart + " a " + heureFin;
    }

}
