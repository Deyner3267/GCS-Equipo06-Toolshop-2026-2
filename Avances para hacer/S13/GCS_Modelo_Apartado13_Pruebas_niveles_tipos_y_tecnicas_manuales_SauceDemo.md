**Modelo guía — Apartado 13 (Semana 13)**

Pruebas de software: niveles, tipos y técnicas de diseño aplicadas a las pruebas MANUALES

**Caso de ejemplo: SauceDemo (saucedemo.com)**

Gestión y Calidad del Software · UCC · 2026-2 · Docente: Andrea Paternina

*Este es el modelo que construimos en clase sobre SauceDemo. Cada equipo lo REPLICA con su sitio asignado (AutomationExercise, Toolshop, ParaBank, DemoBlaze, ExpandTesting, DemoQA, OrangeHRM, BStackDemo). Objetivo del apartado (Avance 3, punto 3): TERMINAR el diseño de los casos de prueba ubicándolos por NIVEL y TIPO, y obteniéndolos con TÉCNICAS DE DISEÑO formales (partición de equivalencia, valores límite, tabla de decisión, transición de estados, casos de uso y técnicas basadas en la experiencia). Esta guía se enfoca en las pruebas MANUALES: se diseñan y ejecutan primero a mano, y en cada caso se marca si es candidato a automatizarse más adelante. No basta con «inventar» casos: cada uno debe salir de una técnica y poder rastrearse hasta una función del sitio y una característica de ISO 25010.*

**Importante (lo más evaluado): cada caso de prueba manual debe indicar (1) de qué TÉCNICA salió, (2) su NIVEL y su TIPO, (3) su PRIORIDAD, y tener (4) PRECONDICIONES, (5) DATOS concretos, (6) PASOS numerados y (7) un RESULTADO ESPERADO verificable (el mensaje exacto, el valor exacto, la página exacta). La suite debe cubrir TODAS las funciones del alcance y estar separada en manuales y candidatos a automatizar. Casos sin técnica, con datos vagos («un usuario cualquiera») o con resultados como «funciona bien» bajan el nivel.**

# **1 · Objetivo del apartado**

En el Avance 2 diseñamos una primera matriz de casos (20 casos) y en las semanas siguientes la fuimos poniendo a prueba: la S11 nos dijo, con la complejidad ciclomática, cuántos casos MÍNIMOS necesita el login (5); y el tablero de la S12 nos alertó de dos huecos: la cobertura funcional estaba en 83,3 % porque la función «ordenar el catálogo» no tenía casos, y un defecto se nos «escapó» justamente ahí. Eso pasa cuando los casos se escriben por intuición. El objetivo de este apartado es diseñar la suite de pruebas manuales de forma SISTEMÁTICA: entender los niveles y tipos de prueba, aplicar las técnicas de diseño a cada función del sitio, y documentar cada caso con un formato estándar listo para ejecutarse en la S15.

# **2 · Marco conceptual**

## **2.1 · Pruebas manuales y principios de la prueba**

Una prueba MANUAL la ejecuta una persona: sigue los pasos, observa el sitio y compara lo que pasa con el resultado esperado. Una prueba AUTOMATIZADA la ejecuta un script (Selenium, Playwright). No compiten: las manuales son mejores cuando se necesita JUICIO HUMANO (usabilidad, aspecto visual, mensajes confusos), cuando se explora algo nuevo o cuando el caso se ejecutará pocas veces; las automatizadas convienen para lo repetitivo y estable (regresión). Por eso todo caso se diseña y se ejecuta primero a mano: un caso que no funciona manualmente tampoco funcionará automatizado.

El ISTQB (2023) resume siete principios que justifican el uso de técnicas de diseño:

| **Principio** | **Qué significa para nuestro proyecto** |
| --- | --- |
| 1. La prueba muestra la presencia de defectos, no su ausencia | Aunque todo pase, no podemos afirmar que el sitio «no tiene errores». |
| 2. La prueba exhaustiva es imposible | No se pueden probar todos los datos posibles: por eso usamos técnicas que eligen pocos casos representativos. |
| 3. Probar temprano ahorra tiempo y dinero | Diseñar casos desde el plan (Avance 2) permitió encontrar huecos antes de ejecutar. |
| 4. Los defectos se agrupan | El Pareto de la S12 mostró que la mitad de los defectos están en Adecuación funcional: ahí reforzamos. |
| 5. Paradoja del pesticida | Repetir siempre los mismos casos deja de encontrar defectos: hay que agregar casos y explorar. |
| 6. La prueba depende del contexto | No se prueba igual una tienda de práctica que un sistema bancario. |
| 7. La falacia de la ausencia de errores | Un sitio sin defectos puede igual no servirle al usuario (usabilidad). |

