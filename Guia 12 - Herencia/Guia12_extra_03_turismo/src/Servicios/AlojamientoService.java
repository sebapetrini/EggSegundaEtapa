

package Servicios;

import Entidades.Alojamiento;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class AlojamientoService {
    
    Scanner Leer;

    public AlojamientoService() {
        Leer  = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Alojamiento crearAlojamiento(){
        System.out.print("Ingrese el Nombre del Alojamiento: ");
        String nombre = Leer.next();
        System.out.print("Ingrese la dirección: ");
        String direccion = Leer.next();
        System.out.print("Ingrese la localidad: ");
        String localidad = Leer.next();
        System.out.print("Ingrese el nombre del gerente: ");
        String gerente = Leer.next();
        
        return new Alojamiento(nombre, direccion, localidad, gerente);
    }

}
