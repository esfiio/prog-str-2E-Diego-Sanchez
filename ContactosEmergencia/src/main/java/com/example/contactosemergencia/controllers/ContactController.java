package com.example.contactosemergencia.controllers;

import com.example.contactosemergencia.model.Contacto;
import com.example.contactosemergencia.services.ContactService;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ContactController {

    private String[] arrParentescos = {"Padre","Madre","Hermano","Hermana","Abuelo","Abuela","Tio","Tia"};

    @FXML
    private ComboBox<String> cbParentesco;
    private ObservableList<String> listObservableParent= FXCollections.observableArrayList();

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTel;

    @FXML
    private ListView<Contacto> listViewContacts;

    @FXML
    private ObservableList<Contacto> listObservableContacts = FXCollections.observableArrayList();
    private List<Contacto> listContacts= new ArrayList<>();

    private ContactService service = new ContactService();

    @FXML
    public void initialize(){ //este metodo es el primero que se ejecuta al cargar el controller
        listObservableParent.setAll(arrParentescos);
        cbParentesco.setItems(listObservableParent);
    }

    @FXML
    public void onAddContact(){
        String name= txtName.getText().trim();
        String tel= txtTel.getText();
        String parent= cbParentesco.getValue();
        Contacto contact = new Contacto(name,tel,parent);
        service.addContact(contact);
        listObservableContacts.setAll(service.getAllContacts());
        listViewContacts.setItems(listObservableContacts);

        System.out.println(service.getAllContacts());
    }



}
