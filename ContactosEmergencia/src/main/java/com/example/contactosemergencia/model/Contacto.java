package com.example.contactosemergencia.model;

public class Contacto {
    private String name;
    private String tel;
    private String parent;

    public Contacto() {

    }

    public Contacto(String name, String tel, String parent) {
        this.name = name;
        this.tel = tel;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }

}
