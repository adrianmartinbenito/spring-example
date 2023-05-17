package com.devanddel.springexample.features.menus.domain.models;

public class Menu {
    private String entrante;
    private String principal;
    private String postre;

    public Menu(String entrante, String principal, String postre) {
        this.entrante = entrante;
        this.principal = principal;
        this.postre = postre;
    }

    public String getEntrante() {
        return entrante;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getPostre() {
        return postre;
    }
}
