1
Avance 2. Modelo de Calidad, Métricas y Diseño de Pruebas
Aseguramiento de la Calidad del Sitio Practice Software Testing (Toolshop)
Equipo 06
Camilo Vides, Luis Tapia y Deyner Ortiz
Sitio asignado: Practice Software Testing (Toolshop)
URL: https://practicesoftwaretesting.com
Facultad de Ingeniería, Universidad Cooperativa de Colombia
Programa de Ingeniería de Sistemas
Gestión y Calidad del Software
Docente: Andrea Paternina
Montería, Córdoba
Octubre de 2026

2
Tabla de Contenido
Presentación del Avance 2 5
Apartado 7. Normas II: CMMI e ISO/IEC 15504 (SPICE) 7
1. El sitio y el alcance de nuestro QA 8
2. Mapeo de nuestras actividades de QA a áreas de proceso de CMMI 9
3. Mini-evaluación SPICE del proceso de pruebas 10
4. Ubicación de la madurez y justificación 11
5. Análisis de brecha y hoja de ruta de mejora 12
6. Verificación de la replicación del modelo 13
7. Errores comunes y cómo los evitamos 14
8. Conclusión del apartado 7 15
Apartado 8. Modelos de Calidad del Producto 16
1. Marco conceptual de los modelos de calidad 17
2. El sitio y la calidad que prioriza 20
3. Modelo elegido y justificación 21
4. Características priorizadas para Practice Software Testing 21
5. Enlace con el Avance 1 y con el apartado 7 23
6. Justificación frente a los otros modelos 24
7. Conclusión del apartado 8 24
Apartado 9. Calidad de Producto, Proceso y Proyecto 26
1. Las tres dimensiones de la calidad en nuestro caso 27
2. Calidad de producto en Practice Software Testing 28
3. Calidad de proceso: nuestro proceso de pruebas 29
4. Calidad de proyecto: cómo gestionamos el trabajo 30
5. Restricciones de tiempo y costo del proyecto 31
6. Cómo se relacionan las tres dimensiones en nuestro caso 33
7. Conclusión del apartado 9 34
Apartado 10. Métricas de Calidad del Software 35
1. Marco conceptual: medida, métrica e indicador 36
2. Métricas directas e indirectas 37
3. Métricas directas medidas en Toolshop 37

3
4. Métricas indirectas calculadas 39
5. Relación de las métricas con las características de calidad 40
6. De métrica a indicador: comparación con las metas 41
7. Interpretación de los resultados 41
Cierre del Avance 2. Matriz Inicial de Casos de Prueba 44
1. Criterios de diseño de la matriz 45
2. Matriz inicial de casos de prueba 46
3. Registro de defectos de la ronda piloto 48
4. Alcance de la automatización prevista 48
Conclusión General del Avance 2 50
Glosario General del Avance 2 51
Referencias 53
Índice de Tablas
Tabla 1. Requisitos del Avance 2 y ubicación en este documento 5
Tabla 2. Mapeo de las actividades de QA del Equipo 06 a áreas de proceso de CMMI 9
Tabla 3. Evaluación de los atributos de proceso (PA) del proceso de pruebas 10
Tabla 4. Verificación criterio por criterio del nivel de madurez y capacidad 12
Tabla 5. Hoja de ruta de mejora del proceso de QA del Equipo 06 13
Tabla 6. Verificación de la replicación del modelo de clase 14
Tabla 7. Control de los errores comunes del apartado 7 14
Tabla 8. Factores de calidad del modelo de McCall según su perspectiva 17
Tabla 9. Características de alto nivel del modelo de Boehm 18
Tabla 10. Características del modelo de calidad del producto de ISO/IEC 25010 19
Tabla 11. Comparación de los modelos McCall, Boehm, Dromey e ISO/IEC 25010 20
Tabla 12. Priorización de las características de ISO/IEC 25010 para Toolshop 21
Tabla 13. Subcaracterísticas, métricas anticipadas y técnica de evaluación 23
Tabla 14. Justificación de la elección frente a McCall, Boehm y Dromey 24
Tabla 15. Las tres dimensiones de la calidad aplicadas al proyecto de aula 27
Tabla 16. Indicadores de calidad de producto por característica priorizada 28
Tabla 17. Pasos del proceso de pruebas del equipo sobre Toolshop 29
Tabla 18. Indicadores de calidad de proceso 30

4
Tabla 19. Gestión e indicadores de calidad de proyecto 30
Tabla 20. Riesgos del proyecto y plan de respuesta 31
Tabla 21. Restricciones de tiempo y costo y su efecto en el alcance 32
Tabla 22. Efecto de una falla en cada dimensión dentro del proyecto 33
Tabla 23. Diferencia entre medida, métrica e indicador en nuestro caso 36
Tabla 24. Comparación entre métricas directas e indirectas 37
Tabla 25. Métricas directas obtenidas en la ronda piloto de pruebas 38
Tabla 26. Casos y defectos por módulo del alcance 39
Tabla 27. Métricas indirectas: fórmula, cálculo y valor obtenido 39
Tabla 28. Relación entre las métricas y las características priorizadas de ISO/IEC 25010 40
Tabla 29. Valores obtenidos frente a las metas del equipo 41
Tabla 30. Matriz inicial de casos de prueba del Equipo 06 46
Tabla 31. Registro de defectos detectados en la ronda piloto 48

5
Presentación del Avance 2
Este documento consolida el Avance 2 del proyecto de aula de Gestión y Calidad del
Software. Reúne los apartados 7 a 10 del semestre, correspondientes a las semanas 7 a 10,
aplicados al sitio asignado al Equipo 06: Practice Software Testing, también conocido como
Toolshop, una tienda virtual de demostración que comercializa herramientas de ferretería y que
fue construida como entorno de práctica para pruebas de software.
Los cuatro apartados no son trabajos independientes, sino un solo razonamiento
encadenado. El apartado 7 ubica la madurez de nuestro proceso de aseguramiento de calidad y
fija una hoja de ruta. El apartado 8 elige el modelo con el que se juzgará la calidad del producto
y prioriza sus características. El apartado 9 distingue las tres dimensiones de la calidad
(producto, proceso y proyecto) y analiza las restricciones de tiempo y costo bajo las que
trabajamos. El apartado 10 convierte todo lo anterior en números, con métricas directas e
indirectas calculadas sobre una ronda piloto de pruebas. El documento cierra con la matriz inicial
de casos de prueba, que es la fuente de la que salen esas mediciones y el insumo del Avance 3.
Para facilitar la revisión, la Tabla 1 indica dónde se desarrolla cada uno de los cinco
requisitos que la guía del proyecto exige para este avance.
Tabla 1
Requisitos del Avance 2 y ubicación en este documento
N.° Requisito de la guía del proyecto Dónde se desarrolla
1 Ubicar la madurez del proceso frente a CMMI e Apartado 7, secciones 2 a 5 (Tablas 2 a 5).
ISO/IEC 15504 (SPICE).
2 Elegir y justificar un modelo de calidad y sus Apartado 8, secciones 3 y 4 (Tablas 11, 12 y
factores. 14).
3 Distinguir calidad de producto y de proceso, y Apartado 9, secciones 1 a 6 (Tablas 15 a 22).
analizar las restricciones de tiempo y costo.
4 Definir las métricas directas e indirectas. Apartado 10, secciones 2 a 6 (Tablas 24 a 29).

6
N.° Requisito de la guía del proyecto Dónde se desarrolla
5 Diseñar la primera versión de los casos de prueba Cierre del Avance 2, secciones 2 a 4 (Tablas 30
(mínimo ocho manuales) e indicar cuáles se y 31).
automatizarán.
Nota. Elaboración propia a partir de la guía del proyecto de aula (Universidad Cooperativa de
Colombia, 2026).
Una aclaración metodológica que atraviesa todo el documento: trabajamos como
auditores de caja negra. No desarrollamos el sitio ni tenemos acceso a su código fuente ni a su
infraestructura, de modo que lo que evaluamos es el producto tal como lo percibe un usuario, y
lo que ubicamos en CMMI y en SPICE es la madurez del proceso de aseguramiento de calidad
del Equipo 06, no la de la empresa que construyó Toolshop.

7
INICIA EL APARTADO 7
Normas II: CMMI e ISO/IEC 15504 (SPICE)
Madurez de nuestro proceso de QA · Semana 7

8
Apartado 7. Normas II: CMMI e ISO/IEC 15504 (SPICE)
Este apartado desarrolla la aplicación de la teoría de CMMI y de ISO/IEC 15504
(SPICE), vista en la semana 7, al sitio asignado al Equipo 06. Toma como evidencia el Avance 1,
es decir, el diagnóstico de calidad y el plan de aseguramiento de calidad del software ya
entregados.
1. El Sitio y el Alcance de Nuestro QA
Practice Software Testing, también conocido como Toolshop, es una tienda virtual de
demostración que comercializa herramientas de ferretería y que fue diseñada específicamente
como entorno de práctica para pruebas de software. Su flujo principal replica el de cualquier
comercio electrónico real: registro e inicio de sesión, navegación del catálogo con filtrado por
categorías como Hand Tools y Power Tools y por marcas como ForgeFlex Tools, ficha de
producto con precio, imagen, indicador de inventario y etiqueta de huella de carbono (CO2),
carrito y checkout con dirección de facturación y selección del método de pago.
El sitio incorpora de manera deliberada comportamientos y datos anómalos que lo hacen
útil como banco de pruebas: productos marcados como agotados, metadatos de marca sin
correspondencia comercial real y mezcla de idiomas en la interfaz. Precisamente esas anomalías
fueron las que detectamos y documentamos en el Avance 1.
El alcance de nuestro proceso de QA en el Avance 2 es el siguiente:
● Incluido: autenticación de usuarios; catálogo; filtros por categoría y por marca;
integridad de los datos de la ficha de producto (precio, imagen, métrica de CO2 y
disponibilidad); consistencia idiomática de la interfaz; carrito de compras, con sus
cantidades y totales; y flujo de checkout, incluido el bloqueo de compra de productos
agotados.

9
● Excluido: auditoría de la infraestructura de servidores, pruebas de carga y
rendimiento, y revisión del código fuente. Trabajamos como auditores de caja negra,
tal como se declaró en el numeral 4 del Avance 1.
Una aclaración metodológica resulta clave: lo que ubicamos en CMMI y en SPICE no es
la madurez de la empresa que desarrolló Practice Software Testing, sino la madurez del proceso
de aseguramiento de calidad que el Equipo 06 aplica sobre ese sitio.
2. Mapeo de Nuestras Actividades de QA a Áreas de Proceso de CMMI
La Tabla 2 conecta cada actividad realmente ejecutada y documentada en el Avance 1 con
el área de proceso de CMMI que le corresponde (Chrissis et al., 2011; ISACA, 2023). Este
mapeo es la evidencia sobre la cual se sustenta la ubicación del nivel en la sección 4.
Tabla 2
Mapeo de las actividades de QA del Equipo 06 a áreas de proceso de CMMI
Actividad de QA ya realizada (evidencia Área CMMI Qué demuestra en nuestro proceso
del Avance 1)
Plan de SQA con alcance delimitado, PPQA El aseguramiento de calidad se planifica de
exclusiones explícitas y actividades de forma consciente y se controla; no se improvisa.
verificación y validación (numeral 4 del
Avance 1).
Adopción y justificación de un enfoque de PPQA Existe un criterio de calidad acordado por el
calidad (Crosby: conformidad con los equipo que guía las revisiones.
requisitos y cero defectos), con descarte
razonado del modelo de Deming.
Checklist de UI/UX y funcionalidad aplicado VER Verificamos el producto frente a criterios
al catálogo, con cuatro criterios y resultado de definidos previamente, no frente a percepciones
cumple o falla por módulo. sueltas.
Revisiones por pares de los hallazgos de VER / PPQA Los hallazgos se validan entre integrantes antes
interfaz para descartar anomalías de caché de reportarse: hay control de la calidad del
local. propio QA.
Diseño de pruebas funcionales de extremo a VAL Validamos que el sitio se comporta como el
extremo: filtros combinados y forzado de usuario final espera y que bloquea acciones
checkout sobre un producto con etiqueta de inválidas.
agotado.

