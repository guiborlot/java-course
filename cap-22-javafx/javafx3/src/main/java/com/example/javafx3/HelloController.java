package com.example.javafx3;

import com.example.javafx3.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction(){
        Alerts.showAlert("Alert title", "Alert header", "Hello", Alert.AlertType.INFORMATION);
    }
}