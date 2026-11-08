**Modelo guía — Avance 3 · Apartado «Plan de calidad» (Semana 14)**

Plan de calidad del software: criterios de aceptación y cronograma — Consolidamos el plan completo

**Caso de ejemplo: SauceDemo (saucedemo.com)**

Gestión y Calidad del Software · UCC · 2026-2 · Docente: Andrea Paternina

Este es el modelo que consolidamos en clase sobre SauceDemo. Reúne en un solo documento lo que ya construyeron en los apartados anteriores (modelo de calidad, métricas y casos de prueba) y le agrega lo nuevo de la Semana 14: los criterios de aceptación y el cronograma. Cada equipo lo REPLICA tal cual con su sitio asignado.

**Importante (lo más evaluado):** el plan de calidad es el “documento maestro” del Avance 3. No se evalúa que repitan teoría, sino que todo quede conectado: cada característica priorizada (S8) tiene su métrica (S10–S12), su criterio de aceptación medible y sus casos de prueba (S13), y que haya un cronograma realista con responsables.

**1 · Objetivo del apartado**

En la Semana 14 CONSOLIDAMOS el plan de calidad del proyecto. Hasta ahora cada tema produjo una pieza suelta: elegimos un modelo de calidad (S8), definimos métricas (S10–S12) y diseñamos casos de prueba (S13). El plan de calidad es el documento que une todas esas piezas, les pone criterios de aceptación (umbrales que deciden si el sitio “pasa”) y un cronograma (quién hace qué y cuándo). Es la hoja de ruta del aseguramiento de calidad y la base de la ejecución de la Semana 15 y del informe final de la Semana 16.

En palabras simples: hasta aquí dijimos QUÉ vamos a medir y probar; el plan de calidad agrega CUÁNTO hay que alcanzar para aceptar el sitio y CUÁNDO y QUIÉN lo hará.

**2 · Marco conceptual**

**2.1 · ¿Qué es un plan de calidad?**

Un plan de calidad (o plan de aseguramiento de calidad, SQA Plan) es un documento que describe cómo se va a asegurar y verificar la calidad de un producto: qué se va a evaluar, con qué criterios, con qué actividades, quién es responsable y en qué fechas. Es el equivalente, para la calidad, de un plan de proyecto. El estándar clásico que lo describe es la IEEE 730; su contenido se alinea con el modelo de calidad que ya elegimos (ISO/IEC 25010).

La idea central: un plan de calidad convierte la intención (“queremos un sitio de calidad”) en compromisos medibles y verificables (“el flujo de compra debe completarse sin errores en el 100% de los casos críticos, y lo verificaremos con estos casos de prueba, en esta fecha, a cargo de esta persona”).

**2.2 · Criterios de aceptación**

Un criterio de aceptación es una condición MEDIBLE que el sitio debe cumplir para considerarse aceptable en una característica de calidad. No es una opinión (“debe ser rápido”), sino un umbral comprobable (“el inventario carga en ≤ 3 segundos con un usuario estándar”). Un buen criterio de aceptación tiene tres partes:

**La característica** de calidad a la que responde (p. ej. eficiencia de desempeño, de ISO/IEC 25010).

**La métrica** con la que se mide (p. ej. tiempo de carga en segundos, % de casos que pasan).

**El umbral** el valor que decide pasa/falla (p. ej. ≤ 3 s; ≥ 95%; 0 defectos críticos).

**Regla práctica:** si no puedes decir con un número o un sí/no si el criterio se cumplió, todavía no es un criterio de aceptación: es un deseo. Reescríbelo hasta que sea verificable.

**2.3 · Cronograma de calidad**

El cronograma de calidad es el calendario de las actividades de aseguramiento: qué se hace cada semana, quién lo hace y qué entregable o hito produce. No es el cronograma de desarrollo del sitio (ese no lo controlamos, porque el sitio ya existe), sino el de NUESTRO trabajo de calidad: diseñar pruebas, ejecutarlas, medir, analizar y reportar. Un buen cronograma tiene actividades concretas, responsables y fechas o semanas, con hitos claros (p. ej. “Avance 2 entregado”, “pruebas ejecutadas”).

**3 · Estructura del plan de calidad (índice del documento)**

Un plan de calidad consolidado debería tener, como mínimo, estas secciones. Úsela como índice de su documento:

|  |  |  |
| --- | --- | --- |
| **Sección** | **Qué contiene** | **De dónde sale** |
| 1. Alcance y objetivos de calidad | Qué sitio es, qué se va a asegurar y qué se considera “calidad” para él. | Avance 1 (S1) + S8 |
| 2. Modelo y características priorizadas | El modelo elegido (ISO/IEC 25010) y las características que más importan. | S8 |
| 3. Métricas | Las métricas directas e indirectas, de producto y de proceso/KPI. | S10–S12 |
| 4. Criterios de aceptación | El umbral de cada métrica: cuándo el sitio “pasa”. | S14 (nuevo) |
| 5. Diseño de pruebas | Los casos de prueba por niveles y tipos, manuales y automatizadas. | S13 |
| 6. Cronograma de calidad | Las actividades de QA con responsables y fechas/hitos. | S14 (nuevo) |
| 7. Roles y responsabilidades | Quién del equipo hace qué. | S14 (nuevo) |
| 8. Gestión de defectos y criterios de salida | Cómo se clasifican los defectos y cuándo se cierra la prueba. | S14 (nuevo) |

**4 · Método para consolidar el plan (6 pasos)**

Paso 1 — Reúna lo que ya tiene: el modelo y las características priorizadas (S8), las métricas (S10–S12) y la matriz de casos de prueba (S13). El plan NO inventa cosas nuevas: las ordena y las conecta.

Paso 2 — Para cada característica priorizada, defina su criterio de aceptación: elija la métrica y fije un umbral realista (pasa/falla). Apóyese en la tabla de la sección 5.3.

Paso 3 — Enlace cada criterio con los casos de prueba que lo evidencian (S13): un criterio sin prueba que lo compruebe no sirve, y una prueba que no responde a ningún criterio sobra.

Paso 4 — Arme el cronograma de calidad (sección 5.5): liste las actividades de QA de las Semanas 11 a 16, con responsable y entregable/hito por semana.

Paso 5 — Asigne roles (sección 5.6) y defina la gestión de defectos y los criterios de salida (sección 5.7): cómo clasifican la severidad y cuándo consideran “aprobada” la prueba.

Paso 6 — Cierre con un párrafo de conclusión que resuma el compromiso de calidad del equipo (sección 5.8).

**5 · Ejemplo trabajado: SauceDemo**

**5.1 · Alcance y objetivos de calidad**

SauceDemo (saucedemo.com) es una tienda de demostración de Sauce Labs pensada para practicar pruebas. Flujo principal: iniciar sesión → ver el catálogo de productos → agregar al carrito → carrito → checkout (datos → resumen) → finalizar. Tiene usuarios de prueba con comportamientos distintos a propósito: standard\_user (normal), locked\_out\_user (bloqueado), problem\_user (con fallas visuales) y performance\_glitch\_user (lento). La contraseña de todos es secret\_sauce.

Alcance de nuestro aseguramiento: validar el flujo de compra de principio a fin y el manejo de errores de autenticación. Objetivo de calidad: demostrar, con criterios medibles y evidencia, que el flujo crítico funciona correctamente y que el sitio responde y comunica los errores de forma adecuada. Fuera de alcance: el código fuente del sitio (es de terceros), por lo que no evaluamos mantenibilidad interna.

**5.2 · Modelo y características priorizadas**

Del Apartado 8 (S8) ya elegimos ISO/IEC 25010 y priorizamos cuatro características para SauceDemo: adecuación funcional, usabilidad, fiabilidad y eficiencia de desempeño (seguridad entra en su dimensión de autenticación). El plan de calidad retoma esas mismas características y ahora les pone criterios de aceptación.

**5.3 · Criterios de aceptación (tabla central)**

Esta es la tabla más importante del apartado. Conecta cada característica priorizada con su métrica, su umbral de aceptación (pasa/falla) y el caso de prueba que lo comprueba.

|  |  |  |  |  |
| --- | --- | --- | --- | --- |
| **ID** | **Característica (ISO 25010)** | **Métrica** | **Criterio de aceptación (umbral)** | **Se verifica con** |
| CA-01 | Adecuación funcional | % de casos del flujo crítico que pasan | 100% de los casos del flujo login→checkout→finalizar pasan | CP de compra (manual + automatizado) |
| CA-02 | Adecuación funcional | Corrección del total del carrito | El total mostrado = suma de ítems + impuesto, en el 100% de los casos | CP de verificación del carrito |
| CA-03 | Fiabilidad (autenticación) | Bloqueo de credenciales inválidas | locked\_out\_user NO entra y se muestra el mensaje de bloqueo (100%) | CP de login negativo |
| CA-04 | Usabilidad | Claridad de mensajes de error | 100% de los campos inválidos muestran un mensaje de error visible y entendible | CP de validación de formularios |
| CA-05 | Usabilidad | N.º de pasos del flujo de compra | La compra se completa en ≤ 5 pasos desde el catálogo | Recorrido del flujo (manual) |
| CA-06 | Eficiencia de desempeño | Tiempo de carga del inventario | ≤ 3 s con standard\_user (performance\_glitch\_user se documenta aparte) | Medición con cronómetro / script |
| CA-07 | Fiabilidad | Defectos críticos abiertos al cierre | 0 defectos de severidad crítica abiertos al terminar la ejecución | Registro de defectos (S15) |
| CA-08 | Fiabilidad | Densidad de defectos | < 0,5 defectos por caso de prueba ejecutado | Métricas de la ejecución (S15) |