## **2.2 · Niveles de prueba**

Los niveles indican QUÉ PARTE del sistema se prueba y en qué momento del desarrollo. Se relacionan con el modelo en V de la S5: cada nivel verifica o valida un producto del lado izquierdo de la V (ISTQB, 2023).

| **Nivel** | **Qué se prueba** | **Quién suele hacerlo** | **¿Aplica en nuestro proyecto?** |
| --- | --- | --- | --- |
| Componente (unitaria) | Una función, clase o módulo del código, aislado. | Desarrolladores | No: no tenemos el código del sitio. |
| Integración | La comunicación entre componentes o entre sistemas (APIs, servicios). | Desarrolladores / testers | Parcial: la vemos desde la interfaz (p. ej. que el carrito pase bien sus datos al checkout). |
| Sistema | El sistema completo funcionando, contra sus requisitos funcionales y no funcionales. | Equipo de pruebas (QA) | Sí: es nuestro nivel principal. |
| Aceptación | Si el sistema sirve al usuario y cumple los criterios para aceptarlo. | Usuario / cliente / QA | Sí: flujos completos de negocio (comprar) y criterios de aceptación de la S14. |

## **2.3 · Tipos de prueba**

Los tipos indican QUÉ OBJETIVO tiene la prueba. Un mismo nivel (p. ej. sistema) puede incluir varios tipos. Cada tipo se relaciona con características de ISO 25010 (S8):

| **Tipo** | **Objetivo** | **Característica ISO 25010** | **Ejemplo en SauceDemo** |
| --- | --- | --- | --- |
| Funcional | Verificar QUÉ hace el sistema. | Adecuación funcional | El total de la orden se calcula bien. |
| No funcional · usabilidad | Verificar qué tan fácil y claro es de usar. | Usabilidad | Los mensajes de error dicen qué corregir. |
| No funcional · desempeño | Verificar tiempos de respuesta. | Eficiencia de desempeño | El login responde en ≤ 2 s (meta del KPI-4). |
| No funcional · seguridad | Verificar control de acceso. | Seguridad | No se entra al catálogo sin iniciar sesión. |
| No funcional · compatibilidad | Verificar en varios navegadores/dispositivos. | Compatibilidad | El flujo de compra en Chrome y Firefox. |
| Humo (smoke) | Comprobar rápido que lo esencial funciona antes de probar a fondo. | Adecuación funcional | Login + agregar al carrito + comprar. |
| Confirmación (re-test) | Volver a probar un caso que falló, tras un cambio. | Todas | Repetir un caso fallido en la S15. |
| Regresión | Verificar que lo que funcionaba sigue funcionando tras cambios. | Todas | Repetir los casos de prioridad alta. |

Otra clasificación clave es según lo que se conoce del sistema: CAJA NEGRA (se diseña desde lo que el sistema debe hacer, sin ver el código) y CAJA BLANCA (se diseña desde la estructura interna, como el camino básico de la S11). Como evaluamos sitios de terceros, casi toda nuestra suite es de caja negra.

## **2.4 · Técnicas de diseño de casos**

Las técnicas de diseño son métodos para ELEGIR qué casos escribir, de modo que con pocos casos se cubra mucho (ISO/IEC/IEEE 29119-4; ISTQB, 2023). Se agrupan en tres familias:

| **Familia** | **Técnica** | **Idea central** |
| --- | --- | --- |
| Caja negra | Partición de equivalencia (PE) | Dividir los datos posibles en CLASES que el sistema trata igual (válidas e inválidas) y probar un valor de cada clase. |
| Caja negra | Análisis de valores límite (AVL) | Los defectos se esconden en los BORDES de las clases: probar el valor justo en el límite y sus vecinos. |
| Caja negra | Tabla de decisión (TD) | Cuando el resultado depende de una COMBINACIÓN de condiciones: cada regla (columna) es un caso. |
| Caja negra | Transición de estados (TE) | Cuando el sistema cambia de ESTADO según eventos: se prueban las transiciones válidas y alguna inválida. |
| Caja negra | Casos de uso / escenarios | Probar el flujo PRINCIPAL de un usuario de principio a fin y sus flujos ALTERNOS. |
| Caja blanca | Camino básico | Un caso por cada camino independiente del grafo de flujo (V(G), S11). |
| Experiencia | Adivinación de errores | Usar la experiencia para anticipar dónde suelen fallar los sistemas (campos con espacios, doble clic, botón Atrás). |
| Experiencia | Prueba exploratoria | Diseñar y ejecutar al mismo tiempo, en sesiones con un objetivo (charter) y un tiempo fijo. |
| Experiencia | Basada en checklist | Revisar el sitio contra una lista de verificación (como la del Avance 1 o heurísticas de usabilidad). |

