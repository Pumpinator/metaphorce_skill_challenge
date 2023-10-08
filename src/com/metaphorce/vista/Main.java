package com.metaphorce.vista;

import java.util.List;

import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;

public class Main {

    public static void main(String[] args) {
        Pelicula[] nuevasPeliculas = {
            new Pelicula(1, "Toy Story", true),
            new Pelicula(2, "Star Wars IV: Una Nueva Esperanza", true),
            new Pelicula(3, "La Leyenda de la Nahuala", false),
            new Pelicula(4, "Interstellar", false),
            new Pelicula(5, "Titanic", true),
            new Pelicula(6, "El Señor de los Anillos: La Comunidad del Anillo", true),
            new Pelicula(7, "Heroico", false),
            new Pelicula(8, "Inception", false),
            new Pelicula(9, "Avengers: Endgame", true),
            new Pelicula(10, "The Dark Knight", false)
        }; // CREE UNA INSTANCIA DE PELICULAS
        

        GestorPelicula peliculas = new GestorPelicula(); // CREE UNA INSTANCIA DEL GESTOR PARA ALIMENTARLO CON 10 PELICULAS
        
        for(int i=0; i < nuevasPeliculas.length; i++) {
            peliculas.agregar(nuevasPeliculas[i]);
        }
        System.out.println("Lista completa de peliculas.");
        imprimirLista(peliculas.listar());
        // IMPRIMO MI INSTANCIA DEL GESTOR DE PELICULAS ALIMENTADA CON UN CICLO

        peliculas.eliminar(2);
        System.out.println("Lista de peliculas con la pelicula 2 eliminada.");
        imprimirLista(peliculas.listar());
        // ELIMINAMOS LA PELICULA CON EL ID 2 E IMPRIMIMOS NUESTRA LISTA

        peliculas.disponibilizar(7);
        System.out.println("Lista de peliculas disponibles con la pelicula 7 disponible.");
        imprimirLista(peliculas.listarDisponibles());
        // HACEMOS DISPONIBLE UNA PELICULA Y LA MOSTRAMOS EN LA LISTA DE PELICULAS DISPONIBLES

        System.out.println("Lista de peliculas no disponibles.");
        imprimirLista(peliculas.listarNoDisponibles());
        

    }

    public static void imprimirLista(List<Pelicula> listaPeliculas) { // HICE UN METODO PARA IMPRIMIR LISTAS
        for(Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("");
    }

}