**Cómo leerla:** cada fila es un compromiso verificable. En la Semana 15, al ejecutar, cada criterio quedará en PASA o FALLA con su evidencia. Ajuste los umbrales a lo razonable para su sitio: lo importante es que sean medibles.

**5.4 · Casos de prueba cubiertos (enlace con S13)**

El plan se apoya en la matriz de casos de prueba diseñada en la Semana 13. Resumen de la cobertura para SauceDemo:

|  |  |  |  |
| --- | --- | --- | --- |
| **Nivel / Tipo** | **Ejemplos de casos** | **Manual** | **Automatizada** |
| Funcional · login (caja negra) | Login válido, contraseña incorrecta, usuario bloqueado, campos vacíos | Sí | Sí (CP-01, CP-02) |
| Funcional · carrito y checkout | Agregar/quitar producto, total correcto, completar compra | Sí | Sí (flujo e2e) |
| Usabilidad | Mensajes de error, claridad del flujo, imágenes (problem\_user) | Sí | No |
| Desempeño | Tiempo de carga del inventario (standard vs performance\_glitch) | Sí | Parcial |

Las pruebas automatizadas se escriben con Selenium o Playwright ejecutadas con pytest; las de API, si aplican, con Postman o requests. Las manuales se registran en la matriz con resultado pasa/falla y evidencia (capturas).

**5.5 · Cronograma de aseguramiento de calidad**

Calendario de las actividades de calidad del equipo para el Avance 3. Cada semana tiene una actividad, un responsable y un entregable o hito.

|  |  |  |  |
| --- | --- | --- | --- |
| **Semana** | **Actividad de calidad** | **Responsable** | **Entregable / Hito** |
| 11 | Calcular métricas de producto del sitio (tamaño, complejidad donde aplique) | Integrante A | Tabla de métricas de producto |
| 12 | Definir métricas de proceso y armar el tablero de KPI | Integrante B | Tablero de KPI de calidad |
| 13 | Diseñar los casos de prueba por niveles y tipos (manuales y automatizadas) | Todo el equipo | Matriz de casos de prueba |
| 14 | Consolidar el plan de calidad: criterios de aceptación y cronograma | Todo el equipo | Plan de calidad (este documento) |
| 15 | Ejecutar pruebas manuales y automatizadas; recolectar métricas | Integrantes A y C | Resultados pasa/falla + evidencias + métricas |
| 16 | Redactar el informe final y preparar la sustentación | Todo el equipo | Informe final (PDF, APA) + sustentación |

**Nota:** los nombres de los roles (Integrante A/B/C) son de ejemplo; cada equipo pone los nombres reales y reparte el trabajo de forma equilibrada. Lo clave es que ninguna actividad quede “sin dueño”.

**5.6 · Roles y responsabilidades**

|  |  |
| --- | --- |
| **Rol** | **Responsabilidad principal** |
| Líder de calidad (QA Lead) | Coordina el plan, revisa que cada criterio tenga prueba y evidencia, consolida el informe. |
| Diseñador de pruebas | Redacta y mantiene la matriz de casos (manuales y automatizadas). |
| Automatizador | Implementa y ejecuta las pruebas automatizadas (Selenium/Playwright + pytest). |
| Analista de métricas | Recolecta las métricas, calcula los indicadores y verifica los umbrales. |

**En equipos de 3:** una persona puede asumir dos roles. Lo importante es que todos participen y todos dominen el trabajo para la sustentación.

**5.7 · Gestión de defectos y criterios de salida**

El plan define cómo se clasifican los defectos encontrados y cuándo se considera que la prueba terminó con éxito (criterios de salida). Clasificación de severidad sugerida:

|  |  |  |
| --- | --- | --- |
| **Severidad** | **Definición** | **Criterio de cierre** |
| Crítica | Impide completar el flujo principal (no se puede comprar / no se puede iniciar sesión válida). | 0 abiertas para aprobar |
| Mayor | Falla importante con solución alterna (p. ej. total mal calculado en un caso). | ≤ 1 abierta, documentada |
| Menor | Defecto cosmético o de usabilidad que no impide usar el sitio (p. ej. imagen rota en problem\_user). | Se documentan; no bloquean |

