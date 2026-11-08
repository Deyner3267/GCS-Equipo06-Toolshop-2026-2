**Modelo guía — Apartado 11 (Semana 11)**

Métricas de producto: tamaño (LOC y puntos de función) y complejidad ciclomática

**Caso de ejemplo: SauceDemo (saucedemo.com)**

Gestión y Calidad del Software · UCC · 2026-2 · Docente: Andrea Paternina

*Este es el modelo que construimos en clase sobre SauceDemo. Cada equipo lo REPLICA con su sitio asignado (AutomationExercise, Toolshop, ParaBank, DemoBlaze, ExpandTesting, DemoQA, OrangeHRM, BStackDemo). Objetivo del apartado (Avance 3, punto 1): CALCULAR las métricas de producto del sitio —su TAMAÑO con líneas de código (LOC) y puntos de función (PF), y su COMPLEJIDAD con la complejidad ciclomática de McCabe— mostrando el conteo, la fórmula y el cálculo paso a paso, e interpretando qué dicen sobre la calidad del sitio. No basta con definirlas: hay que contarlas en nuestro sitio y usarlas para normalizar los defectos de la S10 y orientar los casos de prueba.*

**Importante (lo más evaluado): cada métrica de producto debe mostrar (1) los DATOS de entrada (el conteo), (2) la FÓRMULA, (3) el CÁLCULO paso a paso, (4) el VALOR y (5) qué SIGNIFICA para la calidad. Y ser honestos con lo que se puede medir en un sitio de terceros: los PUNTOS DE FUNCIÓN sí se cuentan desde la interfaz; la COMPLEJIDAD se calcula sobre el flujo observado o sobre nuestros scripts; las LOC solo se CUENTAN sobre código al que tengamos acceso real (nuestros scripts o un repositorio público) y, si no, se ESTIMAN a partir de los PF diciendo que es una estimación. Presentar LOC «inventadas» del sitio baja el nivel.**

# **1 · Objetivo del apartado**

En la Semana 10 definimos y calculamos métricas directas e indirectas a partir de las pruebas (casos ejecutados, defectos, % de casos exitosos, densidad de defectos por caso). Quedó una pregunta abierta: ¿6 defectos son muchos o pocos? Depende del TAMAÑO del software. Esta semana medimos el PRODUCTO en sí: qué tan grande es (LOC y puntos de función) y qué tan complejo es su comportamiento (complejidad ciclomática). El objetivo del apartado es calcular estas tres métricas para nuestro sitio, usarlas para normalizar los defectos (defectos por PF o por KLOC) y aprovechar la complejidad para saber cuántos casos de prueba mínimos necesita cada flujo. Estas métricas alimentan el tablero de KPI de la S12 y el diseño de casos de la S13.

# **2 · Marco conceptual: métricas de producto**

## **2.1 · ¿Qué es una métrica de producto?**

Es la que mide un atributo del software mismo (no del proceso ni del proyecto, que veremos en la S12). Las más usadas miden dos atributos internos: el TAMAÑO (cuánto software hay) y la COMPLEJIDAD (qué tan difícil es entenderlo, probarlo y mantenerlo). Se relacionan con ISO/IEC 25010 sobre todo a través de la Mantenibilidad (analizabilidad, modificabilidad, capacidad de prueba) y sirven de base para normalizar otras métricas de calidad.

| **Métrica** | **Qué mide** | **Enfoque** | **Tipo (regla de la S10)** |
| --- | --- | --- | --- |
| Líneas de código (LOC / KLOC) | Tamaño físico del código fuente | Orientada al tamaño (vista del programador) | Directa: se cuentan líneas |
| Puntos de función (PF) | Tamaño funcional: cuánta funcionalidad entrega el software al usuario | Orientada a la función (vista del usuario) | Indirecta: se calcula con conteos, pesos y factores |
| Complejidad ciclomática V(G) | N.º de caminos independientes en la lógica de un flujo o módulo | Orientada a la estructura (lógica de control) | Indirecta: se calcula con una fórmula sobre el grafo |

## **2.2 · Líneas de código (LOC)**

