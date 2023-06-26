/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia10_ejercicio6_productos;

import Servicios.TiendaServicio;
import java.util.Scanner;

/**
 *
 * @author Salvador Caldarella
 */
public class Guia10_Ejercicio6_Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiendaServicio tiendaServicio = new TiendaServicio();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("*******************************************");
            System.out.println("* Bienvenidos a la distribuidora de Salva *");
            System.out.println("*******************************************");
            System.out.println();
            System.out.println("Seleccione la opcion deseada: ");
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Ingrese una opcion: ");
            System.out.println();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.println();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = sc.nextDouble();
                    tiendaServicio.agregarProducto(nombre, precio);
                    break;
                case 2:
                    sc.nextLine(); 
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    System.out.println();
                    nombre = sc.nextLine();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    System.out.println();
                    precio = sc.nextDouble();
                    tiendaServicio.modificarPrecio(nombre, precio);
                    break;
                case 3:
                    sc.nextLine(); 
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    System.out.println();
                    nombre = sc.nextLine();
                    tiendaServicio.eliminarProducto(nombre);
                    System.out.println();
                    break;
                case 4:
                    tiendaServicio.mostrarProductos();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        } while (opcion != 5);

        
    
}
    
}