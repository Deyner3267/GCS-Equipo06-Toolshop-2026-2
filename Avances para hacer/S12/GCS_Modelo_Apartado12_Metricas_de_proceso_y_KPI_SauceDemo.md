**Modelo guía — Apartado 12 (Semana 12)**

Métricas de proceso y KPI: armamos el tablero de indicadores de calidad

**Caso de ejemplo: SauceDemo (saucedemo.com)**

Gestión y Calidad del Software · UCC · 2026-2 · Docente: Andrea Paternina

*Este es el modelo que construimos en clase sobre SauceDemo. Cada equipo lo REPLICA con su sitio asignado (AutomationExercise, Toolshop, ParaBank, DemoBlaze, ExpandTesting, DemoQA, OrangeHRM, BStackDemo). Objetivo del apartado (Avance 3, punto 2): DEFINIR las métricas de PROCESO (nuestro proceso de pruebas) y de PROYECTO (la gestión del trabajo), SELECCIONAR de todas las métricas que ya tenemos (S10, S11 y las de esta semana) un conjunto pequeño de KPI, y ARMAR con ellos un tablero de indicadores con meta, umbrales, valor actual, estado (semáforo) y responsable. No basta con tener números: el tablero debe permitir DECIDIR qué hacer.*

**Importante (lo más evaluado): una métrica NO es un KPI. Un KPI es una métrica CLAVE que tiene (1) FÓRMULA, (2) META, (3) UMBRALES de semáforo (verde, amarillo, rojo), (4) VALOR actual, (5) RESPONSABLE y (6) FRECUENCIA de medición, y que está ligada a un objetivo de calidad. El tablero debe ser BALANCEADO (KPI de producto, de proceso y de proyecto) y PEQUEÑO (entre 6 y 10 KPI), y cerrar con un PLAN DE ACCIÓN para los que estén en amarillo o rojo. Un tablero con 25 métricas sin metas, o solo con métricas de producto, baja el nivel.**

# **1 · Objetivo del apartado**

Hasta ahora hemos medido sobre todo el PRODUCTO: en la S10, con los resultados de las pruebas (casos exitosos, defectos, tiempo de respuesta), y en la S11, con su tamaño y complejidad (64 PF, V(G) del login = 5). Pero en la S9 vimos que la calidad tiene tres dimensiones, y en la S7 que para subir de nivel de madurez (CMMI 4, SPICE 4) hay que medir y controlar el PROCESO con datos. Esta semana medimos qué tan bien funciona NUESTRO PROCESO DE PRUEBAS y qué tan bien GESTIONAMOS el proyecto, y reunimos lo más importante de todo en un TABLERO DE KPI: una vista de una página que muestra si vamos bien, dónde estamos en alerta y qué debemos hacer. Este tablero es la herramienta de control que usaremos hasta la S15 y uno de los insumos centrales del informe final y de la sustentación.

# **2 · Marco conceptual**

## **2.1 · Métricas de producto, de proceso y de proyecto**

Pressman y Maxim (2020) distinguen tres familias de métricas, que coinciden con las tres dimensiones de la S9. Las de producto ya las trabajamos; esta semana nos enfocamos en las otras dos:

| **Familia** | **Qué mide** | **Para qué sirve** | **Ejemplos** |
| --- | --- | --- | --- |
| Producto (S10–S11) | El software: tamaño, complejidad, defectos, desempeño. | Saber qué tan bueno es el sitio. | Densidad de defectos por PF, V(G), tiempo de respuesta. |
| Proceso (S12) | La eficacia y eficiencia de las ACTIVIDADES con que probamos. | Mejorar el método a mediano plazo (estratégicas). | Tasa de ejecución, cobertura, eficacia de detección. |
| Proyecto (S12) | El avance del trabajo frente al plan: tiempo, esfuerzo, alcance. | Controlar el proyecto ahora (tácticas). | Cumplimiento del cronograma, desviación del esfuerzo. |

La idea de fondo viene de Deming y de Humphrey: si el PROCESO es bueno y está bajo control, el producto tiende a salir bien. Por eso medir el proceso no es un trámite: es lo que permite saber si nuestras pruebas son confiables. En nuestro caso el proceso que medimos es el de pruebas de la S9: planear → diseñar casos → ejecutar → registrar defectos → reportar.

