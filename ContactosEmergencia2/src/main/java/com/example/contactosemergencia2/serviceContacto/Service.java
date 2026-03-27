package com.example.contactosemergencia2.serviceContacto;

import com.example.contactosemergencia2.Contacto;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.security.PublicKey;

public class Service {

    private ObservableList<Contacto> listaContactos = FXCollections.observableArrayList();

    public ObservableList<Contacto> getAllContactos() {
        return listaContactos;
    }

    public void agregarContacto(String nombre, String telefono, String parentesco){
        if(nombre == null || nombre.trim().isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if(telefono == null || telefono.isBlank()){
            throw new IllegalArgumentException("El telefono no puede estar vacio");
        }
        if (parentesco == null){
            throw new IllegalArgumentException("El parentesco no puede estar vacio");
        }
        if (telefono.length() != 10){
            throw new IllegalArgumentException("El telefono tiene que tener 10 digitos");
        }
        listaContactos.add(new Contacto(nombre, telefono, parentesco));

    }



}
