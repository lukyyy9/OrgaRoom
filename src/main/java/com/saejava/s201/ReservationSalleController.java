package com.saejava.s201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ReservationSalleController {

    @FXML
    public Button closeButton;

    @FXML
    public void validerButton(ActionEvent e) {
        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage1.close();
    }

    @FXML
    public void annulerButton(ActionEvent e) {
        Stage stage2 = (Stage) closeButton.getScene().getWindow();
        stage2.close();
    }
}
