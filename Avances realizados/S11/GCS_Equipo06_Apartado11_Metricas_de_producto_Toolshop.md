UNIVERSIDAD COOPERATIVA DE COLOMBIA
Facultad de Ingeniería
Gestión y Calidad del Software

**AVANCE 3 · APARTADO 11: Métricas de producto — tamaño (LOC y puntos de función) y complejidad ciclomática**

Sitio asignado: Practice Software Testing (Toolshop) — Tienda virtual de herramientas.

**Equipo 06:**
Camilo Vides
Luis Tapia
Deyner Ortiz

**Docente:** Andrea Paternina

Montería, Córdoba
2026

---

## 1. Introducción y objetivo

En el Avance 2 medimos la calidad de Toolshop a partir de la ejecución de pruebas: 24 casos diseñados, 22 ejecutados, 17 exitosos y 7 defectos documentados. Esas cifras responden a la pregunta de *cuántos* defectos hay, pero dejan abierta otra igual de importante: **¿esos 7 defectos son muchos o pocos?** La respuesta depende del tamaño del software. Un sitio con 7 defectos y 20 funciones tiene un problema serio; el mismo número en un sitio de 200 funciones sería anecdótico.

Este apartado mide el **producto en sí mismo**, no el proceso de pruebas. Calcula tres métricas de producto: el **tamaño físico** con líneas de código (LOC), el **tamaño funcional** con puntos de función (PF) y la **complejidad** con la complejidad ciclomática de McCabe, V(G). Con ellas normalizamos los defectos del Avance 2 (defectos por PF) y convertimos la complejidad en una decisión práctica de diseño de pruebas: cuántos casos mínimos necesita cada flujo.

El objetivo no es solo definir las métricas, sino **calcularlas sobre Toolshop mostrando el conteo, la fórmula, el cálculo paso a paso, el valor y su significado para la calidad**.

## 2. Marco conceptual

### 2.1 Métricas de producto

Son las que miden un atributo del software mismo, a diferencia de las métricas de proceso (cómo trabajamos) y de proyecto (cómo gestionamos el trabajo). Las dos familias más usadas miden el **tamaño** y la **complejidad**, y se relacionan con ISO/IEC 25010 principalmente a través de la **mantenibilidad** (analizabilidad, modificabilidad y capacidad de prueba) y de la **fiabilidad** (madurez).

| Métrica | Qué mide | Enfoque | Tipo |
|---|---|---|---|
| Líneas de código (LOC / KLOC) | Tamaño físico del código fuente | Tamaño | Directa: se cuentan líneas |
| Puntos de función (PF) | Tamaño funcional: cuánta funcionalidad recibe el usuario | Función | Indirecta: conteos × pesos × factor |
| Complejidad ciclomática V(G) | Caminos independientes de un flujo o módulo | Estructura | Indirecta: fórmula sobre el grafo |

### 2.2 Líneas de código (LOC)

Es la métrica de tamaño más antigua: contar las líneas del código fuente. Hay que declarar la regla de conteo, porque no todas las líneas cuentan igual: las **LOC físicas** incluyen todo el archivo; las **NCLOC** excluyen líneas en blanco y comentarios; las **LOC lógicas** cuentan sentencias ejecutables.

Su limitación principal es que depende del lenguaje y del estilo, y que en un sitio web el código que llega al navegador suele estar minificado. Por eso, en un sitio de terceros como Toolshop, solo se pueden **contar** las LOC de código al que tengamos acceso real (nuestros scripts de prueba) o **estimarlas** a partir de los PF, declarando que es una estimación.

### 2.3 Puntos de función (PF)

Propuestos por Albrecht (1979) y estandarizados por el IFPUG (ISO/IEC 20926), miden el tamaño funcional con independencia del lenguaje. Se cuentan cinco tipos de componentes:

| Componente | Sigla | Qué es | Ejemplo en Toolshop |
|---|---|---|---|
| Entrada externa | EI | Datos que el usuario ingresa y modifican el sistema | Login, agregar al carrito, checkout |
| Salida externa | EO | Información con cálculo o procesamiento | Resumen de la orden con subtotal e impuesto |
| Consulta externa | EQ | Petición que recupera y muestra datos sin cálculo | Ver catálogo, ver ficha de producto |
| Archivo lógico interno | ILF | Grupo de datos que el sistema mantiene | Carrito, catálogo, usuarios |
| Archivo de interfaz externo | EIF | Datos que el sistema solo lee de otro sistema | Pasarela de pago externa (no observable) |

El cálculo tiene tres pasos: contar los componentes y clasificarlos en simples, medios o complejos para obtener los **puntos de función no ajustados (PFNA)**; calificar 14 características generales de 0 a 5 para obtener el **factor de ajuste (VAF)**; y multiplicar.

**PFNA = Σ (cantidad × peso)** · **VAF = 0,65 + 0,01 × ΣFi** · **PF = PFNA × VAF**

### 2.4 Complejidad ciclomática (McCabe, 1976)

Mide la complejidad lógica de un flujo: el número de caminos linealmente independientes. Se calcula sobre un grafo donde los nodos son acciones o decisiones y las aristas son las transiciones. Las tres fórmulas deben dar el mismo resultado:

**V(G) = E − N + 2** · **V(G) = P + 1** · **V(G) = número de regiones**

Su valor para QA es directo: **V(G) indica el número mínimo de casos de prueba** necesarios para recorrer todos los caminos independientes (prueba del camino básico). Como no tenemos el código de Toolshop, la aplicamos sobre el **flujo observado** al probar el sitio.

## 3. Metodología

Se siguieron seis pasos: (1) inventariar las funciones observables y clasificarlas como EI, EO, EQ, ILF o EIF; (2) asignar complejidad y peso para calcular el PFNA; (3) calificar las 14 características generales, calcular el VAF y el PF ajustado; (4) contar las LOC reales de un script de prueba y estimar las del sitio desde los PF; (5) modelar el grafo de login y checkout, calcular V(G) con dos fórmulas y derivar los casos de prueba; y (6) normalizar los defectos del Avance 2 y relacionar cada métrica con ISO/IEC 25010.

## 4. Aplicación a Toolshop

### 4.1 Inventario y conteo de puntos de función

El alcance del Avance 2 identificó **12 funciones**, de las cuales **10 quedaron cubiertas** por al menos un caso de prueba (las dos sin cubrir son el registro de usuario y la recuperación de contraseña). Ese alcance se descompone aquí en **23 componentes** de puntos de función.

**Tabla 1. Inventario de componentes funcionales de Toolshop**