## **2.5 · Anatomía de un caso de prueba manual**

Basados en ISO/IEC/IEEE 29119-3 (documentación de pruebas), cada caso se documenta con estos campos. Los cuatro últimos se llenan al EJECUTAR (S15):

| **Campo** | **Qué contiene** |
| --- | --- |
| ID y título | Código único (CP-01) y un título que diga qué se prueba. |
| Trazabilidad | Función del sitio y característica ISO 25010 que cubre. |
| Técnica, nivel y tipo | De qué técnica salió; en qué nivel y de qué tipo es. |
| Prioridad | Alta, media o baja según el riesgo (Tabla C). |
| Precondiciones | Lo que debe ser cierto antes de empezar (sesión iniciada, carrito vacío…). |
| Datos de prueba | Valores EXACTOS a usar (usuario, clave, nombre, código postal). |
| Pasos | Acciones numeradas, una por paso, que cualquiera pueda repetir. |
| Resultado esperado | Lo que DEBE pasar, verificable: mensaje exacto, valor exacto, página exacta. |
| Resultado obtenido · Estado · Evidencia · Defecto | Se llenan en la ejecución: qué pasó, pasa/falla, captura de pantalla, ID del defecto. |

# **3 · Tablas de criterios**

**Tabla A — ¿Qué técnica uso?**

| **Si la función tiene…** | **Usa…** | **Ejemplo típico** |
| --- | --- | --- |
| Campos de entrada con rangos o tipos de datos | Partición de equivalencia + valores límite | Formularios, cantidades, longitudes de texto. |
| Reglas que combinan varias condiciones | Tabla de decisión | Login, descuentos, permisos. |
| Pantallas o estados por los que se avanza | Transición de estados | Carrito → checkout → confirmación. |
| Un proceso completo de negocio | Casos de uso / escenarios | Comprar de principio a fin. |
| Decisiones encadenadas (ya graficadas) | Camino básico | El grafo del login de la S11. |
| Zonas con historial de defectos o poca documentación | Adivinación de errores + exploratoria | Usuarios «problemáticos», campos libres. |
| Aspectos visuales o de facilidad de uso | Checklist / heurísticas | Imágenes, textos, mensajes, navegación. |

**Tabla B — Criterios de calidad de un caso de prueba manual.**

| **Criterio** | **Cumple si…** |
| --- | --- |
| Atómico | Prueba UNA sola cosa (si falla, se sabe qué falló). |
| Reproducible | Otra persona obtiene el mismo resultado siguiendo los pasos. |
| Independiente | No depende de que otro caso se haya ejecutado antes (lo necesario va en precondiciones). |
| Datos concretos | Usa valores exactos, no «datos válidos». |
| Resultado verificable | El esperado se puede comparar sin interpretación (texto, número, URL). |
| Trazable | Se relaciona con una función, una característica ISO 25010 y una técnica. |

**Tabla C — Prioridad según el riesgo (impacto × probabilidad de falla).**

| **Prioridad** | **Criterio** | **Cuándo se ejecuta** |
| --- | --- | --- |
| Alta | Si falla, el usuario no puede completar su objetivo (comprar, entrar) o hay riesgo de seguridad. | Siempre; forma la suite de regresión. |
| Media | Si falla, el usuario puede seguir pero con molestias o información incorrecta. | En cada ciclo completo. |
| Baja | Si falla, el efecto es menor o cosmético. | Si hay tiempo (restricción de la S9). |

# **4 · Método paso a paso (6 pasos)**

Paso 1 — Toma las funciones del alcance (S10–S11) y define para cada una el NIVEL y los TIPOS de prueba que aplican (mapa como 5.1).

Paso 2 — Elige la TÉCNICA adecuada para cada función con la Tabla A y aplícala mostrando el análisis: clases y límites, tabla de reglas o diagrama de estados.

Paso 3 — Convierte cada clase, límite, regla, transición o escenario en uno o más CASOS, y completa la suite con técnicas basadas en la experiencia (adivinación de errores y una sesión exploratoria).

