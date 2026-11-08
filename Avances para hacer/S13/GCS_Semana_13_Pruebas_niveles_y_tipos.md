<!-- Slide number: 1 -->

GESTIÓN DE CALIDAD DEL SOFTWARE · SEMANA 13
Pruebas: niveles y tipos
Pruebas manuales y automatizadas · Diseño de casos de prueba

Hoy vemos en qué niveles y de qué tipos se prueba el software, cuándo conviene probar a mano o automatizar, y diseñamos casos de prueba con un ejemplo guiado: el Login de un usuario.
Docente: Andrea Paternina · Universidad Cooperativa de Colombia · 2026-2

<!-- Slide number: 2 -->

SEMANA 13 · RUTA DE LA CLASE

El recorrido de hoy, paso a paso

1

2

3

4
Niveles de prueba
Tipos de prueba
Manual vs. automatizada
Diseñar casos
Unitaria
Integración
Sistema
Aceptación
Funcionales / no funcionales
Caja negra / caja blanca
Cuándo conviene cada una
Ventajas y límites
Anatomía de un caso
Ejemplo: Login
Técnicas de diseño

Idea clave:  probar no es “romper por romper”. Es diseñar, con criterio, casos que demuestren si el software hace lo que debe —y qué pasa cuando algo sale mal.

<!-- Slide number: 3 -->

PUNTO DE PARTIDA

¿Qué es probar y por qué importa?
Probar es ejecutar el software con casos pensados a propósito para encontrar defectos antes de que lleguen al usuario. No demuestra que “no hay errores”; demuestra que el software se comporta como se espera en las situaciones que probamos.

Calidad
Evidencia
Diseño

Un defecto encontrado temprano cuesta mucho menos que uno en producción. Probar es parte de asegurar la calidad.
Cada caso de prueba deja un registro: qué se probó, con qué datos y qué resultó. Es trazabilidad, no intuición.
Probar bien es diseñar: elegir qué casos valen la pena en vez de probar todo al azar (que es imposible).

✅ ¿Qué logramos?  Entendemos que probar es una actividad planeada y con evidencia, no improvisar clics.

<!-- Slide number: 4 -->

1

Niveles de prueba
¿Qué tan grande es el “pedazo” de software que estamos probando?

<!-- Slide number: 5 -->

NIVELES DE PRUEBA

De lo más pequeño a lo más completo

Unitaria
Prueba una pieza aislada: una función o método. La escribe el programador. Ej.: la función que valida el formato del correo.

Integración
Prueba que dos o más piezas funcionen juntas y se comuniquen bien. Ej.: el formulario de login consulta la base de datos.

Sistema
Prueba la aplicación completa, de principio a fin, como un todo. Ej.: registrarse, iniciar sesión y entrar al panel.

Aceptación
Prueba que el sistema cumple lo que el cliente/usuario pidió. Da el “visto bueno”. Ej.: el usuario confirma que el login funciona como esperaba.
▲  A medida que subimos, probamos partes más grandes y más cercanas al usuario.

<!-- Slide number: 6 -->

2

Tipos de prueba
Dos preguntas: ¿qué miramos? y ¿vemos el código por dentro?

<!-- Slide number: 7 -->

TIPOS DE PRUEBA

Dos formas de clasificarlas

¿Qué miramos?

¿Vemos el código?
Funcionales — ¿hace lo que debe? (el login deja entrar con datos correctos)

No funcionales —
¿cómo lo hace? Rendimiento, seguridad, usabilidad, compatibilidad
Caja negra — probamos por fuera, sin ver el código: entran datos, miramos la salida

Caja blanca —
probamos por dentro, conociendo el código: recorremos cada camino lógico

✅ ¿Qué logramos?  Un mismo caso puede cruzar clasificaciones: “login con datos correctos” es funcional y de caja negra.

<!-- Slide number: 8 -->

3

Manuales vs. automatizadas
¿Lo prueba una persona a mano, o lo prueba un programa que corre solo?

<!-- Slide number: 9 -->

MANUALES VS. AUTOMATIZADAS

Cuándo conviene cada una
|  | Manual | Automatizada |
| --- | --- | --- |
| Quién la ejecuta | Una persona, paso a paso | Un programa (script) que corre solo |
| Ideal para | Explorar, usabilidad, casos nuevos | Repetir lo mismo muchas veces (regresión) |
| Velocidad | Lenta si hay muchos casos | Muy rápida una vez escrita |
| Costo inicial | Bajo: empiezas ya | Alto: hay que programarla |
| Errores humanos | Posibles (cansancio, descuido) | Ninguno: hace siempre lo mismo |

La regla práctica

Automatiza lo que repites mucho (login, regresión). Prueba a mano lo nuevo, lo visual y lo que exige criterio humano.

No es “una u otra”.  Los equipos combinan: automatizan las pruebas repetitivas y dejan tiempo para las manuales que aportan más.

<!-- Slide number: 10 -->

4

Diseñar casos de prueba
El corazón de la clase: convertir un requisito en casos concretos.

<!-- Slide number: 11 -->

ANATOMÍA DE UN CASO DE PRUEBA

Qué campos lleva y para qué sirve cada uno

ID
Precondición

Un código único para identificarlo (CP-01).
Lo que debe estar listo antes (estar en la página de login).

