# Contexto S13 — Equipo 06 — Toolshop

## Objetivo cumplido
Diseñar la suite de pruebas de S13, ejecutar 6 pruebas (3 manuales y 3 automatizadas), documentar evidencias y actualizar KPI. El apartado quedó cerrado en PDF con normas APA.

## Entregables finales
- `GCS_Equipo06_Apartado13_Pruebas_niveles_tipos_y_tecnicas_Toolshop.pdf` (23 páginas, portada, resumen, contenido, 8 secciones y anexos A–E).
- `GCS_Equipo06_Apartado13_Pruebas_niveles_tipos_y_tecnicas_Toolshop.md` (fuente editable).
- `GCS_Equipo06_Apartado13_Matriz_Casos_Toolshop.xlsx` (10 hojas: Matriz, Cobertura, Ejecucion_S13, Decision, PE_AVL, Estados, Mapa, Suites, Casos_Detallados, Resumen).
- `proyecto-screenplay-toolshop/` (Java 21 + Gradle 8.10.2 + Serenity BDD 4.2.34 + Screenplay + JUnit 5 + Selenium 4 + Chrome headless).
- `fig_transiciones.png`, `fig_cobertura.png`, `fig_kpi_s13.png`, `fig_resultados_s13.png`, `fig_tiempos_auto.png`, `fig_evidencias_automatizadas.png`, `fig_evidencias_manuales.png`.

## Números oficiales S13
- 30 casos diseñados: 24 del Avance 2 + 6 nuevos (CP-25 a CP-30).
- 6 casos ejecutados en la suite S13: 3 manuales (CP-05, CP-09, CP-13) y 3 automatizados (CP-01, CP-02, CP-18).
- CP-30 es ejecución exploratoria adicional, no hace parte de los 6.
- Suite S13: 4/6 exitosos (66,7 %). CP-09 y CP-13 fallan.
- Ejecución acumulada: 23/30 = 76,7 %.
- Éxito acumulado: 19/23 = 82,6 %.
- Cobertura de diseño: 12/12 funciones = 100 %.
- Cobertura de transiciones: 14/14 = 100 %.
- Tabla de decisión del login: 4/4 reglas.
- Automatización: 3/30 = 10 %.
- KPI-1 82,6 amarillo; KPI-5 76,7 rojo; KPI-6 100 verde; KPI-7 87,5 verde; KPI-8 10 rojo.
- Automatizados: CP-01 3,227 s; CP-02 7,867 s; CP-18 4,945 s; total 16,039 s; 3 tests, 0 fallos.
- CP-30: compra completa, factura INV-2026000008, total $14.15.

## Defectos
- D-01: no reproducido en la versión actual.
- D-02: persiste (idioma mezclado en login/catálogo).
- D-03: no reproducido.
- D-04: persiste (metadatos de filtro).
- D-05: no observable.
- D-06, D-07, D-08: pendientes de S15.

## Casos pendientes para S15 (7)
CP-14, CP-24, CP-25, CP-26, CP-27, CP-28, CP-29.

## Decisiones de continuidad
- Mantener la matriz de 30 casos; no reemplazar casos del Avance 2.
- La automatización obligatoria es Java + Gradle + Screenplay; el script Python de S11 queda obsoleto para S13.
- Para llegar a KPI-8 50 % (15/30) faltan 12 automatizaciones: CP-03, CP-04, CP-08, CP-10, CP-11, CP-12, CP-14, CP-17, CP-19, CP-20, CP-22, CP-25.
- S14 debe adaptar la estructura del modelo SauceDemo a Toolshop, sin copiar textos ni cifras.
- S16 depende de los datos de ejecución de S15.

## Comandos de automatización
```powershell
$env:JAVA_HOME = "C:\Users\Lenovo LOQ\AppData\Local\Temp\opencode\tools\jdk-21.0.12.1+1"
$env:PATH = "$env:JAVA_HOME\bin;C:\Users\Lenovo LOQ\AppData\Local\Temp\opencode\tools\gradle-8.10.2\bin;$env:PATH"
cd "C:\Users\Lenovo LOQ\Desktop\actividades\Gestion de software\Avances realizados\S13\proyecto-screenplay-toolshop"
gradle clean test
```

## Verificación
- Matriz: 56 checks, 0 errores.
- Documento/PDF: 103 checks, 0 errores.
- PDF con 6 imágenes incrustadas, diagrama de estados de página completa, numeración y marcadores.
- Nomenclatura final: `GCS_Equipo06_Apartado13_Pruebas_niveles_tipos_y_tecnicas_Toolshop.pdf`.
