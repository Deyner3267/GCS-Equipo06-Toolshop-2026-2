# GCS Equipo 06 — Toolshop

Repositorio de evidencias del proyecto de **Gestión y Calidad del Software** sobre el sitio de práctica **Toolshop** (`https://practicesoftwaretesting.com`).

- **Universidad:** Universidad Cooperativa de Colombia
- **Programa:** Ingeniería de Software
- **Curso:** Gestión y Calidad del Software · 2026-2
- **Docente:** Andrea Paternina
- **Equipo 06:** Camilo Vides · Luis Tapia · Deyner Ortiz
- **Repositorio:** <https://github.com/Deyner3267/GCS-Equipo06-Toolshop-2026-2>

## 📁 Evidencias organizadas

Toda la evidencia está reunida en la carpeta **[Evidencias](Evidencias/)**:

- **[Informes](Evidencias/01_Informes/)** — Avance 1, Avance 2, S11, S12, S13 y S14.
- **[Matrices y Excel](Evidencias/02_Matrices_y_Excel/)** — tablero KPI, matriz de 30 casos y plan de calidad.
- **[Capturas](Evidencias/03_Capturas/)** — automatizadas y manuales de la S13.
- **[Reportes de automatización](Evidencias/04_Reportes_Automatizacion/)** — HTML y XML de Gradle.
- **[Proyecto Screenplay](Evidencias/05_Proyecto_Screenplay/)** — código Java, Gradle y Screenplay.
- **[S15](Evidencias/06_S15_Ejecucion/)** y **[S16](Evidencias/07_S16_Informe_y_Sustentacion/)** — en construcción.

El índice completo, con enlaces directos a cada archivo, está en **[Evidencias/README.md](Evidencias/README.md)**.

## Estado del proyecto

| Entregable | Contenido | Estado |
|---|---|---|
| Avance 1 | Diagnóstico de calidad y plan de SQA | Completado |
| Avance 2 | Modelo de calidad, métricas y diseño inicial de pruebas | Completado |
| S11 | Métricas de producto: PF, V(G), LOC y tiempo de carga | Completado |
| S12 | Métricas de proceso/proyecto y tablero de 10 KPI | Completado |
| S13 | Matriz de 30 casos y ejecución de 6 pruebas (3 manuales y 3 automatizadas) | Completado |
| S14 | Plan de calidad: 11 criterios de aceptación y cronograma | Completado |
| S15 | Ejecución de los 7 casos pendientes, 12 automatizaciones y repetición de defectos | En curso |
| S16 | Informe final y sustentación de 10–12 minutos | Pendiente |

## Estructura del repositorio

```text
.
├── Evidencias/                    Vista curada: informes, Excel, capturas, reportes y proyecto
├── Avances enviados/              Avance 1 y Avance 2 en PDF
├── Avances realizados/
│   ├── S11/                       Métricas de producto
│   ├── S12/                       Métricas de proceso y KPI
│   ├── S13/                       Matriz de 30 casos, documento y proyecto Screenplay
│   └── S14/                       Plan de calidad y criterios de aceptación
├── expo/                          Material de apoyo para la exposición
├── actividad/                     Actividad individual del Momento 2
├── Avances para hacer/            Material de referencia entregado en el curso
├── Todo_los_avances.md            Reglas y alcance de los avances
└── README.md
```

## Evidencias principales

