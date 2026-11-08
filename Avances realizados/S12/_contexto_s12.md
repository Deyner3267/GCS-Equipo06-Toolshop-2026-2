# Contexto S12 — Apartado 12 (Métricas de proceso y KPI) — Equipo 06 Toolshop

## 1. Proyecto
- Sitio: Practice Software Testing (Toolshop) — https://practicesoftwaretesting.com
- Equipo 06: Camilo Vides, Luis Tapia, Deyner Ortiz.
- Docente: Andrea Paternina · UCC · 2026-2.
- Enfoque: caja negra, sin acceso al código.
- Entregable: Apartado 12 del Avance 3 (Semana 12): métricas de proceso y de proyecto + tablero de KPI.

## 2. Datos que ya existen (Avance 2 y S11)
- Casos diseñados: 24
- Casos ejecutados: 22
- Casos exitosos: 17
- Casos fallidos: 5 (CP-05, CP-09, CP-13, CP-21, CP-23)
- Casos no ejecutados: 2 (CP-14 filtros combinados y CP-24 checkout con agotado)
- Defectos detectados (E): 7 (D-01 a D-07)
- Funciones del alcance: 12; cubiertas: 10
- PF (S11): 87,22 (PFNA 89, VAF 0,98)
- Densidad de defectos: 7 ÷ 87,22 = 0,080
- Tiempo de catálogo: 2,4 s; tiempo de filtro: 1,6 s
- Casos automatizables: 16; manuales: 8
- Avances entregados a tiempo: 2 de 2
- Horas planeadas del Avance 2: 48 h-persona
- Integrantes: 3

## 3. Datos de proceso y proyecto (registro del equipo, estimación realista)
- Horas de diseño de casos: 13 h
- Horas de ejecución: 9 h
- Horas de sesión exploratoria: 2 h
- Horas de documentación y revisión: 28 h
- Total real: 52 h (vs. 48 h planeadas)
- Reportes de defecto: 8 (7 válidos, 1 rechazado por no reproducible)
- Defectos escapados (D): 1 → D-08: al aplicar un filtro y pasar a la página 2 del catálogo, el filtro se pierde y aparecen productos de otras categorías.
- Casos con script automatizado: 1 (login, script del S11)
- Defectos críticos: 1 (D-06: se pierde el carrito al recargar)
- Carga por integrante: 18 h / 17 h / 17 h

## 4. Defectos del Avance 2 (para el Pareto)
- D-01 Autenticación: el botón «atrás» devuelve a la cuenta con datos en caché → Seguridad.
- D-02 Catálogo: mezcla etiquetas en español e inglés → Usabilidad.
- D-03 Filtros: tres marcas «some name» sin depurar → Fiabilidad.
- D-04 Filtros: etiquetas del panel en inglés → Usabilidad.
- D-05 Filtros: el contador no se actualiza al limpiar el filtro → Adecuación funcional.
- D-06 Carrito: el contenido se pierde al recargar → Adecuación funcional.
- D-07 Checkout: permite avanzar con dirección vacía → Usabilidad.

## 5. Reglas del modelo S12
- Un KPI no es una métrica: debe tener fórmula, meta, umbrales (verde/amarillo/rojo), valor actual, responsable y frecuencia.
- Entre 6 y 10 KPI.
- Al menos 2 de producto, 2 de proceso y 2 de proyecto.
- Al menos 2 adelantados (leading).
- Umbrales definidos antes de medir.
- Cada KPI con responsable.
- Todo amarillo o rojo con acción.
- El tablero debe tener fórmulas y una gráfica.

## 6. Estructura del entregable
- 5.1 Datos recolectados (tabla con fuente).
- 5.2 Métricas de proceso y proyecto calculadas.
- 5.3 Selección de 6 a 10 KPI balanceados.
- 5.4 Ficha completa de al menos un KPI.
- 5.5 Tablero con meta, umbrales, valor, estado y responsable + gráfica.
- 5.6 Lectura integrada y plan de acción.
- 5.7 Enlace con S11, S13 y S15.
- 5.8 Conclusión.
