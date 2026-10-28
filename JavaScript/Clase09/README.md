# Clase 9 Cosas importantes en JavaScript -> Tarea

¿Cómo creamos funciones en JavaScript de manera descriptiva?

Tenemos que tener presente que utilizamos el tipo de escritura Camel case y sus identificadores normalemente los vamos a encontrar en ingles, veamos varios ejemplos:

# Identificadores de funciones en JavaScript

Los nombres de las funciones deben ser **descriptivos y fáciles de entender**. Es importante utilizar identificadores que permitan reconocer qué tarea realiza cada función sin necesidad de leer todo el código.

Generalmente, se utilizan palabras en inglés que indican una **acción** y el **elemento sobre el que se trabaja**. Esto facilita la lectura, la comprensión y el mantenimiento del código.
Aunque todavía no vamos a avanzar en funciones flechas y otras cosas más avanzadas, ya que lo veremos más adelante, es importante comenzar a tener en cuenta esta forma productiva de trabajar a la hora de programar en JavaScript.

A la hora de trabajar tenemos que tener en cuenta los siguientes items para un identificador de función, en este ejemplo sería una función para sumar todo lo que recibe:


✅ Es muy descriptiva

✅ Indica que hace un cálculo

✅ Específica que es una suma

✅ Suena natural en inglés

✅ Fácil de entender para otros desarrolladores


Tarea:
Así como yo aclare 5 puntos importantes de la función para sumar, deben mostrar el significado al español de las diferentes funciones y sus puntos importantes para saber que hacen, de los temas que están más arriba, sin incluir los ejemplos:
funciones tienen que ver con la manipulación de datos
Eventos o Interacción
Operaciones CRUD
Utilidades
Espero me lo envien antes de las 23 horas para obtener la mejor nota, debe estar en un README.md en el repositorio de Github, y es el enlace que me deben enviar al correo institucional. Se aprueba con 7, si esta enviado despues de las 23 horas y por supuesto si esta bien resuelto.
Profesor Ariel Betancud

--------------------------------------------------------------------------------------------------------------------

# 1. MANIPULACION DE DATOS

## 1. `calculateTotalPrice()`

**Significado en español:** Calcular el precio total.

* **Descriptiva:** indica que se realizará un cálculo.
* **Específica:** señala que se calculará un precio total.
* **Natural en inglés:** utiliza palabras habituales en programación.
* **Fácil de comprender:** permite identificar su propósito rápidamente.
* **Útil para el equipo:** facilita la lectura del código para otros desarrolladores.

## 2. `formatUserInput()`

**Significado en español:** Dar formato a la entrada del usuario.

* **Descriptiva:** indica que se trabajará con información ingresada por el usuario.
* **Específica:** señala que la tarea consiste en dar formato a esos datos.
* **Identifica la información:** permite reconocer qué datos se van a procesar.
* **Clara:** utiliza un nombre fácil de interpretar.
* **Comprensible:** facilita la lectura y el mantenimiento del código.

## 3. `validateEmailAddress()`

**Significado en español:** Validar una dirección de correo electrónico.

* **Descriptiva:** indica que se comprobará una dirección de correo electrónico.
* **Específica:** identifica el dato que se va a verificar.
* **Orientada a una acción:** permite reconocer que se trata de una validación.
* **Natural en inglés:** utiliza términos habituales en programación.
* **Fácil de entender:** permite reconocer rápidamente su finalidad.

## 4. `convertToCamelCase()`

**Significado en español:** Convertir a formato camelCase.

* **Descriptiva:** indica que se realizará una conversión.
* **Específica:** señala que se utilizará el formato camelCase.
* **Identifica la transformación:** permite reconocer qué cambio se realizará.
* **Clara:** utiliza un nombre relacionado directamente con la operación.
* **Fácil de comprender:** ayuda a identificar el propósito de la función.

## 5. `filterActiveUsers()`

**Significado en español:** Filtrar usuarios activos.