| ID | Función observable | Componente | Complejidad | Peso | Justificación |
|---|---|---|---|---|---|
| EI-1 | Iniciar sesión | EI | Simple | 3 | Dos campos (usuario y contraseña), un solo grupo de datos |
| EI-2 | Registro de usuario | EI | Medio | 4 | Siete campos de datos personales |
| EI-3 | Recuperar contraseña | EI | Simple | 3 | Un campo (correo electrónico) |
| EI-4 | Agregar al carrito | EI | Simple | 3 | Una acción que modifica el carrito |
| EI-5 | Modificar cantidad | EI | Simple | 3 | Un campo numérico |
| EI-6 | Eliminar del carrito | EI | Simple | 3 | Una acción que modifica el carrito |
| EI-7 | Datos de facturación | EI | Medio | 4 | Seis campos de dirección |
| EI-8 | Confirmar pago | EI | Medio | 4 | Selección de método y confirmación |
| EI-9 | Cerrar sesión | EI | Simple | 3 | Una acción sobre la sesión |
| EI-10 | Cambiar idioma | EI | Simple | 3 | Una selección de idioma |
| EO-1 | Resumen de la orden | EO | Medio | 5 | Calcula subtotal, impuesto y total |
| EO-2 | Confirmación de la orden | EO | Simple | 4 | Mensaje final con el resultado de la compra |
| EO-3 | Mensajes de validación | EO | Simple | 4 | Salida producida por la lógica de validación (login, checkout y producto agotado) |
| EQ-1 | Ver catálogo | EQ | Simple | 3 | Recupera y muestra productos sin cálculo |
| EQ-2 | Ordenar catálogo | EQ | Simple | 3 | Reordena el listado sin cálculo |
| EQ-3 | Ver ficha de producto | EQ | Simple | 3 | Muestra los datos del producto |
| EQ-4 | Ver carrito | EQ | Simple | 3 | Muestra el contenido del carrito |
| EQ-5 | Ver inventario | EQ | Simple | 3 | Muestra la disponibilidad |
| EQ-6 | Ver categorías y marcas | EQ | Simple | 3 | Muestra el panel de filtros |
| EQ-7 | Aplicar filtros | EQ | Medio | 4 | Recupera el listado según categoría, marca y precio, sin modificar datos |
| ILF-1 | Carrito | ILF | Simple | 7 | Datos que el sistema mantiene entre páginas |
| ILF-2 | Catálogo | ILF | Simple | 7 | Datos de productos y existencias |
| ILF-3 | Usuarios | ILF | Simple | 7 | Datos de cuentas y perfiles |

No se identificó ningún **EIF**: el pago de Toolshop es simulado y no se observa una lectura real de datos desde un sistema externo. Tampoco se contabiliza un ILF «Órdenes», porque desde la caja negra no se puede confirmar que el sitio persista el historial de compras; si lo hiciera, el PF sería mayor.

**Tabla 2. Puntos de función no ajustados (PFNA)**

| Componente | Cantidad | Cálculo | Subtotal |
|---|---|---|---|
| EI | 10 | 3+4+3+3+3+3+4+4+3+3 | 33 |
| EO | 3 | 5+4+4 | 13 |
| EQ | 7 | 3+3+3+3+3+3+4 | 22 |
| ILF | 3 | 7+7+7 | 21 |
| EIF | 0 | — | 0 |
| **PFNA** | **23** | 33+13+22+21+0 | **89** |

### 4.2 Características generales del sistema (factor de ajuste)

**Tabla 3. Calificación de las 14 características generales**

| N.º | Característica | Fi | Justificación en Toolshop |
|---|---|---|---|
| 1 | Comunicación de datos | 3 | Todo el flujo pasa por el navegador y la API del sitio |
| 2 | Procesamiento distribuido | 3 | El catálogo y el inventario se consultan a un backend |
| 3 | Rendimiento | 3 | Tiempos medidos de 2,4 s (catálogo) y 1,6 s (filtro) |
| 4 | Configuración muy utilizada | 1 | Sitio de práctica con poca carga |
| 5 | Tasa de transacciones | 2 | Compras simuladas y volumen bajo |
| 6 | Entrada de datos en línea | 5 | Login, filtros y checkout son formularios en línea |
| 7 | Eficiencia del usuario final | 3 | Flujo de compra directo, aunque afectado por la mezcla de idiomas |
| 8 | Actualización en línea | 3 | El carrito y el inventario se actualizan en línea |
| 9 | Procesamiento complejo | 2 | Solo cálculos simples de impuesto y total |
| 10 | Reusabilidad | 2 | Tarjetas de producto y componentes repetidos |
| 11 | Facilidad de instalación | 0 | No requiere instalación |
| 12 | Facilidad de operación | 2 | Es un entorno de demostración que se restablece |
| 13 | Múltiples sitios | 2 | Debe funcionar en distintos navegadores y resoluciones |
| 14 | Facilidad de cambio | 2 | Catálogo e idioma configurables |
| | **ΣFi** | **33** | |

**VAF = 0,65 + 0,01 × 33 = 0,65 + 0,33 = 0,98**

### 4.3 Cálculo de los puntos de función y normalización