10
Actividad de QA ya realizada (evidencia Área CMMI Qué demuestra en nuestro proceso
del Avance 1)
Evaluación del producto bajo ISO/IEC 25010 VER / PPQA Usamos un referente normativo externo como
en tres características: adecuación funcional, criterio de evaluación, no juicios subjetivos.
capacidad de interacción o usabilidad, y
seguridad.
Diagrama causa-efecto (Ishikawa, modelo MA (inicio) Iniciamos el análisis de causas, aunque todavía
6M) sobre la inconsistencia de idioma y los de forma cualitativa y sin datos cuantitativos.
metadatos residuales.
Consolidación del informe del Avance 1 y de CM (básico) Control incipiente de configuración: existe
las capturas de evidencia en una carpeta custodia de evidencias, pero sin versionado
compartida del equipo. formal.
Nota. Elaboración propia. PPQA = aseguramiento de calidad de proceso y producto; VER =
verificación; VAL = validación; MA = medición y análisis; CM = gestión de configuración.
3. Mini-Evaluación SPICE del Proceso de Pruebas
Evaluamos el proceso de pruebas y verificación del equipo atributo por atributo, con la
escala N, P, L y F de ISO/IEC 15504 (ISO/IEC, 2003; ISO/IEC, 2015). Cada calificación se
sustenta en la evidencia disponible a la fecha, como muestra la Tabla 3.
Tabla 3
Evaluación de los atributos de proceso (PA) del proceso de pruebas
Atributo de Qué evalúa Evidencia en el Equipo 06 Calificación
proceso (PA)
PA 1.1 Desempeño ¿Se ejecutan La inspección del catálogo y de los filtros F. Totalmente
del proceso pruebas y logran su produjo hallazgos reales y reproducibles: logrado
propósito? marcas comodín y mezcla de idiomas.
PA 2.1 Gestión del ¿Se planifica y se Hay plan de SQA con alcance, exclusiones L. Ampliamente
desempeño controla el QA? y actividades de verificación y validación, logrado
pero sin cronograma detallado ni
asignación formal de responsables por
módulo.
PA 2.2 Gestión de ¿Se controlan casos, Existen informe y capturas, pero no hay P. Parcialmente
productos de trabajo evidencias y registro de defectos con identificador, logrado
defectos? severidad y estado, ni nomenclatura ni
versionado de los artefactos.
PA 3.1 Definición ¿Hay un proceso de No existe aún un procedimiento escrito ni N. No logrado
del proceso pruebas estándar y una plantilla única de casos de prueba para
documentado? todo el equipo.

11
Atributo de Qué evalúa Evidencia en el Equipo 06 Calificación
proceso (PA)
PA 3.2 Despliegue ¿Todo el equipo usa Cada integrante inspeccionó el sitio con N. No logrado
del proceso ese estándar? criterio propio; la unificación se hizo al
consolidar el informe y no durante la
ejecución.
PA 4.1 Medición del ¿Se mide el proceso No se habían definido ni recolectado N. No logrado
proceso con datos? métricas de densidad de defectos, cobertura
o porcentaje de casos ejecutados.
Nota. Elaboración propia. N = no logrado; P = parcialmente logrado; L = ampliamente logrado;
F = totalmente logrado. La calificación corresponde al estado del proceso al cerrar el Avance 1.
La lectura del resultado es la siguiente: el nivel 1 está totalmente logrado (F) y los
atributos del nivel 2 están en L y en P, de modo que aún no se cumple la regla que exige tener
todos los atributos del nivel en L o en F. Por eso ubicamos el proceso en SPICE nivel 1
consolidado, en camino al nivel 2.
4. Ubicación de la Madurez y Justificación
Ubicamos el proceso de QA del Equipo 06 sobre Practice Software Testing en CMMI
nivel 2 (Gestionado), en fase de consolidación, y en ISO/IEC 15504 (SPICE) nivel 1 en camino
al nivel 2.
Justificación del nivel alcanzado. Superamos claramente el nivel 1 (Inicial o Realizado)
porque nuestro trabajo de calidad no fue improvisado. Antes de inspeccionar el sitio definimos
un enfoque de calidad explícito (Crosby, 1979), delimitamos un alcance con exclusiones,
formulamos un plan de SQA que separa actividades de verificación y de validación, aplicamos
un checklist con criterios establecidos de antemano, analizamos las causas con Ishikawa 6M y
encuadramos los hallazgos en la taxonomía de ISO/IEC 25010. Todo ello constituye
planificación, ejecución conforme a lo planeado y revisión de los resultados, que es exactamente
lo que exige el nivel 2.

12
Justificación de la brecha. No alcanzamos el nivel 3 (Definido o Establecido) porque el
proceso no está estandarizado ni documentado: no existe un procedimiento de pruebas escrito ni
una plantilla única de casos de prueba que todos los integrantes usen de la misma manera, y la
consistencia se logró al momento de redactar el informe y no durante la ejecución. Tampoco
alcanzamos el nivel 4 (Gestionado cuantitativamente o Predecible) porque, aunque el enfoque de
Crosby exige cero defectos, al cerrar el Avance 1 todavía no medíamos con datos: no había
densidad de defectos por módulo, ni porcentaje de casos ejecutados, ni umbrales cuantitativos de
aceptación. El Ishikawa del Avance 1 es un análisis cualitativo de causas posibles, no un análisis
de causa raíz sustentado en datos de defectos registrados. La Tabla 4 verifica esta ubicación
criterio por criterio.
Tabla 4
Verificación criterio por criterio del nivel de madurez y capacidad
Criterio del nivel Evidencia en nuestro QA sobre Toolshop ¿Se cumple?
Nivel 1. El proceso se Se inspeccionó el catálogo, los filtros y el flujo de Sí (F)
realiza y logra su propósito. compra, y se obtuvieron hallazgos concretos: metadatos
de marca no reales e internacionalización inconsistente.
Nivel 2. Se planifica, se Plan de SQA, checklist de UI/UX, enfoque de Crosby, Sí, en consolidación
controla y se gestiona. pruebas de extremo a extremo diseñadas, revisión por (L)
pares y evidencias consolidadas.
Nivel 3. Estandarizado y No hay procedimiento de pruebas escrito ni plantilla Todavía no
documentado para todo el única de casos; cada integrante aplicó criterio propio
equipo. durante la inspección.
Nivel 4. Medido y Al cerrar el Avance 1 no había registro de defectos con No
controlado con datos. severidad ni métricas de cobertura o densidad, ni
umbrales cuantitativos.
Nivel 5. Mejora continua e No aplica todavía: requiere datos históricos de varios No
innovación del proceso. ciclos de prueba.
Nota. Elaboración propia.

13
5. Análisis de Brecha y Hoja de Ruta de Mejora
El nivel objetivo al final del proyecto es CMMI nivel 3 (Definido) y SPICE nivel 3
(Establecido), con las bases del nivel 4 sembradas mediante métricas. La brecha se concentra en
tres frentes: la falta de estandarización del proceso de pruebas, el control insuficiente de los
productos de trabajo (casos, evidencias y defectos) y la ausencia de medición. La Tabla 5
presenta las acciones que atacan cada frente, con la semana en que se ejecutan según el
cronograma oficial del proyecto.
Tabla 5
Hoja de ruta de mejora del proceso de QA del Equipo 06
Acción de mejora Atributo o área Lleva el QA a Cuándo
que cierra
Redactar el procedimiento de pruebas del PA 3.1 / VER Nivel 3 (Definido) Semana 10
equipo (roles, criterios de entrada y salida,
forma de reportar un hallazgo) y una
plantilla única de casos con identificador,
precondición, pasos, datos, resultado
esperado y resultado obtenido.
Construir la matriz inicial de casos de PA 3.2 / VAL Nivel 3 Semana 10
prueba de los módulos del alcance: (Establecido)
autenticación, catálogo, filtros, ficha de
producto, carrito y checkout con producto
agotado.
Definir y calcular las métricas: densidad de PA 4.1 / MA Bases del nivel 4 Semana 10, con
defectos por módulo, porcentaje de casos (Predecible) cálculo de producto
ejecutados, porcentaje de casos que pasan y y KPI en las
tiempo de respuesta, con umbrales acordes semanas 11 y 12
al criterio de cero defectos de Crosby.
Definir el repositorio compartido con PA 2.2 / CM Consolida el nivel 2 Semana 12
control de versiones y nomenclatura de hacia el 3
evidencias, e implantar un registro de
defectos con identificador, módulo,
severidad, estado y responsable.
Completar el diseño de los casos de prueba PA 3.1 / VAL Nivel 3 Semana 13
por niveles y tipos, separando los manuales
de los automatizados.
Ejecutar la matriz completa de pruebas PA 1.1 / PA 2.1 Evidencia para los Semana 15
sobre Toolshop y registrar resultados y niveles 3 y 4
defectos de forma sistemática.

14
| Acción de mejora  | Atributo o área  | Lleva el QA a  | Cuándo  |
| ----------------- | ---------------- | -------------- | ------- |
que cierra
|                                             |                | Antesala del nivel 5  | Semanas 15 y 16  |
| ------------------------------------------- | -------------- | --------------------- | ---------------- |
| Aplicar Pareto sobre los defectos ya        | MA, camino al  |                       |                  |
| registrados y derivar acciones correctivas  | nivel 5        |                       |                  |
priorizadas, reemplazando el Ishikawa
cualitativo por un análisis basado en datos.
Nota. Elaboración propia. Las semanas corresponden al cronograma de la guía del proyecto de
aula (Universidad Cooperativa de Colombia, 2026).
6. Verificación de la Replicación del Modelo
El modelo de clase pide replicar la estructura del ejemplo trabajado con el sitio asignado.
La Tabla 6 verifica que cada elemento exigido quedó efectivamente desarrollado.
Tabla 6
Verificación de la replicación del modelo de clase
Elemento exigido por el modelo  ¿Dónde se desarrolla?  Estado
Sitio y alcance del QA.  Sección 1 del apartado 7.  Completo
Mapeo de actividades de QA a áreas  Sección 2, Tabla 2: ocho actividades mapeadas  Completo
| de proceso de CMMI.  a PPQA, VER, VAL, MA y CM.  |     |     |     |
| ------------------------------------------------ | --- | --- | --- |
Completo
Mini-evaluación SPICE con escala N,  Sección 3, Tabla 3: seis atributos de proceso
| P, L y F.  calificados.  |     |     |     |
| ------------------------ | --- | --- | --- |
Ubicación del nivel en CMMI y  Sección 4: justificación del nivel alcanzado y  Completo
| SPICE con tabla de criterios y  de la brecha, con la Tabla 4.  |     |     |     |
| -------------------------------------------------------------- | --- | --- | --- |
justificación.
Completo
Análisis de brecha y hoja de ruta con  Sección 5, Tabla 5: siete acciones fechadas
| semanas.  entre las semanas 10 y 16.  |     |     |     |
| ------------------------------------- | --- | --- | --- |
Párrafo de conclusión adaptado al  Sección 8 del apartado 7.  Completo
caso.
Nota. Elaboración propia.
7. Errores Comunes y Cómo los Evitamos
El modelo advierte cinco errores frecuentes en este apartado. La Tabla 7 declara cómo
cada uno fue evitado en este trabajo.

