package com.equipo06.toolshop.questions;

import com.equipo06.toolshop.ui.PaginaCatalogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Pregunta: ¿qué cantidad muestra el contador del carrito?
 */
public class CantidadDelCarrito implements Question<String> {

    public static CantidadDelCarrito valor() {
        return new CantidadDelCarrito();
    }

    @Override
    public String answeredBy(Actor actor) {
        return actor.asksFor(Text.of(PaginaCatalogo.CANTIDAD_CARRITO)).trim();
    }
}
