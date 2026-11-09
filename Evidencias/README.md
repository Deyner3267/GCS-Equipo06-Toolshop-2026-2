# Evidencias — Equipo 06 — Toolshop

Carpeta única de evidencias del proyecto de **Gestión y Calidad del Software** sobre Toolshop.

- **Universidad Cooperativa de Colombia**
- **Curso:** Gestión y Calidad del Software · 2026-2
- **Docente:** Andrea Paternina
- **Equipo 06:** Camilo Vides · Luis Tapia · Deyner Ortiz

> **Nota:** esta carpeta es una **vista curada** para revisión. Los archivos originales se conservan en `Avances realizados/` y `Avances enviados/`. Aquí están copiados y organizados por tipo de evidencia para que la revisión sea directa.

## Contenido

1. [Informes](#1-informes)
2. [Matrices y Excel](#2-matrices-y-excel)
3. [Capturas](#3-capturas)
4. [Reportes de automatización](#4-reportes-de-automatización)
5. [Proyecto Screenplay](#5-proyecto-screenplay)
6. [S15 y S16](#6-s15-y-s16)
7. [Resumen de la línea base S13](#7-resumen-de-la-línea-base-s13)

---

## 1. Informes

| Semana | Documento | Qué contiene |
|---|---|---|
| Avance 1 | [Avance1_GCS_Equipo06_2026-2.pdf](./01_Informes/Avance1_GCS_Equipo06_2026-2.pdf) | Diagnóstico de calidad y plan de SQA. |
| Avance 2 | [Avance2_GCS_Equipo06_2026-2.pdf](./01_Informes/Avance2_GCS_Equipo06_2026-2.pdf) | Modelo de calidad, métricas y diseño inicial de pruebas. |
| S11 | [S11_Metricas_de_producto.pdf](./01_Informes/S11_Metricas_de_producto.pdf) | Puntos de función, LOC, complejidad ciclomática y tiempo de carga. |
| S12 | [S12_Metricas_de_proceso_y_KPI.pdf](./01_Informes/S12_Metricas_de_proceso_y_KPI.pdf) | Métricas de proceso/proyecto y tablero de 10 KPI. |
| S13 | [S13_Pruebas_niveles_tipos_y_tecnicas.pdf](./01_Informes/S13_Pruebas_niveles_tipos_y_tecnicas.pdf) | Matriz de 30 casos y ejecución de 6 pruebas. |
| S14 | [S14_Plan_de_calidad.pdf](./01_Informes/S14_Plan_de_calidad.pdf) | 11 criterios de aceptación y cronograma S11–S16. |

## 2. Matrices y Excel

| Semana | Archivo | Qué contiene |
|---|---|---|
| S12 | [S12_Tablero_KPI.xlsx](./02_Matrices_y_Excel/S12_Tablero_KPI.xlsx) | Tablero de los 10 KPI. |
| S13 | [S13_Matriz_30_casos.xlsx](./02_Matrices_y_Excel/S13_Matriz_30_casos.xlsx) | Matriz de 30 casos, ejecución, defectos y suites. |
| S14 | [S14_Plan_Calidad.xlsx](./02_Matrices_y_Excel/S14_Plan_Calidad.xlsx) | Criterios, cronograma, roles, RACI, defectos y trazabilidad. |

## 3. Capturas

### 3.1 Automatizadas — S13

Carpeta: [S13_Automaticas](./03_Capturas/S13_Automaticas/)

| Caso | Archivo | Resultado |
|---|---|---|
| CP-01 | [cp01LoginValido.png](./03_Capturas/S13_Automaticas/cp01LoginValido.png) | Pasa; URL final `/account`. |
| CP-02 | [cp02LoginConContrasenaIncorrecta.png](./03_Capturas/S13_Automaticas/cp02LoginConContrasenaIncorrecta.png) | Pasa; mensaje `Invalid email or password`. |
| CP-18 | [cp18AgregarProductoAlCarrito.png](./03_Capturas/S13_Automaticas/cp18AgregarProductoAlCarrito.png) | Pasa; contador del carrito en 1. |

### 3.2 Manuales — S13

Carpeta: [S13_Manuales](./03_Capturas/S13_Manuales/)

| Caso | Archivo | Resultado |
|---|---|---|
| CP-05 | [manual_cp05_logout_back.png](./03_Capturas/S13_Manuales/manual_cp05_logout_back.png) | Pasa; logout y botón Atrás. |
| CP-09 | [manual_cp09_idioma.png](./03_Capturas/S13_Manuales/manual_cp09_idioma.png) | Falla; D-02 (idioma mezclado). |
| CP-13 | [manual_cp13_filtros.png](./03_Capturas/S13_Manuales/manual_cp13_filtros.png) | Falla parcial; D-04 (etiquetas en inglés). |
| CP-13 | [manual_cp13_filtro_handtools.png](./03_Capturas/S13_Manuales/manual_cp13_filtro_handtools.png) | Evidencia de apoyo del filtro Hand Tools. |
| CP-30 | [manual_checkout_paso1.png](./03_Capturas/S13_Manuales/manual_checkout_paso1.png) | Compra exploratoria; paso 1 del checkout. |
| CP-30 | [manual_checkout_confirmacion.png](./03_Capturas/S13_Manuales/manual_checkout_confirmacion.png) | Compra completa; factura `INV-2026000008` por `$14.15`. |

## 4. Reportes de automatización

Carpeta: [S13_Gradle](./04_Reportes_Automatizacion/S13_Gradle/)

| Reporte | Enlace | Uso |
|---|---|---|
| HTML de Gradle | [index.html](./04_Reportes_Automatizacion/S13_Gradle/HTML/index.html) | Resultado visual de los 3 tests. |
| XML de JUnit | [TEST-...PruebasToolshopTest.xml](./04_Reportes_Automatizacion/S13_Gradle/XML/TEST-com.equipo06.toolshop.tests.PruebasToolshopTest.xml) | Resultado crudo para trazabilidad. |

> El reporte HTML se descarga y se abre en el navegador para verlo con estilos. En GitHub se muestra como código fuente.

### Resultado de la suite S13

| Test | Caso | Resultado | Duración |
|---|---|---|---|
| `cp01LoginValido` | CP-01 | Pasa | 3,227 s |
| `cp02LoginConContrasenaIncorrecta` | CP-02 | Pasa | 7,867 s |
| `cp18AgregarProductoAlCarrito` | CP-18 | Pasa | 4,945 s |

**Total:** 3 tests, 0 fallos, 16,039 s.

## 5. Proyecto Screenplay

Carpeta: [05_Proyecto_Screenplay](./05_Proyecto_Screenplay/)

Incluye:

- `src/test/java/...` con las capas `ui`, `tasks`, `questions` y `tests`.
- `build.gradle`, `settings.gradle` y `gradle.properties`.
- `gradlew` y `gradlew.bat` para ejecutar sin instalar Gradle.
- `README.md` con las instrucciones de ejecución.

**Stack:** Java 21 · Gradle 8.10.2 · Serenity BDD 4.2.34 · Screenplay · JUnit 5 · Selenium 4 · Chrome headless.

## 6. S15 y S16

| Semana | Carpeta | Estado |
|---|---|---|
| S15 | [06_S15_Ejecucion](./06_S15_Ejecucion/) | Pendiente: 12 tests nuevos, 7 casos pendientes y repetición de defectos. |
| S16 | [07_S16_Informe_y_Sustentacion](./07_S16_Informe_y_Sustentacion/) | Pendiente: informe final y sustentación de 10–12 minutos. |

## 7. Resumen de la línea base S13

- **30 casos diseñados:** 24 del Avance 2 + 6 nuevos (CP-25 a CP-30).
- **12 de 12 funciones cubiertas.**
- **23 de 30 casos ejecutados** (76,7 %).
- **19 de 23 casos exitosos** (82,6 %).
- **3 de 30 casos automatizados** (10 %).
- **KPI:** 7 en verde, 1 en amarillo (KPI-1) y 2 en rojo (KPI-5 y KPI-8).

## Contacto

Repositorio principal: <https://github.com/Deyner3267/GCS-Equipo06-Toolshop-2026-2>