Es la métrica de tamaño más antigua: contar las líneas del código fuente. Se expresa en LOC o en KLOC (miles de líneas). Parece simple, pero hay que DECLARAR la regla de conteo, porque no todas las líneas cuentan igual (Park, 1992):

| **Tipo de línea** | **¿Se cuenta?** | **Comentario** |
| --- | --- | --- |
| Líneas físicas totales | Sí (LOC físicas) | Todo lo que hay en el archivo, incluidas líneas en blanco y comentarios. |
| Líneas en blanco | No (en NCLOC) | No aportan funcionalidad. |
| Comentarios | No (en NCLOC) | Se reportan aparte: sirven para medir documentación del código. |
| Código no comentado (NCLOC) | Sí | La medida más usada: líneas con código real. |
| Sentencias lógicas | Sí (LOC lógicas) | Instrucciones ejecutables (p. ej. las que terminan en «;» en Java), sin importar cuántas líneas ocupen. |

**Ventajas:** fácil de contar con herramientas (cloc, plugins del IDE) y muy usada en estudios históricos (densidad de defectos por KLOC). **Limitaciones:** depende del lenguaje y del estilo del programador; un programa bien diseñado y corto «parece» más pequeño; solo existe cuando el código ya está escrito; y en sitios web el código que llega al navegador suele estar minificado (todo en una línea), así que contar sus líneas no tiene sentido.

**¿Cómo la aplicamos en un sitio de terceros?** Tres opciones, en este orden: (a) contar las LOC de NUESTROS scripts de prueba automatizada (es código real que sí controlamos); (b) si el sitio tiene un repositorio público, contar su código con cloc; (c) si no hay acceso al código, ESTIMAR las LOC a partir de los puntos de función (técnica de conversión o backfiring, ver 2.3) y decir explícitamente que es una estimación.

## **2.3 · Puntos de función (PF)**

Propuestos por Albrecht (IBM, 1979) y estandarizados por el IFPUG (ISO/IEC 20926), miden el tamaño FUNCIONAL: cuánta funcionalidad entrega el software al usuario, independientemente del lenguaje en que esté escrito. Por eso son ideales para nuestro proyecto: se cuentan observando la interfaz y el comportamiento del sitio, sin ver el código. Se cuentan cinco tipos de componentes:

| **Componente** | **Sigla** | **Qué es** | **Ejemplo típico en un sitio web** |
| --- | --- | --- | --- |
| Entrada externa | EI | Datos que el usuario ingresa y que modifican información del sistema. | Formulario de login, agregar al carrito, formulario de envío. |
| Salida externa | EO | Información que el sistema entrega con algún CÁLCULO o procesamiento. | Resumen de la orden con subtotal, impuesto y total. |
| Consulta externa | EQ | Petición que recupera y muestra datos SIN cálculos. | Ver catálogo, ver detalle de un producto. |
| Archivo lógico interno | ILF | Grupo de datos que el propio sistema mantiene. | Carrito de compras, datos de usuarios. |
| Archivo de interfaz externo | EIF | Grupo de datos que el sistema solo LEE de otro sistema. | Pasarela de pago externa, API de envíos. |

El cálculo tiene tres pasos: (1) contar los componentes y clasificarlos como simples, medios o complejos para obtener los puntos de función NO ajustados (PFNA); (2) calificar 14 características generales del sistema de 0 a 5 para obtener el factor de ajuste (VAF); (3) multiplicar.

PFNA = Σ (cantidad de cada componente × su peso) · VAF = 0,65 + 0,01 × ΣFi · PF = PFNA × VAF

Como ΣFi va de 0 a 70, el VAF va de 0,65 a 1,35: el ajuste puede bajar o subir el tamaño hasta un 35 %. Con los PF se normalizan los defectos (defectos por PF) y, si se necesita, se estiman las LOC multiplicando los PF por un factor de conversión del lenguaje (backfiring). Para JavaScript, las tablas de conversión que reporta Pressman dan valores del orden de 50 LOC por PF; es una cifra APROXIMADA y debe presentarse como estimación.

## **2.4 · Complejidad ciclomática (McCabe)**

