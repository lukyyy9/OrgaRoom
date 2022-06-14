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

public class CreationSalleController implements GlobalVals {

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
        String nom = nomSalle.getText();
        int capacite = Integer.parseInt(capaciteSalle.getText());
        int nbOrdinateur = Integer.parseInt(nbOrdinateurSalle.getText());
        int nbTableau = Integer.parseInt(nbTableauSalle.getText());
        boolean projecteur = projecteurSalle.isSelected();
        boolean climatisation = climatisationSalle.isSelected();

        /* fonctionne pas
        if (observableListeSalles.contains(nom)) {
            System.out.println("La salle existe déjà");
        } */

        if (nom == "") {
            erreurNom.setVisible(true);
            return;
        }
        if (nom != "" && erreurNom.isVisible()) {
            erreurNom.setVisible(false);
        }

        if (capacite <= 0 || capacite > 500) {
            erreurCapacite.setVisible(true);
            return;
        }

        if (capacite > 0 && capacite <= 500 && erreurCapacite.isVisible()) {
            erreurCapacite.setVisible(false);
        }

        if (nbOrdinateur < 0 || nbOrdinateur > 500) {
            erreurOrdinateur.setVisible(true);
            return;
        }

        if (nbOrdinateur >= 0 && nbOrdinateur <= 500 && erreurOrdinateur.isVisible()) {
            erreurOrdinateur.setVisible(false);
        }

        if (nbTableau < 0 || nbTableau > 10) {
            erreurTableau.setVisible(true);
        }

        if (nbTableau >= 0 && nbTableau <= 10 && erreurTableau.isVisible()) {
            erreurTableau.setVisible(false);
        }


        if (nom != "" && capacite != 0) {
            erreurNom.setVisible(false);
            erreurCapacite.setVisible(false);
            //listeSalles.add(new Salle(nom, capacite, nbOrdinateur, nbTableau, projecteur, climatisation, true));
            observableListeSalles.add(new Salle(nom, capacite, nbOrdinateur, nbTableau, projecteur, climatisation, true));
        } else {
            System.out.println("Le champ nom est vide");
        }
        //if (nom.equals("") || capacite.)
        //salles.add(new Salle(nom, capacite, nbOrdinateur, nbTableau, projecteur, climatisation, true));

        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage1.close();
    }

    @FXML
    public void annulerButton(ActionEvent e) {
        Stage stage2 = (Stage) closeButton.getScene().getWindow();
        stage2.close();
    }


}
