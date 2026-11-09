package com.equipo06.toolshop.tests;

import com.equipo06.toolshop.questions.CantidadDelCarrito;
import com.equipo06.toolshop.questions.MensajeDeError;
import com.equipo06.toolshop.questions.UrlActual;
import com.equipo06.toolshop.tasks.AbrirLogin;
import com.equipo06.toolshop.tasks.AbrirPrimerProducto;
import com.equipo06.toolshop.tasks.AgregarAlCarrito;
import com.equipo06.toolshop.tasks.IniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Suite automatizada de la ronda S13.
 *
 * <p>Casos cubiertos:
 * CP-01 login válido, CP-02 login con contraseña incorrecta y
 * CP-18 agregar un producto al carrito. Los tres se ejecutan con el patrón
 * Screenplay: un actor, tareas, preguntas y aserciones.</p>
 */
@DisplayName("Suite Screenplay de Toolshop - S13")
class PruebasToolshopTest {

    private static final String CORREO = "customer@practicesoftwaretesting.com";
    private static final String CONTRASENA = "welcome01";
    private static final String CONTRASENA_INCORRECTA = "clave_incorrecta_123";

    private WebDriver driver;
    private Actor cliente;

    @BeforeEach
    void prepararNavegador() {
        ChromeOptions opciones = new ChromeOptions();
        opciones.addArguments("--headless=new");
        opciones.addArguments("--disable-gpu");
        opciones.addArguments("--no-sandbox");
        opciones.addArguments("--disable-dev-shm-usage");
        opciones.addArguments("--window-size=1440,900");
        opciones.addArguments("--lang=es-CO");

        driver = new ChromeDriver(opciones);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cliente = Actor.named("Cliente de Toolshop").whoCan(BrowseTheWeb.with(driver));
    }

    @AfterEach
    void cerrarNavegador(TestInfo testInfo) {
        if (driver != null) {
            guardarEvidencia(testInfo);
            driver.quit();
        }
    }

    @Test
    @DisplayName("CP-01 · Login válido con la cuenta de cliente")
    void cp01LoginValido() {
        cliente.attemptsTo(
                AbrirLogin.ahora(),
                IniciarSesion.conCredenciales(CORREO, CONTRASENA)
        );

        await().atMost(Duration.ofSeconds(15)).untilAsserted(() ->
                assertTrue(cliente.asksFor(UrlActual.valor()).contains("/account"),
                        "Después de un login válido se espera la URL /account"));

        System.out.println("CP-01 OK | URL final: " + cliente.asksFor(UrlActual.valor()));
    }

    @Test
    @DisplayName("CP-02 · Login con contraseña incorrecta")
    void cp02LoginConContrasenaIncorrecta() {
        cliente.attemptsTo(
                AbrirLogin.ahora(),
                IniciarSesion.conCredenciales(CORREO, CONTRASENA_INCORRECTA)
        );

        await().atMost(Duration.ofSeconds(15)).untilAsserted(() ->
                assertEquals("Invalid email or password", cliente.asksFor(MensajeDeError.texto()),
                        "El mensaje de error debe ser exactamente el que muestra Toolshop"));

        System.out.println("CP-02 OK | Mensaje: " + cliente.asksFor(MensajeDeError.texto()));
    }

    @Test
    @DisplayName("CP-18 · Agregar un producto al carrito y verificar el contador")
    void cp18AgregarProductoAlCarrito() {
        cliente.attemptsTo(
                AbrirPrimerProducto.ahora(),
                AgregarAlCarrito.ahora()
        );

        await().atMost(Duration.ofSeconds(15)).untilAsserted(() ->
                assertEquals("1", cliente.asksFor(CantidadDelCarrito.valor()),
                        "El contador del carrito debe quedar en 1"));

        System.out.println("CP-18 OK | Cantidad del carrito: " + cliente.asksFor(CantidadDelCarrito.valor()));
    }

    private void guardarEvidencia(TestInfo testInfo) {
        try {
            Path carpeta = Path.of("evidencias");
            Files.createDirectories(carpeta);
            String nombre = testInfo.getTestMethod().orElseThrow().getName() + ".png";
            File captura = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(captura.toPath(), carpeta.resolve(nombre), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Evidencia guardada: evidencias/" + nombre);
        } catch (Exception e) {
            System.out.println("No se pudo guardar la evidencia: " + e.getMessage());
        }
    }
}