* **Descriptiva:** indica que se realizará un filtrado de datos.
* **Específica:** señala que se trabajará con usuarios activos.
* **Identifica los elementos:** permite reconocer qué usuarios se quieren seleccionar.
* **Directa:** utiliza un nombre breve y descriptivo.
* **Comprensible:** facilita la identificación de la operación.

-----------------------------------------------------------------------------------------------

# 2. EVENTOS O INTERACCIONES:

## 1. `handleButtonClick()`

**Significado en español:** Gestionar el clic de un botón.

* **Descriptiva:** indica que se atenderá una acción relacionada con un botón.
* **Específica:** señala que la acción se produce al hacer clic.
* **Relacionada con la interacción:** permite identificar una acción del usuario.
* **Natural en inglés:** utiliza términos habituales en desarrollo web.
* **Fácil de entender:** permite reconocer qué evento se gestionará.

## 2. `onFormSubmit()`

**Significado en español:** Al enviar un formulario.

* **Descriptiva:** indica que está relacionada con el envío de un formulario.
* **Específica:** identifica el evento que se atenderá.
* **Relacionada con una acción:** permite reconocer cuándo debe producirse una operación.
* **Breve:** utiliza un identificador fácil de recordar.
* **Comprensible:** facilita la identificación de la interacción con el formulario.

## 3. `toggleDarkMode()`

**Significado en español:** Alternar el modo oscuro.

* **Descriptiva:** indica que se cambiará el estado del modo oscuro.
* **Específica:** señala qué característica de la interfaz se modificará.
* **Identifica la acción:** permite reconocer que se alternará entre activado y desactivado.
* **Natural en inglés:** utiliza palabras habituales en programación.
* **Fácil de comprender:** permite identificar rápidamente su propósito.

## 4. `updateProgressBar()`

**Significado en español:** Actualizar la barra de progreso.

* **Descriptiva:** indica que se actualizará un elemento de la interfaz.
* **Específica:** identifica la barra de progreso como el elemento que se modificará.
* **Orientada a una acción:** señala que se realizará una actualización.
* **Clara:** utiliza un nombre relacionado directamente con la tarea.
* **Fácil de entender:** permite identificar qué componente se verá afectado.

## 5. `initializeApp()`

**Significado en español:** Inicializar la aplicación.

*  **Descriptiva:** indica que se preparará la aplicación para comenzar a funcionar.
*  **Específica:** señala que la operación está relacionada con la aplicación completa.
*  **Identifica una etapa:** permite reconocer que se trata de una tarea de inicio.
*  **Natural en inglés:** utiliza una expresión habitual en programación.
*  **Comprensible:** facilita la identificación de las tareas iniciales del programa.

--------------------------------------------------------------------------------

# 3. OPERACIONES CRUD

**CRUD** representa cuatro operaciones básicas para trabajar con datos: (Crear, Leer, Actualizar, Borrar)

* **Operación de creación:** El verbo *create* define la "C" del acrónimo CRUD (guardar datos nuevos).
* **Claridad absoluta:** El adjetivo *new* refuerza que el registro no existía previamente.
* **Entidad definida:** Identifica el objeto de la base de datos sobre el que opera (*user*).
* **Lógica de persistencia:** Indica una interacción directa con sistemas de almacenamiento o API.
* **Fácil de rastrear:** Permite ubicar rápidamente los formularios de registro en el código.

## 1. `createNewUser()`

**Significado en español:** Crear un nuevo usuario.

* **Descriptiva:** indica que se creará un nuevo registro de usuario.
* **Específica:** identifica qué elemento se va a crear.
* **Orientada a una acción:** permite reconocer que se trata de una operación de creación.
* **Clara:** utiliza un nombre directo y descriptivo.
* **Fácil de comprender:** facilita la identificación de su finalidad.

## 2. `fetchUserData()`

**Significado en español:** Obtener los datos del usuario.

* **Descriptiva:** indica que se recuperará información de un usuario.
* **Específica:** señala qué información se necesita obtener.
* **Orientada a una acción:** permite reconocer una operación de consulta o recuperación.
* **Natural en inglés:** utiliza un término habitual en el desarrollo de aplicaciones.
* **Comprensible:** facilita la identificación de la finalidad de la función.