15
Tabla 7
Control de los errores comunes del apartado 7
Error común señalado en el modelo Cómo lo evitamos en este documento
Copiar las definiciones de CMMI y Cada nivel y cada atributo se califica citando evidencia concreta del
SPICE sin aplicarlas al sitio. Avance 1: el plan de SQA, el checklist, el Ishikawa 6M y el encuadre
en ISO/IEC 25010.
Declarar un nivel alto (4 o 5) sin Nos ubicamos en CMMI nivel 2 y en SPICE nivel 1 en camino al 2,
evidencia. que es lo coherente con la evidencia disponible; los niveles 4 y 5 se
declaran expresamente como no cumplidos y se explica por qué.
Confundir el proceso del equipo con el En la sección 1 se aclara que lo evaluado es el proceso de QA del
de la empresa que creó el sitio. Equipo 06 y no el proceso de desarrollo de Practice Software Testing,
cuyo código no auditamos por trabajar en caja negra.
No explicar la brecha, es decir, por qué La sección 4 dedica un párrafo completo a la brecha y la Tabla 4 marca
no se alcanza el nivel superior. criterio por criterio lo que aún no se cumple.
No conectar la madurez con las La hoja de ruta de la sección 5 fija las métricas concretas y las semanas
métricas y las pruebas que vienen en que alimentan este avance y el Avance 3; esas métricas se
después. desarrollan en el apartado 10 de este mismo documento.
Nota. Elaboración propia.
8. Conclusión del Apartado 7
El proceso de QA del Equipo 06 sobre Practice Software Testing se ubica hoy en CMMI
nivel 2 (Gestionado) y en SPICE nivel 1 en camino al 2, porque ya planificamos, ejecutamos y
revisamos las actividades de calidad con un enfoque declarado —la conformidad con los
requisitos y el cero defectos de Crosby—, un plan de SQA con alcance definido, un checklist
aplicado al catálogo, un análisis de causas con Ishikawa 6M y un encuadre normativo en
ISO/IEC 25010. Sin embargo, ese proceso todavía no está estandarizado ni documentado como
procedimiento del equipo, y no se mide con datos, razón por la cual no podemos reclamar el
nivel 3 ni el 4. Nuestra meta para el cierre del proyecto es alcanzar el nivel 3 mediante la matriz
estándar de casos de prueba y el procedimiento escrito, y sentar las bases del nivel 4 con métricas
de densidad de defectos y de cobertura. Esta ubicación orienta el resto del Avance 2: entre más
maduro sea nuestro proceso, más confiables y defendibles serán las conclusiones de calidad que

16
emitamos sobre el sitio, en especial sobre los defectos de internacionalización y de metadatos
residuales detectados en el Avance 1.

17
INICIA EL APARTADO 8
Modelos de Calidad del Producto
McCall, Boehm, Dromey e ISO/IEC 25010: elección y justificación · Semana 8

18
Apartado 8. Modelos de Calidad del Producto
En el apartado 7 ubicamos la madurez de nuestro proceso de aseguramiento de calidad.
En este apartado cambiamos el foco hacia la calidad del producto: qué características hacen que
Toolshop sea un software de calidad y cómo descomponerlas en factores medibles. Presentamos
y comparamos los cuatro modelos vistos en la semana 8, elegimos uno, justificamos la elección y
seleccionamos las características que vamos a priorizar.
1. Marco Conceptual de los Modelos de Calidad
Un modelo de calidad es una forma estructurada de descomponer una noción abstracta,
«la calidad», en características observables y medibles (Pressman & Maxim, 2021). Aunque cada
modelo lo hace de manera distinta, todos persiguen el mismo fin: que la calidad deje de ser una
opinión y pase a ser algo que se puede verificar con evidencia.
1.1 Modelo de McCall (1977)
McCall et al. (1977) propusieron uno de los primeros modelos de calidad. Organiza la
calidad en 11 factores, que representan la vista externa del usuario, agrupados en tres
perspectivas del ciclo de vida. Cada factor se descompone en criterios, que son la vista interna
del desarrollador, y cada criterio en métricas. Su principal aporte es precisamente esa cadena de
factor, criterio y métrica, que permite pasar de una idea general como «que sea usable» a algo
que se puede medir, como muestra la Tabla 8.
Tabla 8
Factores de calidad del modelo de McCall según su perspectiva
Perspectiva Factores de calidad Pregunta que responde
Operación del producto Corrección, fiabilidad, eficiencia, integridad y ¿Funciona bien y se puede usar
(uso) usabilidad. hoy?
Revisión del producto Facilidad de mantenimiento, flexibilidad y ¿Se puede corregir, cambiar y
(cambios) facilidad de prueba. probar?

19
Perspectiva Factores de calidad Pregunta que responde
Transición del producto Portabilidad, reusabilidad e interoperabilidad. ¿Se adapta a otros entornos y
(entorno) sistemas?
Nota. Adaptado de McCall et al. (1977) y de Pressman y Maxim (2021).
1.2 Modelo de Boehm (1978)
Boehm et al. (1978) plantean un modelo jerárquico que parte de la utilidad general del
software, es decir, de si vale la pena usarlo y mantenerlo, y la descompone en características de
alto nivel, luego intermedias y finalmente primitivas medibles. Frente a McCall, Boehm otorga
más peso a la mantenibilidad y a la portabilidad, y considera la utilidad para distintos tipos de
usuario (ver Tabla 9).
Tabla 9
Características de alto nivel del modelo de Boehm
Característica de alto nivel Qué agrupa
Utilidad tal cual (as-is utility) Fiabilidad, eficiencia e ingeniería humana (usabilidad): que el software sirva y
funcione ya.
Facilidad de mantenimiento Facilidad de prueba, comprensibilidad y modificabilidad: que el software se
pueda sostener en el tiempo.
Portabilidad Que el software pueda usarse en otro entorno o plataforma con pocos cambios.
Nota. Adaptado de Boehm et al. (1978).
1.3 Modelo de Dromey (1995)
Dromey (1995) aborda la calidad desde las propiedades del producto. Relaciona los
componentes tangibles del software (módulos, variables y expresiones) con cuatro tipos de
propiedades que llevan calidad —de corrección, internas, contextuales y descriptivas— y estas
con atributos de alto nivel. Su valor está en que permite construir la calidad desde el diseño y el
código. Sin embargo, en nuestro proyecto trabajamos sobre un sitio de terceros con un enfoque
de caja negra, por lo que no tenemos acceso a los componentes internos que este modelo necesita
evaluar.

20
1.4 ISO/IEC 25010
La norma ISO/IEC 25010 es el estándar internacional vigente para la calidad del
software. Forma parte de la familia SQuaRE (ISO/IEC 2500n) y es la sucesora de la ISO/IEC
9126 (ISO/IEC, 2011, 2014). Define un modelo de calidad del producto con ocho características,
cada una con sus subcaracterísticas, y un modelo aparte de calidad en uso que comprende
efectividad, eficiencia, satisfacción, ausencia de riesgo y cobertura del contexto. La Tabla 10
resume las ocho características.
Tabla 10
Características del modelo de calidad del producto de ISO/IEC 25010
| Característica  | Qué significa  | Subcaracterísticas  |
| --------------- | -------------- | ------------------- |
1. Adecuación funcional  Que las funciones existan y hagan lo  Completitud, corrección y pertinencia
|     | correcto.  | funcional.  |
| --- | ---------- | ----------- |
2. Eficiencia de  Que responda rápido y use bien los  Comportamiento temporal, uso de recursos
| desempeño  | recursos.  | y capacidad.  |
| ---------- | ---------- | ------------- |
3. Compatibilidad  Que conviva e intercambie  Coexistencia e interoperabilidad.
información con otros sistemas.
4. Usabilidad  Que sea fácil de entender, aprender y  Reconocibilidad, aprendizaje, operabilidad,
usar.
protección frente a errores, estética y
accesibilidad.
5. Fiabilidad  Que funcione sin fallar y se recupere  Madurez, disponibilidad, tolerancia a fallos
|     | ante errores.  | y recuperabilidad.  |
| --- | -------------- | ------------------- |
6. Seguridad  Que proteja la información y controle  Confidencialidad, integridad, no repudio,
|     | el acceso.  | responsabilidad y autenticidad.  |
| --- | ----------- | -------------------------------- |
7. Mantenibilidad
Que sea fácil de modificar, analizar y  Modularidad, reusabilidad, analizabilidad,
|     | probar.  | modificabilidad y capacidad de prueba.  |
| --- | -------- | --------------------------------------- |
8. Portabilidad  Que se adapte e instale en otros  Adaptabilidad, instalabilidad y
|     | entornos.  | reemplazabilidad.  |
| --- | ---------- | ------------------ |
Nota. Adaptado de ISO/IEC (2011).
Como nota de rigor, la revisión ISO/IEC 25010:2023, que citamos en el Avance 1, añadió
la seguridad funcional (safety) como novena característica y renombró algunas otras: la
usabilidad pasó a llamarse capacidad de interacción y la portabilidad, flexibilidad (ISO/IEC,

21
2023). En este apartado trabajamos con las ocho características clásicas de la versión 2011, que
son las del curso, y mantenemos la equivalencia con los términos de 2023 para no perder
coherencia con lo que ya escribimos.
1.5 Comparación de los Modelos
La Tabla 11 compara los cuatro modelos según su estructura, su enfoque, su principal
fortaleza y su limitación para un proyecto como el nuestro.
Tabla 11
Comparación de los modelos McCall, Boehm, Dromey e ISO/IEC 25010
| Aspecto  | McCall (1977)  | Boehm (1978)  | Dromey (1995)  |     |
| -------- | -------------- | ------------- | -------------- | --- |
ISO/IEC 25010
(2011)
Estructura  11 factores, criterios  Utilidad general,  Componentes del  8 características y
|     | y métricas  | características  | producto,  | subcaracterísticas,  |
| --- | ----------- | ---------------- | ---------- | -------------------- |
más calidad en uso
|     |     | intermedias y  | propiedades y         |     |
| --- | --- | -------------- | --------------------- | --- |
|     |     | primitivas     | atributos de calidad  |     |
Enfoque  Vista del usuario y  Utilidad para  Propiedades internas  Estándar
del desarrollador  distintos tipos de  del diseño y del  internacional de
|     |     | usuario  | código  | producto y de uso  |
| --- | --- | -------- | ------- | ------------------ |
Fortaleza
Pionero; enlaza  Da peso a la  Permite construir la  Vigente, completo y
factor, criterio y  mantenibilidad y a la  calidad desde el  reconocido
|     | métrica  | portabilidad  | código  | internacionalmente  |
| --- | -------- | ------------- | ------- | ------------------- |
Limitación en  Antiguo; varios  Antiguo; menos  Exige acceso al  Hay que adaptarlo y
| nuestro caso  | factores se solapan  | detalle de métricas  |                 |                     |
| ------------- | -------------------- | -------------------- | --------------- | ------------------- |
|               |                      |                      | código, que no  | priorizar según el  |
|               |                      |                      | tenemos         | sitio               |
Nota. Elaboración propia a partir de McCall et al. (1977), Boehm et al. (1978), Dromey (1995) e
ISO/IEC (2011).
Los cuatro modelos coinciden en descomponer la calidad en características medibles. La
diferencia está en desde dónde miran: McCall y Boehm desde el uso y el ciclo de vida, Dromey
desde el interior del producto e ISO/IEC 25010 desde un marco normalizado que integra ambos
puntos de vista.

22
2. El Sitio y la Calidad que Prioriza
Como se describió en el apartado 7, Toolshop es una plataforma transaccional de
demostración cuyo flujo principal va del inicio de sesión al pago. En coherencia con el enfoque
de Crosby (1979) adoptado en el Avance 1, la calidad que más nos importa es la conformidad
con los requisitos del flujo de compra: en una tienda en línea no es sostenible tolerar umbrales de
error.
A partir del diagnóstico del Avance 1, la calidad de Toolshop se juega en cinco frentes.
Primero, que las funciones del flujo de compra hagan lo correcto: filtros, carrito y bloqueo de
productos agotados. Segundo, que la interfaz sea comprensible, lo cual hoy se ve afectado por la
mezcla de idiomas y por los metadatos residuales en las marcas. Tercero, que el acceso al
historial y al pago esté protegido por sesión. Cuarto, que el catálogo no muestre datos de prueba
sin depurar. Y quinto, que el sitio responda con rapidez y se comporte igual en distintos
navegadores, tal como anticipó la categoría de medio ambiente de nuestro diagrama de Ishikawa.
3. Modelo Elegido y Justificación
Elegimos ISO/IEC 25010 como modelo de calidad del proyecto por cuatro razones.
Primera, da continuidad a lo que ya hicimos: en el Avance 1 evaluamos Toolshop con la familia
ISO/IEC 25000 (SQuaRE) y con tres características de ISO/IEC 25010, de modo que el proyecto
queda coherente de principio a fin. Segunda, es el estándar internacional vigente, mientras que
McCall y Boehm son modelos históricos de los años setenta. Tercera, sus características se
pueden observar y probar desde la caja negra, que es exactamente nuestra posición frente al sitio.
Y cuarta, distingue la calidad del producto de la calidad en uso, lo que nos permite separar las
pruebas funcionales, por ejemplo que el filtro devuelva lo correcto, de la experiencia del usuario,
por ejemplo que un comprador hispanohablante entienda la interfaz.

