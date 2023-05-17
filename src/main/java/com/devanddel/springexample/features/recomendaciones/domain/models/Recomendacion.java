package com.devanddel.springexample.features.recomendaciones.domain.models;

import com.devanddel.springexample.features.menus.domain.models.*;
import com.devanddel.springexample.features.restaurantes.domain.models.*;

public class Recomendacion {
     private Menu menu;
     private Restaurante restaurante;

    public Recomendacion(Menu menu, Restaurante restaurante) {
        this.menu = menu;
        this.restaurante = restaurante;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