## **2.2 · Métricas del proceso de pruebas**

Estas son las métricas de proceso más usadas en QA (ISTQB, 2023; Kan, 2002), organizadas por etapa del proceso:

| **Etapa del proceso** | **Métrica** | **Fórmula** | **Qué indica** |
| --- | --- | --- | --- |
| Diseñar casos | Productividad de diseño | casos diseñados ÷ horas de diseño | Ritmo con que el equipo escribe casos. |
| Diseñar casos | Cobertura funcional | funciones con casos ÷ funciones del alcance × 100 | Qué parte del sitio queda probada. |
| Ejecutar | Tasa de ejecución | casos ejecutados ÷ casos diseñados × 100 | Avance de la ejecución frente al plan. |
| Ejecutar | % de casos exitosos | casos que pasan ÷ casos ejecutados × 100 | Estabilidad del sitio en lo probado. |
| Ejecutar | % de automatización | casos automatizados ÷ casos diseñados × 100 | Madurez técnica del proceso de pruebas. |
| Registrar defectos | Tasa de detección | defectos ÷ horas de ejecución | Cuántos defectos encontramos por hora de prueba. |
| Registrar defectos | % de reportes rechazados | reportes inválidos ÷ reportes totales × 100 | Calidad de nuestros reportes (falsos positivos). |
| Reportar / evaluar | Eficacia de detección (DRE) | E ÷ (E + D) × 100 | Qué proporción de los defectos atrapa nuestro proceso. |

**La métrica estrella: eficiencia en la remoción de defectos (DRE).** Capers Jones la propone como el mejor indicador de la calidad de un proceso: DRE = E ÷ (E + D), donde E son los defectos encontrados ANTES de entregar y D los que se escapan y se encuentran DESPUÉS. Como nosotros no entregamos el sitio a usuarios reales, la ADAPTAMOS: E = defectos encontrados por nuestros casos de prueba planeados; D = defectos que se nos «escaparon» y aparecieron después en una sesión de prueba exploratoria (o los señaló la docente u otro equipo). Así medimos qué tan buena es nuestra suite de casos.

*Nota de rigor: métricas como el «tiempo medio de corrección de defectos» no aplican en nuestro proyecto, porque no corregimos el sitio (es de terceros). Lo correcto es decirlo y reemplazarlas por métricas que sí dependen de nuestro proceso.*

## **2.3 · Métricas de proyecto**

Miden la gestión del trabajo (S9): si cumplimos el alcance, en el tiempo y con el esfuerzo previstos (PMI, 2021).

| **Métrica de proyecto** | **Fórmula** | **Qué indica** |
| --- | --- | --- |
| Cumplimiento del cronograma | avances entregados a tiempo ÷ avances programados × 100 | Si estamos entregando a tiempo. |
| Desviación del esfuerzo | (horas reales − horas planeadas) ÷ horas planeadas × 100 | Si el trabajo cuesta más (positivo) o menos (negativo) de lo previsto. |
| % de alcance completado | tareas completadas ÷ tareas planeadas de la semana × 100 | Si cumplimos lo comprometido en cada semana. |
| Distribución de la carga | horas de cada integrante ÷ horas totales × 100 | Si el trabajo está bien repartido en el equipo. |

## **2.4 · ¿Qué es un KPI?**

Un KPI (Key Performance Indicator, indicador clave de desempeño) es una métrica que se eligió por ser CLAVE para un objetivo y que se compara contra una META para decidir (Parmenter, 2015). Retomando la S10: medida → métrica → indicador; un KPI es un indicador de los más importantes. No todas las métricas son KPI: de las 20 o 30 que podemos calcular, elegimos pocas que resuman el estado de la calidad.

| **Concepto** | **Ejemplo en SauceDemo** |
| --- | --- |
| Métrica | Tasa de detección = 1,33 defectos por hora (dato útil, pero no lo seguimos semana a semana). |
| KPI | % de casos exitosos = 77,8 %, meta ≥ 90 %, responsable: líder de QA, se mide en cada ciclo de ejecución. |

