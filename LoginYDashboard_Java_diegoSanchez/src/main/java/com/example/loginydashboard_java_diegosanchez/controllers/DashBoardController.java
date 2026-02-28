package com.example.loginydashboard_java_diegosanchez.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashBoardController {

    @FXML
    private Label lblBienvenida;
    public void recibirUsuario(String usuario){
        lblBienvenida.setText("Bienvenido, "+usuario);
    }
}
