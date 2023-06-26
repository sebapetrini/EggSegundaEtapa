

package Servicios;

import Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class JugadorService {
    Scanner Leer;

    public JugadorService() {
        Leer  = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Jugador crearJugador(){
        System.out.print("Ingrese el nombre del Jugador: ");
        String nombre = Leer.next();
        return new Jugador(nombre); 
    }
    
    
}
