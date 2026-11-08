**Actividad individual — Momento 2**

Gestión y Calidad del Software · Calidad del software y métricas

Docente: Andrea Paternina · UCC · 2026-2

**Nombre:** Deyner Ortiz Florez **Sitio del proyecto:** Practice Software Testing (Toolshop)

---

## 1 · Modelos de calidad

McCall (1977) fue de los primeros en ordenar la calidad en 11 factores (corrección, fiabilidad, usabilidad…) que baja a criterios y luego a métricas, pensando en la vista del usuario y del desarrollador. Boehm (1978) arranca desde la utilidad del software y le da más peso a la mantenibilidad y la portabilidad. ISO/IEC 25010 ya es el estándar internacional vigente: resume todo en 8 características (adecuación funcional, usabilidad, seguridad, fiabilidad, entre otras) y además separa la calidad del producto de la calidad en uso. Para mi proyecto elegiría **ISO/IEC 25010**: es el más actual, es el que ya venimos usando desde el Avance 1 y sus características se pueden evaluar desde la caja negra, que es justo como trabajamos con Toolshop. McCall y Boehm sirven como referencia histórica, pero se quedan cortos para una tienda en línea.

## 2 · Producto, proceso y proyecto

Son tres formas distintas de mirar la calidad y conviene no revolverlas:

- **Calidad de producto:** qué tan bueno es el software en sí, si hace bien lo que debe hacer. *Ejemplo en mi caso:* que el carrito de Toolshop sume bien los subtotales y que el checkout bloquee la compra de un producto agotado.
- **Calidad de proceso:** qué tan ordenado y repetible es el método con el que yo pruebo ese software. *Ejemplo:* que exista una plantilla única de casos y que cualquier integrante del grupo pueda ejecutarla y obtener el mismo resultado.
- **Calidad de proyecto:** qué tan bien se gestiona el trabajo del equipo. *Ejemplo:* entregar cada avance completo y en la fecha, con los roles repartidos y sabiendo cuántas horas nos toma.

En pocas palabras: el producto es "lo que se entrega", el proceso es "cómo lo pruebo" y el proyecto es "cómo administro el trabajo para lograrlo".

## 3 · Métrica directa vs. indirecta

- **Métrica directa:** número de defectos encontrados. En Toolshop contamos 7 defectos en la ronda piloto. Es directa porque simplemente los conté, no tuve que combinar nada.
- **Métrica indirecta:** densidad de defectos = defectos encontrados / casos ejecutados = 7 / 22 = **0,32 defectos por caso**.

Es indirecta porque salió de combinar dos medidas directas (los defectos y los casos ejecutados) mediante una división; no se observa sola en el sitio, hay que calcularla.

## 4 · Calcula e interpreta

**% de casos exitosos:** 12 / 18 × 100 = **66,7 %**. Significa que apenas dos de cada tres casos pasaron, así que el sitio todavía tiene fallas que hay que corregir antes de considerarlo confiable.

**Tasa de ejecución:** 18 / 20 × 100 = **90 %**. Significa que sí se alcanzó a correr casi toda la prueba (quedaron 2 casos sin ejecutar), así que la cobertura del trabajo fue buena aunque no completa.

## 5 · Relaciona con la calidad

Elijo la **usabilidad** (capacidad de interacción), porque es la característica que peor salió en Toolshop: el catálogo mezcla idiomas y las marcas muestran datos de relleno. La mediría con el **número de problemas de usabilidad detectados en el checklist de UI/UX por vista revisada**; en nuestro caso fueron 2. Esa métrica la evidencia porque cada problema del checklist es un punto donde el usuario tiene que adivinar o donde la interfaz lo confunde, y eso es exactamente lo que mide la usabilidad.