Propuesta por Thomas McCabe (1976), mide la complejidad LÓGICA de un flujo o módulo: el número de caminos linealmente independientes que hay en él. Se calcula sobre un GRAFO DE FLUJO, donde los NODOS son acciones o decisiones y las ARISTAS son el paso de una a otra. Cada decisión (si/no) abre un camino nuevo. Hay tres formas de calcularla y las tres deben dar lo mismo:

V(G) = E − N + 2 (E = aristas, N = nodos) · V(G) = P + 1 (P = nodos de decisión) · V(G) = número de regiones del grafo

Su gran utilidad para QA es que V(G) indica el NÚMERO MÍNIMO DE CASOS DE PRUEBA necesarios para recorrer todos los caminos independientes del flujo (prueba del camino básico, Watson y McCabe, 1996). Así la métrica de producto se convierte directamente en diseño de pruebas. Como no tenemos el código del sitio, la aplicamos sobre el FLUJO OBSERVADO (las decisiones que el sitio toma según lo que ingresamos: campos vacíos, credenciales, tipo de usuario) y sobre el código de nuestros scripts.

# **3 · Tablas de criterios (pesos, factores y umbrales)**

**Tabla A — Pesos de los componentes de PF (IFPUG).** Regla simplificada para el curso para clasificar: SIMPLE si el componente maneja pocos datos (hasta unos 4 campos) y un solo grupo de datos; MEDIO si maneja más campos (5 a 15) o dos grupos de datos; COMPLEJO si maneja muchos campos o varios grupos de datos.

| **Componente** | **Simple** | **Medio** | **Complejo** |
| --- | --- | --- | --- |
| Entrada externa (EI) | 3 | 4 | 6 |
| Salida externa (EO) | 4 | 5 | 7 |
| Consulta externa (EQ) | 3 | 4 | 6 |
| Archivo lógico interno (ILF) | 7 | 10 | 15 |
| Archivo de interfaz externo (EIF) | 5 | 7 | 10 |

**Tabla B — Las 14 características generales del sistema (Fi).** Cada una se califica de 0 (sin influencia) a 5 (influencia esencial): 0 = ninguna, 1 = incidental, 2 = moderada, 3 = media, 4 = significativa, 5 = esencial.

| **N.º** | **Característica** | **Pregunta guía** |
| --- | --- | --- |
| 1 | Comunicación de datos | ¿Usa comunicaciones (red, web) para intercambiar datos? |
| 2 | Procesamiento distribuido | ¿Hay funciones distribuidas entre varios equipos/servidores? |
| 3 | Rendimiento | ¿El tiempo de respuesta es crítico para el usuario? |
| 4 | Configuración muy utilizada | ¿Corre en un entorno de hardware muy cargado? |
| 5 | Tasa de transacciones | ¿Maneja muchas transacciones por periodo? |
| 6 | Entrada de datos en línea | ¿Los datos se ingresan en línea (formularios)? |
| 7 | Eficiencia del usuario final | ¿Se diseñó para que el usuario trabaje rápido y fácil? |
| 8 | Actualización en línea | ¿Los datos internos se actualizan en línea? |
| 9 | Procesamiento complejo | ¿Hay cálculos o lógica compleja? |
| 10 | Reusabilidad | ¿El código se diseñó para reutilizarse? |
| 11 | Facilidad de instalación | ¿Requiere instalación o conversión especial? |
| 12 | Facilidad de operación | ¿Tiene respaldo, recuperación o arranque automático? |
| 13 | Múltiples sitios | ¿Debe funcionar en varios entornos/organizaciones? |
| 14 | Facilidad de cambio | ¿Se diseñó para facilitar cambios? |

**Tabla C — Interpretación de la complejidad ciclomática (McCabe / SEI).**

| **V(G)** | **Complejidad** | **Riesgo para probar y mantener** |
| --- | --- | --- |
| 1 – 10 | Baja: flujo simple y bien estructurado | Bajo |
| 11 – 20 | Moderada | Medio |
| 21 – 50 | Alta | Alto: difícil de probar completamente |
| Más de 50 | Muy alta: prácticamente no se puede probar | Muy alto |

