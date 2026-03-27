package com.example.contactosemergencia2;

import com.example.contactosemergencia2.serviceContacto.Service;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {
    private Service service = new Service();

    private String[] listaOpciones = {"Padre", "Madre", "Hermano", "Hermana", "Tio", "Tia", "Abuelo", "Abuela"};

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTel;

    @FXML
    private ComboBox<String> cbRelacion;

    @FXML
    private ListView<Contacto> contactoListView;

    @FXML
    public void initialize(){
        cbRelacion.getItems().addAll(listaOpciones);
        contactoListView.setItems(service.getAllContactos());
    }

    @FXML
    public void onAdd(){
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        String relacion = cbRelacion.getValue();

        service.agregarContacto(nombre, telefono, relacion);
    }

}