Paso 4 — Asigna la PRIORIDAD de cada caso con la Tabla C y marca si es candidato a automatizarse (estable, repetitivo, con resultado objetivo) o debe quedarse manual (visual, exploratorio, de juicio humano).

Paso 5 — Documenta la MATRIZ completa y escribe al menos dos casos en formato detallado (pasos y datos exactos); revisa cada uno con la Tabla B.

Paso 6 — Verifica la COBERTURA: todas las funciones, todas las transiciones y todas las reglas cubiertas; actualiza los KPI de la S12 (casos diseñados, cobertura) y conecta con la S14 y la S15. Esta integración da el nivel relacional.

# **5 · Ejemplo trabajado: SauceDemo**

## **5.1 · Mapa de pruebas: funciones, niveles, tipos y técnicas**

| **Función (alcance)** | **Nivel** | **Tipos de prueba** | **Técnicas aplicadas** |
| --- | --- | --- | --- |
| F1 · Login | Sistema | Funcional, seguridad, desempeño | Tabla de decisión, PE, camino básico (S11) |
| F2 · Catálogo y detalle | Sistema | Funcional, usabilidad (visual) | Escenarios, checklist, adivinación de errores |
| F3 · Ordenar el catálogo | Sistema | Funcional | Partición de equivalencia (4 opciones de orden) |
| F4 · Carrito | Sistema / integración (vista de usuario) | Funcional | Valores límite, transición de estados |
| F5 · Checkout | Sistema / aceptación | Funcional, usabilidad | PE + AVL, transición de estados, caso de uso |
| F6 · Menú (logout, reset) | Sistema | Funcional, seguridad | Transición de estados, adivinación de errores |

## **5.2 · Partición de equivalencia y valores límite**

**a) Login (F1).** El sitio trata igual a todos los valores de una misma clase, así que basta un valor por clase:

| **Entrada** | **Clases VÁLIDAS** | **Clases INVÁLIDAS** | **Valor elegido por clase** |
| --- | --- | --- | --- |
| Usuario | V1: usuario existente y activo | I1: vacío · I2: inexistente · I3: existente pero bloqueado | V1 standard\_user · I1 (vacío) · I2 usuario\_x · I3 locked\_out\_user |
| Clave | V2: clave correcta | I4: vacía · I5: incorrecta | V2 secret\_sauce · I4 (vacía) · I5 clave123 |

**b) Formulario de información del checkout (F5).** Los campos Nombre, Apellido y Código postal solo exigen no estar vacíos y no se observa un límite máximo documentado. Clases por campo: VÁLIDA = texto de 1 o más caracteres; INVÁLIDA = vacío. Valores límite de la LONGITUD: 0 caracteres (inválido, justo fuera del límite) y 1 carácter (válido, justo en el límite). Como no hay máximo especificado, el valor largo (p. ej. 255 caracteres) se prueba como adivinación de errores.

**c) Cantidad de productos en el carrito (F4).** El catálogo tiene 6 productos y cada uno se agrega una sola vez, así que la cantidad va de 0 a 6. Valores límite: 0 (sin contador visible), 1 (contador = 1) y 6 (contador = 6, máximo posible).

**d) Opciones de orden (F3).** Las 4 opciones del selector son 4 clases distintas: Name (A to Z), Name (Z to A), Price (low to high) y Price (high to low). Por la restricción de tiempo de la S9 elegimos un representante por CRITERIO de orden: precio (CP-09, «low to high») y nombre (CP-10, «Z to A», distinto del orden predeterminado). Las dos opciones restantes son las inversas de estas y se agregan si hay tiempo.

## **5.3 · Tabla de decisión del login**

El resultado del login depende de la combinación de cuatro condiciones. Cada columna (regla) es un caso de prueba; el guion «–» significa que esa condición no importa en esa regla:

| **Condiciones / acciones** | **R1** | **R2** | **R3** | **R4** | **R5** |
| --- | --- | --- | --- | --- | --- |
| ¿Usuario vacío? | Sí | No | No | No | No |
| ¿Clave vacía? | – | Sí | No | No | No |
| ¿Credenciales válidas? | – | – | No | Sí | Sí |
| ¿Usuario bloqueado? | – | – | – | Sí | No |
| Resultado esperado | Epic sadface: Username is required | Epic sadface: Password is required | Epic sadface: Username and password do not match any user in this service | Epic sadface: Sorry, this user has been locked out. | Ingresa a /inventory.html |
| Caso de prueba | CP-02 | CP-03 | CP-04 | CP-05 | CP-01 |

