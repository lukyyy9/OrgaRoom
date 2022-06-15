package com.saejava.s201;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ReservationSalleController extends MainController{

    @FXML
    public Button closeButton;

    @FXML
    public TextField reserverNomSalle = new TextField();

    public String[] heures = {"8h","9h","10h","11h","12h","13h","14h","15h","16h"};

    public ComboBox<String> heureDebut = new ComboBox<>();

    public ComboBox<String> heureFin = new ComboBox<>();

    public ComboBox<String> listeJourSemaineCombo = new ComboBox<>();

    List<String> listeJourSemaine = new ArrayList<>(Arrays.asList("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi"));
    public static List<Reservation> listeReservationSalle = new ArrayList<>();

    ObservableList<String> observableListeJourSemaine = FXCollections.observableList(listeJourSemaine);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        heureDebut.getItems().clear();
        heureDebut.getItems().addAll(heures);
        heureFin.getItems().clear();
        heureFin.getItems().addAll(heures);
        listeJourSemaineCombo.setItems(observableListeJourSemaine);
        reserverNomSalle.setText(salleSelectionne.getNom());
        super.initialize(url, resourceBundle);
        //Salle salleSelectionne = (Salle)listeSalleCombo.getSelectionModel().getSelectedItem();
        //salleSelectionne = listeSalleCombo.getValue()
    }

    @FXML
    public void validerButton(ActionEvent e) throws IOException {
        salleSelectionne = (Salle)listeSalleCombo.getSelectionModel().getSelectedItem();
        Reservation nouvelleReservation = new Reservation(salleSelectionne, heureDebut.getValue(),  heureFin.getValue(), listeJourSemaineCombo.getValue());
        listeReservationSalle.add(nouvelleReservation);
        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage1.close();
    }

    @FXML
    public void annulerButton(ActionEvent e) {
        Stage stage2 = (Stage) closeButton.getScene().getWindow();
        stage2.close();
    }

}