

package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ProductoService {
    Scanner Leer;

    public ProductoService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Producto crearProducto(){
        System.out.print("Ingrese el código del Producto: ");
        int codigo = Leer.nextInt();
        System.out.print("Ingrese el nombre del Producto: ");
        String nombre = Leer.next();
        System.out.print("Ingrese el precio del Producto: ");
        double precio = Leer.nextDouble();
        System.out.print("Ingrese el código del fabricante: ");
        int cod_fabricante = Leer.nextInt();
        
        return new Producto(codigo, nombre, precio, cod_fabricante);
    }
}