**PF = PFNA × VAF = 89 × 0,98 = 87,22 ≈ 87 PF**

Con el tamaño funcional ya podemos normalizar las métricas del Avance 2:

**Tabla 4. Normalización de los datos del Avance 2**

| Métrica derivada | Fórmula | Cálculo | Valor |
|---|---|---|---|
| Densidad de defectos por PF | defectos ÷ PF | 7 ÷ 87,22 | **0,080 defectos/PF** (≈ 8 por cada 100 PF) |
| Casos de prueba por PF | casos diseñados ÷ PF | 24 ÷ 87,22 | **0,275 casos/PF** |

La lectura es que Toolshop es un sitio de tamaño funcional pequeño-medio (23 componentes, 87 PF) y que sus 7 defectos equivalen a 8 defectos por cada 100 puntos de función. Es una densidad más baja que la de un sitio con el mismo número de defectos pero menor tamaño, aunque sigue siendo un valor que obliga a corregir antes de considerar el flujo de compra aceptable.

### 4.4 Líneas de código (LOC)

El código que Toolshop envía al navegador está empaquetado y minificado, así que contar sus líneas no tendría sentido. Aplicamos las dos opciones válidas: contar las LOC reales de nuestro script de prueba y estimar las LOC del sitio a partir de los PF.

**a) Conteo real sobre un script de prueba (Python + Playwright):**

**Tabla 5. Conteo de LOC del script `script_login_toolshop.py`**

| Medida | Regla | Valor |
|---|---|---|
| LOC físicas | Todas las líneas del archivo | 26 |
| Líneas en blanco | Líneas vacías | 6 |
| Líneas de comentario | Líneas que empiezan con `#` | 3 |
| NCLOC (código real) | 26 − 6 − 3 | **17** |
| LOC lógicas | En Python cada línea de código es una sentencia | **17** |
| % de comentarios | 3 ÷ 26 × 100 | **11,5 %** |

**b) Estimación de las LOC del sitio desde los PF (backfiring):**

**LOC estimadas ≈ PF × 50 ≈ 87,22 × 50 ≈ 4.361 LOC (4,361 KLOC)** (estimación, sitio en JavaScript)

**Densidad de defectos estimada = 7 ÷ 4,36 ≈ 1,61 defectos/KLOC**

*Nota de rigor:* esta cifra **no** es un conteo del código real de Toolshop; es una aproximación para comparar con referencias que usan KLOC. Por eso la métrica principal de tamaño del informe es la de **puntos de función**.

### 4.5 Complejidad ciclomática

#### 4.5.1 Flujo de login

Modelamos las decisiones que toma el login de Toolshop según lo que ingresa el usuario, con base en los casos CP-01, CP-02 y CP-03 del Avance 2.

**Tabla 6. Datos del grafo de login**

| Elemento | Valor |
|---|---|
| N (nodos) | 6 |
| E (aristas) | 8 |
| P (nodos de decisión) | 3 |

Aristas: 1→2, 2→6, 2→3, 3→6, 3→4, 4→6, 4→5, 5→6.

- V(G) = E − N + 2 = 8 − 6 + 2 = **4**
- V(G) = P + 1 = 3 + 1 = **4**
- Regiones del grafo = **4**

Las tres lecturas coinciden: **V(G) = 4**, complejidad **baja** (rango 1–10).

**Tabla 7. Caminos independientes del login convertidos en casos de prueba**

| Camino | Recorrido | Condición | Caso del Avance 2 | Resultado esperado |
|---|---|---|---|---|
| C1 | 1→2→6 | Usuario vacío | CP-03 | Mensaje de campo obligatorio |
| C2 | 1→2→3→6 | Contraseña vacía | CP-03 | Mensaje de campo obligatorio |
| C3 | 1→2→3→4→6 | Credenciales inválidas | CP-02 | Mensaje de credenciales incorrectas |
| C4 | 1→2→3→4→5→6 | Credenciales válidas | CP-01 | Acceso concedido al catálogo |

