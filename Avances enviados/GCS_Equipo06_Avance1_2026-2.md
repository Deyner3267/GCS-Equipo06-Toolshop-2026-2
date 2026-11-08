UNIVERSIDAD COOPERATIVA DE COLOMBIA
Facultad de Ingeniería
Gestión y Calidad del Software
AVANCE 1: Diagnóstico de calidad y plan de SQA
Sitio web asignado: Practice Software Testing (practicesoftwaretesting.com) — Tienda
virtual de venta de herramientas.
Estudiante:
Camilo Vides
Luis Tapia
Deyner Ortiz
Docente:
Andrea Paternina
Montería, cordoba
2026

1. Descripción del sitio y definición de calidad aplicada
El entorno de pruebas asignado, Practice Software Testing (disponible en
practicesoftwaretesting.com), opera como una plataforma transaccional simulada que
comercializa herramientas de ferretería. Su arquitectura funcional integra módulos esenciales
de comercio electrónico: autenticación de perfiles, un catálogo dinámico filtrable por
categorías (ej. Hand Tools, Power Tools) y marcas (ej. ForgeFlex Tools), un sistema de
evaluación de impacto ambiental (CO ), control de inventario en tiempo real y una pasarela
2
de pagos (checkout).
Desde una perspectiva analítica, la "calidad" en este ecosistema no se reduce a la mera
ausencia de colapsos del servidor. Siguiendo el paradigma de Pressman (2021) y el estándar
ISO/IEC 25000, la calidad se define como el grado de concordancia estricta entre la
funcionalidad entregada y los atributos implícitos que exige un comprador digital. Aplicado
a este portal, un software de calidad debe garantizar una experiencia de usuario (UX)
coherente, donde la interfaz mantenga consistencia idiomática, el carrito actualice sus valores
matemáticos sin latencia y los módulos de pago protejan la integridad transaccional
bloqueando cualquier fricción operativa.
2. Enfoque de la calidad adoptado
La auditoría se rige bajo la filosofía de Philip B. Crosby, fundamentada en dos ejes: la
absoluta "conformidad con los requisitos" y la meta preventiva de "cero defectos".
Asumir este enfoque responde directamente a la naturaleza financiera del sitio evaluado. En
una tienda en línea, tolerar umbrales de error (como lo permitirían modelos de inspección
tardía) resulta insostenible; permitir que un usuario intente comprar un artículo sin

existencias o se enfrente a datos corruptos destruye la confianza comercial. La perspectiva
de Crosby obliga a diagnosticar las anomalías del portal no como accidentes inevitables, sino
como desviaciones de un estándar que deben aislarse en esta fase inicial. Se descartan
modelos como el de Deming, al enfocarse en la mejora continua de un ciclo de desarrollo
interno sobre el cual, como auditores de caja negra, no tenemos control estructural.
3. Diagnóstico de problemas (Checklist e Ishikawa)
La inspección inicial del catálogo revela inconsistencias que afectan la aptitud de uso. Se
aplicaron dos herramientas de diagnóstico para estructurar estos hallazgos.
Lista de verificación (Checklist de UI/UX y Funcionalidad):
| Criterio evaluado  |     |     | Módulo  | Resultado  |
| ------------------ | --- | --- | ------- | ---------- |
¿El filtrado por categoría (Hand Tools) devuelve productos
|     |     |     | Filtros  | ✓ Cumple  |
| --- | --- | --- | -------- | --------- |
acordes al criterio?
¿El indicador de disponibilidad de inventario es visible en
|     |     |     | Catálogo  | ✓ Cumple  |
| --- | --- | --- | --------- | --------- |
la tarjeta del producto?
¿Los metadatos de las marcas corresponden a entidades
|     |     |     | Filtros  | 𝑿 Falla  |
| --- | --- | --- | -------- | -------- |
comerciales reales?
| ¿La  interfaz  | mantiene  | un  diccionario  | de       |          |
| -------------- | --------- | ---------------- | -------- | -------- |
|                |           |                  | General  | 𝑿 Falla  |
internacionalización (i18n) consistente?

Diagrama Causa-Efecto (Ishikawa - Modelo 6M):
Efecto analizado: Inconsistencia visual y de datos durante la navegación del catálogo (mezcla
de idiomas y metadatos residuales), Se identificaron posibles causas agrupadas en las 6 M:

Categoría
Posibles causas identificadas
(6M)
Carencia de un protocolo de localización (l10n) estructurado que
Método unifique el estado del idioma antes de renderizar los componentes
visuales.
Desincronización en el consumo de la API; el frontend despliega
Máquina etiquetas estáticas en español mientras extrae el JSON de productos en
inglés.
Mano de Ausencia de pruebas de regresión visual rigurosas por parte del equipo
obra de desarrollo antes de liberar la versión final del catálogo.
Registros de prueba no depurados en la base de datos, lo cual inyecta
Material cadenas de texto nulas o de relleno (como "some name") directamente
en los filtros de usuario.
Inexistencia de métricas de cobertura que evalúen qué porcentaje del
Medición
código frontend cuenta con traducciones validadas.
Discrepancias técnicas en la interpretación de los diccionarios de
Medio
idioma al renderizar la plataforma bajo distintos motores de
ambiente
navegación web.
4. Plan de Aseguramiento de Calidad (SQA)
El plan SQA delimita su radio de acción a las funciones críticas de negocio, excluyendo la
auditoría de infraestructura de servidores. Su objetivo es asegurar que la construcción técnica
respalde el modelo comercial.
• Actividades de Verificación (¿El código es consistente?): Se ejecutarán revisiones
por pares (peer reviews) sobre los hallazgos de interfaz para descartar anomalías de

caché local. Se verificará la integridad relacional del catálogo, asegurando que ningún
producto carezca de variables obligatorias (precio, métrica CO , imagen).
2
• Actividades de Validación (¿Satisface al usuario final?): Se diseñarán pruebas
funcionales de extremo a extremo (End-to-End). Estas emularán el recorrido de un
cliente real: desde la aplicación de filtros combinados hasta el intento de forzar un
checkout con un producto con la etiqueta "Agotado", garantizando que el sistema
bloquee la acción adecuadamente.
5. Evaluación bajo el estándar ISO/IEC 25010
La calidad del producto se somete a la taxonomía normativa del modelo ISO/IEC 25010,
analizando tres características medibles:
• Adecuación Funcional (Cumple): El sistema responde con exactitud algorítmica.
Los filtros de categoría discriminan correctamente el inventario y las etiquetas de
huella de carbono se asignan de forma proporcional.
• Capacidad de Interacción / Usabilidad (Falla): La coexistencia de múltiples
idiomas en la misma vista y la exposición de metadatos de desarrollo (marcas
comodín) degradan severamente la operabilidad intuitiva. Un usuario
hispanohablante que lee "Agotado" podría no comprender que "Power Tools" es la
categoría que busca.
• Seguridad (Cumple): La arquitectura aísla correctamente los flujos; no es posible
acceder a historiales de compra ni ejecutar el pago sin poseer un token de sesión
válido.

Referencias
Crosby, P. B. (1979). Quality is Free: The Art of Making Quality Certain. McGraw-Hill.
ISO/IEC. (2023). ISO/IEC 25010:2023 Systems and software engineering — Systems and
software Quality Requirements and Evaluation (SQuaRE) — Product quality model.
International Organization for Standardization.
Pressman, R. S., & Maxim, B. R. (2021). Ingeniería del software: un enfoque práctico (9.ª
ed.). McGraw-Hill.