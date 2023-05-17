package com.devanddel.springexample.features.menus.infrastructure.drivers.ports;

import com.devanddel.springexample.features.menus.domain.*;
import org.springframework.web.bind.annotation.*;

public interface MenuController {
    public Recomendacion getMenu(@PathVariable String category);
}
