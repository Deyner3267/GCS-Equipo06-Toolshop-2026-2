GESTIÓN Y CALIDAD DEL SOFTWARE · PROYECTO DE AULA
Guía del proyecto del semestre (paso a paso)
Universidad Cooperativa de Colombia · Período 2026-2 · Docente: Andrea Paternina · Equipos de 3
¿En qué consiste el proyecto?
Durante todo el semestre, su equipo hará el ASEGURAMIENTO DE CALIDAD de una página web de práctica (un sitio hecho para
testear). No tienen que programar la página: la van a evaluar, probar y medir su calidad, APLICANDO CADA TEMA que veamos en
clase. El proyecto avanza semana a semana y se entrega en 3 avances que se van construyendo uno sobre otro.
Qué deben entregar (importante): en cada avance suben una DOCUMENTACIÓN escrita (PDF, normas APA) al Aula Extendida; y
el avance final, además de la documentación, se SUSTENTA en una exposición oral ante la docente, quien hará preguntas al
equipo.
Integrantes del equipo (3):
Sitio web asignado:
URL del sitio:
Mapa: cada tema del semestre alimenta el proyecto
Todo lo que veamos en clase se convierte en una parte del proyecto. Este es el recorrido completo:
Semana Tema visto en clase Qué aportan al proyecto
1 Definición de calidad del software
E
ca
li
s
g
o
e
.
n el sitio y definen qué es «calidad» para su
2 Evolución (Deming, Juran, Crosby) Adoptan un enfoque/gurú como guía del equipo.
3 Técnicas y herramientas (checklist, Ishikawa, Pareto) Diagnostican problemas del sitio con 2 técnicas.
4 Garantía de calidad (SQA) y plan de SQA Redactan su plan de SQA.
5 Actividades del SQA (revisión, V&V) Definen qué van a revisar/validar.
6 Normas I: ISO/IEC 25000 y 9126
E
A
n
V
m
AN
ar
C
c
E
a n
1
la calidad en un estándar. → ENTREGA
7 Normas II: CMMI e ISO 15504 (SPICE) Ubican la madurez del proceso.
8 Modelos de calidad (McCall, Boehm, ISO 25010) Eligen y justifican un modelo de calidad.
9 Calidad de producto, proceso y proyecto
A
tie
n
m
ali
p
z
o
an
/c
c
o
a
s
l
t
i
o
d
.
a d con restricciones de
10 Métricas: teoría, directas e indirectas Definen sus métricas. → ENTREGA AVANCE 2
11 Métricas de producto (LOC, PF, complejidad) Calculan métricas de producto del sitio.
12 Métricas de proceso y KPI Arman su tablero de indicadores (KPI).
13 Pruebas: niveles y tipos (manuales/automatizadas)
D
au
is
t
e
o
ñ
m
a
a
n
t i
l
z
o
a
s
d
c
a
a
s
s
.
o s de prueba manuales y
14 Plan de calidad (criterios, cronograma) Consolidan el plan de calidad completo.
15 Ejecución de pruebas y recolección de métricas Ejecutan pruebas y miden.
16 Informe final y sustentación
E
(c
n
o
t
n
re
n
g
o
a
t
n
a )
y sustentan. → ENTREGA AVANCE 3
Los 3 avances (así se va construyendo)