Las 5 reglas coinciden con los 5 caminos independientes que calculamos con la complejidad ciclomática en la S11 (V(G) = 5). Que dos técnicas distintas lleguen al mismo número de casos es una buena señal de que la suite del login está completa.

## **5.4 · Transición de estados del flujo de compra**

El flujo de compra pasa por varios ESTADOS. Dibujamos el diagrama con los eventos que provocan cada cambio y una transición INVÁLIDA (entrar al catálogo sin sesión):

![](data:image/png;base64...)

*Figura 1. Diagrama de transición de estados del flujo de compra de SauceDemo (elaboración propia).*

Criterio de cobertura: TODAS las transiciones válidas (T1 a T15) y la inválida (T16) deben quedar cubiertas por al menos un caso:

| **Transición** | **Casos que la cubren** | **Transición** | **Casos que la cubren** |
| --- | --- | --- | --- |
| T1 login válido | CP-01 | T9 Cancel (información) | CP-20 |
| T2 login inválido | CP-02 a CP-05 | T10 dato vacío | CP-16, CP-17, CP-18 |
| T3 agregar | CP-12, CP-13 | T11 Continue | CP-15, CP-19 |
| T4 quitar último | CP-12 | T12 Cancel (resumen) | CP-21 |
| T5 abrir carrito | CP-14, CP-15 | T13 Finish | CP-15 |
| T6 quitar en carrito | CP-14 | T14 Back Home | CP-15 |
| T7 Continue Shopping | CP-14 | T15 Logout | CP-24 |
| T8 Checkout | CP-15 | T16 inválida (sin sesión) | CP-06 |

Cobertura de transiciones = 16 ÷ 16 × 100 = 100 %.

## **5.5 · Caso de uso: comprar productos (flujo principal y alternos)**

**Flujo principal (nivel de aceptación):** el usuario inicia sesión, agrega Sauce Labs Backpack ($29.99) y Sauce Labs Bike Light ($9.99), revisa el carrito, ingresa sus datos, verifica el resumen y finaliza. Aquí se valida además la SALIDA EXTERNA con cálculo que contamos en los puntos de función (EO-1, S11):

Item total = 29,99 + 9,99 = $39.98 · Tax (8 %) = 39,98 × 0,08 = 3,198 ≈ $3.20 · Total = 39,98 + 3,20 = $43.18

**Flujos alternos:** A1 — cancelar en la información (vuelve al carrito, CP-20); A2 — cancelar en el resumen (vuelve al catálogo y conserva el carrito, CP-21); A3 — dato obligatorio vacío (mensaje de error y no avanza, CP-16 a CP-18).

## **5.6 · Técnicas basadas en la experiencia**

**a) Adivinación de errores.** Lista de «sospechas» típicas de una tienda en línea, convertidas en casos: nombre escrito solo con espacios (CP-22); usuarios con comportamiento anómalo, como problem\_user, en el checkout (CP-23); volver con el botón Atrás del navegador después de cerrar sesión (CP-24); restablecer el estado de la aplicación con productos en el carrito (CP-25); imágenes que no corresponden al producto (CP-08).

**b) Sesión de prueba exploratoria.** Se organiza con un CHARTER (objetivo), un tiempo fijo y una hoja de notas (Bach, 2000). Sus hallazgos alimentan el KPI-7 de la S12 (los defectos «escapados») y, si son útiles, se convierten en casos formales:

| **Campo** | **Sesión exploratoria SE-01** |
| --- | --- |
| Charter | Explorar el ordenamiento y el checkout con error\_user y problem\_user para descubrir fallos en formularios y listas. |
| Duración y tester | 45 minutos · Integrante 2. |
| Áreas recorridas | Selector de orden, formulario de información, resumen de la orden. |
| Notas | Qué se probó, qué se observó y qué llamó la atención (en orden cronológico). |
| Defectos encontrados | Se registran con ID en el registro de defectos. |
| Preguntas / ideas | Dudas sobre el comportamiento esperado y nuevos casos a diseñar. |

**c) Checklist.** Para el aspecto visual y la usabilidad (CP-08) reutilizamos la lista de verificación del Avance 1, complementada con heurísticas de usabilidad de Nielsen (visibilidad del estado, mensajes de error claros, consistencia).

## **5.7 · Matriz de casos de prueba manuales de SauceDemo**

