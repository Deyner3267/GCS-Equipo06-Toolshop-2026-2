# Contexto S11 — Apartado 11 (Métricas de producto) — Equipo 06 Toolshop

## 1. Datos del proyecto
- **Sitio:** Practice Software Testing (Toolshop) — https://practicesoftwaretesting.com
- **Equipo 06:** Camilo Vides, Luis Tapia, Deyner Ortiz.
- **Docente:** Andrea Paternina · UCC · 2026-2.
- **Enfoque:** caja negra. No hay acceso al código fuente ni al servidor.
- **Entregable:** Apartado 11 del Avance 3 (Semana 11): métricas de producto (tamaño con LOC y PF, complejidad ciclomática V(G)).

## 2. Datos de la ronda piloto (vienen del Avance 2 / S10)
- Casos diseñados: **24**
- Casos ejecutados: **22**
- Casos exitosos: **17**
- Casos fallidos: **5**
- Defectos: **7** (D-01 a D-07)
- Funciones del alcance: **12**; cubiertas: **10**
- Problemas de usabilidad: **2**
- Registros sin depurar (marcas «some name»): **3**
- Tiempo de catálogo: **2,4 s**; tiempo de filtro: **1,6 s**
- Módulos: autenticación, catálogo, filtros, ficha de producto, carrito, checkout
- Defectos por módulo: autenticación 1, catálogo 1, filtros 3, ficha 0, carrito 1, checkout 1

## 3. Funciones y casos observados (base para el inventario de PF)
Casos de la matriz del Avance 2:
- CP-01 Login válido · CP-02 Contraseña incorrecta · CP-03 Login con campos vacíos · CP-04 Acceso por URL sin sesión · CP-05 Logout + botón atrás
- CP-06 Cargar catálogo · CP-07 Indicador de inventario · CP-08 Ordenar por precio · CP-09 Consistencia de idioma (i18n)
- CP-10 Filtrar por categoría · CP-11 Filtrar por marca · CP-12 Filtrar por rango de precio · CP-13 Lista de marcas/etiquetas · CP-14 Filtros combinados
- CP-15 Ficha de producto disponible · CP-16 Ficha de producto agotado · CP-17 Añadir agotado al carrito
- CP-18 Agregar al carrito · CP-19 Modificar cantidad · CP-20 Eliminar del carrito · CP-21 Persistencia del carrito
- CP-22 Iniciar checkout con sesión · CP-23 Checkout con campos vacíos · CP-24 Forzar checkout de producto agotado

Funciones adicionales del alcance no cubiertas por casos: registro de usuario y recuperación de contraseña.
Otras funciones observables: cerrar sesión, cambiar idioma, ver detalle de producto, ver carrito, ver marcas/categorías.

## 4. Reglas del modelo S11 (resumen operativo)
### 4.1 Pesos de puntos de función (IFPUG, versión simplificada del curso)
Clasificación: SIMPLE (hasta ~4 campos, un grupo de datos), MEDIO (5–15 campos o dos grupos), COMPLEJO (muchos campos o varios grupos).

| Componente | Simple | Medio | Complejo |
|---|---|---|---|
| Entrada externa (EI) | 3 | 4 | 6 |
| Salida externa (EO) | 4 | 5 | 7 |
| Consulta externa (EQ) | 3 | 4 | 6 |
| Archivo lógico interno (ILF) | 7 | 10 | 15 |
| Archivo de interfaz externo (EIF) | 5 | 7 | 10 |

### 4.2 Fórmulas
- PFNA = Σ (cantidad de cada componente × su peso)
- VAF = 0,65 + 0,01 × ΣFi  (ΣFi va de 0 a 70; VAF entre 0,65 y 1,35)
- PF = PFNA × VAF
- Densidad de defectos por PF = defectos ÷ PF
- Casos por PF = casos diseñados ÷ PF

### 4.3 Las 14 características generales (Fi de 0 a 5)
1 Comunicación de datos · 2 Procesamiento distribuido · 3 Rendimiento · 4 Configuración muy utilizada · 5 Tasa de transacciones · 6 Entrada de datos en línea · 7 Eficiencia del usuario final · 8 Actualización en línea · 9 Procesamiento complejo · 10 Reusabilidad · 11 Facilidad de instalación · 12 Facilidad de operación · 13 Múltiples sitios · 14 Facilidad de cambio.
Cada una se justifica; no se pone todo en 5.

### 4.4 Complejidad ciclomática
- V(G) = E − N + 2 (E aristas, N nodos)
- V(G) = P + 1 (P nodos de decisión)
- V(G) = número de regiones del grafo
- Las tres deben coincidir. V(G) = nº mínimo de casos para cubrir los caminos independientes.
- Interpretación: 1–10 baja; 11–20 moderada; 21–50 alta; >50 muy alta.

### 4.5 LOC (regla de honestidad)
- Solo se cuentan LOC de código real al que tengamos acceso: nuestros scripts de prueba o un repositorio público.
- Si no hay acceso, se ESTIMAN desde los PF (backfiring, ~50 LOC/PF para JavaScript) y se declara que es una estimación.
- Nunca inventar LOC del sitio ni contar el código minificado del navegador.

## 5. Formato de salida exigido (mismas secciones que el modelo SauceDemo)
- 5.1 Inventario y conteo de PF (tabla de componentes + tabla PFNA).
- 5.2 Características generales (14 Fi con justificación y ΣFi).
- 5.3 Cálculo de PF + normalización de defectos y casos por PF.
- 5.4 LOC (conteo real del script y/o estimación desde PF, marcada).
- 5.5 Complejidad ciclomática de al menos un flujo (grafo, N/E/P, dos fórmulas, tabla de caminos → casos).
- 5.6 Resumen de métricas (tipo, valor, característica ISO 25010, qué dice).
- 5.7 Párrafo de interpretación.

## 6. Criterios de calidad del entregable
- Mostrar datos de entrada, fórmula, cálculo paso a paso, valor y significado.
- Coherencia total con los datos del Avance 2.
- Nada de LOC inventadas.
- V(G) verificado con dos fórmulas.
- Relación explícita con ISO/IEC 25010 (mantenibilidad, fiabilidad, adecuación funcional).
