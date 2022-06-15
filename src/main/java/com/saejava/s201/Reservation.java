package com.saejava.s201;

import java.time.DayOfWeek;
import java.time.LocalDate;

//import log

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Reservation {


    private final static Logger LOGGER = getLogger("L1");

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

        //log
        LOGGER.info("Reservation salle effectue");
    }

    @Override
    public String toString() {
        return "La salle " + salle + " a ete reservee le " + jour + " de " + heureDepart + " a " + heureFin;
    }

}