Un buen KPI cumple el criterio SMART (Doran, 1981): eSpecífico (mide una sola cosa clara), Medible (tiene fórmula y fuente), Alcanzable (la meta es realista), Relevante (ligado a una característica ISO 25010 o a un objetivo del plan) y con Tiempo definido (se sabe cuándo se mide y para cuándo se espera la meta).

Además, conviene mezclar dos tipos de KPI: los ADELANTADOS (leading), que anticipan el resultado y permiten corregir a tiempo (p. ej. tasa de ejecución, cobertura), y los REZAGADOS (lagging), que muestran el resultado final (p. ej. % de casos exitosos, densidad de defectos). Un tablero solo con rezagados avisa tarde.

## **2.5 · El tablero de indicadores (dashboard)**

Es una vista de UNA página que reúne los KPI con su meta, su valor actual y su estado. Se inspira en el Cuadro de Mando Integral (Balanced Scorecard) de Kaplan y Norton (1996), cuya idea central es mirar el desempeño desde varias PERSPECTIVAS balanceadas; en nuestro caso las perspectivas son las tres dimensiones de la calidad: producto, proceso y proyecto. Un tablero útil tiene:

* Una fila por KPI con fórmula, meta, umbrales, valor actual, estado y responsable.
* Un SEMÁFORO: verde = cumple la meta; amarillo = alerta, cerca de la meta; rojo = no cumple, hay que actuar.
* Una referencia de TENDENCIA: el valor anterior para ver si mejora o empeora (desde la segunda medición).
* Una o dos gráficas que se entiendan de un vistazo (barras contra la meta, Pareto de defectos).
* Un PLAN DE ACCIÓN para cada KPI en amarillo o rojo: causa, acción, responsable y fecha.

# **3 · Ficha de KPI y reglas del tablero (tabla de criterios)**

**Tabla A — Ficha de un KPI.** Cada KPI del tablero debe poder describirse con estos campos:

| **Campo** | **Qué se escribe** |
| --- | --- |
| ID y nombre | Código (KPI-1, KPI-2…) y nombre corto. |
| Dimensión y característica | Producto, proceso o proyecto; y la característica ISO 25010 u objetivo del plan con que se relaciona. |
| Objetivo | Qué queremos lograr con él (ligado a la meta GQM de la S10). |
| Fórmula y fuente | Cómo se calcula y de dónde salen los datos (matriz de casos, registro de defectos, registro de horas). |
| Meta | Valor esperado y para cuándo (p. ej. ≥ 90 % en la S15). |
| Umbrales del semáforo | Rango verde, amarillo y rojo. |
| Tipo | Adelantado o rezagado. |
| Frecuencia y responsable | Cada cuánto se mide y qué integrante lo actualiza. |

**Tabla B — Reglas para armar el tablero.**

| **Regla** | **Por qué** |
| --- | --- |
| Entre 6 y 10 KPI | Con más, el tablero deja de leerse de un vistazo. |
| Al menos 2 de producto, 2 de proceso y 2 de proyecto | Así el tablero es balanceado (las tres dimensiones de la S9). |
| Al menos 2 adelantados | Para poder corregir antes de que sea tarde. |
| Umbrales definidos ANTES de medir | Si se fijan después, se acomodan al resultado. |
| Cada KPI con un responsable | Un indicador sin dueño no se actualiza. |
| Todo amarillo o rojo con acción | El tablero existe para decidir, no para decorar. |

# **4 · Método paso a paso (6 pasos)**

Paso 1 — Reúne las métricas que ya tienes: producto (S10 y S11) y los indicadores de proceso y proyecto que propusiste en la S9.

Paso 2 — Recolecta los DATOS de proceso y proyecto que faltan: horas de diseño y de ejecución, reportes de defecto (válidos y rechazados), defectos escapados (haz una sesión corta de prueba exploratoria), casos automatizados, entregas y horas reales vs. planeadas.

Paso 3 — Calcula las métricas de proceso y de proyecto con su fórmula y su valor (tabla como 5.2).

Paso 4 — SELECCIONA entre 6 y 10 KPI cumpliendo las reglas de la Tabla B y justifica por qué cada uno es clave.

Paso 5 — ARMA el tablero en la hoja de cálculo: meta, umbrales, valor, estado con semáforo automático y responsable; agrega una gráfica de KPI contra la meta.

