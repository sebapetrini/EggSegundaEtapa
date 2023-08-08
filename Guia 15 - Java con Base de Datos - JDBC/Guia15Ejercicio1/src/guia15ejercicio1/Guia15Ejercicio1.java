
package guia15ejercicio1;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDAO;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Guia15Ejercicio1 {
   
    public static void main(String[] args) throws Exception {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        Collection<Fabricante> ListaFabricantes;
        Collection<Producto> ListaProductos;
        FabricanteService fS = new FabricanteService();
        ProductoService pS = new ProductoService();
        FabricanteDAO fD = new FabricanteDAO();
        ProductoDAO pD = new ProductoDAO();
        Fabricante f;
        Producto p;
        int op;
        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("1 - Listar Fabricantes");        
            System.out.println("2 - Agregar Fabricante");
            System.out.println("3 - Eliminar Fabricante");
            System.out.println("4 - Listar Productos");
            System.out.println("5 - Agregar Producto");
            System.out.println("6 - Eliminar Producto");
            System.out.println("7 - (a)Listar todos los nombres Productos");
            System.out.println("8 - (b)Listar todos los nombres y precios Productos");
            System.out.println("9 - (c)Listar todos los Productos precio entre 120 y 202");
            System.out.println("10 -(d)Listar todos los Productos 'Portátiles'");
            System.out.println("11 -(e)Lista el Productomas barato");
            System.out.println("12 -(h)Editar un Producto");
            System.out.println("0 - Salir");
            System.out.print("Ingrese una opción: ");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    ListaFabricantes = fD.listarFabricante();
                    for (Fabricante Fabricante : ListaFabricantes) {
                        System.out.println("Código: " + Fabricante.getCodigo() + "   Nombre: " + Fabricante.getNombre());
                    }
                    break;
                case 2:
                    f = fS.crearFabricante();
                    fD.guardarFabricante(f);
                    break;
                case 3:
                    System.out.print("Ingrese el fabricante a eliminar: ");
                    int cod = Leer.nextInt();
                    fD.eliminarFabricante(cod);
                    break;
                case 4:
                    ListaProductos = pD.listarProducto("");
                    for (Producto p2 : ListaProductos) {
                        System.out.println("Código: " + p2.getCodigo() + "   Nombre: " + p2.getNombre() + "  Precio: " + p2.getPrecio() + "  Codigo Fabricante: " + p2.getCodigo_fabricante());
                    }
                    break;
                case 5:
                    p = pS.crearProducto();
                    pD.guardarProducto(p);
                    break;
                case 6:
                    System.out.print("Ingrese el codigo del producto a eliminar: ");
                    int codprod = Leer.nextInt();
                    pD.eliminarProducto(codprod);
                    break;
                 case 7:
                    ListaProductos = pD.listarProducto("");
                    for (Producto p2 : ListaProductos) {
                        System.out.println("Nombre: " + p2.getNombre());
                    }
                    break;
                case 8:
                    ListaProductos = pD.listarProducto("");
                    for (Producto p2 : ListaProductos) {
                        System.out.println("Nombre: " + p2.getNombre() + "  Precio: " + p2.getPrecio());
                    }
                    break;
                case 9:
                    ListaProductos = pD.listarProducto("where precio between 120 and 202");
                    for (Producto p2 : ListaProductos) {
                        System.out.println("Código: " + p2.getCodigo() + "   Nombre: " + p2.getNombre() + "  Precio: " + p2.getPrecio() + "  Codigo Fabricante: " + p2.getCodigo_fabricante());
                    }
                    break;    
                case 10:
                    ListaProductos = pD.listarProducto("where nombre LIKE '%Portátil%'");
                    for (Producto p2 : ListaProductos) {
                        System.out.println("Código: " + p2.getCodigo() + "   Nombre: " + p2.getNombre() + "  Precio: " + p2.getPrecio() + "  Codigo Fabricante: " + p2.getCodigo_fabricante());
                    }
                    break;
                case 11:
                    ListaProductos = pD.listarProducto("order by precio asc LIMIT 1");
                    for (Producto p2 : ListaProductos) {
                        System.out.println("Nombre: " + p2.getNombre() + "  Precio: " + p2.getPrecio());
                    }
                    break; 
                case 12:
                    System.out.println("Ingrese los datos del producto a modificar");
                    p = pS.crearProducto();
                    pD.modificarProducto(p);                    
                    break;    
            }
        } while (op!=0);
        
        
    }

}
