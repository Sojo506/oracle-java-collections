package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(6);

        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(8);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(9);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

//        for (Titulo item : lista) {
//            System.out.println("Nombre: " + item.getNombre());
//            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
//                System.out.println("Clasificacion: " + pelicula.getClasificacion());
//            }
//        }

//        for (Titulo item : lista) {
//            System.out.println("Nombre: " + item.getNombre());
//            if (item instanceof Pelicula) {
//                // En el primer ejemplo, en el if, se ahorra esta linea de code;
//                Pelicula pelicula = (Pelicula) item;
//                System.out.println("Clasificacion: " + pelicula.getClasificacion());
//            }
//        }

        // otra manera de usar forEach
        lista.forEach(item -> {
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificacion: " + pelicula.getClasificacion());
            }
        });

        Collections.sort(lista);
        System.out.println("lista ordenada por nombre = " + lista);
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha de lanzamiento = " + lista);
    }
}