23
Además, la norma cuenta con una guía complementaria de medición, ISO/IEC 25023
(ISO/IEC, 2016), que propone medidas del tipo X igual a A sobre B para cada subcaracterística.
Esto facilita el paso siguiente del avance: definir métricas con fórmula y no solo con intuición,
tal como se desarrolla en el apartado 10.
4. Características Priorizadas para Practice Software Testing
No todas las características pesan igual en nuestro sitio. La Tabla 12 asigna a cada una de
las ocho características un nivel de prioridad y lo justifica con la evidencia del diagnóstico del
Avance 1.
Tabla 12
Priorización de las características de ISO/IEC 25010 para Toolshop
Característica Prioridad Justificación con evidencia del Avance 1
Usabilidad (capacidad Alta Es la característica peor evaluada: el checklist registró dos fallas —mezcla
de interacción) de idiomas en una misma vista y marcas con metadatos de relleno como
«some name»— y la evaluación ISO del Avance 1 la calificó como falla.
Adecuación funcional Alta Es el núcleo transaccional del sitio. Los filtros por categoría cumplieron,
pero falta validar el carrito, el checkout y el bloqueo de productos
agotados, que es la prueba de extremo a extremo diseñada en el plan de
SQA.
Seguridad Alta El sitio maneja sesión, historial de compras y pago. En el Avance 1
comprobamos que no se accede sin un token de sesión válido; debe
confirmarse con casos formales.
Fiabilidad Media Los datos de prueba sin depurar en la base de datos, causa de tipo material
del Ishikawa, indican defectos residuales que afectan la madurez del
producto.
Eficiencia de Media El sitio presenta inventario en tiempo real y consume una API para el
desempeño catálogo, causa de tipo máquina del Ishikawa; el tiempo de respuesta de
filtros y catálogo es observable desde el navegador.
Portabilidad Media-baj Solo priorizamos la adaptabilidad: el Ishikawa señaló posibles diferencias
a entre navegadores. La instalabilidad y la reemplazabilidad no aplican a un
sitio web de terceros.
Compatibilidad Baja No evaluamos la integración con otros sistemas; el alcance de QA excluye
la infraestructura del servidor.
Mantenibilidad Baja Requiere acceso al código fuente, que no tenemos por trabajar en caja
negra.

24
Nota. Elaboración propia. La prioridad se asignó según la evidencia de fallas del Avance 1 y la
posibilidad real de evaluar la característica desde la caja negra.
Dejamos explícitamente la compatibilidad y la mantenibilidad con prioridad baja, no
porque carezcan de importancia, sino porque no podemos evaluarlas con rigor sin acceso al
código ni a la infraestructura del sitio. Priorizarlas implicaría afirmar resultados que no
podríamos respaldar con evidencia.
4.1 Cómo Evaluaremos Cada Característica Priorizada
Siguiendo la lógica de factor, criterio y métrica de McCall et al. (1977) y el formato de
medidas de ISO/IEC 25023 (ISO/IEC, 2016), la Tabla 13 anticipa para cada característica
priorizada su subcaracterística clave, la métrica que usaremos y la técnica de evaluación.
Tabla 13
Subcaracterísticas, métricas anticipadas y técnica de evaluación
Característica Subcaracterística Métrica anticipada (fórmula y Técnica de evaluación
clave meta)
Usabilidad Reconocibilidad y Consistencia idiomática: X = Checklist de UI/UX por
operabilidad etiquetas en el idioma seleccionado / vista, con el selector de
etiquetas visibles. Meta: 100 %. idioma en español.
Usabilidad Protección frente a X = acciones inválidas con mensaje Casos negativos: login
errores claro / acciones inválidas probadas. inválido, checkout de
Meta: 100 %. producto agotado y campos
vacíos.
Adecuación Corrección funcional X = casos del flujo aprobados / casos Casos de extremo a extremo:
funcional ejecutados. Meta: ≥ 90 %. login, filtros, ficha, carrito y
checkout.
Adecuación Completitud X = funciones del alcance operativas Matriz de trazabilidad de las
funcional funcional / funciones del alcance. Meta: 100 %. funciones del alcance de QA.
Seguridad Autenticidad y X = accesos sin sesión bloqueados / Casos de acceso directo por
confidencialidad accesos sin sesión intentados. Meta: URL a historial, cuenta y
100 %. pago sin sesión.
Fiabilidad Madurez Densidad de defectos = defectos Registro de defectos por
confirmados / casos ejecutados. módulo: catálogo, filtros,
Meta: ≤ 0,20. carrito y checkout.

25
Característica Subcaracterística Métrica anticipada (fórmula y Técnica de evaluación
clave meta)
Eficiencia de Comportamiento Tiempo medio de carga del catálogo Medición con la pestaña
desempeño temporal y de respuesta al aplicar un filtro, en Network de las herramientas
segundos. Meta: ≤ 3 s. de desarrollador.
Portabilidad Adaptabilidad X = casos críticos aprobados en todos Casos críticos en dos
los entornos / casos críticos. Meta: navegadores y dos
100 %. resoluciones: escritorio y
móvil.
Nota. Elaboración propia. X = A / B, donde un valor cercano al 100 % indica mejor calidad,
salvo en la densidad de defectos y en el tiempo de respuesta, donde un valor menor es mejor. Las
metas se retoman y se contrastan con los valores reales en el apartado 10.
5. Enlace con el Avance 1 y con el Apartado 7
Las características priorizadas no salen de la nada. La usabilidad concentra las dos fallas
del checklist y responde a las causas de método —falta de un protocolo de localización— y de
mano de obra —ausencia de pruebas de regresión visual— del Ishikawa. La fiabilidad responde
a la causa material, es decir, los registros de prueba sin depurar; la eficiencia de desempeño, a la
causa máquina, la desincronización con la API; y la adaptabilidad, a la causa de medio ambiente,
las diferencias entre navegadores. La adecuación funcional y la seguridad dan continuidad a las
dos características que en el Avance 1 calificamos como cumple y que ahora debemos confirmar
con casos formales.
El enlace con el apartado 7 es igualmente directo: allí nos comprometimos a definir
métricas de densidad de defectos, cobertura y tiempo de respuesta. Las métricas de la Tabla 13
son esas mismas métricas, ahora ancladas a características concretas de ISO/IEC 25010 y con
una meta cuantitativa, que es lo que exige avanzar hacia el nivel 4 de madurez.
6. Justificación Frente a los Otros Modelos
Elegir ISO/IEC 25010 no significa desechar los demás modelos. La Tabla 14 explica por
qué no tomamos cada uno como modelo principal y qué rescatamos de él para nuestro trabajo.

26
Tabla 14
Justificación de la elección frente a McCall, Boehm y Dromey
Modelo ¿Por qué no lo elegimos como principal? Qué rescatamos de él
McCall (1977) Es antiguo, varios de sus factores se solapan La cadena de factor, criterio y métrica, que
—por ejemplo, corrección y fiabilidad— y no usamos en la Tabla 13 para pasar de cada
está alineado con la familia ISO/IEC 25000 característica a una métrica concreta.
que usamos desde el Avance 1.
Boehm (1978) Es antiguo, está centrado en la utilidad Su énfasis en la portabilidad, que nos llevó a
general del software y ofrece menos incluir la adaptabilidad entre navegadores, y
subcaracterísticas medibles para un flujo de en la mantenibilidad, que dejamos en el radar.
comercio electrónico.
Dromey (1995) Se centra en propiedades internas del diseño Sería la mejor opción si nosotros
y del código, que no controlamos al evaluar construyéramos el software; nos recuerda que
un sitio de terceros en caja negra. los defectos de datos, como las marcas «some
name», nacen en el producto interno.
Nota. Elaboración propia.
7. Conclusión del Apartado 8
Para nuestro proyecto sobre Practice Software Testing elegimos el modelo de calidad
ISO/IEC 25010, porque continúa el marco ISO/IEC 25000 que usamos desde el Avance 1, es el
estándar vigente y sus características se pueden evaluar desde la caja negra. De sus ocho
características priorizamos con nivel alto la usabilidad, la adecuación funcional y la seguridad;
con nivel medio la fiabilidad y la eficiencia de desempeño; y, de forma acotada, la adaptabilidad
dentro de la portabilidad. Estas son las que podemos observar en el flujo de compra y las que
concentran los problemas del diagnóstico, en especial la mezcla de idiomas y los metadatos
residuales del catálogo. Descartamos McCall y Boehm como modelo principal por ser anteriores
y menos alineados con el estándar, y Dromey por requerir acceso al código; aun así, rescatamos
de ellos la relación entre factor, criterio y métrica, y la atención a la portabilidad. Las
características priorizadas y sus métricas son la base del apartado 10 y de los casos de prueba del
cierre de este avance.

27
INICIA EL APARTADO 9
Calidad de Producto, Proceso y Proyecto
Las tres dimensiones de la calidad y las restricciones del proyecto · Semana 9

28
Apartado 9. Calidad de Producto, Proceso y Proyecto
Hasta aquí hemos mirado la madurez de nuestro proceso (apartado 7) y la calidad del
producto (apartado 8). Este apartado integra ambas miradas y añade una tercera: la calidad con
que gestionamos el trabajo como equipo, incluidas las restricciones de tiempo y de costo bajo las
que operamos.
1. Las Tres Dimensiones de la Calidad en Nuestro Caso
La calidad del software no se agota en el producto terminado. Siguiendo a Humphrey
(1989) y a Pressman y Maxim (2021), se distinguen tres dimensiones que en nuestro proyecto se
leen así. La calidad de producto es la calidad de Toolshop en sí mismo, es decir, qué tan bien el
sitio hace lo que debe hacer; la evaluamos con ISO/IEC 25010, el modelo que elegimos en el
apartado 8. La calidad de proceso es la calidad del método con el que nosotros probamos ese
sitio, o sea nuestro proceso de pruebas y su madurez, encuadrado en ISO/IEC/IEEE 12207
(2017), CMMI (ISACA, 2023) e ISO/IEC 33001 (ISO/IEC, 2015). La calidad de proyecto es la
calidad con que gestionamos el trabajo del equipo: alcance de cada avance, tiempo, costo, roles y
riesgos, con la orientación del PMBOK (Project Management Institute, 2021) e ISO 21502 (ISO,
2020).
La distinción es importante porque afirmar que «Toolshop tiene defectos de interfaz» es
un juicio sobre el producto, mientras que afirmar que «no teníamos una matriz estándar de
casos» es un juicio sobre nuestro proceso, y decir que «entregamos el avance a tiempo» es un
juicio sobre el proyecto. La Tabla 15 resume las tres dimensiones.

29
Tabla 15
Las tres dimensiones de la calidad aplicadas al proyecto de aula
Dimensión Pregunta que responde Qué se mira en nuestro caso Estándares de referencia
Producto ¿Es bueno el software? Toolshop: autenticación, ISO/IEC 25010 e ISO/IEC
catálogo, filtros, ficha de 25023.
producto, carrito y checkout.
Proceso ¿Es bueno el modo en Nuestro proceso de pruebas: ISO/IEC/IEEE 12207, CMMI
que lo probamos? planear, diseñar casos, e ISO/IEC 33001 (SPICE).
ejecutar, registrar defectos y
reportar.
Proyecto ¿Gestionamos bien el Alcance de cada avance, PMBOK (PMI) e ISO 21502.
trabajo? cronograma semanal, costo en
horas, roles del equipo y
riesgos.
Nota. Elaboración propia a partir de ISO/IEC (2011, 2015), ISO/IEC/IEEE (2017), ISACA
(2023), Project Management Institute (2021) e ISO (2020).
2. Calidad de Producto en Practice Software Testing
El producto es el sitio Toolshop. En el apartado 8 elegimos ISO/IEC 25010 como modelo
y priorizamos, con nivel alto, la usabilidad, la adecuación funcional y la seguridad; con nivel
medio, la fiabilidad y la eficiencia de desempeño; y, de forma acotada, la adaptabilidad dentro de
la portabilidad. La Tabla 16 asigna un indicador concreto a cada una de esas características.
Tabla 16
Indicadores de calidad de producto por característica priorizada
Característica Indicador de calidad de producto Evidencia de partida (Avance
priorizada 1)
Usabilidad N.° de problemas de usabilidad detectados en el Dos fallas: mezcla de idiomas
checklist de UI/UX por vista revisada. en una misma vista y marcas
con metadatos de relleno.
Adecuación funcional N.° de defectos funcionales en el flujo de login, Los filtros por categoría
filtros, ficha, carrito y checkout. cumplieron; falta validar
carrito, checkout y producto
agotado.

