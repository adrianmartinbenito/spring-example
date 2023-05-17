package com.devanddel.springexample.features.menus.infrastructure.drivers.adapters;

import com.devanddel.springexample.features.menus.infrastructure.drivens.ports.*;
import com.devanddel.springexample.features.menus.infrastructure.drivers.ports.*;
import com.devanddel.springexample.features.recomendaciones.domain.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MenuControllerImpl implements MenuController {

    @Autowired
    private MenuDao menuDao;

    @Override
    @GetMapping(value="/menu/{menuType}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Recomendacion getMenu(@PathVariable String menuType){
        if(menuType.equals("healthy")){
            return menuDao.getMenuHealthy();
        } else {
            return menuDao.getMenu();
        }
    }


}