Paso 6 — LEE el tablero: interpreta los verdes, amarillos y rojos relacionando las tres dimensiones, y escribe el plan de acción. Esta lectura integrada da el nivel relacional.

# **5 · Ejemplo trabajado: SauceDemo**

## **5.1 · Datos recolectados del proceso y del proyecto**

Además de los datos de la S10 (20 casos diseñados, 18 ejecutados, 14 exitosos, 6 defectos, login de 1,8 s, 5 de 6 funciones cubiertas) y de la S11 (64 PF), registramos:

| **Dato (métrica directa)** | **Valor** | **Fuente** |
| --- | --- | --- |
| Horas dedicadas a diseñar casos | 6 h | Registro de horas del equipo |
| Horas dedicadas a ejecutar casos | 4,5 h | Registro de horas del equipo |
| Reportes de defecto registrados | 7 (6 válidos, 1 rechazado: no reproducible) | Registro de defectos |
| Defectos escapados (sesión exploratoria de 1 h) | 1 (ordenar por precio falla con problem\_user) | Notas de la sesión exploratoria |
| Defectos críticos | 1 (problem\_user no puede completar el checkout) | Registro de defectos (severidad) |
| Casos automatizados | 3 (los de login) | Repositorio de scripts |
| Avances entregados a tiempo | 2 de 2 | Aula Extendida |
| Horas del proyecto (planeadas / reales, S10–S12) | 30 h / 34 h | Cronograma y registro de horas |

## **5.2 · Métricas de proceso y de proyecto calculadas**

| **Métrica** | **Dimensión** | **Fórmula** | **Cálculo** | **Valor** |
| --- | --- | --- | --- | --- |
| Productividad de diseño | Proceso | casos ÷ h de diseño | 20 ÷ 6 | 3,33 casos/h |
| Tasa de ejecución | Proceso | ejecutados ÷ diseñados × 100 | 18 ÷ 20 × 100 | 90 % |
| Cobertura funcional | Proceso | funciones cubiertas ÷ total × 100 | 5 ÷ 6 × 100 | 83,3 % |
| % de automatización | Proceso | automatizados ÷ diseñados × 100 | 3 ÷ 20 × 100 | 15 % |
| Tasa de detección | Proceso | defectos ÷ h de ejecución | 6 ÷ 4,5 | 1,33 def./h |
| % de reportes rechazados | Proceso | rechazados ÷ reportes × 100 | 1 ÷ 7 × 100 | 14,3 % |
| Eficacia de detección (DRE adaptada) | Proceso | E ÷ (E + D) × 100 | 6 ÷ (6 + 1) × 100 | 85,7 % |
| Cumplimiento del cronograma | Proyecto | a tiempo ÷ programados × 100 | 2 ÷ 2 × 100 | 100 % |
| Desviación del esfuerzo | Proyecto | (reales − planeadas) ÷ planeadas × 100 | (34 − 30) ÷ 30 × 100 | +13,3 % |

## **5.3 · Selección de los KPI**

De todas las métricas (S10, S11 y 5.2) elegimos 10 KPI, balanceados entre las tres dimensiones:

| **KPI** | **Nombre** | **Dimensión / característica** | **Tipo** | **¿Por qué es clave?** |
| --- | --- | --- | --- | --- |
| KPI-1 | % de casos exitosos | Producto · Adecuación funcional | Rezagado | Resume si el flujo de compra funciona. |
| KPI-2 | Densidad de defectos por PF | Producto · Fiabilidad | Rezagado | Normaliza los defectos con el tamaño (S11). |
| KPI-3 | % de defectos críticos | Producto · Fiabilidad | Rezagado | Un defecto crítico pesa más que varios leves. |
| KPI-4 | Tiempo de respuesta del login | Producto · Eficiencia | Rezagado | Característica priorizada en la S8. |
| KPI-5 | Tasa de ejecución | Proceso | Adelantado | Avisa si no alcanzaremos a probar todo. |
| KPI-6 | Cobertura funcional | Proceso | Adelantado | Avisa qué parte del sitio queda sin probar. |
| KPI-7 | Eficacia de detección (DRE) | Proceso | Rezagado | Mide si nuestra suite atrapa los defectos. |
| KPI-8 | % de automatización | Proceso | Adelantado | Prepara la ejecución automatizada de la S15. |
| KPI-9 | Cumplimiento del cronograma | Proyecto | Rezagado | Las entregas están encadenadas en el Aula. |
| KPI-10 | Desviación del esfuerzo | Proyecto | Adelantado | Avisa si el trabajo nos está costando más de lo previsto. |

