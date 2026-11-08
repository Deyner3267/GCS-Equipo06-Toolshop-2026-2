package com.equipo06.toolshop.tasks;

import com.equipo06.toolshop.ui.PaginaCatalogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Tarea: abrir el catálogo y entrar a la ficha del primer producto.
 */
public class AbrirPrimerProducto implements Task {

    public static AbrirPrimerProducto ahora() {
        return new AbrirPrimerProducto();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PaginaCatalogo.URL),
                Click.on(PaginaCatalogo.PRIMER_PRODUCTO)
        );
    }
}