Resultado de aplicar las técnicas: 26 casos manuales. «Auto» indica si es candidato a automatizarse más adelante (Sí), si debe quedarse manual (No) o si se decide tras ejecutarlo (Evaluar).

| **ID** | **Caso de prueba** | **Técnica** | **Nivel · Tipo** | **Prioridad** | **Auto** |
| --- | --- | --- | --- | --- | --- |
| CP-01 | Login válido con standard\_user | TD-R5 / PE | Sistema · Funcional | Alta | Sí |
| CP-02 | Login con usuario vacío | TD-R1 / PE | Sistema · Funcional | Media | Sí |
| CP-03 | Login con clave vacía | TD-R2 / PE | Sistema · Funcional | Media | Sí |
| CP-04 | Login con clave incorrecta | TD-R3 / PE | Sistema · Seguridad | Alta | Sí |
| CP-05 | Login con usuario bloqueado | TD-R4 / PE | Sistema · Seguridad | Alta | Sí |
| CP-06 | Entrar a /inventory.html sin sesión | TE (inválida) | Sistema · Seguridad | Alta | Sí |
| CP-07 | Ver el detalle de un producto y volver | Escenario | Sistema · Funcional | Media | Sí |
| CP-08 | Imágenes del catálogo con problem\_user | Checklist / adivinación | Sistema · Usabilidad | Media | No |
| CP-09 | Ordenar por precio (menor a mayor) | PE | Sistema · Funcional | Alta | Sí |
| CP-10 | Ordenar por nombre (Z a A) | PE | Sistema · Funcional | Baja | Sí |
| CP-11 | Carrito vacío no muestra contador | AVL (0) | Sistema · Funcional | Media | Sí |
| CP-12 | Agregar 1 producto y quitarlo desde el catálogo | AVL (1) / TE | Sistema · Funcional | Alta | Sí |
| CP-13 | Agregar los 6 productos | AVL (máximo) | Sistema · Funcional | Media | Sí |
| CP-14 | Quitar desde el carrito y seguir comprando | TE | Integración · Funcional | Media | Sí |
| CP-15 | Compra completa de 2 productos con totales | Caso de uso / TE | Aceptación · Funcional | Alta | Sí |
| CP-16 | Checkout con nombre vacío | PE / AVL (0) | Sistema · Funcional | Media | Sí |
| CP-17 | Checkout con apellido vacío | PE / AVL (0) | Sistema · Funcional | Media | Sí |
| CP-18 | Checkout con código postal vacío | PE / AVL (0) | Sistema · Funcional | Media | Sí |
| CP-19 | Checkout con datos de 1 carácter | AVL (1) | Sistema · Funcional | Baja | Sí |
| CP-20 | Cancelar en la información vuelve al carrito | TE | Sistema · Funcional | Baja | Sí |
| CP-21 | Cancelar en el resumen conserva el carrito | TE | Sistema · Funcional | Media | Sí |
| CP-22 | Nombre escrito solo con espacios | Adivinación | Sistema · Usabilidad | Baja | Evaluar |
| CP-23 | Checkout completo con problem\_user | Adivinación / exploratoria | Sistema · Funcional | Alta | No |
| CP-24 | Cerrar sesión y usar el botón Atrás | TE / adivinación | Sistema · Seguridad | Media | Sí |
| CP-25 | Reset App State con productos en el carrito | Adivinación | Sistema · Funcional | Media | Sí |
| CP-26 | Tiempo de login con performance\_glitch\_user | Medición (no funcional) | Sistema · Desempeño | Media | Sí |

**Suites que salen de la matriz:** suite de HUMO = CP-01, CP-12 y CP-15 (se corre primero en cada ciclo); suite de REGRESIÓN = los 8 casos de prioridad alta; casos que se quedan MANUALES = CP-08 y CP-23 (requieren juicio visual o exploración) y CP-22 (se decide tras ejecutarlo).

## **5.8 · Casos en formato detallado (ejemplos)**

