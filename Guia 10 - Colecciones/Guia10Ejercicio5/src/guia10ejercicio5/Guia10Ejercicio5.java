
package guia10ejercicio5;

import Entidad.Pais;
import Servicio.PaisService;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
* 
 * 
 * @author Sebastián A. Petrini
 */

public class Guia10Ejercicio5 {
   
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        PaisService pS = new PaisService();
        HashSet <Pais> paises = new HashSet();
        String opt;
        do {
            paises.add(pS.crearPais());
            System.out.print("¿Desea agregar otro País S/N?");
            opt = Leer.next().toLowerCase().substring(0, 1);
        } while (!opt.equals("n"));
        
        pS.mostrarPaises(paises);
        pS.mostrarPaisesOrdenados(paises);
        pS.eliminarPais(paises);
        

    }

}
