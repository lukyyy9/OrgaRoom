package com.saejava.s201;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    public Button closeButton;
    public ComboBox<Salle> listeSalleCombo;



    //Faire une méthode ouverture/fermeture fenetre pour éviter la répétition

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        final ObservableList<Salle> salles = FXCollections.observableArrayList(
                new Salle("S503", 17, 17, 2, true, true, true),
                new Salle("S206", 30, 1, 1, false, false, true),
                new Salle("S071", 90, 1, 1, true, false, true)
        );

        listeSalleCombo.setItems(salles);
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

    //Bouton permettant l'ouverture de la fenêtre GestionSalle et la fermeture de la fenêtre actuelle
    @FXML
    public void gestionSalleButton(ActionEvent e) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("GestionSalle.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("Solution de réservation de salle");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            Stage stage2 = (Stage) closeButton.getScene().getWindow();
            stage2.close();
    }

    //Bouton permettant l'ouverture de la fenêtre ReservationSalle
    @FXML
    public void reservationSalleButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("ReservationSalle.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = new Stage();
        stage.setTitle("Solution de réservation de salle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}