30
Característica Indicador de calidad de producto Evidencia de partida (Avance
priorizada 1)
Seguridad % de intentos de acceso sin sesión que el sitio No se accede al historial ni al
bloquea (meta: 100 %). pago sin un token de sesión
válido.
Fiabilidad N.° de registros del catálogo con datos de prueba Cadenas de relleno tipo «some
sin depurar detectados. name» inyectadas en los filtros
de marca.
Eficiencia de Tiempo de respuesta al cargar el catálogo y al El catálogo consume una API y
desempeño aplicar un filtro, en segundos. muestra inventario en tiempo
real.
Portabilidad N.° de diferencias de comportamiento del flujo La categoría de medio ambiente
(adaptabilidad) crítico entre dos navegadores. del Ishikawa anticipó
diferencias entre motores de
navegación.
Nota. Elaboración propia. Las características priorizadas provienen del apartado 8 y la evidencia,
del diagnóstico del Avance 1.
3. Calidad de Proceso: Nuestro Proceso de Pruebas
El proceso es la forma ordenada en que nosotros probamos Toolshop. Lo definimos en
cinco pasos repetibles, de manera que cualquier integrante del equipo pueda ejecutarlo y obtener
el mismo resultado; esa repetibilidad es justamente lo que nos falta para pasar del nivel 2 al nivel
3 de CMMI, según el diagnóstico del apartado 7. La Tabla 17 describe los pasos y la Tabla 18
define los indicadores con que mediremos el proceso.
Tabla 17
Pasos del proceso de pruebas del equipo sobre Toolshop
Paso Qué hacemos Evidencia que queda
1. Planear Definir el alcance de la prueba —autenticación, Alcance y criterios documentados en el
catálogo, filtros, ficha de producto, carrito y avance.
checkout— y los criterios de aceptación.
2. Diseñar casos Escribir los casos en una plantilla única: Matriz de casos de prueba (Tabla 30).
identificador, precondición, pasos, dato de entrada
y resultado esperado.
3. Ejecutar Correr cada caso sobre el sitio y registrar el Matriz con el resultado y la fecha de
resultado como pasa o falla. ejecución.

31
| Paso  | Qué hacemos  | Evidencia que queda  |
| ----- | ------------ | -------------------- |
4. Registrar  Documentar cada defecto: identificador, módulo,  Registro de defectos con evidencia
| defectos  |     | (Tabla 31).  |
| --------- | --- | ------------ |
paso que lo produce, resultado esperado, resultado
obtenido y captura de pantalla.
5. Reportar  Consolidar los resultados, calcular los indicadores  Informe del avance con los indicadores
|     | y concluir sobre la calidad del sitio.  | calculados.  |
| --- | --------------------------------------- | ------------ |
Nota. Elaboración propia. Este procedimiento es la acción de mejora comprometida para la
semana 10 en la hoja de ruta del apartado 7.
Tabla 18
Indicadores de calidad de proceso
| Indicador  | Cómo se calcula  | Meta del equipo  |
| ---------- | ---------------- | ---------------- |
Cobertura de pruebas  Funciones del alcance cubiertas por al  100 % de las doce funciones del
|     | menos un caso / funciones del alcance.  | alcance.                            |
| --- | --------------------------------------- | ----------------------------------- |
|     | Casos ejecutados / casos planeados.     | ≥ 90 % en cada ronda de ejecución.  |
Casos ejecutados frente a
planeados
Densidad de defectos  Defectos confirmados / casos ejecutados.  ≤ 0,20 defectos por caso.
Casos con evidencia  Casos con captura o registro / casos  100 %, requisito para el nivel 2 de
| registrada  | ejecutados.  | SPICE (PA 2.2).  |
| ----------- | ------------ | ---------------- |
Nota. Elaboración propia. Estos son los indicadores comprometidos en la hoja de ruta del
apartado 7 y los que se calculan con datos reales en el apartado 10.
4. Calidad de Proyecto: Cómo Gestionamos el Trabajo
El proyecto es la gestión de nuestro propio trabajo de QA: entregar cada avance completo
y a tiempo, con roles claros y con los imprevistos controlados. La Tabla 19 resume cómo
gestionamos cada aspecto y con qué indicador lo evaluamos.

32
Tabla 19
Gestión e indicadores de calidad de proyecto
| Aspecto  | Cómo lo gestionamos  |     | Indicador  |
| -------- | -------------------- | --- | ---------- |
Alcance
|     | Definimos al inicio de cada semana qué apartado  |     | % de alcance de la semana  |
| --- | ------------------------------------------------ | --- | -------------------------- |
|     | entra en el avance y qué queda fuera; la         |     | completado.                |
infraestructura del servidor, las pruebas de carga y
la revisión del código están excluidas desde el
Avance 1.
Tiempo
Seguimos el cronograma oficial del proyecto: el  Avances entregados en la fecha
|     | Avance 1 se entregó en la semana 6, este Avance 2  |     | pactada (sí o no).  |
| --- | -------------------------------------------------- | --- | ------------------- |
en la semana 10 y el Avance 3, con la sustentación,
en las semanas 15 y 16.
Costo
El costo del proyecto son las horas del equipo,  Horas-persona consumidas frente a las
|     | porque todas las herramientas que usamos son  |     | planeadas.  |
| --- | --------------------------------------------- | --- | ----------- |
libres. Llevamos el conteo de horas dedicadas por
avance.
Recursos y roles
Repartimos el trabajo: un integrante diseña los  Tareas asignadas frente a tareas
|     | casos, otro los ejecuta sobre el sitio y otro registra  |     | cumplidas por integrante.  |
| --- | ------------------------------------------------------- | --- | -------------------------- |
los defectos y consolida el documento; la revisión
por pares es responsabilidad de todos.
Riesgos
Anticipamos los imprevistos propios del sitio y del  N.° de riesgos identificados que
equipo, con un plan alterno para cada uno (ver  cuentan con plan de respuesta.
Tabla 20).
Nota. Elaboración propia. Los roles se acuerdan al inicio de cada avance y se registran en el acta
del equipo.
Tabla 20
Riesgos del proyecto y plan de respuesta
| Riesgo  |     | Efecto si ocurre  | Plan de respuesta  |
| ------- | --- | ----------------- | ------------------ |
El sitio de práctica restablece sus  Se pierden las evidencias de un  Capturar la evidencia en el
datos o queda fuera de servicio.  defecto o se detiene la ejecución.  momento del hallazgo y
reprogramar la ejecución al día
siguiente.
Ausencia temporal de un integrante.  Tareas sin ejecutar y avance  Roles suplentes: cada tarea tiene un
|     |     | incompleto.  | responsable principal y uno de  |
| --- | --- | ------------ | ------------------------------- |
respaldo.
Defectos no reproducibles por  Falsos positivos en el registro de  Revisión cruzada entre integrantes
diferencias de navegador o de  defectos.  antes de documentar el defecto,
| caché.  |     |     | como se definió en el plan de SQA.  |
| ------- | --- | --- | ----------------------------------- |

33
Riesgo Efecto si ocurre Plan de respuesta
Retraso en el diseño de la matriz de Se comprime el tiempo de ejecución Congelar la plantilla de casos en la
casos. de las semanas finales. semana 10 y diseñar por módulos en
paralelo.
Curva de aprendizaje de las La automatización prevista no Marcar desde ya qué casos son
herramientas de automatización. alcanza a ejecutarse en el Avance 3. automatizables y empezar por los de
login y filtros, que son los más
simples.
Nota. Elaboración propia.
5. Restricciones de Tiempo y Costo del Proyecto
Analizar la calidad sin considerar las restricciones del proyecto sería irreal: un equipo con
tiempo y presupuesto ilimitados probaría todo, pero ese no es nuestro caso. El proyecto se
desarrolla en dieciséis semanas con tres integrantes que dedican alrededor de cuatro horas
semanales cada uno fuera de clase, lo que equivale a unas ciento noventa horas-persona para
todo el semestre. El Avance 2 dispuso de cuatro de esas semanas, es decir, cerca de cuarenta y
ocho horas-persona, repartidas entre la redacción de los cuatro apartados, el diseño de la matriz
de casos y la ronda piloto de ejecución.
El costo monetario directo es cero: todas las herramientas que usamos son libres —el
navegador y sus herramientas de desarrollador, una hoja de cálculo para la matriz y el registro de
métricas, y Selenium o Playwright y Postman para la automatización prevista en el Avance 3—.
Por eso, en este proyecto el costo se gestiona como tiempo del equipo y no como dinero. La
Tabla 21 resume las restricciones y el efecto que cada una tiene sobre el alcance.

34
Tabla 21
Restricciones de tiempo y costo y su efecto en el alcance
Restricción Descripción Efecto en el alcance Decisión del equipo
Tiempo Cerca de 48 horas-persona disponibles No alcanza a probarse Limitar la ronda piloto
entre las semanas 7 y 10 para los todo el sitio en esta a 24 casos sobre los
cuatro apartados y la primera ronda. seis módulos del
ejecución. alcance y priorizar por
riesgo.
Costo Presupuesto de cero pesos; solo No se usan herramientas La matriz de casos y el
herramientas libres. de pago de gestión de registro de métricas se
pruebas. llevan en una hoja de
cálculo compartida.
Acceso al Trabajamos en caja negra, sin código Quedan fuera la Priorizar solo las
producto fuente ni acceso al servidor. mantenibilidad, la características
compatibilidad y las observables desde la
pruebas de carga. interfaz, como se
justificó en el apartado
8.
Disponibilidad del El sitio de práctica restablece sus datos Un defecto puede dejar Capturar la evidencia
entorno de forma periódica. de reproducirse entre en el mismo momento
una sesión y otra. del hallazgo y fechar
cada registro.
Competencias del La automatización de pruebas está en No es viable automatizar Marcar en la matriz qué
equipo fase de aprendizaje. dentro del Avance 2. casos son
automatizables y
ejecutar la
automatización en el
Avance 3.
Nota. Elaboración propia. Las horas-persona son una estimación del equipo con fines de
planificación.
La consecuencia práctica de estas restricciones es que nuestra estrategia no puede ser
probar todo, sino probar primero lo que más riesgo concentra. Por eso la matriz inicial cubre con
más casos los módulos donde el Avance 1 ya había detectado problemas —catálogo y filtros— y
el flujo que sostiene el negocio —carrito y checkout—, y deja para el Avance 3 las funciones
periféricas.

35
6. Cómo se Relacionan las Tres Dimensiones en Nuestro Caso
Las tres dimensiones se encadenan. El proyecto organiza el trabajo, porque el
cronograma semanal, el presupuesto de horas y el reparto de roles son los que hacen posible que
alguien alcance a diseñar y ejecutar los casos. Dentro de ese marco corre el proceso de pruebas, y
solo un proceso ordenado permite detectar de verdad los defectos del producto. A su vez, lo que
medimos en el producto nos devuelve información sobre el proceso: si en la ejecución aparecen
defectos de idioma que el checklist no había registrado, el problema no es solo del sitio, sino
también de nuestra cobertura de pruebas.
Un ejemplo concreto de nuestro caso ilustra la cadena. Si no repartimos los roles de la
semana (falla el proyecto), no alcanzamos a ejecutar los casos del checkout (falla el proceso) y
no detectamos que el sitio permite avanzar con el formulario incompleto (falla el producto), que
es justamente uno de los defectos que la ronda piloto sí encontró. La Tabla 22 generaliza este
encadenamiento.
Tabla 22
Efecto de una falla en cada dimensión dentro del proyecto
Si falla… Se nota en… Ejemplo en nuestro proyecto
El proyecto Entregas tardías o incompletas, aunque el Sin roles definidos, el avance se entrega sin la
sitio pudiera estar bien evaluado. matriz de casos completa.
El proceso Un producto con defectos que no Sin casos diseñados para el checkout, no se
detectamos, aunque el equipo se esfuerce. descubre el comportamiento con productos
agotados.
El producto El usuario final recibe un sitio que no La mezcla de idiomas y las marcas «some
cumple lo esperado. name» confunden a un comprador
hispanohablante.
Nota. Elaboración propia.

