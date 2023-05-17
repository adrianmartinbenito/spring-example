package com.devanddel.springexample.features.menus.infrastructure.drivens.adapters;

import com.devanddel.springexample.features.menus.domain.models.*;
import com.devanddel.springexample.features.menus.infrastructure.drivens.ports.*;
import com.devanddel.springexample.features.recomendaciones.domain.models.*;
import com.devanddel.springexample.features.restaurantes.domain.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.*;

@Repository
public class MenuDaoImpl implements MenuDao {

    @Autowired
    private NamedParameterJdbcOperations jdbcTemplate;
    @Override
    public Recomendacion getMenu() {
        StringBuilder query = new StringBuilder();
        query.append(" SELECT ");
        query.append(" primerPlato.descripcion AS entrante, ");
        query.append(" segundoPlato.descripcion AS principal, ");
        query.append(" tercerPlato.descripcion AS postre, ");
        query.append(" restaurante.nombre AS nombreRest, ");
        query.append(" restaurante.direccion AS direccRest, ");
        query.append(" RAND() AS rdn ");
        query.append(" FROM plato AS primerPlato, plato AS segundoPlato, plato AS tercerPlato, restaurante ");
        query.append(" WHERE primerPlato.categoria = 1 AND segundoPlato.categoria = 2 AND tercerPlato.categoria = 3 ");
        query.append(" AND primerPlato.restaurante_id = segundoPlato.restaurante_id AND tercerPlato.restaurante_id = primerPlato.restaurante_id ");
        query.append(" AND primerPlato.restaurante_id = restaurante.id ");
        query.append(" ORDER BY rdn ");
        query.append(" LIMIT 1");

        return jdbcTemplate.queryForObject(query.toString(),
                EmptySqlParameterSource.INSTANCE,
                (rs, rowNum) ->
                new Recomendacion(new Menu(
                        rs.getString("entrante"),
                        rs.getString("principal"),
                        rs.getString("postre")),
                        new Restaurante(
                                rs.getString("nombreRest"),
                                rs.getString("direccRest"))));

    }

}