Como V(G) = 4, el login necesita **mínimo 4 casos**. En la matriz actual, CP-03 cubre dos caminos (usuario vacío y contraseña vacía); para que la cobertura sea explícita conviene **dividir CP-03 en dos ejecuciones** o en dos casos con identificador propio.

#### 4.5.2 Flujo de checkout (datos de facturación)

**Tabla 8. Datos del grafo de checkout**

| Elemento | Valor |
|---|---|
| N (nodos) | 6 |
| E (aristas) | 8 |
| P (nodos de decisión) | 3 |

Aristas: 1→2, 2→6, 2→3, 3→6, 3→4, 4→6, 4→5, 5→6.

- V(G) = E − N + 2 = 8 − 6 + 2 = **4**
- V(G) = P + 1 = 3 + 1 = **4**

El grafo del checkout tiene la misma estructura que el del login (6 nodos, 8 aristas y 3 decisiones), pero las decisiones son distintas: sesión activa, campos obligatorios completos y producto agotado. La coincidencia en V(G) es estructural, no indica que los flujos sean iguales.

**Tabla 9. Caminos independientes del checkout convertidos en casos de prueba**

| Camino | Recorrido | Condición | Caso del Avance 2 | Resultado esperado |
|---|---|---|---|---|
| C1 | 1→2→6 | Sin sesión activa | CP-04 | Redirección al login, sin exponer datos |
| C2 | 1→2→3→6 | Campos obligatorios vacíos | CP-23 | El sistema impide avanzar y señala el campo |
| C3 | 1→2→3→4→6 | Producto agotado | CP-24 | El sistema bloquea la compra y notifica |
| C4 | 1→2→3→4→5→6 | Checkout válido | CP-22 | Avanza al formulario y procesa la compra |

El checkout también requiere **mínimo 4 casos** y su complejidad es **baja**. La diferencia con el login es que aquí las decisiones son de negocio (sesión, datos, disponibilidad), no de credenciales.

### 4.6 Resumen de las métricas de producto

**Tabla 10. Resumen de métricas de producto de Toolshop**

| Métrica | Tipo | Valor | Característica ISO 25010 | Qué nos dice |
|---|---|---|---|---|
| Puntos de función | Indirecta | 87 PF (89 PFNA, VAF 0,98) | Adecuación funcional (completitud) | Tamaño funcional pequeño-medio: 23 componentes |
| LOC del script de prueba | Directa | 17 NCLOC | Mantenibilidad (de nuestras pruebas) | Script corto y legible, con 11,5 % de comentarios |
| LOC estimadas del sitio | Indirecta (estimación) | ≈ 4,36 KLOC | — | Solo para comparar con referencias en KLOC |
| Densidad de defectos por PF | Indirecta | 0,080 def./PF | Fiabilidad (madurez) | 8 defectos por cada 100 PF |
| Densidad estimada por KLOC | Indirecta (estimación) | 1,61 def./KLOC | Fiabilidad (madurez) | Referencia aproximada, no conteo real |
| V(G) del login | Indirecta | 4 | Mantenibilidad (capacidad de prueba) | Complejidad baja; 4 casos mínimos |
| V(G) del checkout | Indirecta | 4 | Mantenibilidad (capacidad de prueba) | Complejidad baja; 4 casos mínimos |

### 4.7 Interpretación

Toolshop tiene un tamaño funcional de **87 puntos de función** (89 PFNA con un factor de ajuste de 0,98), repartidos en **23 componentes** funcionales: 10 entradas, 3 salidas, 7 consultas y 3 archivos lógicos internos. Es un sitio de tamaño pequeño-medio, coherente con una tienda de demostración.

Como no tenemos acceso a su código fuente, las LOC del sitio se **estimaron** en unas **4,36 KLOC** a partir de los PF, mientras que las LOC reales de nuestro script de prueba son **17 NCLOC**. Normalizando los 7 defectos del Avance 2, obtenemos una densidad de **0,080 defectos por PF** (≈ 8 por cada 100 PF) y **0,275 casos por PF**.

