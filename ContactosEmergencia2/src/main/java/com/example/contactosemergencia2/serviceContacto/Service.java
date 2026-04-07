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
        validar(nombre, telefono, parentesco);
        if(buscarContacto(nombre) != null){
            throw new IllegalArgumentException("Este usuario ya existe");
        }
        listaContactos.add(new Contacto(nombre, telefono, parentesco));
    }

    public Contacto buscarContacto(String nombre){
        for(Contacto contactoABuscar : listaContactos){
            if(nombre.equalsIgnoreCase(contactoABuscar.getNombre())){
                return contactoABuscar;
            }
        }
        return null;
    }

    public void actualizarContacto(String nombre, String nuevoTel, String nuevaRelacion){
        validar(nombre, nuevoTel, nuevaRelacion);

        Contacto contacto = buscarContacto(nombre);
        if(contacto != null){
            contacto.setParentesco(nuevaRelacion);
            contacto.setTelefono(nuevoTel);
            return;
        }
        throw new IllegalArgumentException("Error, el contacto a actualizar no existe");
    }

    public void borrarContacto(String nombre){
        Contacto contacto = buscarContacto(nombre);
        if(contacto != null){
            listaContactos.remove(contacto);
            return;
        }
        throw new IllegalArgumentException("El usuario no existe");
    }

    private void validar(String nombre, String telefono, String parentesco){
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

    }
}
