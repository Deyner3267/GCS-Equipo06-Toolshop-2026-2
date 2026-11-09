package com.equipo06.toolshop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

/**
 * Pregunta: ¿cuál es la URL actual del navegador?
 */
public class UrlActual implements Question<String> {

    public static UrlActual valor() {
        return new UrlActual();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    }
}
