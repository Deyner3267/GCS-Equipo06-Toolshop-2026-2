| ID | Función | Caso | Técnica | Nivel / Tipo | Prioridad | Auto | Resultado S13 |
|---|---|---|---|---|---|---|---|
| CP-01 | F1 · Iniciar sesión | Iniciar sesión con credenciales válidas | Tabla de decisión R4 / partición de equivalencia | Sistema / Funcional | Alta | Sí | Pasa (S13) |
| CP-02 | F1 · Iniciar sesión | Iniciar sesión con contraseña incorrecta | Tabla de decisión R3 / partición de equivalencia | Sistema / Seguridad | Alta | Sí | Pasa (S13) |
| CP-03 | F1 · Iniciar sesión | Enviar el formulario con correo y/o contraseña vacíos | Tabla de decisión R1-R2 / valores límite (0) | Sistema / Funcional | Alta | Sí | Pasa (Avance 2) |
| CP-04 | F1 · Iniciar sesión | Abrir /account o /checkout por URL sin sesión | Transición de estados inválida | Sistema / Seguridad | Alta | Sí | Pasa (Avance 2) |
| CP-05 | F2 · Cerrar sesión | Cerrar sesión y volver con el botón Atrás | Transición de estados / adivinación de errores | Sistema / Seguridad | Media | No | Pasa (S13) |
| CP-06 | F5 · Listado de catálogo | Cargar el catálogo y contar las tarjetas visibles | Escenario | Sistema / Funcional, desempeño | Media | Sí | Pasa (Avance 2) |
| CP-07 | F5 · Listado de catálogo | Verificar la disponibilidad visible en cada tarjeta | Lista de comprobación | Sistema / Usabilidad | Media | No | Pasa (Avance 2) |
| CP-08 | F6 · Ordenamiento | Ordenar por precio de menor a mayor | Partición de equivalencia (4 criterios de orden) | Sistema / Funcional | Alta | Sí | Pasa (Avance 2) |
| CP-09 | F5 · Listado de catálogo | Revisar que el catálogo esté completo en español | Lista de comprobación / adivinación | Sistema / Usabilidad | Alta | No | Falla (S13) |
| CP-10 | F7 · Filtro por categoría | Filtrar por la categoría Hand Tools | Partición de equivalencia | Sistema / Funcional | Alta | Sí | Pasa (Avance 2) |
| CP-11 | F8 · Filtro por marca | Filtrar por la marca ForgeFlex Tools | Partición de equivalencia | Sistema / Funcional | Media | Sí | Pasa (Avance 2) |
| CP-12 | F9 · Filtro por precio | Filtrar por el rango de precio 10-50 | Partición de equivalencia + valores límite | Sistema / Funcional | Media | Sí | Pasa (Avance 2) |
| CP-13 | F8/F9 · Filtros | Revisar marcas, etiquetas y contador de filtros | Lista de comprobación / exploratoria | Sistema / Usabilidad | Alta | No | Falla (S13) |
| CP-14 | F7/F8/F9 · Filtros | Combinar categoría, marca y rango de precio | Tabla de decisión / partición combinada | Sistema / Funcional | Alta | Sí | Pendiente (S15) |
| CP-15 | F10 · Ficha de producto | Abrir la ficha de un producto disponible | Escenario | Sistema / Funcional | Media | Sí | Pasa (Avance 2) |
| CP-16 | F10 · Ficha de producto | Abrir la ficha de un producto agotado | Partición de equivalencia / lista de comprobación | Sistema / Usabilidad | Media | No | Pasa (Avance 2) |
| CP-17 | F10/F11 · Producto y carrito | Intentar agregar un producto agotado | Tabla de decisión / partición de equivalencia | Sistema / Funcional | Alta | Sí | Pasa (Avance 2) |
| CP-18 | F11 · Carrito | Agregar un producto y verificar el contador | Escenario / valores límite (1) | Sistema / Funcional | Alta | Sí | Pasa (S13) |
| CP-19 | F11 · Carrito | Cambiar la cantidad a 2 y luego a 99 | Valores límite (1, 2, 99, 100) | Sistema / Funcional | Alta | Sí | Pasa (Avance 2) |
| CP-20 | F11 · Carrito | Eliminar un producto del carrito | Transición de estados | Sistema / Funcional | Media | Sí | Pasa (Avance 2) |
| CP-21 | F11 · Carrito | Recargar la página con productos en el carrito | Adivinación / transición de estados | Sistema / Fiabilidad | Media | No | Falla (Avance 2) |
| CP-22 | F12 · Checkout | Iniciar el checkout con sesión activa | Caso de uso | Sistema / Funcional | Alta | Sí | Pasa (Avance 2) |
| CP-23 | F12 · Checkout | Enviar el checkout con campos obligatorios vacíos | Partición de equivalencia / valores límite (0) | Sistema / Usabilidad | Alta | No | Falla (Avance 2) |
| CP-24 | F12 · Checkout | Forzar el checkout con un producto agotado | Tabla de decisión / transición inválida | Aceptación / Funcional | Alta | No | Pendiente (S15) |
| CP-25 | F7/F9 · Filtros y paginación | Filtrar y recorrer toda la paginación | Partición de equivalencia / transición de estados | Sistema / Funcional | Alta | Sí | Pendiente (S15) |
| CP-26 | F3 · Registro de usuario | Registrarse con correo nuevo y datos válidos | Partición de equivalencia / valores límite | Sistema / Funcional | Alta | Sí | Pendiente (S15) |
| CP-27 | F3 · Registro de usuario | Registrarse con un correo ya existente | Partición de equivalencia (clase inválida) | Sistema / Funcional | Media | Sí | Pendiente (S15) |
| CP-28 | F4 · Recuperación de contraseña | Recuperar la contraseña con un correo registrado | Caso de uso / partición de equivalencia | Sistema / Funcional | Alta | Sí | Pendiente (S15) |
| CP-29 | F12 · Checkout | Checkout con dirección de 1 carácter | Valor límite (1) | Sistema / Funcional | Baja | Sí | Pendiente (S15) |
| CP-30 | F12 · Checkout | Comprar un producto de principio a fin | Caso de uso / aceptación | Aceptación / Funcional | Alta | Sí | Pasa (exploratoria S13) |
