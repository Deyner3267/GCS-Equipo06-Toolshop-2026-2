| Transición | Estados | Evento | Caso | Tipo |
|---|---|---|---|---|
| T1 | Visitante → Login | Abrir login o acceso directo sin sesión | CP-04 | Válida |
| T2 | Login → Autenticado | Credenciales válidas | CP-01 | Válida |
| T3 | Login → Login | Credenciales inválidas o campos vacíos | CP-02, CP-03 | Inválida |
| T4 | Autenticado → Visitante | Cerrar sesión | CP-05 | Válida |
| T5 | Autenticado → Catálogo | Abrir catálogo | CP-06 | Válida |
| T6 | Catálogo → Producto | Abrir ficha de producto | CP-15 | Válida |
| T7 | Producto → Carrito | Agregar al carrito | CP-18 | Válida |
| T8 | Carrito → Carrito | Modificar cantidad o eliminar | CP-19, CP-20 | Válida |
| T9 | Carrito → Checkout datos | Iniciar checkout | CP-22 | Válida |
| T10 | Checkout datos → Checkout datos | Datos inválidos | CP-23, CP-29 | Inválida |
| T11 | Checkout datos → Checkout pago | Datos válidos | CP-30 | Válida |
| T12 | Checkout pago → Confirmación | Pago confirmado | CP-30 | Válida |
| T13 | Confirmación → Catálogo | Volver a comprar | CP-30 | Válida |
| T14 | Checkout datos → Carrito | Producto agotado | CP-24 | Inválida |
