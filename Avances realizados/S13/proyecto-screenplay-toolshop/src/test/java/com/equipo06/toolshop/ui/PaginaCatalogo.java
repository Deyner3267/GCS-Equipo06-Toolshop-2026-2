package com.equipo06.toolshop.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Localizadores del catálogo y de la ficha de producto de Toolshop.
 */
public final class PaginaCatalogo {

    public static final String URL = "https://practicesoftwaretesting.com/";

    public static final Target PRIMER_PRODUCTO =
            Target.the("primer producto del catálogo")
                    .located(By.cssSelector("a[data-test^='product-']"));

    public static final Target NOMBRE_PRODUCTO =
            Target.the("nombre del producto")
                    .located(By.cssSelector("[data-test='product-name']"));

    public static final Target BOTON_AGREGAR_AL_CARRITO =
            Target.the("botón añadir al carrito")
                    .located(By.cssSelector("button[data-test='add-to-cart']"));

    public static final Target CANTIDAD_CARRITO =
            Target.the("cantidad del carrito")
                    .located(By.cssSelector("[data-test='cart-quantity']"));

    private PaginaCatalogo() {
    }
}
