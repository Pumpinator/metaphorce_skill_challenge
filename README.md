<h1>Skill Challenge: Programación básica en Java<h1>

El reto consiste en implementar una aplicación de gestión de películas. Deberás crear las clases
necesarias para representar una película y un gestor de películas que permita realizar operaciones
básicas, como agregar una película, eliminar una película y obtener una lista de películas.

Requisitos:
1. Crea una clase Película que tenga los siguientes atributos:
     Id (int): identificador único de la película.
     Nombre (String): nombre de la película.
     Disponible (boolean): indica si la película está disponible o no.
2. Crea una clase GestorPelicula que contenga una colección de películas (puedes
utilizar una lista, por ejemplo) y que tenga los siguientes métodos:
     AgregarPelicula(Pelicula pelicula): agrega una película la colección.
     EliminarPelicula(int id): elimina la película con el id especificado de la
     colección.
     ObtenerPeliculas(): devuelve una lista con todas las películas.
     ObtenerPeliculasDisponibles(): devuelve una lista con las películas
     disponibles.
     ObtenerPeliculasNoDisponibles(): devuelve una lista con las películas no
     disponibles.
     MarcarPeliculaComoDisponible(int id): marca una película como disponible
     según el ID especificado.
3. Crea una clase Main que sirva como punto de entrada de la aplicación. En el
método main, crea instancias de películas, agrégalas al gestor de películas y realiza
algunas operaciones como:
     Eliminar una película
     Marcar una película como activa.
     Mostrar la lista de películas no disponibles.
4. Estructura del proyecto:
     Crea un paquete com.methaporce.modelo para las clases relacionadas con
     las tareas.
     Crea un paquete com.methaporce.vista para la clase Main.
