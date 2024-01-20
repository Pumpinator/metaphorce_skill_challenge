<h1>Skill Challenge: Programación básica en Java</h1>

<p>
El reto consiste en implementar una aplicación de gestión de películas. Deberás crear las clases
necesarias para representar una película y un gestor de películas que permita realizar operaciones
básicas, como agregar una película, eliminar una película y obtener una lista de películas.
</p>

Requisitos:

<ol>
     <li>
          Crea una clase Película que tenga los siguientes atributos:
          <ul>
               - id : int
               - nombre : String
               - disponible : booolean
          </ul>
     </li>
     <li>
          Crea una clase GestorPelicula que contenga una colección de películas (puedes
          utilizar una lista, por ejemplo) y que tenga los siguientes métodos:
          <ul>
               <li>+ agregarPelicula(pelicula : Pelicula) : void</li>
               <li>+ eliminarPelicula(id : int) : void</li>
               <li>+ obtenerPeliculas() : List<Pelicula></li>
               <li>+ obtenerPeliculasDisponibles() : List<Pelicula></li>
               <li>+ obtenerPeliculasNoDisponibles() : List<Pelicula></li>
               <li>+ disponibilizarPelicula(id : int)
          </ul>
     </li>
     <li>
          Crea una clase Main que sirva como punto de entrada de la aplicación. En el
          método main, crea instancias de películas, agrégalas al gestor de películas y realiza
          algunas operaciones como:
          <ul>
               Eliminar una película
               Marcar una película como activa
               Mostrar la lista de películas no disponibles
          </ul>
     </li>
     <li>
          Estructura del proyecto:
          <ul>
               Crea un paquete com.methaporce.modelo para las clases relacionadas las tareas
               Crea un paquete com.methaporce.vista para la clase Main
          </ul>
     </li>
</ol>