# **4 · Método paso a paso (6 pasos)**

Paso 1 — Haz el INVENTARIO de funciones de tu sitio recorriendo la interfaz (usa las funciones del alcance de la S10) y clasifica cada una como EI, EO, EQ, ILF o EIF.

Paso 2 — Asigna a cada componente su complejidad (simple, medio, complejo) con la Tabla A y calcula los PFNA.

Paso 3 — Califica las 14 características generales (Tabla B) justificando cada valor, calcula el VAF y luego los PF ajustados.

Paso 4 — LOC: cuenta las LOC de tus scripts de prueba (o del repositorio público del sitio, si existe) declarando la regla de conteo; si no hay código accesible, estima las LOC desde los PF y dilo explícitamente.

Paso 5 — COMPLEJIDAD: elige uno o dos flujos con decisiones (login, formulario, búsqueda), dibuja su grafo de flujo, calcula V(G) con al menos dos fórmulas, lista los caminos independientes y conviértelos en casos de prueba.

Paso 6 — NORMALIZA e INTERPRETA: calcula defectos por PF (y por KLOC si estimaste LOC) con los defectos de la S10, relaciona cada métrica con ISO 25010 y di qué significa para tu sitio. Esta integración da el nivel relacional.

# **5 · Ejemplo trabajado: SauceDemo**

## **5.1 · Inventario y conteo de puntos de función**

Recorrimos SauceDemo con standard\_user y clasificamos cada función que observamos:

| **Componente** | **Función observada en SauceDemo** | **Complejidad** | **Peso** |
| --- | --- | --- | --- |
| EI-1 | Iniciar sesión (usuario y clave) | Simple | 3 |
| EI-2 | Agregar producto al carrito | Simple | 3 |
| EI-3 | Quitar producto del carrito | Simple | 3 |
| EI-4 | Ingresar datos de envío (nombre, apellido, código postal) | Medio | 4 |
| EI-5 | Finalizar la compra (Finish) | Medio | 4 |
| EI-6 | Cerrar sesión / Reset App State (menú) | Simple | 3 |
| EO-1 | Resumen de la orden (calcula subtotal, impuesto y total) | Medio | 5 |
| EO-2 | Confirmación de la orden | Simple | 4 |
| EO-3 | Mensajes de error de validación (login y checkout) | Simple | 4 |
| EQ-1 | Ver catálogo de productos | Simple | 3 |
| EQ-2 | Ordenar el catálogo (nombre y precio) | Simple | 3 |
| EQ-3 | Ver detalle de un producto | Simple | 3 |
| EQ-4 | Ver el carrito | Simple | 3 |
| ILF-1 | Carrito de compras (productos seleccionados) | Simple | 7 |
| ILF-2 | Catálogo de productos (nombre, descripción, precio, imagen) | Simple | 7 |
| ILF-3 | Usuarios y sus perfiles de comportamiento | Simple | 7 |
| EIF | No se observan datos leídos de sistemas externos | — | 0 |

| **Componente** | **Cantidad** | **Cálculo** | **Subtotal** |
| --- | --- | --- | --- |
| EI | 6 | 3 + 3 + 3 + 4 + 4 + 3 | 20 |
| EO | 3 | 5 + 4 + 4 | 13 |
| EQ | 4 | 3 + 3 + 3 + 3 | 12 |
| ILF | 3 | 7 + 7 + 7 | 21 |
| EIF | 0 | — | 0 |
| **PFNA (total no ajustado)** | **16** |  | **66** |

## **5.2 · Características generales del sistema (factor de ajuste)**

