package com.example.contactosemergencia.services;

import com.example.contactosemergencia.model.Contacto;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contacto> listContacts= new ArrayList<>();

    public List<Contacto> getAllContacts(){
        return listContacts;
    }

    public void addContact(Contacto contacto){
        listContacts.add(contacto);
    }

    public boolean verificarNombre(String nombreARevisar){
        for(Contacto contactoActual : listContacts){
            if(contactoActual.getName().equalsIgnoreCase(nombreARevisar)){
                return true;
            }
        }
        return false;
    }


}
