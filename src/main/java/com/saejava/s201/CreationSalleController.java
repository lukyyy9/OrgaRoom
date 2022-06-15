/*
    Nom de classe : CreationSalleController

    Description : Cette classe a pour objectif de créer toutes les méthodes qui sont nécessaires à la page CreationSalle.fxml

    Version : 1.0

    Date: 13/06/2022
 */

package com.saejava.s201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//import log

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;


public class CreationSalleController implements GlobalVals {


   // private final static Logger LOGGER = getLogger("L1");

    @FXML
    public Button closeButton;
    @FXML
    TextField nomSalle;
    @FXML
    TextField capaciteSalle;
    @FXML
    TextField nbOrdinateurSalle;
    @FXML
    TextField nbTableauSalle;
    @FXML
    CheckBox projecteurSalle;
    @FXML
    CheckBox climatisationSalle;
    @FXML
    Label erreurNom;
    @FXML
    Label erreurCapacite;
    @FXML
    Label erreurOrdinateur;
    @FXML
    Label erreurTableau;




    @FXML

    public void validerButton(ActionEvent e) {
        Logger LOGGER = getLogger("L1");
        String nom = nomSalle.getText();
        int capacite = Integer.parseInt(capaciteSalle.getText());
        int nbOrdinateur = Integer.parseInt(nbOrdinateurSalle.getText());
        int nbTableau = Integer.parseInt(nbTableauSalle.getText());
        boolean projecteur = projecteurSalle.isSelected();
        boolean climatisation = climatisationSalle.isSelected();

        if (nom == "") {
            LOGGER.warning("Erreur creation de salle");
            erreurNom.setVisible(true);
            return;
        }
        if (nom != "" && erreurNom.isVisible()) {
            erreurNom.setVisible(false);
        }

        if (capacite <= 0 || capacite > 500) {
            erreurCapacite.setVisible(true);
            LOGGER.warning("Erreur creation de salle");
            return;
        }

        if (capacite > 0 && capacite <= 500 && erreurCapacite.isVisible()) {
            erreurCapacite.setVisible(false);

        }

        if (nbOrdinateur < 0 || nbOrdinateur > 500) {
            erreurOrdinateur.setVisible(true);
            LOGGER.warning("Erreur creation de salle");
            return;
        }

        if (nbOrdinateur >= 0 && nbOrdinateur <= 500 && erreurOrdinateur.isVisible()) {
            erreurOrdinateur.setVisible(false);
        }

        if (nbTableau < 0 || nbTableau > 10) {
            erreurTableau.setVisible(true);

            //log
            LOGGER.warning("Erreur creation de salle");
        }

        if (nbTableau >= 0 && nbTableau <= 10 && erreurTableau.isVisible()) {
            erreurTableau.setVisible(false);

        }


        if (nom != "" && capacite != 0) {
            erreurNom.setVisible(false);
            erreurCapacite.setVisible(false);
            observableListeSalles.add(new Salle(nom, capacite, nbOrdinateur, nbTableau, projecteur, climatisation, true));
        } else {
            System.out.println("Le champ nom est vide");
        }

        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage1.close();
    }

    Logger LOGGER = getLogger("L1");

    @FXML
    public void annulerButton(ActionEvent e) {
        Stage stage2 = (Stage) closeButton.getScene().getWindow();
        stage2.close();

        //log
        LOGGER.info("Annulation creation de salle");
    }


}