36
7. Conclusión del Apartado 9
En nuestro proyecto sobre Practice Software Testing cuidamos las tres dimensiones de la
calidad. La calidad del producto la evaluamos con ISO/IEC 25010, priorizando usabilidad,
adecuación funcional, seguridad, fiabilidad, eficiencia de desempeño y adaptabilidad, y
midiéndolas con indicadores como el número de defectos por característica y los tiempos de
respuesta. La calidad del proceso la aseguramos con un proceso de pruebas de cinco pasos,
medido con la cobertura, los casos ejecutados frente a los planeados, la densidad de defectos y la
evidencia registrada. La calidad del proyecto la gestionamos con el cronograma de avances, el
alcance definido por semana, un costo que se contabiliza en horas del equipo, los roles con
respaldo y los riesgos con plan de respuesta. Las tres se sostienen entre sí: un buen proyecto
permite ejecutar un buen proceso, y un buen proceso revela y previene los defectos del producto.
Las restricciones de tiempo y de costo no son una excusa, sino el criterio que nos obliga a
priorizar por riesgo, y esos indicadores son los que el apartado 10 convierte en números.

37
INICIA EL APARTADO 10
Métricas de Calidad del Software
Teoría, métricas directas e indirectas · Semana 10

38
Apartado 10. Métricas de Calidad del Software
En los apartados anteriores elegimos un modelo de calidad y distinguimos las tres
dimensiones de la calidad. Ahora corresponde medir, es decir, convertir esas ideas en números.
Este apartado desarrolla la teoría de las métricas, diferencia las directas de las indirectas y
calcula un conjunto de métricas sobre Toolshop a partir de una ronda piloto de pruebas.
1. Marco Conceptual: Medida, Métrica e Indicador
Tres términos que suelen confundirse y que conviene separar antes de medir. Una
medida es un dato puntual obtenido al observar un atributo del software o de su proceso. Una
métrica es una relación entre medidas que le da significado al dato. Un indicador es una métrica
comparada con una meta, y es lo que permite tomar una decisión (Fenton & Bieman, 2014;
Pressman & Maxim, 2021). La Tabla 23 los ilustra con datos de nuestra propia medición.
Tabla 23
Diferencia entre medida, métrica e indicador en nuestro caso
Término Qué es Ejemplo en Toolshop
Medida Dato puntual obtenido al observar un Se encontraron 7 defectos en la ronda piloto de
atributo. pruebas.
Métrica Relación entre medidas que da significado Densidad de defectos = 7 defectos / 22 casos
al dato. ejecutados = 0,32.
Indicador Métrica comparada con una meta para 0,32 supera la meta de 0,20, luego el sitio
decidir. requiere corrección antes de considerarse
aceptable.
Nota. Elaboración propia a partir de Fenton y Bieman (2014) y Pressman y Maxim (2021).
1.1 Qué Hace Buena a una Métrica
Siguiendo a Fenton y Bieman (2014) y a Sommerville (2016), una métrica útil debe ser
simple y entendible, es decir, fácil de calcular e interpretar; objetiva, de modo que dos
integrantes del equipo que midan lo mismo obtengan el mismo valor; repetible y confiable, para
poder volver a medir en la siguiente ronda y comparar; y relevante, porque debe aportar a una

39
decisión de calidad. Medir por medir no sirve. Por esa razón descartamos las métricas de tamaño
del código, como las líneas de código (LOC o KLOC): aunque son las más citadas en la
literatura, no se pueden observar en un sitio de terceros evaluado en caja negra. En su lugar
usamos el número de casos de prueba como unidad de tamaño de lo probado.
2. Métricas Directas e Indirectas
Una métrica directa se obtiene midiendo u observando un atributo por sí mismo, sin
depender de otras métricas; es un conteo o una medida cruda, como el número de defectos, el
número de casos de prueba o el tiempo de respuesta. Una métrica indirecta o derivada se
calcula combinando dos o más métricas directas mediante una fórmula, de modo que no se
observa sino que se deduce; son indirectas la densidad de defectos, el porcentaje de casos
exitosos y la cobertura de pruebas (Fenton & Bieman, 2014; Pressman & Maxim, 2021). La regla
práctica para no confundirlas es simple: si para obtener el número hubo que dividir o combinar
dos cantidades, la métrica es indirecta; si solo se contó o se midió una cosa, es directa. La Tabla
24 compara ambos tipos.
Tabla 24
Comparación entre métricas directas e indirectas
Aspecto Métrica directa Métrica indirecta (derivada)
Cómo se obtiene Se cuenta o se mide directamente sobre el Se calcula combinando métricas directas
sitio o sobre la ejecución. con una fórmula.
Depende de otras No. Sí.
métricas
Ejemplo general N.° de defectos; horas de esfuerzo; líneas Densidad de defectos = defectos / KLOC;
de código. productividad = LOC / hora.
Ejemplo en nuestro N.° de casos ejecutados sobre Toolshop; % de casos exitosos = casos exitosos /
QA tiempo de carga del catálogo. casos ejecutados × 100.
Nota. Elaboración propia a partir de Fenton y Bieman (2014), Pressman y Maxim (2021) y
Sommerville (2016).

40
3. Métricas Directas Medidas en Toolshop
Las métricas directas provienen de la ronda piloto de ejecución de la matriz inicial de
casos de prueba, que se presenta completa en el cierre de este avance (Tabla 30). La ronda cubrió
los seis módulos del alcance: autenticación, catálogo, filtros, ficha de producto, carrito y
checkout. La Tabla 25 reúne lo que contamos y medimos.
Tabla 25
Métricas directas obtenidas en la ronda piloto de pruebas
| Métrica directa  | Qué es y cómo se obtuvo  | Unidad  | Valor  |
| ---------------- | ------------------------ | ------- | ------ |
Casos de prueba diseñados  Casos escritos en la matriz para los seis módulos  Casos  24
del alcance.
Casos ejecutados  Casos que alcanzamos a correr sobre el sitio en la  Casos  22
ronda piloto.
Casos exitosos  Casos cuyo resultado obtenido coincidió con el  Casos  17
esperado.
Defectos encontrados  Fallas confirmadas y documentadas con evidencia  Defectos  7
(Tabla 31).
| Problemas de usabilidad  |     | Problemas  | 2   |
| ------------------------ | --- | ---------- | --- |
Hallazgos del checklist de UI/UX del Avance 1:
mezcla de idiomas y metadatos de relleno.
Registros con datos sin  Marcas del filtro con cadenas de relleno tipo  Registros  3
| depurar  | «some name».  |     |     |
| -------- | ------------- | --- | --- |
Tiempo de carga del  Medido con la pestaña Network del navegador;  Segundos  2,4
| catálogo                | promedio de tres cargas.                         |           |      |
| ----------------------- | ------------------------------------------------ | --------- | ---- |
|                         |                                                  | Segundos  | 1,6  |
| Tiempo de respuesta al  | Medido con la pestaña Network; promedio de tres  |           |      |
| aplicar un filtro       | aplicaciones.                                    |           |      |
Funciones del alcance  Funciones con al menos un caso ejecutado, de 12  Funciones  10
| cubiertas  | identificadas en el alcance.  |     |     |
| ---------- | ----------------------------- | --- | --- |
Casos con evidencia  Casos ejecutados con captura de pantalla o  Casos  22
| registrada          | registro asociado.                                |           |     |
| ------------------- | ------------------------------------------------- | --------- | --- |
|                     |                                                   | Intentos  | 4   |
| Accesos sin sesión  | Intentos de entrar por URL a historial, cuenta y  |           |     |
| bloqueados          | pago sin sesión, de 4 probados.                   |           |     |
Nota. Elaboración propia. Los valores corresponden a la ronda piloto ejecutada por el equipo y
se actualizan en cada ronda posterior. Las dos funciones no cubiertas son el registro de usuario y
la recuperación de contraseña.

41
Para que los conteos de la Tabla 25 sean verificables, la Tabla 26 los desagrega por
módulo. Esta desagregación permite además identificar dónde se concentran los defectos y, por
tanto, qué módulo priorizar en la siguiente ronda.
Tabla 26
Casos y defectos por módulo del alcance
Módulo  Casos diseñados  Casos  Casos exitosos  Casos  Defectos
|                    |     | ejecutados  |     | fallidos  |     |
| ------------------ | --- | ----------- | --- | --------- | --- |
| Autenticación      | 5   | 5           | 4   | 1         | 1   |
| Catálogo           | 4   | 4           | 3   | 1         | 1   |
| Filtros            | 5   | 4           | 3   | 1         | 3   |
| Ficha de producto  | 3   | 3           | 3   | 0         | 0   |
| Carrito            | 4   | 4           | 3   | 1         | 1   |
| Checkout           | 3   | 2           | 1   | 1         | 1   |
| Total              | 24  | 22          | 17  | 5         | 7   |
Nota. Elaboración propia. Un mismo caso fallido puede revelar más de un defecto: por eso el
módulo de filtros registra un caso fallido y tres defectos. Los dos casos no ejecutados
corresponden a los filtros combinados y al checkout con producto agotado, que quedaron
pendientes por tiempo.
4. Métricas Indirectas Calculadas
Las métricas indirectas se derivan de los conteos anteriores. La Tabla 27 presenta cada
una con su fórmula, el cálculo con los valores reales y el resultado obtenido.
Tabla 27
Métricas indirectas: fórmula, cálculo y valor obtenido
| Métrica indirecta  | Fórmula  |     | Cálculo  | Valor  |     |
| ------------------ | -------- | --- | -------- | ------ | --- |
% de casos exitosos  Casos exitosos / casos  17 / 22 × 100  77,3 %
ejecutados × 100

42
| Métrica indirecta  | Fórmula  | Cálculo  | Valor  |
| ------------------ | -------- | -------- | ------ |
Tasa de ejecución  Casos ejecutados / casos  22 / 24 × 100  91,7 %
diseñados × 100
Densidad de defectos  Defectos / casos ejecutados  7 / 22  0,32 defectos por
caso
Cobertura de pruebas  Funciones cubiertas / funciones  10 / 12 × 100  83,3 %
del alcance × 100
| % de casos con evidencia  |     | 22 / 22 × 100  | 100 %  |
| ------------------------- | --- | -------------- | ------ |
Casos con evidencia / casos
ejecutados × 100
% de accesos sin sesión  Accesos bloqueados / accesos  4 / 4 × 100  100 %
| bloqueados  | intentados × 100  |     |     |
| ----------- | ----------------- | --- | --- |
Tiempo medio de  (Tiempo del catálogo + tiempo  (2,4 + 1,6) / 2  2,0 s
| respuesta            | del filtro) / 2                 |              |         |
| -------------------- | ------------------------------- | ------------ | ------- |
|                      |                                 | 3 / 7 × 100  | 42,9 %  |
| Concentración de     | Defectos del módulo / defectos  |              |         |
| defectos en filtros  | totales × 100                   |              |         |
Nota. Elaboración propia. Todos los valores se derivan de las métricas directas de la Tabla 25 y
de su desagregación en la Tabla 26.
5. Relación de las Métricas con las Características de Calidad
Cada métrica debe evidenciar una característica de calidad; de lo contrario sería un
número sin propósito. La Tabla 28 relaciona las métricas con las características de ISO/IEC
25010 priorizadas en el apartado 8 e indica si la métrica es directa o indirecta.
Tabla 28
Relación entre las métricas y las características priorizadas de ISO/IEC 25010
Característica  Métrica que la evidencia  Tipo  Valor obtenido
priorizada
Adecuación funcional  % de casos exitosos del flujo de login,  Indirecta  77,3 %
filtros, ficha, carrito y checkout
| Usabilidad  |     | Directa  | 2   |
| ----------- | --- | -------- | --- |
N.° de problemas de usabilidad detectados
en el checklist de UI/UX
Seguridad  % de accesos sin sesión bloqueados  Indirecta  100 %
Fiabilidad  Densidad de defectos (defectos por caso  Indirecta  0,32
ejecutado)
Fiabilidad  N.° de registros del catálogo con datos de  Directa  3
prueba sin depurar

