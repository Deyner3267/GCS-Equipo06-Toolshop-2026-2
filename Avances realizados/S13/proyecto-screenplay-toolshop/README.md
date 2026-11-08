# Proyecto Screenplay Toolshop — S13

Suite automatizada de tres casos de prueba sobre Practice Software Testing (Toolshop), construida con **Java 21 + Gradle 8.10.2 + Screenplay (Serenity BDD 4.2.34) + Selenium 4 + JUnit 5**.

## Casos automatizados

| ID | Caso | Resultado esperado |
|---|---|---|
| CP-01 | Login válido con `customer@practicesoftwaretesting.com` / `welcome01` | La URL termina en `/account` |
| CP-02 | Login con contraseña incorrecta `clave_incorrecta_123` | Aparece el mensaje `Invalid email or password` |
| CP-18 | Agregar el primer producto del catálogo al carrito | El contador `cart-quantity` muestra `1` |

## Requisitos

- JDK 21.
- Google Chrome instalado.
- Conexión a Internet (las pruebas se ejecutan contra el sitio real).
- Gradle se ejecuta con el wrapper incluido; no hace falta instalarlo.

## Ejecución

```powershell
$env:JAVA_HOME = "C:\ruta\a\jdk-21"
$env:Path = "$env:JAVA_HOME\bin;$env:Path"
.\gradlew.bat test --no-daemon
```

En Linux/macOS:

```bash
export JAVA_HOME=/ruta/a/jdk-21
./gradlew test --no-daemon
```

## Evidencias

- Reporte HTML de Gradle: `build/reports/tests/test/index.html`
- Capturas de pantalla: `evidencias/cp01LoginValido.png`, `evidencias/cp02LoginConContrasenaIncorrecta.png`, `evidencias/cp18AgregarProductoAlCarrito.png`
- Salida de consola: `build/test-results/test/*.xml` y la salida de `gradlew test`.

## Estructura

```
src/test/java/com/equipo06/toolshop/
├── ui/          Localizadores (Target) de login y catálogo
├── tasks/       Tareas Screenplay: abrir login, iniciar sesión, abrir producto, agregar al carrito
├── questions/   Preguntas Screenplay: URL, mensaje de error, cantidad del carrito
└── tests/       Pruebas JUnit 5 que ejecutan el actor
```

La separación `ui / tasks / questions / tests` es la estructura típica de Screenplay: el test expresa **qué** se quiere comprobar y las tareas encapsulan **cómo** se interactúa con la interfaz.
