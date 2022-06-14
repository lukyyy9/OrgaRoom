/*
    Nom de classe : ListeReservationController

    Description : Cette classe a pour objectif de créer toutes les méthodes qui sont nécessaires à la page ListeReservation.fxml

    Version : 1.0

    Date: 13/06/2022
 */

package com.saejava.s201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListeReservationController extends ReservationSalleController {

    public Button closeButton;

    @FXML
    ListView<Reservation> listeReservations = new ListView<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        super.initialize(url, resourceBundle);
        listeReservations.getItems().clear();
        listeReservations.getItems().addAll(listeReservationSalle);
    }

    void initialize() {
        System.out.println("sdqsfqsfqsfqqf");
        listeReservations.getItems().clear();
        listeReservations.getItems().addAll(listeReservationSalle);
    }

    @FXML
    void retourButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        Stage stage = new Stage();
        stage.setTitle("Solution de réservation de salle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        Stage stage3 = (Stage) closeButton.getScene().getWindow();
        stage3.close();
    }
}