*Quedaron como métricas de apoyo (no KPI): productividad de diseño, tasa de detección y % de reportes rechazados. Se calculan y se reportan, pero no se siguen en el tablero.*

## **5.4 · Ficha completa de un KPI (ejemplo)**

| **Campo** | **KPI-7 · Eficacia de detección (DRE adaptada)** |
| --- | --- |
| Dimensión y característica | Proceso · objetivo del plan de SQA: que la suite de casos detecte los defectos del sitio. |
| Objetivo | Que se nos escapen pocos defectos de los casos planeados. |
| Fórmula y fuente | E ÷ (E + D) × 100. E: registro de defectos; D: notas de la sesión exploratoria. |
| Meta | ≥ 85 % al cierre de la S15. |
| Umbrales | Verde ≥ 85 % · Amarillo 70 – 84,9 % · Rojo < 70 %. |
| Tipo | Rezagado. |
| Frecuencia y responsable | Después de cada ciclo de ejecución + sesión exploratoria · Integrante 2 (ejecución de pruebas). |
| Valor actual | 85,7 % → Verde. |

## **5.5 · Tablero de KPI de SauceDemo (línea base S12)**

| **KPI** | **Meta** | **Amarillo** | **Rojo** | **Valor S12** | **Estado** | **Responsable** |
| --- | --- | --- | --- | --- | --- | --- |
| KPI-1 % casos exitosos | ≥ 90 % | 75 – 89,9 % | < 75 % | 77,8 % | Amarillo | Integrante 1 |
| KPI-2 Defectos por PF | ≤ 0,08 | 0,081 – 0,12 | > 0,12 | 0,094 | Amarillo | Integrante 1 |
| KPI-3 % defectos críticos | ≤ 20 % | 20,1 – 30 % | > 30 % | 16,7 % | Verde | Integrante 1 |
| KPI-4 Tiempo login | ≤ 2 s | 2,1 – 3 s | > 3 s | 1,8 s | Verde | Integrante 2 |
| KPI-5 Tasa de ejecución | 100 % (S15) | 80 – 99,9 % | < 80 % | 90 % | Amarillo | Integrante 2 |
| KPI-6 Cobertura funcional | ≥ 90 % | 75 – 89,9 % | < 75 % | 83,3 % | Amarillo | Integrante 2 |
| KPI-7 Eficacia de detección | ≥ 85 % | 70 – 84,9 % | < 70 % | 85,7 % | Verde | Integrante 2 |
| KPI-8 % automatización | ≥ 50 % (S15) | 30 – 49,9 % | < 30 % | 15 % | Rojo | Integrante 3 |
| KPI-9 Cumplimiento cronograma | 100 % | 80 – 99,9 % | < 80 % | 100 % | Verde | Integrante 3 |
| KPI-10 Desviación esfuerzo | ± 10 % | ± 10,1 – 20 % | más de ± 20 % | +13,3 % | Amarillo | Integrante 3 |

*Roles: Integrante 1 = líder de QA y análisis de defectos; Integrante 2 = diseño y ejecución de pruebas; Integrante 3 = automatización y gestión del proyecto. La columna de TENDENCIA se agrega en la S15, cuando haya una segunda medición para comparar.*

**Cómo armarlo en la hoja de cálculo (Excel o Google Sheets):** cada dato directo va en una hoja «Datos»; cada KPI se calcula con una fórmula que apunta a esa hoja (p. ej. =Datos!B4/Datos!B3 con formato de porcentaje), así el tablero se actualiza solo al cambiar los datos. El estado se calcula automáticamente; para un KPI donde «más alto es mejor», con el valor en F5, la meta en B5 y el límite inferior del amarillo en C5:

=SI(F5>=B5;"Verde";SI(F5>=C5;"Amarillo";"Rojo"))