43
Característica  Métrica que la evidencia  Tipo  Valor obtenido
priorizada
|                |                                           |     | Directa  | 2,4 s y 1,6 s  |
| -------------- | ----------------------------------------- | --- | -------- | -------------- |
| Eficiencia de  | Tiempo de carga del catálogo y tiempo de  |     |          |                |
| desempeño      | respuesta al aplicar un filtro            |     |          |                |
Calidad del proceso de  Tasa de ejecución, cobertura de pruebas y  Indirecta  91,7 %, 83,3 % y 100
| pruebas  | % de casos con evidencia  |     |     | %   |
| -------- | ------------------------- | --- | --- | --- |
Nota. Elaboración propia. Las seis primeras filas corresponden a la calidad de producto y la
última, a la calidad de proceso definida en el apartado 9.
6. De Métrica a Indicador: Comparación con las Metas
Una métrica se convierte en indicador cuando se compara con una meta. La Tabla 29
contrasta cada valor obtenido con la meta que el equipo fijó en los apartados 8 y 9, y señala si se
cumple.
Tabla 29
Valores obtenidos frente a las metas del equipo
| Métrica  | Valor obtenido  | Meta  | Resultado  |     |
| -------- | --------------- | ----- | ---------- | --- |
% de casos exitosos  77,3 %  ≥ 90 %  No se cumple. Es el hallazgo crítico de
la ronda.
| Tasa de ejecución  | 91,7 %  | ≥ 90 %  |     |     |
| ------------------ | ------- | ------- | --- | --- |
Se cumple, aunque quedaron dos casos
pendientes.
Densidad de defectos  0,32  ≤ 0,20  No se cumple. Debe reducirse en la
siguiente ronda.
| Cobertura de pruebas  | 83,3 %  | 100 %  |     |     |
| --------------------- | ------- | ------ | --- | --- |
No se cumple. Faltan dos funciones por
cubrir.
% de casos con evidencia  100 %  100 %  Se cumple. Satisface el atributo PA 2.2
de SPICE.
% de accesos sin sesión  100 %  100 %  Se cumple. Confirma la evaluación de
| bloqueados                 |        |        | seguridad del Avance 1.  |     |
| -------------------------- | ------ | ------ | ------------------------ | --- |
| Tiempo medio de respuesta  | 2,0 s  | ≤ 3 s  |                          |     |
Se cumple. El desempeño no es hoy un
punto crítico.
Nota. Elaboración propia. Las metas fueron definidas en la Tabla 13 del apartado 8 y en la Tabla
18 del apartado 9.

44
7. Interpretación de los Resultados
En Toolshop medimos la calidad con métricas directas —24 casos diseñados, 22
ejecutados, 17 exitosos, 7 defectos, 2 problemas de usabilidad y tiempos de 2,4 y 1,6 segundos—
y con métricas indirectas derivadas de ellas: 77,3 % de casos exitosos, 91,7 % de tasa de
ejecución, densidad de defectos de 0,32, cobertura de 83,3 % y 2,0 segundos de tiempo medio de
respuesta. Estas métricas evidencian las características priorizadas en el apartado 8: la
adecuación funcional mediante el porcentaje de casos exitosos, la usabilidad mediante los
problemas del checklist, la fiabilidad mediante la densidad de defectos y los registros sin
depurar, la seguridad mediante los accesos bloqueados y la eficiencia de desempeño mediante los
tiempos de respuesta.
La lectura de conjunto es la siguiente. El porcentaje de casos exitosos (77,3 %) queda por
debajo de la meta del 90 % y la densidad de defectos (0,32) supera la meta de 0,20, de modo que
el flujo de compra todavía no puede considerarse de calidad bajo el criterio de conformidad con
los requisitos de Crosby (1979) que adoptamos en el Avance 1. Los defectos se concentran en el
módulo de filtros, que reúne el 42,9 % del total, lo cual confirma el diagnóstico del Ishikawa: las
causas de tipo material (registros de prueba sin depurar) y de tipo método (ausencia de un
protocolo de localización) siguen siendo las dominantes. En contraste, la seguridad y la
eficiencia de desempeño cumplen sus metas, por lo que no constituyen hoy el punto crítico del
sitio. Vale la pena señalar también que la ficha de producto fue el único módulo sin defectos, lo
que sugiere que el problema no está en la presentación del dato individual sino en la consulta y el
filtrado del conjunto.
Sobre nuestro propio proceso, la tasa de ejecución del 91,7 % cumple la meta, pero la
cobertura del 83,3 % no la alcanza, porque el registro de usuario y la recuperación de contraseña

45
quedaron sin ningún caso. Además, los dos casos diseñados que no se ejecutaron son los filtros
combinados y el checkout con producto agotado, que son justamente las dos pruebas de extremo
a extremo comprometidas en el plan de SQA, de modo que su ejecución es prioritaria. El 100 %
de casos con evidencia registrada sí satisface el atributo PA 2.2 de SPICE, que en el apartado 7
habíamos calificado como parcialmente logrado; esta es la primera evidencia concreta de avance
hacia el nivel 2 consolidado.
En consecuencia, las acciones para la siguiente ronda son cuatro: ejecutar los dos casos
pendientes, diseñar casos para las dos funciones sin cubrir y llevar así la cobertura al 100 %,
concentrar el diseño de nuevos casos en el módulo de filtros, donde se acumulan los defectos, y
repetir la medición para comparar ambas rondas. Esa comparación entre rondas es, además, lo
que nos permitirá demostrar la medición con datos que exige el nivel 4 de madurez, tal como lo
planteamos en la hoja de ruta del apartado 7.

46
CIERRE DEL AVANCE 2
Matriz inicial de casos de prueba y registro de defectos · Requisito 5 de la guía

47
Cierre del Avance 2. Matriz Inicial de Casos de Prueba
La guía del proyecto exige, como quinto requisito del Avance 2, diseñar la primera
versión de los casos de prueba, con un mínimo de ocho casos manuales, e indicar cuáles se
automatizarán. Esta sección cumple ese requisito y, al mismo tiempo, documenta la fuente de la
que salen todas las mediciones del apartado 10.
1. Criterios de Diseño de la Matriz
La matriz se diseñó con la plantilla única comprometida en la hoja de ruta del apartado 7,
que es la acción con la que cerramos el atributo PA 3.1 de SPICE. Cada caso tiene identificador,
módulo, objetivo, resultado esperado, tipo de ejecución y resultado obtenido. Los criterios que
guiaron el diseño fueron tres.
● Priorización por riesgo. Dado el límite de horas analizado en el apartado 9, los
módulos con hallazgos previos en el Avance 1 —catálogo y filtros— y los que
sostienen la transacción —carrito y checkout— reciben más casos que los módulos
periféricos.
● Trazabilidad con las características priorizadas. Cada caso responde a al menos
una de las características de ISO/IEC 25010 priorizadas en el apartado 8, de modo
que ningún caso se diseña sin propósito de calidad.
● Inclusión de casos negativos. No basta con comprobar que el sitio hace lo correcto:
el enfoque de cero defectos de Crosby obliga a comprobar también que bloquea lo
incorrecto, por lo que la matriz incluye intentos de login inválido, acceso sin sesión,
campos vacíos y compra de productos agotados.

48
En total se diseñaron 24 casos: 8 de ejecución estrictamente manual, por requerir juicio
visual o verificación de idioma, y 16 automatizables con Selenium o Playwright en el Avance 3.
La Tabla 30 presenta la matriz completa.
2. Matriz Inicial de Casos de Prueba
Tabla 30
Matriz inicial de casos de prueba del Equipo 06
ID Módulo Caso de prueba Resultado esperado Tipo Resultado
CP-01 Autenticación Iniciar sesión con El sistema concede Automática Pasa
credenciales válidas. acceso y muestra el
catálogo.
CP-02 Autenticación Iniciar sesión con Se niega el acceso y se Automática Pasa
contraseña incorrecta. muestra un mensaje de
error claro.
CP-03 Autenticación Enviar el formulario de Se muestran las Automática Pasa
login con los campos validaciones de campo
vacíos. obligatorio.
CP-04 Autenticación Acceder por URL a la El sistema redirige al Automática Pasa
cuenta y al historial sin login y no expone
sesión iniciada. datos.
CP-05 Autenticación Cerrar sesión y usar el No debe volver a Manual Falla (D-01)
botón «atrás» del mostrarse la vista de
navegador. cuenta con datos.
CP-06 Catálogo Cargar el listado de Cada tarjeta muestra Automática Pasa
productos. imagen, nombre,
precio y etiqueta de
CO2.
CP-07 Catálogo Verificar el indicador de El estado de inventario Manual Pasa
disponibilidad en la es visible y legible.
tarjeta del producto.
CP-08 Catálogo Ordenar los productos por El listado se reordena Automática Pasa
precio ascendente. correctamente de
menor a mayor.
CP-09 Catálogo Navegar el catálogo con Toda la interfaz visible Manual Falla (D-02)
el idioma en español. permanece en un solo
idioma.
CP-10 Filtros Filtrar por la categoría Solo se muestran Automática Pasa
Hand Tools. productos de esa
categoría.

49
ID  Módulo  Caso de prueba  Resultado esperado  Tipo  Resultado
CP-11  Filtros  Filtrar por la marca  Solo se muestran  Automática  Pasa
ForgeFlex Tools.
productos de esa
marca.
CP-12  Filtros  Filtrar por un rango de  Solo se muestran  Automática  Pasa
|     | precio.  | productos dentro del  |     |     |
| --- | -------- | --------------------- | --- | --- |
rango indicado.
| CP-13  Filtros  |     |     | Manual  |     |
| --------------- | --- | --- | ------- | --- |
Revisar la lista de marcas  No hay metadatos de  Falla (D-03,
y las etiquetas del panel  prueba y las etiquetas  D-04, D-05)
|     | de filtros.  | están en el idioma  |     |     |
| --- | ------------ | ------------------- | --- | --- |
elegido.
| CP-14  Filtros  |                           |                           | Automática  | Pendiente  |
| --------------- | ------------------------- | ------------------------- | ----------- | ---------- |
|                 | Aplicar filtros           | El resultado respeta las  |             |            |
|                 | combinados de categoría,  | tres condiciones a la     |             |            |
|                 | marca y precio.           | vez.                      |             |            |
CP-15  Ficha de  Abrir la ficha de un  Se muestran precio,  Automática  Pasa
| producto  | producto disponible.  |     |     |     |
| --------- | --------------------- | --- | --- | --- |
imagen, disponibilidad
y huella de CO2.
CP-16  Ficha de  Abrir la ficha de un  El estado de agotado se  Manual  Pasa
| producto  | producto agotado.  | muestra de forma  |     |     |
| --------- | ------------------ | ----------------- | --- | --- |
visible.
| CP-17     |                             |                     | Automática  | Pasa  |
| --------- | --------------------------- | ------------------- | ----------- | ----- |
| Ficha de  | Intentar añadir al carrito  | El botón está       |             |       |
| producto  | un producto agotado.        | deshabilitado o la  |             |       |
acción se bloquea.
CP-18  Carrito  Agregar un producto al  El contador del carrito  Automática  Pasa
carrito.
y el subtotal se
actualizan.
CP-19  Carrito  Modificar la cantidad de  El subtotal se recalcula  Automática  Pasa
|     | un producto del carrito.  | de forma correcta.  |     |     |
| --- | ------------------------- | ------------------- | --- | --- |
CP-20  Carrito  Eliminar un producto del  El producto desaparece  Automática  Pasa
|                 | carrito.                  | y el total se recalcula.  |         |               |
| --------------- | ------------------------- | ------------------------- | ------- | ------------- |
| CP-21  Carrito  |                           |                           | Manual  | Falla (D-06)  |
|                 | Recargar la página con    | El carrito conserva su    |         |               |
|                 | productos en el carrito.  | contenido tras la         |         |               |
recarga.
CP-22  Checkout  Iniciar el checkout con  El sistema avanza al  Automática  Pasa
sesión activa.
formulario de datos de
facturación.
CP-23  Checkout  Avanzar en el checkout  El sistema impide  Manual  Falla (D-07)
|                  | con campos obligatorios   | avanzar y señala el    |         |            |
| ---------------- | ------------------------- | ---------------------- | ------- | ---------- |
|                  | vacíos.                   | campo faltante.        |         |            |
| CP-24  Checkout  |                           |                        | Manual  | Pendiente  |
|                  | Forzar el checkout de un  | El sistema bloquea la  |         |            |
|                  | producto marcado como     | compra y notifica al   |         |            |
|                  | agotado.                  | usuario.               |         |            |

