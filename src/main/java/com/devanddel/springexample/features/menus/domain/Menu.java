package com.devanddel.springexample.features.menus.domain;

public class Menu {
    private String entrante;
    private String Stringprincipal;
    private String postre;

    public Menu(String entrante, String stringprincipal, String postre) {
        this.entrante = entrante;
        Stringprincipal = stringprincipal;
        this.postre = postre;
    }

    public String getEntrante() {
        return entrante;
    }

    public String getStringprincipal() {
        return Stringprincipal;
    }

    public String getPostre() {
        return postre;
    }
}