| **N.º** | **Característica** | **Fi** | **Justificación en SauceDemo** |
| --- | --- | --- | --- |
| 1 | Comunicación de datos | 3 | Aplicación web: todo pasa por el navegador. |
| 2 | Procesamiento distribuido | 1 | Lógica casi toda en el cliente. |
| 3 | Rendimiento | 3 | El tiempo importa (performance\_glitch\_user lo evidencia). |
| 4 | Configuración muy utilizada | 1 | Sitio de práctica, poca carga. |
| 5 | Tasa de transacciones | 2 | Compras simuladas, volumen bajo. |
| 6 | Entrada de datos en línea | 5 | Todo se ingresa por formularios en línea. |
| 7 | Eficiencia del usuario final | 4 | Flujo de compra corto y directo. |
| 8 | Actualización en línea | 3 | El carrito se actualiza en línea. |
| 9 | Procesamiento complejo | 1 | Solo cálculos simples (impuesto y total). |
| 10 | Reusabilidad | 2 | Componentes repetidos (tarjetas de producto). |
| 11 | Facilidad de instalación | 0 | No requiere instalación. |
| 12 | Facilidad de operación | 3 | Reset App State restaura el estado. |
| 13 | Múltiples sitios | 2 | Debe funcionar en distintos navegadores. |
| 14 | Facilidad de cambio | 2 | Opciones de orden configurables. |
|  | **ΣFi** | **32** |  |

## **5.3 · Cálculo de los puntos de función**

VAF = 0,65 + 0,01 × 32 = 0,65 + 0,32 = 0,97

PF = PFNA × VAF = 66 × 0,97 = 64,02 ≈ 64 PF

Con el tamaño funcional ya podemos NORMALIZAR las métricas de la S10 (6 defectos encontrados, 20 casos diseñados):

| **Métrica derivada** | **Fórmula** | **Cálculo** | **Valor** |
| --- | --- | --- | --- |
| Densidad de defectos por PF | defectos ÷ PF | 6 ÷ 64,02 | 0,094 defectos/PF (≈ 9,4 por cada 100 PF) |
| Casos de prueba por PF | casos diseñados ÷ PF | 20 ÷ 64,02 | 0,31 casos/PF |

## **5.4 · Líneas de código (LOC)**

El código que SauceDemo envía al navegador está empaquetado y minificado, así que contar sus líneas no tendría sentido. Aplicamos las dos opciones válidas: contar las LOC de nuestro propio script de prueba y ESTIMAR las LOC del sitio desde los PF.

**a) Conteo real sobre nuestro script de prueba (Selenium, Java):**

// Prueba automatizada: login válido en SauceDemo

public class LoginTest {

@Test

public void loginValido() {

WebDriver driver = new ChromeDriver();

driver.get("https://www.saucedemo.com/");

// Escribir credenciales y enviar

driver.findElement(By.id("user-name")).sendKeys("standard\_user");

driver.findElement(By.id("password")).sendKeys("secret\_sauce");

driver.findElement(By.id("login-button")).click();

assertTrue(driver.getCurrentUrl().contains("inventory"));

driver.quit();

}

}

| **Medida** | **Regla** | **Valor** |
| --- | --- | --- |
| LOC físicas | Todas las líneas del archivo | 16 |
| Líneas en blanco | Líneas vacías | 2 |
| Líneas de comentario | Líneas que empiezan con // | 2 |
| NCLOC (código real) | 16 − 2 − 2 | 12 |
| LOC lógicas (sentencias) | Instrucciones terminadas en «;» | 7 |
| % de comentarios | 2 ÷ 16 × 100 | 12,5 % |

Cuando el equipo tenga todos sus scripts (S13–S15), se suman las LOC de todos los archivos (a mano o con cloc) y se reporta el total en NCLOC.

**b) Estimación de las LOC del sitio desde los PF (backfiring):**

LOC estimadas ≈ PF × LOC por PF del lenguaje ≈ 64 × 50 ≈ 3.200 LOC ≈ 3,2 KLOC (ESTIMACIÓN, sitio en JavaScript)

Densidad de defectos estimada = 6 defectos ÷ 3,2 KLOC ≈ 1,9 defectos/KLOC

*Nota de rigor: esta cifra NO es un conteo del código real del sitio; es una aproximación útil para comparar con referencias que usan KLOC. Por eso, en el informe, la métrica principal de tamaño es la de PF.*

## **5.5 · Complejidad ciclomática del flujo de login**

Modelamos las decisiones que el login de SauceDemo toma según lo que ingresamos (lo observamos probando con campos vacíos, credenciales erradas, locked\_out\_user y standard\_user):

![](data:image/png;base64...)

