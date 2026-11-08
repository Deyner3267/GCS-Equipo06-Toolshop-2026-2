# Contexto S14 — Equipo 06 — Toolshop

## Objetivo cumplido
Consolidar el plan de calidad del Avance 3: 11 criterios de aceptación medibles, cronograma S11–S16, roles, RACI, severidad de defectos y criterios de salida. El apartado quedó cerrado en PDF con normas APA y un Excel de soporte.

## Entregables finales
- `GCS_Equipo06_Apartado14_Plan_Calidad_Toolshop.pdf` (20 páginas, portada, resumen, contenido, 11 secciones, referencias y anexos A–D; 2 figuras; metadatos y 18 marcadores).
- `GCS_Equipo06_Apartado14_Plan_Calidad_Toolshop.md` (fuente editable).
- `GCS_Equipo06_Apartado14_Plan_Calidad_Toolshop.xlsx` (7 hojas: Criterios, Cronograma, Roles, RACI, Defectos, Trazabilidad, Resumen).
- `fig_criterios_s14.png` (línea base de los 11 criterios).
- `fig_cronograma_s14.png` (Gantt S11–S16).

## Números oficiales S14
- 11 criterios de aceptación: CA-01 a CA-11.
- Línea base S13: 4 cumplen, 4 parciales, 3 no cumplen.
- 30 casos diseñados; 12/12 funciones; 22 automatizables / 8 manuales.
- 23/30 ejecutados (76,7 %); 19/23 exitosos (82,6 %); 3/30 automatizados (10 %).
- KPI S13: 7 verde, 1 amarillo (KPI-1 82,6 %), 2 rojos (KPI-5 76,7 %, KPI-8 10 %).
- Meta S15: 30/30 ejecutados, 15/30 automatizados (50 %), 0 críticos abiertos, ≤ 1 mayor documentado.
- Cronograma: S11 19–25 oct; S12 26 oct–1 nov; S13 2–8 nov; S14 9–15 nov; S15 16–22 nov; S16 23–29 nov de 2026.
- Roles: Camilo Vides (QA Lead y métricas), Luis Tapia (diseño y automatización), Deyner Ortiz (manual y defectos).
- Distribución de carga S12: 34,6 % / 32,7 % / 32,7 % sobre 52 horas.

## Criterios y estado S13
| Criterio | Tema | Estado S13 |
|---|---|---|
| CA-01 | Flujo crítico | Cumple (5/5) |
| CA-02 | Total del carrito | Cumple (3/3) |
| CA-03 | Acceso sin sesión | Cumple (2/2) |
| CA-04 | Mensajes de error | Parcial (1/2) |
| CA-05 | Consistencia idiomática | No cumple (0/2) |
| CA-06 | Tiempo de catálogo/filtro | Parcial (catálogo 2,4 s; filtro pendiente) |
| CA-07 | Fiabilidad | No cumple (D-06 crítico; densidad 0,080) |
| CA-08 | Dos navegadores | Parcial (Chrome 3/3; Edge pendiente) |
| CA-09 | Cobertura y ejecución | Parcial (12/12 diseño; 23/30 ejecución) |
| CA-10 | Automatización | No cumple (3/30 = 10 %) |
| CA-11 | Proyecto | Cumple (100 % hitos; 8,3 % desviación) |

## Decisiones de continuidad
- Mantener los 30 casos de la S13; no crear casos nuevos para S14.
- La S14 es plan, no ejecución: los resultados finales se reportan en S15 y S16.
- El criterio de aceptación principal es el flujo crítico (CA-01) y el total del carrito (CA-02).
- La aceptación con observaciones exige CA-01, CA-02, CA-03 y CA-07; los demás criterios pueden quedar como observación con plan de acción.
- Los defectos menores (D-02, D-04) no bloquean; D-06 y D-07 sí deben resolverse antes de aceptar.
- Si la automatización no llega a 15/30, el mínimo aceptable es 9/30 = 30 % (umbral amarillo del KPI-8).
- S16 depende de los resultados de S15.

## Pendientes para S15 (7 casos)
CP-14, CP-24, CP-25, CP-26, CP-27, CP-28, CP-29.

## Automatizaciones previstas para S15 (12)
CP-03, CP-04, CP-08, CP-10, CP-11, CP-12, CP-14, CP-17, CP-19, CP-20, CP-22, CP-25.
Con las 3 existentes (CP-01, CP-02, CP-18) se llega a 15/30 = 50 %.

## Verificación
- Documento/PDF/Excel: 217 checks, 0 errores.
- PDF: 20 páginas, 2 imágenes, sin páginas vacías, numeración desde la página 2, metadatos y 18 marcadores.
- MD: 11 CA, 30 CP, 10 KPI, tablas consistentes, sin mojibake.
- Excel: 7 hojas, 11 criterios, 4/4/3 estados, 6 semanas, 8 defectos.

## Nomenclatura
- PDF: `GCS_Equipo06_Apartado14_Plan_Calidad_Toolshop.pdf`.
- MD: mismo nombre base.
- Excel: mismo nombre base.
- Figuras: `fig_criterios_s14.png`, `fig_cronograma_s14.png`.

## Próximo paso
Construir la S15 (ejecución de los 7 casos pendientes + 12 automatizaciones + repetición de defectos + actualización de KPI) y luego la S16 (informe final y sustentación de 10–12 minutos).