La complejidad ciclomática es **4 tanto en el login como en el checkout**, lo que indica flujos **bajos** y fáciles de probar: cada uno necesita al menos 4 casos para cubrir sus caminos independientes. Esa cifra ya está casi cubierta por la matriz del Avance 2; el ajuste pendiente es dividir CP-03 en dos ejecuciones para que los caminos de usuario vacío y contraseña vacía queden explícitos.

## 5. Relación con ISO/IEC 25010

- **Adecuación funcional (completitud):** los 87 PF y los 23 componentes describen cuánta funcionalidad entrega Toolshop; sirven para verificar que el alcance cubra todas las funciones del flujo de compra.
- **Fiabilidad (madurez):** la densidad de 0,080 defectos/PF normaliza los hallazgos del Avance 2 y permite comparar entre rondas y entre módulos.
- **Mantenibilidad (capacidad de prueba):** V(G) = 4 en login y checkout indica flujos simples; también justifica el número mínimo de casos de la matriz y el esfuerzo de automatización.
- **Mantenibilidad (analizabilidad):** las 17 NCLOC del script y su 11,5 % de comentarios muestran un código de prueba corto y legible, fácil de mantener en el Avance 3.

## 6. Conclusiones

Las métricas de producto completan lo que las métricas de proceso del Avance 2 no podían responder: **si 7 defectos son muchos o pocos**. Con un tamaño de 87 PF, la densidad es de 0,080 defectos por PF, un valor que permite comparar a Toolshop consigo mismo en la próxima ronda y con otros sitios de tamaño similar.

El tamaño funcional se pudo calcular **desde la interfaz**, sin ver el código, lo que confirma que los puntos de función son la métrica más adecuada para un proyecto de caja negra. Las LOC del sitio solo se **estimaron** y así se declara; las únicas LOC reales son las de nuestro script.

La complejidad ciclomática aportó el resultado más accionable: login y checkout tienen **V(G) = 4**, es decir, flujos de complejidad baja que exigen **4 casos mínimos cada uno**. Eso nos dice que la matriz del Avance 2 está cerca de la cobertura mínima y que el esfuerzo debe concentrarse en separar los caminos de validación (CP-03) y en mantener la automatización. Estas métricas alimentan el tablero de KPI del Apartado 12 y el diseño de casos por niveles y tipos de la Semana 13.

## Referencias

Albrecht, A. J. (1979). Measuring application development productivity. En *Proceedings of the Joint SHARE/GUIDE/IBM Application Development Symposium* (pp. 83–92). IBM.

Fenton, N., & Bieman, J. (2014). *Software metrics: A rigorous and practical approach* (3.ª ed.). CRC Press.

IFPUG. (2010). *Function point counting practices manual* (Release 4.3.1). International Function Point Users Group.

ISO/IEC. (2009). *ISO/IEC 20926:2009 — Software and systems engineering — Software measurement — IFPUG functional size measurement method 2009*. ISO.

ISO/IEC. (2011). *ISO/IEC 25010:2011 — Systems and software engineering — SQuaRE — System and software quality models*. ISO.

ISO/IEC. (2016). *ISO/IEC 25023:2016 — Systems and software engineering — SQuaRE — Measurement of system and software product quality*. ISO.

McCabe, T. J. (1976). A complexity measure. *IEEE Transactions on Software Engineering, SE-2*(4), 308–320.

Park, R. E. (1992). *Software size measurement: A framework for counting source statements* (CMU/SEI-92-TR-020). Software Engineering Institute.

Pressman, R. S., & Maxim, B. R. (2021). *Ingeniería del software: Un enfoque práctico* (9.ª ed.). McGraw-Hill.

Watson, A. H., & McCabe, T. J. (1996). *Structured testing: A testing methodology using the cyclomatic complexity metric* (NIST Special Publication 500-235). National Institute of Standards and Technology.
