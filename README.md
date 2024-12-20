Todo List Application
=====================

Descripción
-----------

Esta aplicación sencilla de **Todo List** permite a los usuarios agregar, actualizar y gestionar tareas de manera intuitiva. La aplicación está diseñada con una interfaz amigable y es ideal para quienes necesitan organizar sus actividades diarias.

Características principales
---------------------------

*   Agregar nuevas tareas.
    
*   Actualizar el título de una tarea existente.
    
*   Mostrar la lista de tareas.
    

Tecnologías utilizadas
----------------------

*   **Lenguaje**: Kotlin
    
*   **Framework de prueba**: AndroidJUnit4
    
*   **Herramienta de interacción**: Espresso (para pruebas de UI)
    

Instrucciones para ejecutar el proyecto
---------------------------------------

1.  git clone https://github.com/WilsonJrDiaz/claro.git
    
2.  Abre el proyecto en Android Studio.
    
3.  Conecta un dispositivo o emulador Android para ejecutar la aplicación.
    
4.  ./gradlew installDebug
    
5.  ./gradlew connectedAndroidTest
    

Explicación del código de pruebas
---------------------------------

El código proporcionado utiliza **JUnit4** y **Espresso** para probar la funcionalidad de agregar y actualizar tareas dentro de la aplicación.

### Clase de pruebas: TodoTests

#### Dependencias y configuración inicial

*   @RunWith(AndroidJUnit4::class): Define que la clase usará AndroidJUnit4 como framework de prueba.
    
*   @get:Rule val activityRule: Establece una regla para lanzar la actividad principal (MainActivity) antes de cada prueba.
    

#### Caso de prueba: add\_update\_todo

Este test valida las funcionalidades principales de la aplicación:

1.  **Agregar una tarea:**
    
    *   Espresso.onView(ViewMatchers.withId(R.id.todo\_title)): Busca el campo de texto donde se escribe el título de la tarea.
        
    *   perform(ViewActions.typeText(title)): Ingresa el texto "claro" en el campo de texto.
        
    *   Espresso.onView(ViewMatchers.withId(R.id.todo\_save\_button)): Encuentra y presiona el botón para guardar la tarea.
        
    *   check(ViewAssertions.matches(ViewMatchers.withText(title))): Verifica que la tarea agregada tiene el texto correcto.
        
2.  **Actualizar una tarea:**
    
    *   perform(ViewActions.replaceText(updateTitle)): Reemplaza el texto de la tarea con "Carlos Slim".
        
    *   Espresso.onView(ViewMatchers.withId(R.id.update\_button)): Encuentra y presiona el botón para actualizar la tarea.
        
    *   check(ViewAssertions.matches(ViewMatchers.withText(updateTitle))): Verifica que el texto de la tarea fue actualizado correctamente.
        

### Flujo completo del test

*   Inicia ingresando un título para la tarea.
    
*   Guarda la tarea y verifica que se muestre correctamente en la interfaz.
    
*   Actualiza el título de la tarea y comprueba que el cambio se refleja adecuadamente.
    

Estructura del proyecto
-----------------------

*   MainActivity.kt: Contiene la lógica principal de la aplicación.
    
*   res/layout/: Diseño de la interfaz de usuario, incluyendo campos de texto, botones y listas.
    
*   test/: Contiene las pruebas automatizadas, como TodoTests.
    

Futuras mejoras
---------------

*   Implementación de eliminación de tareas.
    
*   Soporte para categorías o etiquetas.
    
*   Sincronización con una base de datos remota.