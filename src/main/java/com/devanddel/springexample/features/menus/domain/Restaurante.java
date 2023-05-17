package com.devanddel.springexample.features.menus.domain;

public class Restaurante {
    private String nombreRest;
    private String direccRest;

    public Restaurante(String nombreRest, String direccRest) {
        this.nombreRest = nombreRest;
        this.direccRest = direccRest;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public String getDireccRest() {
        return direccRest;
    }

    public void setDireccRest(String direccRest) {
        this.direccRest = direccRest;
    }
}

