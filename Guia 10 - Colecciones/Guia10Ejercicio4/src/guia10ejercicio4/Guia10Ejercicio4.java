
package guia10ejercicio4;

import Entidad.Pelicula;
import Servicio.PeliculaService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 * 
 * @author Sebastián A. Petrini
 */

public class Guia10Ejercicio4 {
    
    
   
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        
        PeliculaService pS = new PeliculaService();
        ArrayList<Pelicula> peliculas = new ArrayList();
        String opc;
        do {
            peliculas.add(pS.crearPelicula());
            System.out.print("Desea cargar otra Película S/N: ");
            opc = Leer.next().toLowerCase().substring(0, 1);          
        }while(opc.equals("s")); 
        
       pS.imprimirPeliculas(peliculas);
       pS.imprimirPeliculasLargas(peliculas);
       pS.ordenarPeliculaMayoraMenor(peliculas);
       pS.ordenarPeliculaMenoraMayor(peliculas);
       pS.ordenarPeliculaTitulo(peliculas);
       pS.ordenarPeliculaDirector(peliculas);
        
       
        
        
    }

}
