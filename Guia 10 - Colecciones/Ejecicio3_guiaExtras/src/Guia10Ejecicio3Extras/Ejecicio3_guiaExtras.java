/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia10Ejecicio3Extras;

import ejecicio3_guiaextras.Entidades.Libreria;
import ejecicio3_guiaextras.Servicios.LibreriaServicios;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lautaro
 * 
 *  * Implemente un programa para una Librería haciendo uso de un HashSet para evitar
 * datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
 * información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
 * el título del libro, autor, número de ejemplares y número de ejemplares prestados.
 * También se creará en el main un HashSet de tipo Libro que guardará todos los libros
 * creados.
 * En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
 * sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
 * se le pregunta al usuario si quiere crear otro Libro o no.
 * La clase Librería contendrá además los siguientes métodos:
 * • Constructor por defecto.
 * • Constructor con parámetros.
 * • Métodos Setters/getters
 * • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
 * busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
 * método. El método se incrementa de a uno, como un carrito de compras, el
 * atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
 * cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
 * que no queden ejemplares disponibles para prestar. Devuelve true si se ha
 * podido realizar la operación y false en caso contrario.
 * • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
 * lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
 * El método decrementa de a uno, como un carrito de compras, el atributo
 * ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
 * vez que se produzca la devolución de un libro. No se podrán devolver libros
 * donde que no tengan ejemplares prestados. Devuelve true si se ha podido
 * realizar la operación y false en caso contrario.
 * • Método toString para mostrar los datos de los libros.
 */
public class Ejecicio3_guiaExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibreriaServicios m1 = new LibreriaServicios();
        HashSet<Libreria> libreria = new HashSet();
        System.out.println("====LIBRERIA===");
        String opc;
        do { 
            
     //       Libreria pablo = m1.crearLibro();
            libreria.add(m1.crearLibro());
            System.out.println("¿Desea continuar ingresando libros? s/n");
            opc=leer.next();
            if (opc.equalsIgnoreCase("n")){
                break;
            }
        } while (true);
        System.out.println("Ingrese un libro a buscar para PRESTAR");
        String nombre=leer.next();
        Iterator<Libreria> aux1 = libreria.iterator();
        while (aux1.hasNext()){
            Libreria lib = aux1.next();
            if(lib.getTitulo().equalsIgnoreCase(nombre)){
                if(m1.prestamo(lib)){
                    System.out.println("\033[31mLibro procesado\033[0m"); 
                }else {
                    System.out.println("El libro no puede prestarse por falta de stock");
                    
                }  
            }
        }
        System.out.println(libreria);
        /**public void mostrarPaises(HashSet<Pais> p){
        Iterator<Pais> it = p.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNombre());
        }
    }**/
        
        
        /**for (Iterator<Libreria> aux = libreria.iterator(); aux.hasNext();) {
            if(aux.next().getTitulo().equalsIgnoreCase(nombre)){
                if(m1.prestamo(aux.next())){
                    System.out.println("\033[31mLibro procesado\033[0m"); 
                }else {
                    System.out.println("El libro no puede prestarse por falta de stock");
                }  
            }
        }**/
        System.out.println("=======================================");
        System.out.println("Ingrese un libro a buscar para DEVOLVER");
        System.out.println("========================================");
        nombre = leer.next();
        for (Iterator<Libreria> aux = libreria.iterator(); aux.hasNext();) {
            Libreria lib = aux.next();
            if (lib.getTitulo().equalsIgnoreCase(nombre)){
                if (m1.devolucion(lib)){
                    System.out.println("\033[31mLibro devuelto\033[0m");
                }else {
                    System.out.println("error, estan todos los ejemplares en la libreria");
                }
            }
        }
        System.out.println(libreria);
    }
    
}
