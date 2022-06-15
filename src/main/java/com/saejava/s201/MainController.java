/*
    Nom de classe : MainController

    Description : Cette classe a pour objectif de créer toutes les méthodes qui sont nécessaires à la page Main.fxml

    Version : 1.0

    Date: 13/06/2022
 */
//package org.uca.logger;
package com.saejava.s201;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

//import log

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

interface GlobalVals{

    Salle salle1 = new Salle("S503", 17, 17, 2, true, true, true);
    Salle salle2 = new Salle("S206", 30, 1, 1, false, false, true);
    Salle salle3 = new Salle("S071", 90, 1, 1, true, false, true);
    List<Salle> listeSalles = new ArrayList<>(Arrays.asList(salle1, salle2, salle3));
    ObservableList<Salle> observableListeSalles = FXCollections.observableList(listeSalles);

}



public class MainController implements Initializable, GlobalVals {


    private final static Logger LOGGER = getLogger("L1");

    @FXML
    public Button closeButton;

    public ComboBox<Salle> listeSalleCombo = new ComboBox<>();

    //Attribut de la page de modification de salle

    @FXML
    public Button validerButton;

    @FXML
    public TextField modifNomSalle = new TextField();

    @FXML
    public TextField modifCapaciteSalle = new TextField();

    @FXML
    public TextField modifNbOrdinateurSalle = new TextField();

    @FXML
    public TextField modifNbTableauSalle = new TextField();

    @FXML
    public CheckBox modifProjecteurSalle = new CheckBox();

    @FXML
    public CheckBox modifClimatisationSalle = new CheckBox();

    public static Salle salleSelectionne = new Salle("defaut", 1, 1, 1, false, false, true);

    //Faire une méthode ouverture/fermeture fenetre pour éviter la répétition

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listeSalleCombo.setItems(observableListeSalles);
        listeSalleCombo.getSelectionModel().selectFirst();

    }

    public void updateComboBox(ActionEvent e) {
        salleSelectionne = listeSalleCombo.getValue();

    }

    @FXML
    public void modificationSalleButton() throws IOException {
        salleSelectionne = listeSalleCombo.getValue();
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("ModificationSalle.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = new Stage();
        stage.setTitle("Solution de réservation de salle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //log
        LOGGER.info("Ouverture modification de salle");
    }

    @FXML
    public void suppressionSalleButton() { //ActionEvent e
        observableListeSalles.remove(listeSalleCombo.getValue());
    }

    @FXML
    public void creationSalleButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("CreationSalle.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = new Stage();
        stage.setTitle("Solution de réservation de salle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //log
        LOGGER.info("Ouverure fenetre creation salle");
    }

    //Bouton permettant l'ouverture de la fenêtre ListeReservation et la fermeture de la fenêtre actuelle
    @FXML
    public void listeReservationButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("ListeReservation.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        Stage stage = new Stage();
        stage.setTitle("Solution de réservation de salle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage1.close();

    }

    //Bouton permettant l'ouverture de la fenêtre ReservationSalle
    @FXML
    public void reservationSalleButton(ActionEvent e) throws IOException {
        salleSelectionne = listeSalleCombo.getValue();
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("ReservationSalle.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = new Stage();
        stage.setTitle("Solution de réservation de salle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void annulerButton(ActionEvent e) {
        Stage stage2 = (Stage) closeButton.getScene().getWindow();
        stage2.close();
    }

}