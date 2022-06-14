/*
    Nom de classe : MainApplication

    Description : Cette classe a pour objectif de lancer l'application.

    Version : 1.0

    Date: 13/06/2022
 */

package com.saejava.s201;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import com.saejava.s201.Salle;

public class MainApplication extends Application implements GlobalVals {

    //Ouverture et configuration de la fenêtre principale au lancement de l'application
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        primaryStage.setTitle("Solution de réservation de salles");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
