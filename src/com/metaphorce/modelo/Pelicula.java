package com.metaphorce.modelo;

public class Pelicula {

    private int id;
    private String nombre;
    private boolean disponible;

    public Pelicula() {
    }

    public Pelicula(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String disponibilidad; // SI LA PELICULA ESTA DISPONIBLE LO MOSTRAREMOS COMO CADENA EN LUGAR DE BOOLEANO
        String normalizacion; // AL TRABAJAR ESTA VARIABLE LOGRO QUE EL LARGO DEL NOMBRE NO EXCEDA Y DESACOMODE EL SOUT
        if(disponible) {
            disponibilidad = "Disponible";
        } else {
            disponibilidad = "No disponible";
        }
        if(nombre.length() > 12) {
            normalizacion = nombre.substring(0, 12) + "...";
        } else if (nombre.length() == 12) {
            normalizacion = nombre;
        } else if(nombre.length() > 8) {
            normalizacion = nombre + "\t";
        } else {
            normalizacion = nombre + "\t\t";
        }
        return id + "\t" + normalizacion + "\t" + disponibilidad; // DEVUELVO MI CADENA SEPARADA POR TABULACIONES
    } // SOBREESCRIBI EL METODO TOSTRING() PARA LOGRAR IMPRIMIR LA INFORMACION ORDENADA 

}
