package com.metaphorce.modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {
    
    private List<Pelicula> peliculas = new ArrayList<>(); // CREE UNA INSTANCIA DE UNA ESTRUCTURA DE DATOS PARA GUARDAR MIS OBJETOS DE CLASE PELICULA

    public void agregar(Pelicula pelicula) {
        peliculas.add(pelicula);
    } // CREE UN METODO PARA AGREGAR UNA PELICULA, PASA EL ARGUMENTO DE PELICULA HACIA EL METODO ADD() DE LA CLASE LISTA<>

    public void eliminar(int id) {
        for(Pelicula pelicula : peliculas) {
            if(pelicula.getId() == id) {
                peliculas.remove(pelicula);
                break;
            }
        }
    } // PARA ELIMINAR UNA PELICULA POR MEDIO DE SU ID RECORREMOS EL ARREGLO BUSCANDO COINCIDENCIAS

    public List<Pelicula> listar() {
        return peliculas;
    }

    public List<Pelicula> listarDisponibles() {
        List<Pelicula> peliculasDisponibles = new ArrayList<>();
        for(Pelicula pelicula : peliculas) {
            if(pelicula.getDisponible()) {
                peliculasDisponibles.add(pelicula);
            }
        }
        return peliculasDisponibles;
    } // IGUAL USE CICLOS PARA BUSCAR LAS PELICULAS DISPONIBLES EN MI ARREGLO DE CLASE LISTA<>

    public List<Pelicula> listarNoDisponibles() {
        List<Pelicula> peliculasNoDisponibles = new ArrayList<>();
        for(Pelicula pelicula : peliculas) {
            if(pelicula.getDisponible() != true) {
                peliculasNoDisponibles.add(pelicula);
            }
        }
        return peliculasNoDisponibles;
    }

    public void disponibilizar(int id) {
        for(Pelicula pelicula : peliculas) {
            if(pelicula.getId() == id) {
                pelicula.setDisponible(true);
            }
        }
    } // MAS CICLOS PARA MODIFICAR LA INFORMACION DE UNA PELICULA POR MEDIO DE SU ID
 
}
