

package Servicios;

import Entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PerroService {
    Scanner Leer;

    public PerroService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
        
    public Perro crearPerro(){
        System.out.print("Ingrese el nombre del perro: ");
        String nombre = Leer.next();
        System.out.print("Ingrese la raza del perro: ");
        String raza = Leer.next();
        System.out.print("Ingrese la edad del perro: ");
        Integer edad = Leer.nextInt();
        System.out.print("Ingrese el tamaño del perro: ");
        String tamanio = Leer.next();
        return new Perro(nombre, raza, edad, tamanio);
    }
    
    public void mostrarPerro(Perro p){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Raza: " + p.getRaza());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Tamaño: " + p.getTamanio());
    }
}
