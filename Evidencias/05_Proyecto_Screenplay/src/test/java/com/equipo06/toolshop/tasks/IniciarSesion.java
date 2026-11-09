package com.equipo06.toolshop.tasks;

import com.equipo06.toolshop.ui.PaginaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * Tarea: diligenciar correo y contraseña y enviar el formulario.
 * El mismo caso se usa para el camino válido y para el de error.
 */
public class IniciarSesion implements Task {

    private final String correo;
    private final String contrasena;

    public IniciarSesion(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public static IniciarSesion conCredenciales(String correo, String contrasena) {
        return new IniciarSesion(correo, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(correo).into(PaginaLogin.CAMPO_EMAIL),
                Enter.theValue(contrasena).into(PaginaLogin.CAMPO_PASSWORD),
                Click.on(PaginaLogin.BOTON_ENTRAR)
        );
    }
}
