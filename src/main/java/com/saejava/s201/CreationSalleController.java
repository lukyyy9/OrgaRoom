package com.saejava.s201;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import com.saejava.s201.MainController.*;
import org.controlsfx.control.action.Action;

import java.net.URL;
import java.util.ResourceBundle;

public class CreationSalleController {

    @FXML
    public Button closeButton;
    TextField nomSalle;
    TextField capaciteSalle;
    TextField nbOrdinateurSalle;
    TextField nbTableauSalle;
    CheckBox projecteurSalle;
    CheckBox climatisationSalle;
    public ComboBox<Salle> listeSalleCombo;

    @FXML
    public void validerButton(ActionEvent e) {
        String nom = nomSalle.getText();
        int capacite = Integer.parseInt(capaciteSalle.getText());
        int nbOrdinateur = Integer.parseInt(nbOrdinateurSalle.getText());
        int nbTableau = Integer.parseInt(nbTableauSalle.getText());
        boolean projecteur = projecteurSalle.isSelected();
        boolean climatisation = climatisationSalle.isSelected();

        //salles.add(new Salle(nom, capacite, nbOrdinateur, nbTableau, projecteur, climatisation, true));


        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage1.close();
    }

    @FXML
    public void annulerButton(ActionEvent e) {
        Stage stage2 = (Stage) closeButton.getScene().getWindow();
        stage2.close();
    }

    /*@FXML
    public void informationAlerte(ActionEvent e) {
        Alert alerte = new Alert(Alert.AlertType.ERROR);
        alerte.setTitle("Erreur Nom");
    }*/

}