Avance 1 · Diagnóstico de calidad y plan de SQA — consolida Semanas 1 a 6 · entrega Semana 6
1. Describan su sitio asignado (qué hace, qué funciones tiene) y definan qué es «calidad» para ese caso (S1).
2. Adopten un enfoque de la calidad (Deming, Juran o Crosby) como guía del equipo y expliquen por qué (S2).
3. Diagnostiquen problemas con 2 técnicas de calidad: una lista de verificación (checklist) y un diagrama causa-efecto (Ishikawa),
Pareto o histograma (S3).
4. Redacten su plan de SQA: alcance y actividades de revisión, verificación y validación (S4–S5).
5. Enmarquen la calidad de su sitio en un estándar: características de ISO/IEC 25000 (SQuaRE) / 9126 (S6).
Entregable (documentación): documento en PDF (4–6 páginas, APA) con todo lo anterior. Se sube al Aula Extendida.
Avance 2 · Modelo de calidad, métricas y diseño de pruebas — consolida Semanas 7 a 10 · entrega Semana 10
1. Ubiquen la madurez del proceso frente a CMMI / ISO 15504 (SPICE): ¿en qué nivel estaría su caso? (S7).
2. Elijan y justifiquen UN modelo de calidad (McCall, Boehm, Dromey o ISO/IEC 25010) y sus factores (S8).
3. Distingan calidad de producto vs. de proceso y analicen las restricciones de tiempo/costo de su proyecto (S9).
4. Definan sus métricas: directas (p. ej. n.º de defectos, tiempo de respuesta) e indirectas (p. ej. densidad de defectos) (S10).
5. Diseñen la primera versión de los casos de prueba (mínimo 8 manuales) e indiquen cuáles automatizarán.
Entregable (documentación): plan de calidad con el modelo/estándar elegido + lista de métricas + matriz inicial de casos de
prueba. PDF (APA), se sube al Aula.
Avance 3 · Ejecución, informe final y SUSTENTACIÓN — consolida Semanas 11 a 16 · Semanas 15–16 (con nota)
1. Calculen métricas de producto del sitio: tamaño y complejidad (LOC, puntos de función, complejidad ciclomática donde
aplique) (S11).
2. Definan métricas de proceso/proyecto y armen un tablero de KPI de calidad (S12).
3. Terminen el diseño de casos de prueba por niveles y tipos, separando MANUALES y AUTOMATIZADAS (S13).
4. Consoliden el plan de calidad: criterios de aceptación y cronograma (S14).
5. Ejecuten las pruebas MANUALES (resultados pasa/falla + evidencias) y las AUTOMATIZADAS (Selenium/Playwright con
pytest/JUnit, o API con Postman/requests) y recolecten las métricas (S15).
6. Redacten el informe final (portada, objetivos, plan de pruebas, métricas, análisis y conclusiones, en APA) y prepárense para
SUSTENTAR (S16).
Entregable (documentación + exposición): informe final en PDF subido al Aula + SUSTENTACIÓN oral del equipo (la docente
pregunta). Este avance lleva la nota del curso (Momento 3).
Herramientas que pueden usar (todas libres)
Pruebas manuales: la matriz de casos en una hoja de cálculo. · Automatización de interfaz: Selenium o Playwright, ejecutadas con
(Java). · Pruebas de API: Postman o la librería requests. Registro de métricas: hoja de cálculo.
Qué se entrega y cómo se sustenta
Documentación (los 3 avances): cada avance es un documento escrito en PDF con normas APA, subido al Aula Extendida. Los
avances 1 y 2 son formativos (reciben realimentación por niveles, sin nota); el avance 3 es el informe final completo.
Sustentación (avance 3): además del documento, el equipo EXPONE el proyecto ante la docente (10–12 min) y responde
preguntas. Se evalúa que todos los integrantes dominen el trabajo. Aquí se asigna la nota del curso (Momento 3).
Reglas de entrega en el Aula Extendida
Las entregas están encadenadas: NO se habilita el Avance 2 hasta que suban el Avance 1, ni el Avance 3 hasta subir el Avance 2.
Suban a tiempo para no bloquearse. Un solo integrante sube por el equipo (con los nombres de todos en la portada).
Nombre de archivo sugerido: GCS_Equipo##_Avance#_2026-2.pdf (ej.: GCS_Equipo03_Avance1_2026-2.pdf).
Cronograma

| Avance    | Qué entregan                          | Semana    |
| --------- | ------------------------------------- | --------- |
| Avance 1  | Diagnóstico de calidad + plan de SQA  | Semana 6  |
Avance 2  Plan de calidad + métricas + diseño de pruebas  Semana 10
Avance 3  Ejecución + informe final + sustentación  Semanas 15–16