50
Nota. Elaboración propia. En la columna «Tipo», «Automática» indica que el caso se
automatizará en el Avance 3 con Selenium o Playwright, y «Manual» que permanecerá como
prueba manual por requerir juicio visual. Los casos marcados como pendientes no alcanzaron a
ejecutarse en la ronda piloto por la restricción de tiempo analizada en el apartado 9.
3. Registro de Defectos de la Ronda Piloto
Los cinco casos fallidos revelaron siete defectos, porque un mismo caso puede exponer
más de uno. La Tabla 31 los documenta con su identificador, el módulo afectado, la característica
de ISO/IEC 25010 comprometida y el caso que lo detectó. Este registro es la acción de mejora
que cierra el atributo PA 2.2 de SPICE, señalado como parcialmente logrado en el apartado 7.
Tabla 31
Registro de defectos detectados en la ronda piloto
ID Módulo Descripción del defecto Característica Caso de origen
afectada
D-01 Autenticación Tras cerrar sesión, el botón «atrás» del Seguridad y fiabilidad CP-05
navegador devuelve a la vista de cuenta
con los datos en caché.
D-02 Catálogo La vista del catálogo mezcla etiquetas Usabilidad CP-09
en español con nombres de categoría y
estados en inglés.
D-03 Filtros La lista de marcas incluye tres registros Fiabilidad CP-13
de prueba sin depurar, del tipo «some
name».
D-04 Filtros Las etiquetas del panel de filtros Usabilidad CP-13
permanecen en inglés aunque el idioma
seleccionado sea español.
D-05 Filtros El contador de resultados no se Adecuación funcional CP-13
actualiza al limpiar el filtro aplicado.
D-06 Carrito El contenido del carrito se pierde al Adecuación funcional CP-21
recargar la página. y fiabilidad
D-07 Checkout El formulario permite avanzar con el Usabilidad (protección CP-23
campo de dirección vacío y el error frente a errores)
solo aparece al final del flujo.

51
Nota. Elaboración propia. La distribución por módulo coincide con la Tabla 26: autenticación 1,
catálogo 1, filtros 3, ficha de producto 0, carrito 1 y checkout 1.
4. Alcance de la Automatización Prevista
De los 24 casos, 16 son automatizables y 8 permanecerán como pruebas manuales. El
criterio de separación es si el caso puede verificarse por comparación de valores o si exige juicio
humano. Son automatizables los casos cuyo resultado esperado es un estado comprobable por el
programa: redirecciones, mensajes de validación, contenido del listado tras aplicar un filtro,
totales del carrito y avance del checkout. Permanecen manuales los casos CP-05, CP-07, CP-09,
CP-13, CP-16, CP-21, CP-23 y CP-24, porque dependen de la consistencia idiomática de la
interfaz, de la legibilidad de un indicador o del comportamiento del navegador, que son juicios
difíciles de codificar de forma confiable en esta etapa.
La automatización se ejecutará en el Avance 3 con Selenium o Playwright, según lo
previsto en la guía del proyecto, y empezará por los módulos de autenticación y filtros, que son
los de menor complejidad técnica y los que más se repiten en cada ronda. Esta decisión responde
directamente a la restricción de competencias identificada en la Tabla 21: al marcar desde ahora
qué casos se automatizarán, el equipo puede empezar a prepararlos sin bloquear la entrega de
este avance.

52
Conclusión General del Avance 2
Este avance deja al Equipo 06 con un sistema de calidad completo y encadenado para el
sitio Practice Software Testing. Ubicamos nuestro proceso de aseguramiento de calidad en
CMMI nivel 2 y en SPICE nivel 1 en camino al 2, con una hoja de ruta de siete acciones hacia el
nivel 3. Elegimos ISO/IEC 25010 como modelo de calidad del producto y priorizamos seis de
sus características con base en la evidencia del diagnóstico. Distinguimos las tres dimensiones de
la calidad y reconocimos de forma explícita las restricciones de tiempo y de costo que nos
obligan a priorizar por riesgo. Definimos y calculamos once métricas directas y ocho indirectas,
cada una ligada a una característica y comparada con una meta. Y diseñamos una matriz de 24
casos de prueba que ya produjo una primera ronda de medición con siete defectos documentados.
El resultado de esa medición es claro y no lo maquillamos: con un 77,3 % de casos
exitosos y una densidad de defectos de 0,32, Toolshop no alcanza todavía el estándar de calidad
que fijamos, y el módulo de filtros concentra casi la mitad de los defectos. Nuestro propio
proceso tampoco está completo, porque la cobertura se quedó en el 83,3 %. Ambas conclusiones
son útiles precisamente porque están sustentadas en datos y no en impresiones, que es justo el
salto que el apartado 7 identificó como pendiente.
El Avance 3 continúa desde aquí: completar la cobertura, calcular las métricas de
producto y el tablero de indicadores de las semanas 11 y 12, terminar el diseño de pruebas por
niveles y tipos, automatizar los 16 casos marcados, ejecutar la matriz completa y comparar
ambas rondas. Esa comparación es la evidencia con la que esperamos demostrar el nivel 3 de
madurez y sentar las bases del nivel 4.

53
Glosario General del Avance 2
Se reúnen aquí los términos empleados en los cuatro apartados, para facilitar la lectura y
la sustentación.
Alcance (proyecto): conjunto de trabajo acordado para una entrega o avance. En nuestro caso,
los seis módulos del sitio que se prueban y las exclusiones declaradas.
Área de proceso (CMMI): grupo de prácticas con un objetivo común. Las relevantes aquí son
PPQA (aseguramiento de calidad de proceso y producto), VER (verificación), VAL
(validación), MA (medición y análisis) y CM (gestión de configuración).
Atributo de proceso o PA (SPICE): característica medible de un proceso que se califica con la
escala N (no logrado), P (parcialmente logrado), L (ampliamente logrado) y F (totalmente
logrado).
Calidad de producto: qué tan bien el software cumple y hace lo que debe. Se evalúa con
ISO/IEC 25010.
Calidad de proceso: qué tan bueno y ordenado es el método con que se construye y se prueba el
software.
Calidad de proyecto: qué tan bien se gestiona el trabajo: alcance, tiempo, costo, recursos y
riesgos.
Caja negra: enfoque de prueba en el que se evalúa el comportamiento externo del software sin
acceder a su código fuente.
Cero defectos (Crosby): meta preventiva adoptada como enfoque de calidad en el Avance 1,
según la cual los defectos no son accidentes tolerables sino desviaciones de un requisito.
Cobertura de pruebas: proporción de funciones o flujos del alcance cubiertos por al menos un
caso de prueba.

54
Densidad de defectos: métrica que relaciona el número de defectos con el tamaño de lo
probado; aquí, defectos por caso ejecutado.
Factor o característica: cualidad de alto nivel del software, como la usabilidad o la fiabilidad.
i18n y l10n: internacionalización y localización. La inconsistencia idiomática del catálogo de
Toolshop es el defecto principal documentado en el Avance 1.
Indicador: métrica comparada con una meta para tomar una decisión.
LOC y KLOC: líneas de código y miles de líneas de código; métricas de tamaño que no aplican
a un sitio de terceros evaluado en caja negra.
Madurez y capacidad: la madurez describe el conjunto del equipo u organización (CMMI por
etapas); la capacidad describe cada proceso por separado (SPICE y CMMI continuo).
Medida: dato puntual obtenido al observar un atributo.
Métrica: relación entre medidas que da significado al dato.
Métrica directa: se obtiene contando o midiendo algo por sí mismo, sin depender de otras
métricas.
Métrica indirecta o derivada: se calcula combinando métricas directas mediante una fórmula.
Modelo de calidad: forma estructurada de descomponer la calidad en características medibles.
Proceso de pruebas: secuencia de planear, diseñar casos, ejecutar, registrar defectos y reportar.
SQA: aseguramiento de la calidad del software; conjunto de actividades planificadas para revisar
tanto los procesos como los productos.
SQuaRE (ISO/IEC 2500n): familia de normas de calidad del software; la 25010 es su modelo
de calidad y la 25023, su guía de medición.
Subcaracterística o criterio: parte más concreta de una característica, como la operabilidad
dentro de la usabilidad.

55
V&V: verificación (¿se está construyendo bien el producto?) y validación (¿es lo que el usuario
necesita?).

56
Referencias
Boehm, B. W., Brown, J. R., Kaspar, H., Lipow, M., MacLeod, G. J., & Merritt, M. J. (1978).
Characteristics of software quality. North-Holland.
Chrissis, M. B., Konrad, M., & Shrum, S. (2011). CMMI for development: Guidelines for
process integration and product improvement (3.ª ed.). Addison-Wesley.
Crosby, P. B. (1979). Quality is free: The art of making quality certain. McGraw-Hill.
Dromey, R. G. (1995). A model for software product quality. IEEE Transactions on Software
Engineering, 21(2), 146–162. https://doi.org/10.1109/32.345830
Fenton, N., & Bieman, J. (2014). Software metrics: A rigorous and practical approach (3.ª ed.).
CRC Press.
Humphrey, W. S. (1989). Managing the software process. Addison-Wesley.
ISACA. (2023). CMMI model V3.0. CMMI Institute. https://cmmiinstitute.com
ISO. (2015). ISO 9001:2015. Quality management systems: Requirements. International
Organization for Standardization.
ISO. (2020). ISO 21502:2020. Project, programme and portfolio management: Guidance on
project management. International Organization for Standardization.
ISO/IEC. (2003). ISO/IEC 15504-2:2003. Information technology: Process assessment.
Performing an assessment. International Organization for Standardization.
ISO/IEC. (2011). ISO/IEC 25010:2011. Systems and software engineering: Systems and software
quality requirements and evaluation (SQuaRE). System and software quality models.
International Organization for Standardization.

57
ISO/IEC. (2014). ISO/IEC 25000:2014. Systems and software engineering: Systems and software
quality requirements and evaluation (SQuaRE). Guide to SQuaRE. International
Organization for Standardization.
ISO/IEC. (2015). ISO/IEC 33001:2015. Information technology: Process assessment. Concepts
and terminology. International Organization for Standardization.
ISO/IEC. (2016). ISO/IEC 25023:2016. Systems and software engineering: Systems and software
quality requirements and evaluation (SQuaRE). Measurement of system and software
product quality. International Organization for Standardization.
ISO/IEC. (2023). ISO/IEC 25010:2023. Systems and software engineering: Systems and software
quality requirements and evaluation (SQuaRE). Product quality model. International
Organization for Standardization.
ISO/IEC/IEEE. (2017). ISO/IEC/IEEE 12207:2017. Systems and software engineering: Software
life cycle processes. International Organization for Standardization.
McCall, J. A., Richards, P. K., & Walters, G. F. (1977). Factors in software quality (Vols. 1–3).
Rome Air Development Center, U.S. Air Force.
Practice Software Testing. (s. f.). Toolshop [Aplicación web de demostración]. Recuperado el 10
de octubre de 2026, de https://practicesoftwaretesting.com
Pressman, R. S., & Maxim, B. R. (2021). Ingeniería del software: Un enfoque práctico (9.ª ed.).
McGraw-Hill.
Project Management Institute. (2021). Guía de los fundamentos para la dirección de proyectos
(Guía del PMBOK) (7.ª ed.). PMI.
Sommerville, I. (2016). Ingeniería de software (10.ª ed.). Pearson.

58
Universidad Cooperativa de Colombia. (2026). Gestión y calidad del software: Guía del
proyecto de aula, período 2026-2 [Documento del curso]. Facultad de Ingeniería.