*Figura 1. Grafo de flujo del login de SauceDemo (elaboración propia a partir del comportamiento observado).*

**Datos del grafo:** N = 11 nodos (1 a 11); E = 14 aristas (1→2, 2→3, 2→4, 3→11, 4→5, 4→6, 5→11, 6→7, 6→8, 7→11, 8→9, 8→10, 9→11, 10→11); P = 4 nodos de decisión (2, 4, 6 y 8).

V(G) = E − N + 2 = 14 − 11 + 2 = 5 · V(G) = P + 1 = 4 + 1 = 5 · Regiones del grafo = 5 → V(G) = 5 (complejidad baja, Tabla C)

Como V(G) = 5, el login necesita como MÍNIMO 5 casos de prueba para recorrer todos sus caminos independientes:

| **Camino** | **Recorrido (nodos)** | **Caso de prueba que lo cubre** | **Resultado esperado** |
| --- | --- | --- | --- |
| C1 | 1 → 2 → 3 → 11 | Usuario vacío | Mensaje «Username is required» |
| C2 | 1 → 2 → 4 → 5 → 11 | Usuario lleno, clave vacía | Mensaje «Password is required» |
| C3 | 1 → 2 → 4 → 6 → 7 → 11 | Clave incorrecta | Mensaje de credenciales que no coinciden |
| C4 | 1 → 2 → 4 → 6 → 8 → 9 → 11 | locked\_out\_user / secret\_sauce | Mensaje de usuario bloqueado |
| C5 | 1 → 2 → 4 → 6 → 8 → 10 → 11 | standard\_user / secret\_sauce | Ingresa al catálogo |

Aplicando el mismo análisis a otros flujos: el formulario de envío del checkout tiene 3 decisiones (¿nombre vacío?, ¿apellido vacío?, ¿código postal vacío?), así que V(G) = 3 + 1 = 4 y necesita al menos 4 casos. El método loginValido() de nuestro script no tiene decisiones: V(G) = 0 + 1 = 1 (un solo camino), lo esperable en una prueba bien escrita.

## **5.6 · Resumen de las métricas de producto de SauceDemo**

| **Métrica** | **Tipo** | **Valor** | **Característica ISO 25010** | **Qué nos dice** |
| --- | --- | --- | --- | --- |
| Puntos de función | Indirecta | 64 PF | Adecuación funcional (completitud) | Tamaño funcional pequeño: tienda con 16 funciones. |
| LOC del script de prueba | Directa | 12 NCLOC | Mantenibilidad (de nuestras pruebas) | Script corto y legible. |
| LOC estimadas del sitio | Indirecta (estimación) | ≈ 3,2 KLOC | — | Solo para comparar con referencias en KLOC. |
| Densidad de defectos por PF | Indirecta | 0,094 def./PF | Fiabilidad (madurez) | Unos 9 defectos por cada 100 PF. |
| V(G) del login | Indirecta | 5 | Mantenibilidad (capacidad de prueba) | Complejidad baja; 5 casos mínimos. |
| V(G) del checkout (datos) | Indirecta | 4 | Mantenibilidad (capacidad de prueba) | Complejidad baja; 4 casos mínimos. |

## **5.7 · Interpretación (párrafo modelo, adaptable)**

*«SauceDemo tiene un tamaño funcional de 64 puntos de función (66 PF no ajustados y un factor de ajuste de 0,97), lo que corresponde a una aplicación pequeña de 16 funciones. Como no tenemos acceso a su código fuente, sus LOC se estimaron en unas 3,2 KLOC a partir de los PF, y contamos las LOC reales de nuestro script de prueba (12 NCLOC). Normalizando los 6 defectos de la S10, obtenemos una densidad de 0,094 defectos por PF (≈ 1,9 defectos por KLOC estimada). La complejidad ciclomática del login es 5 y la del formulario de envío es 4, ambas bajas según McCabe, lo que indica flujos fáciles de probar: el login requiere al menos 5 casos y el checkout 4, que incorporamos a nuestra matriz. Estas métricas de producto serán parte del tablero de KPI de la S12.»*

# **6 · Plantilla de replicación — Ahora con TU sitio**