Para los KPI donde «más bajo es mejor» (defectos por PF, % de críticos, tiempo de login) se invierten las comparaciones (<=). Luego se aplica FORMATO CONDICIONAL a la columna Estado (verde, amarillo, rojo) y se inserta una gráfica de barras de los KPI contra su meta, como la Figura 1.

![](data:image/png;base64...)

*Figura 1. Tablero visual de los KPI expresados en porcentaje (elaboración propia, datos de ejemplo).*

Como apoyo al análisis del KPI-1 y del KPI-2, el tablero incluye el Pareto de los 6 defectos por característica (técnica que ya usamos en el Avance 1):

![](data:image/png;base64...)

*Figura 2. Pareto de defectos por característica ISO 25010 en SauceDemo (elaboración propia, datos de ejemplo).*

## **5.6 · Lectura del tablero y plan de acción**

El tablero muestra 4 KPI en verde, 5 en amarillo y 1 en rojo. Leídos JUNTOS cuentan una historia coherente: el PROCESO detecta bien los defectos (KPI-7 en verde: solo se nos escapó 1 de 7), y por eso el PRODUCTO aparece en amarillo (KPI-1 y KPI-2): no es que probemos mal, es que el sitio tiene defectos deliberados (problem\_user). El Pareto muestra que la mitad de los defectos están en Adecuación funcional, así que ahí deben concentrarse las nuevas pruebas. En PROYECTO entregamos a tiempo (KPI-9 en verde), pero con un 13,3 % más de horas de las previstas (KPI-10 en amarillo), y el único rojo (KPI-8, automatización) es un riesgo para la S15 si no actuamos ya.

| **KPI en alerta** | **Causa probable** | **Acción** | **Responsable** | **Fecha** |
| --- | --- | --- | --- | --- |
| KPI-8 % automatización (rojo) | Solo se automatizó el login. | Automatizar carrito y checkout (9 casos más) con Selenium. | Integrante 3 | S13–S14 |
| KPI-5 Tasa de ejecución | Quedan 2 casos sin ejecutar. | Ejecutar los 2 casos pendientes y los nuevos del camino básico (S11). | Integrante 2 | S13 |
| KPI-6 Cobertura funcional | La función «ordenar catálogo» no tenía casos. | Diseñar casos de ordenamiento (de ahí salió el defecto escapado). | Integrante 2 | S13 |
| KPI-1 y KPI-2 (producto) | Defectos del sitio con problem\_user. | No se corrige el sitio: documentar cada defecto con evidencia y severidad. | Integrante 1 | S13–S15 |
| KPI-10 Desviación del esfuerzo | Subestimamos el tiempo de diseño de casos. | Ajustar la estimación de horas de las S13–S15 en +15 %. | Integrante 3 | S13 |

## **5.7 · Enlace con lo que ya hicimos y lo que viene**

El tablero integra todo el semestre: las características de ISO 25010 (S8) dan los KPI de producto; las tres dimensiones (S9) dan el balance producto-proceso-proyecto; las métricas de la S10 y de la S11 son los datos de los KPI; y medir el proceso con metas y umbrales es justamente lo que pide el Nivel 4 de CMMI/SPICE que pusimos como horizonte en la S7. Lo que sigue: las acciones del plan entran al diseño de casos por niveles y tipos de la S13; los criterios de aceptación del plan de calidad de la S14 se fijarán con estas metas; y en la S15 actualizaremos el tablero con los datos reales de la ejecución y agregaremos la tendencia.

## **5.8 · Conclusión (párrafo modelo, adaptable)**

*«Para controlar la calidad de nuestro proyecto sobre SauceDemo definimos métricas de proceso (tasa de ejecución, cobertura, eficacia de detección, automatización) y de proyecto (cumplimiento del cronograma y desviación del esfuerzo), y seleccionamos 10 KPI balanceados entre producto, proceso y proyecto, cada uno con fórmula, meta, umbrales y responsable. La línea base del tablero muestra 4 KPI en verde, 5 en amarillo y 1 en rojo: nuestro proceso detecta bien los defectos (eficacia de detección del 85,7 %), lo que explica que la calidad del producto aparezca en alerta (77,8 % de casos exitosos y 0,094 defectos por PF), concentrada en la adecuación funcional. El principal riesgo es la baja automatización (15 %), para la cual definimos un plan de acción en las S13 y S14. Este tablero será nuestra herramienta de control hasta la ejecución final de la S15.»*

