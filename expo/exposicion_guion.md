**Exposición S12 · Métricas de proceso y KPIs de calidad (tablero de indicadores)**

**Equipo 6 (Toolshop)** · Duración sugerida: 12 a 15 minutos · 3 expositores

Reparto: **Deyner** (introducción y conceptos), **Luis** (métricas y KPIs con metas), **Camilo** (tablero, análisis y cierre). Pueden intercambiar los turnos.

**PARTE 1. GUION**

**Diapositiva 1. Portada (Deyner, 30 s)**

"Buenos días. Somos el Equipo 6, Toolshop, y hoy les presentamos *Métricas de proceso y KPIs de calidad: el tablero de indicadores*. Les explicaremos cómo medir la calidad de un proyecto de software y cómo esa información se muestra en un tablero para tomar decisiones."

**Diapositiva 2. Agenda (Deyner, 30 s)**

"Vamos a ver cuatro puntos: qué son las métricas y los KPIs, cuáles usamos en nuestro proyecto, cómo se ve un tablero de indicadores con metas cuantitativas, y cómo interpretarlo."

**Diapositiva 3. ¿Por qué medir? (Deyner, 1 min)**

"Lo que no se mide no se puede mejorar. Sin datos, decir que 'el software va bien' es solo una opinión. Las métricas nos dan evidencia objetiva para detectar problemas a tiempo, comparar avances entre versiones y decidir con criterio. En calidad de software esto reduce el costo de corregir errores, porque un defecto encontrado tarde cuesta mucho más que uno encontrado temprano."

**Diapositiva 4. Métrica vs. KPI (Deyner, 1,5 min)**

"Una **métrica** es una medida objetiva de algo, por ejemplo, el número de defectos encontrados. Un **KPI** (indicador clave de desempeño) es una métrica que se compara contra una **meta** y está ligada a un objetivo de calidad. Por ejemplo: la métrica es 'defectos encontrados' y el KPI es 'densidad de defectos menor a 1 por cada 100 líneas modificadas'. Toda métrica puede ser útil, pero un KPI debe ser **SMART**: específico, medible, alcanzable, relevante y con un tiempo definido."

**Diapositiva 5. Tipos de métricas (Deyner → Luis, 1 min)**

"Las métricas se agrupan en tres tipos. Las **de proceso** miden cómo trabajamos: velocidad, cumplimiento del cronograma, tiempo de corrección. Las **de producto** miden cómo es el software: defectos, complejidad, cobertura de pruebas. Las **de proyecto** miden recursos: esfuerzo y costo. Hoy nos enfocamos en proceso y calidad."

**Diapositiva 6. Métricas de proceso (Luis, 1,5 min)**

"Las métricas de proceso nos dicen si nuestra forma de trabajar es eficiente. En Toolshop usamos: la **tasa de ejecución de casos de prueba**, el **tiempo promedio de corrección de defectos**, la **eficacia en la detección de defectos** (DDE) y el **cumplimiento del cronograma**. Estas métricas permiten ver, por ejemplo, si los defectos se están quedando mucho tiempo sin resolver."

**Diapositiva 7. KPIs de calidad (Luis, 2 min)**

"Estos son los KPIs de calidad con sus metas cuantitativas. Cada uno tiene una fórmula y una meta:

* **Cobertura de pruebas:** casos ejecutados / casos planificados. Meta: ≥ 95 %.
* **Tasa de casos aprobados:** casos exitosos / casos ejecutados. Meta: ≥ 90 %.
* **Densidad de defectos:** defectos / módulos o funcionalidades probadas. Meta: ≤ 0,5.
* **Defectos críticos abiertos:** Meta: 0 al momento de liberar.
* **Tiempo medio de corrección:** Meta: ≤ 3 días.
* **Eficacia de detección de defectos (DDE):** defectos hallados en pruebas / total de defectos. Meta: ≥ 85 %.
  Es importante que cada meta se defina *antes* de medir, no después."

**Diapositiva 8. Semáforo de indicadores (Luis, 45 s)**

"Para leer rápido los resultados usamos un semáforo: **verde** si se cumple la meta, **amarillo** si está dentro de un margen de tolerancia (por ejemplo, 10 % por debajo), y **rojo** si está fuera de la meta y requiere acción inmediata."

**Diapositiva 9. ¿Qué es un tablero de indicadores? (Camilo, 1 min)**

