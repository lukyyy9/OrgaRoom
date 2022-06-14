package com.saejava.s201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ModificationSalleController extends MainController{

    @FXML
    public Button closeButton;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        super.initialize(url, resourceBundle);
        //Salle salleSelectionne = (Salle)listeSalleCombo.getSelectionModel().getSelectedItem();
        //salleSelectionne = listeSalleCombo.getValue()
        modifNomSalle.setText(salleSelectionne.getNom());
        modifCapaciteSalle.setText(String.valueOf(salleSelectionne.getCapacite()));
        modifNbOrdinateurSalle.setText(String.valueOf(salleSelectionne.getNbOrdinateur()));
        modifNbTableauSalle.setText(String.valueOf(salleSelectionne.getNbTableau()));
        modifProjecteurSalle.setSelected(salleSelectionne.projecteur);
        modifClimatisationSalle.setSelected(salleSelectionne.climatisation);
    }

    /*public void initialize() {
        System.out.println("qjdpfsjofdiqsdhqiudgsquydqoidqh");
        modifNomSalle.setText(salleSelectionne.getNom());
        modifCapaciteSalle.setText(String.valueOf(salleSelectionne.getCapacite()));
        modifNbOrdinateurSalle.setText(String.valueOf(salleSelectionne.getNbOrdinateur()));
        modifNbTableauSalle.setText(String.valueOf(salleSelectionne.getNbTableau()));
        modifProjecteurSalle.setSelected(salleSelectionne.projecteur);
        modifClimatisationSalle.setSelected(salleSelectionne.climatisation);
    }*/

    @FXML
    public void validerButton(ActionEvent e) throws IOException {
        salleSelectionne = (Salle)listeSalleCombo.getSelectionModel().getSelectedItem();
        salleSelectionne.setNom(modifNomSalle.getText());
        salleSelectionne.setCapacite(Integer.parseInt(modifCapaciteSalle.getText()));
        salleSelectionne.setNbOrdinateur(Integer.parseInt(modifNbOrdinateurSalle.getText()));
        salleSelectionne.setNbTableau(Integer.parseInt(modifNbTableauSalle.getText()));
        salleSelectionne.setProjecteur(salleSelectionne.projecteur);
        salleSelectionne.setClimatisation(salleSelectionne.climatisation);
        observableListeSalles.add(salleSelectionne);
        suppressionSalleButton(e);



        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage1.close();
    }

    @FXML
    public void annulerButton(ActionEvent e) {
        Stage stage2 = (Stage) closeButton.getScene().getWindow();
        stage2.close();
    }

}