# **6 · Plantilla de replicación — Ahora con TU sitio**

Repite la misma estructura con el sitio que te tocó. Completa:

* Tabla de datos de proceso y de proyecto recolectados, con su fuente (como 5.1).
* Métricas de proceso y de proyecto con fórmula, cálculo y valor (como 5.2).
* Selección de 6 a 10 KPI balanceados, con dimensión, tipo (adelantado o rezagado) y justificación (como 5.3).
* La ficha completa de al menos un KPI (como 5.4).
* El tablero con meta, umbrales, valor, estado (semáforo) y responsable, hecho en la hoja de cálculo con fórmulas, más una gráfica de KPI contra la meta (como 5.5).
* La lectura integrada del tablero y el plan de acción para los amarillos y rojos (como 5.6), y el párrafo de conclusión (como 5.8).

# **7 · Errores comunes a evitar**

* Llamar KPI a cualquier métrica: sin meta, umbrales y responsable no es un KPI.
* Hacer un tablero solo con métricas de producto, olvidando proceso y proyecto.
* Poner demasiados KPI (más de 10) o tan pocos que no cubren las tres dimensiones.
* Fijar las metas DESPUÉS de ver los resultados para que todo quede en verde.
* Usar métricas que no dependen de nuestro proceso (p. ej. tiempo de corrección de defectos de un sitio de terceros).
* Confundir un mal resultado de PRODUCTO con un mal PROCESO: muchos defectos detectados puede significar que el proceso funciona bien.
* Presentar el tablero sin lectura ni plan de acción: el tablero existe para decidir.
* Hacer el semáforo «a mano»: debe calcularse con fórmulas para que se actualice con los datos de la S15.

# **8 · Glosario breve**

* Métrica de proceso: mide la eficacia o eficiencia de las actividades con que se produce o prueba el software.
* Métrica de proyecto: mide el avance del trabajo frente al plan (tiempo, esfuerzo, alcance).
* KPI: métrica clave, ligada a un objetivo, con meta, umbrales, responsable y frecuencia.
* Tablero de indicadores (dashboard): vista de una página con los KPI, su estado y su meta.
* Semáforo: regla de color (verde, amarillo, rojo) que compara el valor del KPI con sus umbrales.
* KPI adelantado / rezagado: anticipa el resultado / muestra el resultado ya ocurrido.
* DRE (eficiencia en la remoción de defectos): defectos detectados ÷ (detectados + escapados).
* Defecto escapado: defecto que la suite de casos planeados no detectó y apareció después.
* Línea base: primera medición de los KPI, contra la que se comparan las siguientes.
* SMART: criterio para metas e indicadores específicos, medibles, alcanzables, relevantes y con tiempo definido.

# **9 · Referencias (APA)**

Doran, G. T. (1981). There's a S.M.A.R.T. way to write management's goals and objectives. Management Review, 70(11), 35–36.

ISO/IEC/IEEE. (2017). ISO/IEC/IEEE 15939:2017 — Systems and software engineering — Measurement process. ISO/IEC/IEEE.

ISTQB. (2023). Certified Tester Foundation Level Syllabus (v4.0). International Software Testing Qualifications Board.

Jones, C. (2008). Applied Software Measurement: Global Analysis of Productivity and Quality (3.ª ed.). McGraw-Hill.

Kan, S. H. (2002). Metrics and Models in Software Quality Engineering (2.ª ed.). Addison-Wesley.

Kaplan, R. S., & Norton, D. P. (1996). The Balanced Scorecard: Translating Strategy into Action. Harvard Business School Press.

Parmenter, D. (2015). Key Performance Indicators: Developing, Implementing, and Using Winning KPIs (3.ª ed.). Wiley.

Pressman, R. S., & Maxim, B. R. (2020). Software Engineering: A Practitioner's Approach (9.ª ed.). McGraw-Hill.

Project Management Institute. (2021). A Guide to the Project Management Body of Knowledge (PMBOK Guide) (7.ª ed.). PMI.