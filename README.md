# Optimización de un sistema de gestión de pedidos

El sistema de gestión de pedidos de una tienda en línea necesita ser optimizado para manejar un mayor volumen de transacciones. Cada pedido tiene múltiples productos, y se requiere un procesamiento eficiente para evitar cuellos de botella. El sistema debe ser capaz de manejar la adición, eliminación y modificación de productos en un pedido, así como la búsqueda rápida de pedidos por ID.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Dominio de estructuras de datos para resolución de problemas |
| **Nivel** | advanced-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado de datos

**Objetivo:** Definir la estructura de datos para representar los pedidos y productos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los atributos necesarios para representar un pedido y un producto.
- Decide cómo relacionar los productos con los pedidos.

**Entregable:** Estructura de datos definida para pedidos y productos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la eficiencia en la búsqueda y manipulación de datos.
- Piensa en cómo representar la relación entre pedidos y productos.

</details>

### Fase 2: Implementación de operaciones básicas

**Objetivo:** Implementar las operaciones para añadir, eliminar y modificar productos en un pedido.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Implementa la funcionalidad para añadir un producto a un pedido.
- Implementa la funcionalidad para eliminar un producto de un pedido.
- Implementa la funcionalidad para modificar la cantidad de un producto en un pedido.

**Entregable:** Operaciones básicas implementadas para manejar productos en pedidos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la eficiencia de las operaciones en términos de tiempo y espacio.
- Piensa en cómo manejar errores, como productos no encontrados.

</details>

### Fase 3: Optimización de búsqueda

**Objetivo:** Optimizar la búsqueda de pedidos por ID.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Implementa una búsqueda eficiente de pedidos por ID.
- Considera diferentes estructuras de datos para mejorar la eficiencia de la búsqueda.

**Entregable:** Búsqueda de pedidos por ID optimizada.

<details>
<summary>Pistas de conocimiento</summary>

- Evalúa diferentes estructuras de datos para la búsqueda.
- Considera el trade-off entre tiempo y espacio.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Cómo definiste la estructura de datos para representar los pedidos y productos?
- **paraQueSirve**: ¿Para qué sirve la relación entre pedidos y productos en tu sistema?
- **comoSeUsa**: ¿Cómo implementaste la funcionalidad para añadir un producto a un pedido?
- **erroresComunes**: ¿Qué errores podrías encontrar al eliminar un producto de un pedido y cómo los manejaste?
- **queDecisionesImplica**: ¿Qué decisiones tomaste al elegir la estructura de datos para la búsqueda de pedidos por ID?

## Criterios de Evaluacion

- Definir estructura de datos para pedidos y productos
- Implementar operaciones básicas para manejar productos en pedidos
- Optimizar la búsqueda de pedidos por ID

---

*Reto generado automaticamente por Challenge Generator - Pragma*
