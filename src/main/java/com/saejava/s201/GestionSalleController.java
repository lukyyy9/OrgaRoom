package com.saejava.s201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GestionSalleController implements Initializable {

    @FXML
    public Button closeButton;

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

    @FXML
    public void creationSalleButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("CreationSalle.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = new Stage();
        stage.setTitle("Solution de réservation de salle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
