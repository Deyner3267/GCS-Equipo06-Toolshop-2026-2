| Caso | Campo | Contenido |
|---|---|---|
| CP-01 · Iniciar sesión con credenciales válidas | Trazabilidad | F1 · Iniciar sesión · TD R4 · V(G)=4 (S11) · Adecuación funcional y seguridad (S8) |
| CP-01 · Iniciar sesión con credenciales válidas | Técnica · Nivel · Tipo · Prioridad | Tabla de decisión R4 + PE · Sistema · Funcional · Alta |
| CP-01 · Iniciar sesión con credenciales válidas | Precondiciones | Sitio disponible; navegador con caché limpia; cuenta customer@practicesoftwaretesting.com / welcome01; sin sesión iniciada. |
| CP-01 · Iniciar sesión con credenciales válidas | Datos de prueba | URL https://practicesoftwaretesting.com/auth/login; correo customer@practicesoftwaretesting.com; contraseña welcome01. |
| CP-01 · Iniciar sesión con credenciales válidas | Pasos | 1) Abrir la URL. 2) Escribir el correo. 3) Escribir la contraseña. 4) Clic en Sign in. 5) Verificar la URL final. 6) Verificar que se vea la cuenta. |
| CP-01 · Iniciar sesión con credenciales válidas | Resultado esperado | La URL contiene /account; la vista de cuenta carga; no aparece el mensaje de error. |
| CP-01 · Iniciar sesión con credenciales válidas | Al ejecutar (S13) | Pasa · automatizado · 3,227 s · evidencia cp01LoginValido.png. |
| CP-13 · Revisar marcas, etiquetas y contador de filtros | Trazabilidad | F8/F9 · Filtros · D-03, D-04 y D-05 del Avance 2 · Usabilidad y fiabilidad (S8) |
| CP-13 · Revisar marcas, etiquetas y contador de filtros | Técnica · Nivel · Tipo · Prioridad | Checklist + exploratoria · Sistema · Usabilidad · Alta |
| CP-13 · Revisar marcas, etiquetas y contador de filtros | Precondiciones | Catálogo público disponible; navegador con caché limpia; no se requiere sesión. |
| CP-13 · Revisar marcas, etiquetas y contador de filtros | Datos de prueba | Categoría Hand Tools; marcas ForgeFlex Tools y MightyCraft Hardware; rango de precio 10-50. |
| CP-13 · Revisar marcas, etiquetas y contador de filtros | Pasos | 1) Abrir el catálogo. 2) Revisar la lista de marcas. 3) Seleccionar Hand Tools. 4) Revisar las etiquetas del panel. 5) Buscar el contador de resultados. 6) Comparar el idioma de las etiquetas. |
| CP-13 · Revisar marcas, etiquetas y contador de filtros | Resultado esperado | Etiquetas en español; solo marcas reales; contador de resultados visible; paginación coherente con el filtro. |
| CP-13 · Revisar marcas, etiquetas y contador de filtros | Al ejecutar (S13) | Falla · manual · 'Hand Tools' y 'Power Tools' en inglés; no hay contador visible; D-03 no se reproduce; D-04 persiste · evidencia manual_cp13_filtro_handtools.png. |