"Un tablero de indicadores, o *dashboard*, es una vista visual que reúne los KPIs más importantes en una sola pantalla. Un buen tablero responde tres preguntas: ¿cómo vamos?, ¿dónde están los problemas? y ¿qué debemos hacer? Debe ser simple, con pocos indicadores, gráficos claros y colores con significado."

**Diapositiva 10. Ejemplo de tablero Toolshop, resumen (Camilo, 2 min)**

"Este es un ejemplo de tablero para el ciclo de pruebas de Toolshop. Arriba están las tarjetas con los KPIs principales: cobertura de pruebas 96 % (meta ≥ 95 %, verde), casos aprobados 88 % (meta ≥ 90 %, amarillo), defectos críticos abiertos 2 (meta 0, rojo) y tiempo medio de corrección 2,8 días (meta ≤ 3, verde). *(Aclaren que son datos de ejemplo.)*"

**Diapositiva 11. Ejemplo de tablero, gráficos (Camilo, 2 min)**

"Debajo vemos cuatro gráficos. El **gráfico de barras** compara los defectos por módulo: el carrito de compras y el pago concentran la mayoría. El **gráfico de líneas** muestra cómo bajan los defectos abiertos sprint a sprint frente a la meta. El **gráfico circular** muestra los defectos por severidad. Y el **gráfico de barras apiladas** muestra casos aprobados, fallidos y bloqueados por sprint. Con esto se ve que los defectos se concentran en pocos módulos, y que hay que priorizar ahí."

**Diapositiva 12. Análisis y decisiones (Camilo, 1 min)**

"Un tablero no sirve si no lleva a acciones. Aquí la lectura es: los 2 defectos críticos abiertos impiden liberar, así que se corrigen primero; se refuerzan las pruebas en carrito y pago; y se revisa por qué la tasa de aprobación está en amarillo. Cada indicador rojo debe tener un responsable y una fecha."

**Diapositiva 13. Buenas prácticas y errores comunes (Luis, 45 s)**

"Buenas prácticas: pocos KPIs, metas realistas, actualización periódica y un responsable por indicador. Errores comunes: medir demasiadas cosas, usar métricas de vanidad, definir metas sin fundamento o presentar datos sin interpretarlos."

**Diapositiva 14. Conclusiones (los tres, 1 min)**

* **Deyner:** "Las métricas convierten opiniones en evidencia."
* **Luis:** "Un KPI necesita una fórmula, una meta y un responsable."
* **Camilo:** "El tablero traduce los datos en decisiones rápidas."
  "Con esto cerramos. Muchas gracias, quedamos atentos a sus preguntas."

**Diapositiva 15. Preguntas y referencias (1 min)**

Se sugiere incluir referencias como ISO/IEC 25010 (modelo de calidad del producto), ISTQB y el enfoque GQM (Goal–Question–Metric). Verifiquen que las citen tal como las vieron en clase.

**PARTE 2. EJEMPLO DE TABLERO / KPI (datos ficticios de Toolshop)**

| **KPI** | **Fórmula** | **Meta** | **Resultado** | **Estado** |
| --- | --- | --- | --- | --- |
| Cobertura de pruebas | Ejecutados / Planificados | ≥ 95 % | 96 % | 🟢 |
| Tasa de casos aprobados | Aprobados / Ejecutados | ≥ 90 % | 88 % | 🟡 |
| Defectos críticos abiertos | Conteo | 0 | 2 | 🔴 |
| Tiempo medio de corrección | Suma días / defectos | ≤ 3 días | 2,8 días | 🟢 |
| Eficacia de detección (DDE) | Hallados en pruebas / Total | ≥ 85 % | 87 % | 🟢 |
| Densidad de defectos | Defectos / módulos | ≤ 0,5 | 0,6 | 🟡 |

**Datos para los gráficos**

* **Defectos por módulo (barras):** Login 3, Catálogo 5, Carrito 9, Pago 8, Perfil 2.
* **Defectos abiertos por sprint (líneas), con meta de 5:** S1 = 20, S2 = 15, S3 = 11, S4 = 7.
* **Defectos por severidad (circular):** Crítica 2, Alta 6, Media 12, Baja 7.
* **Casos por sprint (barras apiladas):**
  + S1: 60 aprobados, 20 fallidos, 10 bloqueados.
  + S2: 70 aprobados, 12 fallidos, 8 bloqueados.
  + S3: 78 aprobados, 8 fallidos, 4 bloqueados.