Repite la misma estructura con el sitio que te tocó. Completa:

* Inventario de funciones clasificadas en EI, EO, EQ, ILF y EIF con su complejidad y peso, y la tabla de PFNA (como 5.1).
* Las 14 características generales calificadas y justificadas, ΣFi, VAF y PF ajustados (como 5.2 y 5.3).
* Defectos por PF y casos por PF usando tus datos de la S10 (como 5.3).
* LOC: conteo real sobre tu script (o repositorio público) con la regla declarada, y/o estimación desde los PF marcada como estimación (como 5.4).
* Grafo de flujo de al menos un flujo de tu sitio, V(G) con dos fórmulas y la tabla de caminos convertidos en casos de prueba (como 5.5).
* Tabla resumen con tipo, valor, característica ISO 25010 e interpretación, y el párrafo final (como 5.6 y 5.7).

# **7 · Errores comunes a evitar**

* Dar valores sin mostrar el conteo y el cálculo paso a paso (PFNA, VAF, PF; E, N, P).
* Contar las LOC del código minificado del navegador o «inventar» las LOC del sitio. Si se estiman desde los PF, hay que decirlo.
* Confundir EO con EQ: si hay CÁLCULO (p. ej. totales), es salida externa; si solo se muestran datos, es consulta.
* Calificar las 14 características sin justificar, o poner todas en 5 «por si acaso».
* Calcular V(G) con una sola fórmula y no verificarla con otra (si no coinciden, el grafo está mal dibujado).
* No conectar V(G) con los casos de prueba: su mayor valor es decir cuántos casos mínimos necesita cada flujo.
* No normalizar los defectos de la S10 con el tamaño (defectos por PF) ni relacionar las métricas con ISO 25010.

# **8 · Glosario breve**

* Métrica de producto: mide un atributo del software mismo (tamaño, complejidad).
* LOC / KLOC: líneas de código / miles de líneas de código.
* NCLOC: líneas de código sin contar comentarios ni líneas en blanco.
* Punto de función (PF): unidad de tamaño funcional basada en lo que el software entrega al usuario.
* PFNA: puntos de función no ajustados (conteo × pesos).
* VAF: factor de ajuste del valor, 0,65 + 0,01 × ΣFi.
* EI / EO / EQ / ILF / EIF: entrada, salida y consulta externas; archivo lógico interno; archivo de interfaz externo.
* Backfiring: estimar LOC multiplicando los PF por un factor del lenguaje.
* Complejidad ciclomática V(G): número de caminos independientes de un flujo; mínimo de casos para cubrirlos.
* Grafo de flujo: representación de un flujo con nodos (acciones/decisiones) y aristas (transiciones).
* Camino básico: técnica de prueba que diseña un caso por cada camino independiente.

# **9 · Referencias (APA)**

Albrecht, A. J. (1979). Measuring application development productivity. En Proceedings of the Joint SHARE/GUIDE/IBM Application Development Symposium (pp. 83–92). IBM.

Fenton, N., & Bieman, J. (2014). Software Metrics: A Rigorous and Practical Approach (3.ª ed.). CRC Press.

IFPUG. (2010). Function Point Counting Practices Manual (Release 4.3.1). International Function Point Users Group.

ISO/IEC. (2009). ISO/IEC 20926:2009 — Software and systems engineering — Software measurement — IFPUG functional size measurement method 2009. ISO.

ISO/IEC. (2011). ISO/IEC 25010:2011 — Systems and software engineering — SQuaRE — System and software quality models. ISO.

McCabe, T. J. (1976). A complexity measure. IEEE Transactions on Software Engineering, SE-2(4), 308–320.

Park, R. E. (1992). Software Size Measurement: A Framework for Counting Source Statements (CMU/SEI-92-TR-020). Software Engineering Institute.

Pressman, R. S., & Maxim, B. R. (2020). Software Engineering: A Practitioner's Approach (9.ª ed.). McGraw-Hill.

Watson, A. H., & McCabe, T. J. (1996). Structured Testing: A Testing Methodology Using the Cyclomatic Complexity Metric (NIST Special Publication 500-235). National Institute of Standards and Technology.