| Evidencia | Enlace |
|---|---|
| Avance 1 (PDF) | [GCS_Equipo06_Avance1_2026-2.pdf](Avances%20enviados/GCS_Equipo06_Avance1_2026-2.pdf) |
| Avance 2 (PDF) | [GCS_Equipo06_Avance2_2026-2.pdf](Avances%20enviados/GCS_Equipo06_Avance2_2026-2.pdf) |
| S11 · Métricas de producto | [PDF](Avances%20realizados/S11/GCS_Equipo06_Apartado11_Metricas_de_producto_Toolshop.pdf) |
| S12 · Métricas de proceso y KPI | [PDF](Avances%20realizados/S12/GCS_Equipo06_Apartado12_Metricas_de_proceso_y_KPI_Toolshop.pdf) |
| S12 · Tablero KPI | [Excel](Avances%20realizados/S12/GCS_Equipo06_Apartado12_Tablero_KPI_Toolshop.xlsx) |
| S13 · Documento de pruebas | [PDF](Avances%20realizados/S13/GCS_Equipo06_Apartado13_Pruebas_niveles_tipos_y_tecnicas_Toolshop.pdf) |
| S13 · Matriz de 30 casos | [Excel](Avances%20realizados/S13/GCS_Equipo06_Apartado13_Matriz_Casos_Toolshop.xlsx) |
| S14 · Plan de calidad | [PDF](Avances%20realizados/S14/GCS_Equipo06_Apartado14_Plan_Calidad_Toolshop.pdf) |
| S14 · Criterios, cronograma y trazabilidad | [Excel](Avances%20realizados/S14/GCS_Equipo06_Apartado14_Plan_Calidad_Toolshop.xlsx) |
| S13 · Proyecto Screenplay | [Carpeta](Avances%20realizados/S13/proyecto-screenplay-toolshop) |
| S13 · Capturas de evidencias | [Carpeta](Avances%20realizados/S13/proyecto-screenplay-toolshop/evidencias) |
| S13 · Reporte HTML de Gradle | [Reporte](Avances%20realizados/S13/proyecto-screenplay-toolshop/build/reports/tests/test/index.html) |

## Automatización

La suite está construida con:

- **Java 21**
- **Gradle 8.10.2**
- **Serenity BDD 4.2.34** con el patrón **Screenplay**
- **JUnit 5**
- **Selenium 4** y Chrome headless

### Casos automatizados en S13

| ID | Caso | Resultado | Duración |
|---|---|---|---|
| CP-01 | Login válido | Pasa | 3,227 s |
| CP-02 | Login con contraseña incorrecta | Pasa | 7,867 s |
| CP-18 | Agregar producto al carrito | Pasa | 4,945 s |

Resultado: **3 tests, 0 fallos, 16,039 s en total**.

### Cómo ejecutar la suite

```powershell
$env:JAVA_HOME = "C:\ruta\a\jdk-21"
$env:Path = "$env:JAVA_HOME\bin;$env:Path"
cd "Avances realizados\S13\proyecto-screenplay-toolshop"
.\gradlew.bat test --no-daemon
```

El reporte HTML queda en `build/reports/tests/test/index.html` y las capturas en `evidencias/`.

## Evidencias manuales de S13

| Caso | Qué se verificó | Resultado |
|---|---|---|
| CP-05 | Logout y botón Atrás | Pasa |
| CP-09 | Idioma del catálogo | Falla (D-02) |
| CP-13 | Etiquetas de filtros | Falla parcial (D-04) |
| CP-30 | Compra completa exploratoria | Pasa; factura `INV-2026000008` por `$14.15` |

Las capturas están en `Avances realizados/S13/proyecto-screenplay-toolshop/evidencias/`.

## Datos de la línea base S13

- **30 casos diseñados**: 24 del Avance 2 + 6 nuevos (CP-25 a CP-30).
- **12 de 12 funciones cubiertas**.
- **23 de 30 casos ejecutados** (76,7 %).
- **19 de 23 casos exitosos** (82,6 %).
- **3 de 30 casos automatizados** (10 %).
- **KPI:** 7 en verde, 1 en amarillo (KPI-1) y 2 en rojo (KPI-5 y KPI-8).

## S15 y S16

La S15 agregará al repositorio:

- Los **12 tests nuevos** de Screenplay (CP-03, CP-04, CP-08, CP-10, CP-11, CP-12, CP-14, CP-17, CP-19, CP-20, CP-22 y CP-25).
- La ejecución de los **7 casos pendientes**: CP-14, CP-24, CP-25, CP-26, CP-27, CP-28 y CP-29.
- La **repetición de los defectos** D-01, D-03, D-06, D-07 y D-08.
- El **tablero KPI actualizado** y el paquete de evidencias de la S15.

La S16 integrará todo en el informe final `GCS_Equipo06_Avance3_2026-2.pdf` y en la sustentación.

## Nota sobre el material de referencia

La carpeta `Avances para hacer/` contiene los modelos y guías entregados en el curso. Se incluye solo como referencia; **no es producción del Equipo 06**.
