

package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;

/**
 *
 * @author Sebastián A. Petrini
 */

public class FabricanteService {
    Scanner Leer;

    public FabricanteService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Fabricante crearFabricante(){
        System.out.print("Ingrese el código del Fabricante: ");
        int codigo = Leer.nextInt();
        System.out.print("Ingrese el nombre del Fabricante: ");
        String nombre = Leer.next();
        return new Fabricante(codigo, nombre);
    }
}
