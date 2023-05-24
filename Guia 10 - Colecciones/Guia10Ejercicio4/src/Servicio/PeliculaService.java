

package Servicio;

import Entidad.Pelicula;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PeliculaService {
    Scanner Leer;

    public PeliculaService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Pelicula crearPelicula(){
        System.out.print("Ingrese el título de la película: ");
        String titulo = Leer.next();
        System.out.print("Ingrese el nombre del Director: ");
        String director= Leer.next();
        System.out.print("Ingrese la duración de la película: ");
        Double duracion=Leer.nextDouble();
        return new Pelicula(titulo, director, duracion);
    }
    
    
    
    
    public static Comparator<Pelicula> cp = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getDuracion().compareTo(p2.getDuracion());
    }
    };
    
}