Criterio de salida (definición de “aprobado”): se considera superada la prueba cuando el 100% de los casos del flujo crítico pasan, no hay defectos críticos abiertos y se cumplen los criterios de aceptación CA-01 a CA-08 (o se justifica razonadamente cada excepción).

**5.8 · Conclusión (párrafo modelo, adaptable)**

*«Para nuestro proyecto sobre SauceDemo consolidamos un plan de calidad basado en el modelo ISO/IEC 25010, que prioriza la adecuación funcional, la usabilidad, la fiabilidad y la eficiencia de desempeño. Para cada una definimos criterios de aceptación medibles (CA-01 a CA-08) enlazados con nuestras métricas y con los casos de prueba diseñados en la Semana 13. Establecimos un cronograma de aseguramiento para las Semanas 11 a 16 con responsables y entregables, repartimos los roles del equipo y fijamos la gestión de defectos y los criterios de salida. Con este plan pasamos de la intención de calidad a compromisos verificables, listos para ejecutar y medir en la Semana 15 y reportar en el informe final.»*

**6 · Plantilla de replicación — Ahora con TU sitio**

Repite la misma estructura con el sitio que te tocó. Completa:

**Alcance y objetivos de calidad de tu sitio** (qué flujo asegurarás y qué queda fuera de alcance).

**Modelo y características priorizadas** (retoma tu elección del Apartado 8).

**Criterios de aceptación** (tabla como 5.3: característica → métrica → umbral → caso que lo verifica).

**Cobertura de casos de prueba** (enlaza tu matriz de la S13, manuales y automatizadas).

**Cronograma de calidad** (tabla como 5.5: semana → actividad → responsable → entregable/hito).

**Roles y responsabilidades** (reparte el trabajo entre los 3 integrantes).

**Gestión de defectos y criterios de salida** (severidades y definición de “aprobado”).

**Párrafo de conclusión** adaptado a tu caso (como 5.8).

**7 · Errores comunes a evitar**

**Criterios de aceptación no medibles** (“debe ser rápido”, “fácil de usar”): sin número o sí/no no se pueden verificar.

**Criterios sin prueba (o pruebas sin criterio)** : cada criterio debe enlazar con un caso de la S13, y viceversa.

**Cronograma genérico** : actividades vagas sin responsable ni entregable. Cada semana debe tener dueño y resultado.

**Confundir el plan de calidad con el informe final** : este plan dice qué y cómo se hará; el informe (S16) reporta qué pasó al ejecutarlo.

**Repetir teoría de apartados anteriores** en vez de consolidar y conectar las piezas (modelo + métricas + pruebas).

**Poner umbrales imposibles** (“0 defectos de cualquier tipo”): fija metas realistas y razonadas para tu sitio.

**Prometer medir lo que no controlas** (p. ej. mantenibilidad del código de un sitio de terceros).

**8 · Glosario breve**

**Plan de calidad (SQA Plan):** documento que describe cómo se asegurará y verificará la calidad: qué, con qué criterios, quién y cuándo.

**Criterio de aceptación:** condición medible (con umbral) que decide si el sitio “pasa” en una característica de calidad.

**Umbral:** el valor límite que separa pasa de falla (p. ej. ≤ 3 s, ≥ 95%).

**Cronograma de calidad:** calendario de las actividades de aseguramiento, con responsables y entregables/hitos.

**Hito:** un punto de control importante del cronograma (p. ej. “pruebas ejecutadas”, “avance entregado”).

**Severidad de un defecto:** qué tan grave es su impacto (crítica, mayor, menor).

**Criterio de salida:** condición que define cuándo la prueba terminó con éxito (“aprobado”).

**Trazabilidad:** poder seguir el hilo característica → métrica → criterio → caso de prueba → evidencia.

**9 · Referencias (APA)**

IEEE. (2014). IEEE 730-2014 — IEEE Standard for Software Quality Assurance Processes. IEEE.

ISO/IEC. (2011). ISO/IEC 25010:2011 — Systems and software engineering — SQuaRE — System and software quality models. ISO.

ISO/IEC. (2014). ISO/IEC 25000:2014 — Systems and software engineering — SQuaRE — Guide to SQuaRE. ISO.

ISO/IEC/IEEE. (2017). ISO/IEC/IEEE 29119 — Software and systems engineering — Software testing. ISO.

Pressman, R. S., & Maxim, B. R. (2020). Software Engineering: A Practitioner’s Approach (9.ª ed.). McGraw-Hill.

Sauce Labs. (s. f.). Swag Labs — SauceDemo. https://www.saucedemo.com