package com.equipo06.toolshop.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Localizadores de la página de autenticación de Toolshop.
 * Se usan los atributos data-test del sitio para que las pruebas sean estables.
 */
public final class PaginaLogin {

    public static final String URL = "https://practicesoftwaretesting.com/auth/login";

    public static final Target CAMPO_EMAIL =
            Target.the("campo de correo electrónico")
                    .located(By.cssSelector("input[data-test='email']"));

    public static final Target CAMPO_PASSWORD =
            Target.the("campo de contraseña")
                    .located(By.cssSelector("input[data-test='password']"));

    public static final Target BOTON_ENTRAR =
            Target.the("botón de iniciar sesión")
                    .located(By.cssSelector("[data-test='login-submit']"));

    public static final Target MENSAJE_ERROR =
            Target.the("mensaje de error de login")
                    .located(By.cssSelector("[data-test='login-error']"));

    private PaginaLogin() {
    }
}
