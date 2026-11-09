package com.equipo06.toolshop.questions;

import com.equipo06.toolshop.ui.PaginaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Pregunta: ¿qué texto muestra el mensaje de error del login?
 */
public class MensajeDeError implements Question<String> {

    public static MensajeDeError texto() {
        return new MensajeDeError();
    }

    @Override
    public String answeredBy(Actor actor) {
        return actor.asksFor(Text.of(PaginaLogin.MENSAJE_ERROR)).trim();
    }
}
