
package guia10ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Guia10Ejercicio1 {
   
    public static void main(String[] args) {
        /*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 

* 2 El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir. 

3 se mostrará todos los perros guardados en el ArrayList.
 */


        
        ArrayList<String> razasPerros= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        String razaPerro;
        
        do{
            
            System.out.println("Ingrese la raza del perro: ");
            razaPerro = sc.nextLine();
            razasPerros.add(razaPerro);
            System.out.println("Desea continuar? (si/no): ");
            String opc= sc.nextLine();
            
            
            if (opc.equalsIgnoreCase("no")){
                break;
            }
            
        } while(true);
        
        System.out.println("Razas de perros almacenadas al momento son: ");
        
        for(String raza : razasPerros){
            System.out.println(raza);
        }
        System.out.print("Ingrese la raza a buscar: ");
        String eliminar = sc.next();
        Iterator<String> it = razasPerros.iterator();
        boolean enc = false;
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(eliminar)){
                it.remove();
                enc = false;
            }
        }
        if (!enc)
            System.out.println("La raza no se encontró!!!! ");
        System.out.println("La lista de razas actualizada es: ");
        Collections.sort(razasPerros);
        for(String raza : razasPerros){
            System.out.println(raza);
        } 
    }
    
}