| **Campo** | **CP-15 · Compra completa de 2 productos con verificación de totales** |
| --- | --- |
| Trazabilidad | F5 Checkout · EO-1 de los PF (S11) · Adecuación funcional (corrección funcional). |
| Técnica · Nivel · Tipo · Prioridad | Caso de uso (flujo principal) y TE (T5, T8, T11, T13, T14) · Aceptación · Funcional · Alta. |
| Precondiciones | Navegador con caché limpia; sesión iniciada con standard\_user; carrito vacío (aplicar Reset App State si es necesario). |
| Datos de prueba | Productos: Sauce Labs Backpack ($29.99) y Sauce Labs Bike Light ($9.99). First Name: Ana · Last Name: Pérez · Zip/Postal Code: 230001. |
| Pasos | 1) Clic en «Add to cart» de Sauce Labs Backpack. 2) Clic en «Add to cart» de Sauce Labs Bike Light. 3) Clic en el ícono del carrito. 4) Clic en «Checkout». 5) Escribir los datos de prueba. 6) Clic en «Continue». 7) Revisar el resumen. 8) Clic en «Finish». 9) Clic en «Back Home». |
| Resultado esperado | Paso 3: el carrito lista los 2 productos. Paso 7: Item total $39.98, Tax $3.20, Total $43.18. Paso 8: mensaje «Thank you for your order!». Paso 9: vuelve al catálogo sin contador en el carrito. |
| Al ejecutar (S15) | Resultado obtenido · Pasa/Falla · Captura de los pasos 7 y 8 · ID de defecto si falla. |

| **Campo** | **CP-06 · Intentar entrar al catálogo sin iniciar sesión** |
| --- | --- |
| Trazabilidad | F1 Login / control de acceso · Seguridad (confidencialidad, autenticidad). |
| Técnica · Nivel · Tipo · Prioridad | Transición de estados (transición inválida T16) · Sistema · Seguridad · Alta. |
| Precondiciones | No hay sesión iniciada (ventana de incógnito). |
| Datos de prueba | URL: https://www.saucedemo.com/inventory.html |
| Pasos | 1) Abrir una ventana de incógnito. 2) Escribir la URL de prueba en la barra de direcciones. 3) Presionar Enter. |
| Resultado esperado | No se muestra el catálogo; el sitio queda en la página de login con el mensaje «Epic sadface: You can only access '/inventory.html' when you are logged in.» |
| Al ejecutar (S15) | Resultado obtenido · Pasa/Falla · Captura de la pantalla final · ID de defecto si falla. |

## **5.9 · Cobertura de la suite y actualización de los KPI**

| **Función** | **Casos** | **N.º de casos** | **Técnicas** |
| --- | --- | --- | --- |
| F1 · Login | CP-01 a CP-06, CP-26 | 7 | TD, PE, TE, medición |
| F2 · Catálogo y detalle | CP-07, CP-08 | 2 | Escenario, checklist |
| F3 · Ordenar el catálogo | CP-09, CP-10 | 2 | PE |
| F4 · Carrito | CP-11 a CP-14 | 4 | AVL, TE |
| F5 · Checkout | CP-15 a CP-23 | 9 | Caso de uso, PE, AVL, TE, adivinación |
| F6 · Menú | CP-24, CP-25 | 2 | TE, adivinación |
| **Total** |  | **26** |  |

Con la nueva suite, la cobertura funcional pasa de 5 ÷ 6 (83,3 %) a 6 ÷ 6 × 100 = 100 %, y el KPI-6 del tablero de la S12 pasa de amarillo a VERDE. La cobertura de reglas del login (5 ÷ 5) y de transiciones (16 ÷ 16) también es del 100 %. Los casos diseñados pasan de 20 a 26, así que la tasa de ejecución (KPI-5) se recalculará sobre 26 en la S15. Hay 23 casos candidatos a automatizar: alcanzar la meta del KPI-8 (≥ 50 %) exige automatizar al menos 13.

## **5.10 · Enlace con lo que ya hicimos y lo que viene**

La suite cierra varios hilos del semestre: aplica el modelo en V y las actividades de V&V de la S5; cada caso se ancla a una característica de ISO 25010 (S8); la tabla de decisión confirma el V(G) = 5 del login (S11); y la cobertura completa responde al plan de acción del tablero de la S12. Lo que sigue: en la S14 los casos de prioridad alta serán la base de los criterios de aceptación y del cronograma del plan de calidad; y en la S15 se ejecutará la suite manual (pasa/falla con evidencias) y se automatizarán los candidatos elegidos.

## **5.11 · Conclusión (párrafo modelo, adaptable)**

*«Para SauceDemo diseñamos una suite de 26 casos de prueba manuales, principalmente de nivel de sistema y aceptación, que cubren pruebas funcionales y no funcionales (seguridad, usabilidad y desempeño). Los casos se obtuvieron con técnicas formales: una tabla de decisión para el login, cuyas 5 reglas coinciden con la complejidad ciclomática calculada en la S11; partición de equivalencia y valores límite para el formulario de checkout, el carrito y el ordenamiento; un diagrama de transición de estados con 16 transiciones para el flujo de compra; un caso de uso que verifica el cálculo de los totales; y técnicas basadas en la experiencia (adivinación de errores, sesión exploratoria y checklist). La suite alcanza una cobertura del 100 % de las funciones, reglas y transiciones, lleva el KPI de cobertura a verde y deja identificados 23 casos candidatos a automatizar para la S15.»*