## 3. `updateUserProfile()`

**Significado en español:** Actualizar el perfil del usuario.

* **Descriptiva:** indica que se modificarán datos existentes.
* **Específica:** identifica la información que se actualizará.
* **Orientada a una acción:** permite reconocer que se trata de una operación de actualización.
* **Clara:** utiliza un nombre relacionado directamente con la tarea.
* **Fácil de comprender:** facilita la identificación de su objetivo.

## 4. `deleteUserAccount()`

**Significado en español:** Eliminar la cuenta del usuario.

* **Descriptiva:** indica que se eliminará una cuenta.
* **Específica:** identifica qué elemento será afectado.
* **Orientada a una acción:** permite reconocer que se trata de una operación de eliminación.
* **Directa:** utiliza un identificador claro.
* **Comprensible:** facilita la identificación de la finalidad de la función.

------------------------------------------------------------------------------------------------

# 4. FUNCIONES DE UTILIDAD

## 1. `generateRandomId()`

**Significado en español:** Generar un identificador aleatorio.

* **Descriptiva:** indica que se creará un identificador.
* **Específica:** señala que la generación será aleatoria.
* **Identifica el resultado:** permite reconocer qué se espera obtener.
* **Clara:** utiliza palabras relacionadas directamente con la operación.
* **Fácil de entender:** facilita la identificación de su propósito.

## 2. `formatCurrency()`

**Significado en español:** Dar formato a un valor monetario.

* **Descriptiva:** indica que se aplicará un formato a un importe.
* **Específica:** señala que el dato representa una cantidad de dinero.
* **Identifica el tipo de dato:** permite reconocer que se trabajará con valores monetarios.
* **Breve:** utiliza un nombre sencillo y descriptivo.
* **Comprensible:** facilita la identificación de la operación.

## 3. `debounceSearch()`

**Significado en español:** Controlar la frecuencia de una búsqueda mediante una espera.

* **Descriptiva:** indica que se controlará cuándo se ejecuta una búsqueda.
* **Específica:** señala que la operación está relacionada con una búsqueda.
* **Optimiza las operaciones:** permite reducir las búsquedas repetidas cuando el usuario escribe.
* **Utiliza un término técnico:** incorpora el concepto *debounce*, habitual en programación.
* **Identifica su finalidad:** ayuda a reconocer que se controlará la frecuencia de ejecución.

## 4. `sanitizeInput()`

**Significado en español:** Limpiar o depurar los datos de entrada.

* **Descriptiva:** indica que se procesarán los datos ingresados.
* **Específica:** señala que la operación se aplica a los datos de entrada.
* **Relacionada con la seguridad:** puede ayudar a eliminar o corregir contenido no deseado.
* **Clara:** utiliza un nombre relacionado directamente con la tarea.
* **Fácil de comprender:** permite identificar qué tipo de operación se realizará.

## 5. `checkPermissions()`

**Significado en español:** Comprobar los permisos.

* **Descriptiva:** indica que se verificarán los permisos disponibles.
* **Específica:** señala que se comprobarán los permisos relacionados con una acción.
* **Relacionada con el control de acceso:** permite reconocer que se evaluará si una operación está autorizada.
* **Clara:** utiliza palabras habituales en programación.
* **Fácil de entender:** facilita la identificación de su propósito.

------------------------------------------------------------------------------------------------------

# Conclusión

Utilizar nombres descriptivos para las funciones permite **reconocer sus objetivos y comprender mejor el código**. También facilita el trabajo en equipo, el mantenimiento y la identificación de errores.

Es recomendable elegir identificadores que indiquen claramente **qué acción se realizará y sobre qué elemento se trabajará**.

De esta manera, el código resulta más **ordenado, legible y fácil de mantener**.

> **Importante:** el nombre de una función indica la finalidad que se espera de ella, pero no garantiza por sí solo cómo está implementada. Para conocer su funcionamiento exacto, es necesario revisar el código que contiene.

