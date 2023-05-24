/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:



• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.

• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import static Entidades.Comparadores.comparador;
import static Entidades.Comparadores.comparadorDirector;
import static Entidades.Comparadores.comparadorTitulo;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duracion de la pelicula");
        double horas = leer.nextDouble();
        return new Pelicula(titulo, director, horas);
    }

    public void mostrarPeliculas(ArrayList<Pelicula> pelis) {
        System.out.println("Mostrar Peliculas");
        
        for (Pelicula peli : pelis) {
            
            System.out.println(peli.getTitulo());
        }
    }

    public void mayores1h(ArrayList<Pelicula> pelis) {

        for (Pelicula peli : pelis) {
            if (peli.getHoras() > 1) {
                System.out.println("La pelicula " + peli.getTitulo() + " tiene mas de una hora");
            }

        }
    }

    public void ordenarMenorMayor(ArrayList<Pelicula> pelis) {

        Collections.sort(pelis, comparador);
        System.out.println("Peliculas ordenadas de menor a mayor");
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());
        }
    }

    public void ordenarMayorMenor(ArrayList<Pelicula> pelis) {

        Collections.reverse(pelis);
        System.out.println("Peliculas ordenadas de mayor a menor");
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());
        }
    }

    public void ordenarTitulos(ArrayList<Pelicula> pelis) {
        Collections.sort(pelis, comparadorTitulo);
        System.out.println("Peliculas ordenadas segun titulo");
        for (Pelicula peli : pelis) {
            System.out.println(peli.getTitulo());
        }
    }
    
    public void ordenarDirector(ArrayList<Pelicula> pelis) {
    Collections.sort(pelis, comparadorDirector);
        System.out.println("Peliculas ordenadas segun director");
    for (Pelicula peli : pelis) {
            System.out.println(peli.getDirector());
        }
    
    }

}
