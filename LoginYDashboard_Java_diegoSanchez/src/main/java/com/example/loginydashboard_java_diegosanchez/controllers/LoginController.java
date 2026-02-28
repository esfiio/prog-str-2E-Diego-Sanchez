package com.example.loginydashboard_java_diegosanchez.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtCorreo;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblError;


    public void onLogin(ActionEvent event){
        String usuario;
        if(txtUsuario.getText()==null){
            usuario="";
        }else {
            usuario=txtUsuario.getText().trim();
        }

        String correo;
        if(txtCorreo.getText()==null){
            correo="";
        } else {
            correo=txtCorreo.getText().trim();
        }

        String contraseña;
        if (txtPassword.getText()==null){
            contraseña="";
        }else {
            contraseña=txtPassword.getText();
        }

        String mensajeError="";

        if(usuario.length() < 4){
            mensajeError=mensajeError+"El usuario debe tener minimo 4 caracteres";
        }

        if(!correo.contains("@") || !correo.contains(".")){
            mensajeError=mensajeError+"El correo debe contener @ y .";
        }

        if (contraseña.length() < 6){
            mensajeError=mensajeError+"La contraseña debe tener minimo 6 caracteres";
        }

        if(mensajeError.equals("")){
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/loginydashboard_java_diegosanchez/dashboard-view.fxml"));                Scene scene = new Scene(loader.load(), 500, 300);

                DashBoardController dashboard = loader.getController();
                dashboard.recibirUsuario(usuario);

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (Exception e){
                e.printStackTrace();
            }
        }else {
            lblError.setText(mensajeError);
        }
    }




}