Pasos
Datos de prueba

Las acciones, en orden (escribir correo → escribir clave → clic Entrar).
Los valores exactos que se usan (correo y contraseña).

Resultado esperado
Resultado real / Estado

Lo que DEBE pasar si todo está bien (entra al panel).
Lo que pasó al ejecutarlo y si pasó o falló.

✅ ¿Qué logramos?  Un buen caso cualquiera puede ejecutarlo y obtener el mismo resultado: eso es ser repetible.

<!-- Slide number: 12 -->

EJEMPLO · CASOS MANUALES

Login de usuario — diseño de casos
| ID | Caso | Datos de prueba | Resultado esperado |
| --- | --- | --- | --- |
| CP-01 | Login válido | correo@ucc.edu.co / Clave2026 | Entra al panel principal |
| CP-02 | Contraseña incorrecta | correo@ucc.edu.co / 1234 | Mensaje: “Credenciales inválidas” |
| CP-03 | Campos vacíos | (sin datos) + clic Entrar | Mensaje: “Campo obligatorio” |
| CP-04 | Correo mal formado | correoucc.edu.co / Clave2026 | Mensaje: “Correo no válido” |
| CP-05 | Contraseña muy corta | correo@ucc.edu.co / Cla1 | Mensaje: “Mínimo 8 caracteres” |
⚠ Ojo:  Cada caso prueba UNA cosa. No mezcles “clave corta y correo malo” en un solo caso: si falla, no sabrías cuál fue.

<!-- Slide number: 13 -->

EJEMPLO · CASOS AUTOMATIZADOS

Los mismos casos, ahora en código (pytest + Selenium)

login_test.py
assert

from selenium import webdriver
from selenium.webdriver.common.by import By
import pytest

@pytest.fixture
def driver():
    d = webdriver.Chrome()
    d.get("http://localhost:8000/login")
    yield d
    d.quit()

def login(d, correo, clave):
    d.find_element(By.ID, "correo").send_keys(correo)
    d.find_element(By.ID, "clave").send_keys(clave)
    d.find_element(By.ID, "entrar").click()

# CP-01 · login valido
def test_login_valido(driver):
    login(driver, "correo@ucc.edu.co", "Clave2026")
    assert "/panel" in driver.current_url

# CP-02 · contrasena incorrecta
def test_clave_incorrecta(driver):
    login(driver, "correo@ucc.edu.co", "1234")
    msg = driver.find_element(By.ID, "error").text
    assert "invalidas" in msg.lower()
La afirmación que decide: si se cumple, el test PASA; si no, FALLA. Es el “resultado esperado” en código.

fixture

Prepara y limpia el entorno (abre y cierra el navegador) para cada prueba.

Mismo diseño:  CP-01 y CP-02 son los mismos casos de la tabla. Automatizar no cambia el diseño: cambia quién lo ejecuta.

<!-- Slide number: 14 -->

TÉCNICAS DE DISEÑO

Cómo elegir buenos casos sin probar infinito

Partición de equivalencia

Valores límite
Agrupa las entradas en clases que el sistema trata igual, y prueba un representante de cada una.
Los errores se esconden en los bordes. Prueba justo en el límite y en sus vecinos.
En el login (contraseña):

Válida: 8 a 20 caracteres → 1 caso

Inválida: menos de 8 → 1 caso

Inválida: más de 20 → 1 caso
Si la clave va de 8 a 20, prueba:

7 (uno menos) → debe rechazar

8 (el mínimo) → debe aceptar

20 (el máximo) → debe aceptar

21 (uno más) → debe rechazar

✅ ¿Qué logramos?  Con estas dos técnicas cubrimos lo que importa con pocos casos, en vez de probar combinaciones infinitas.

<!-- Slide number: 15 -->

✅ ¿QUÉ LOGRAMOS EN LA SEMANA 13?

De la teoría al diseño de casos

Niveles y tipos
Manual vs. auto
Diseñar casos
Sabemos qué tan grande es lo que probamos (niveles) y qué miramos (tipos).
Elegimos con criterio: automatizar lo repetitivo, probar a mano lo nuevo.
Convertimos un requisito en casos claros, repetibles y con técnicas.

La idea central:  probar bien es diseñar. El mismo caso vale para ejecutarlo a mano o automatizarlo; lo que importa es que sea claro, repetible y pensado.
➡ Lo que sigue:  diseñar los casos de prueba (manuales y automatizados) de una funcionalidad de su proyecto.

<!-- Slide number: 16 -->

ACTIVIDAD

👩‍🎓 Tu turno: con una funcionalidad de tu proyecto

Diseña casos manuales
Automatiza al menos 2

Elige una funcionalidad (login, registro, buscar…)
Escribe al menos 5 casos en tabla
Usa partición de equivalencia y valores límite
Incluye casos válidos Y casos de error
Marca ID, pasos, datos y resultado esperado
Toma 2 de tus casos (uno válido, uno de error)
Escríbelos como test automatizado
Usa assert para el resultado esperado
Ejecútalos y anota si pasan o fallan
Entrega la tabla + el código + la evidencia

Recuerda:  un buen caso de prueba es claro, repetible y prueba una sola cosa. Automatizar no cambia el diseño: cambia quién ejecuta. Usa el ejemplo del Login como modelo.