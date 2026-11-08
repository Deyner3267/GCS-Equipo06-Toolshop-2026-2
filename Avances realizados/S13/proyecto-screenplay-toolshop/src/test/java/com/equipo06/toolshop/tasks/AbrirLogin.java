package com.equipo06.toolshop.tasks;

import com.equipo06.toolshop.ui.PaginaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Tarea: abrir directamente el formulario de inicio de sesión.
 */
public class AbrirLogin implements Task {

    public static AbrirLogin ahora() {
        return new AbrirLogin();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(PaginaLogin.URL));
    }
}
