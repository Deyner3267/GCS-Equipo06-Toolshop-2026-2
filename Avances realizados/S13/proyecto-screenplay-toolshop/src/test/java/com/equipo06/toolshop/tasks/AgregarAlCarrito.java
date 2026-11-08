package com.equipo06.toolshop.tasks;

import com.equipo06.toolshop.ui.PaginaCatalogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

/**
 * Tarea: agregar al carrito el producto que está abierto en la ficha.
 */
public class AgregarAlCarrito implements Task {

    public static AgregarAlCarrito ahora() {
        return new AgregarAlCarrito();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaCatalogo.BOTON_AGREGAR_AL_CARRITO));
    }
}