# **6 · Plantilla de replicación — Ahora con TU sitio**

Repite la misma estructura con el sitio que te tocó. Completa:

* Mapa de pruebas: funciones del alcance con su nivel, tipos y técnicas (como 5.1).
* Partición de equivalencia y valores límite de al menos dos entradas de tu sitio, con sus clases y valores elegidos (como 5.2).
* Una tabla de decisión de una función con reglas combinadas (como 5.3).
* Un diagrama de transición de estados de tu flujo principal con la tabla de cobertura de transiciones (como 5.4).
* Un caso de uso con flujo principal y alternos (como 5.5) y las técnicas basadas en la experiencia, incluida una sesión exploratoria con su charter (como 5.6).
* La matriz completa de casos manuales (mínimo 20) con técnica, nivel, tipo, prioridad y candidato a automatizar, y las suites de humo y regresión (como 5.7).
* Al menos dos casos en formato detallado (como 5.8), la tabla de cobertura con la actualización de tus KPI (como 5.9) y el párrafo de conclusión (como 5.11).

# **7 · Errores comunes a evitar**

* Escribir casos «por intuición» sin indicar de qué técnica salieron.
* Resultados esperados vagos («funciona bien», «sale un error»): hay que escribir el mensaje, el valor o la página exacta.
* Datos genéricos («un usuario válido») en lugar de valores concretos.
* Casos que prueban varias cosas a la vez: si falla, no se sabe qué falló.
* Probar solo el «camino feliz»: sin clases inválidas, límites ni transiciones inválidas.
* Confundir nivel con tipo (p. ej. decir que «regresión» es un nivel).
* Declarar pruebas unitarias o de componente de un sitio cuyo código no tenemos.
* Marcar todo como «automatizable»: lo visual y lo exploratorio requiere juicio humano.
* No actualizar la cobertura ni los KPI de la S12 con la nueva suite.

# **8 · Glosario breve**

* Prueba manual: ejecutada por una persona que sigue pasos y compara el resultado obtenido con el esperado.
* Nivel de prueba: parte del sistema que se prueba (componente, integración, sistema, aceptación).
* Tipo de prueba: objetivo de la prueba (funcional, no funcional, humo, confirmación, regresión).
* Caja negra / caja blanca: diseño desde el comportamiento esperado / desde la estructura interna.
* Partición de equivalencia: división de los datos en clases que el sistema trata igual.
* Análisis de valores límite: prueba de los valores en los bordes de las clases.
* Tabla de decisión: tabla de combinaciones de condiciones (reglas) y sus resultados.
* Transición de estados: técnica que prueba los cambios de estado provocados por eventos.
* Adivinación de errores: técnica que usa la experiencia para anticipar fallos típicos.
* Prueba exploratoria / charter: diseño y ejecución simultáneos guiados por un objetivo y un tiempo fijo.
* Suite de humo / de regresión: conjunto mínimo para validar lo esencial / conjunto que se repite tras cambios.

# **9 · Referencias (APA)**

Bach, J. (2000). Session-based test management. Software Testing and Quality Engineering Magazine, 2(6).

Copeland, L. (2004). A Practitioner's Guide to Software Test Design. Artech House.

ISO/IEC/IEEE. (2021). ISO/IEC/IEEE 29119-3:2021 — Software and systems engineering — Software testing — Part 3: Test documentation. ISO/IEC/IEEE.

ISO/IEC/IEEE. (2021). ISO/IEC/IEEE 29119-4:2021 — Software and systems engineering — Software testing — Part 4: Test techniques. ISO/IEC/IEEE.

ISTQB. (2023). Certified Tester Foundation Level Syllabus (v4.0). International Software Testing Qualifications Board.

Kaner, C., Bach, J., & Pettichord, B. (2002). Lessons Learned in Software Testing. Wiley.

Myers, G. J., Sandler, C., & Badgett, T. (2011). The Art of Software Testing (3.ª ed.). Wiley.

Nielsen, J. (1993). Usability Engineering. Academic Press.

Pressman, R. S., & Maxim, B. R. (2020). Software Engineering: A Practitioner's Approach (9.ª ed.). McGraw-Hill.