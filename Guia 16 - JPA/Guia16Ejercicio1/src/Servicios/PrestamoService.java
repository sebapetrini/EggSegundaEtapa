

package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistencia.PrestamoDAO;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PrestamoService {
    Scanner Leer;
    PrestamoDAO pD;
    ClienteService cS;
    LibroService lS;
    
    public PrestamoService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
        pD = new PrestamoDAO();
        cS = new ClienteService();
        lS = new LibroService();
    }
    
    public void menuPrestamo(){
        int op;
        boolean salir = true;
        do {
            System.out.println("Menú Prestamo");
            System.out.println("1  - Ingresar un nuevo Prestamo");
            System.out.println("2  - Listar Prestamos");
            System.out.println("3  - Listar Clientes");
            
            System.out.println("4  - Devolver un Libro");
            
         /*   System.out.println("5  - Ingresar un nuevo Libro");
            System.out.println("6  - Listar Libros");
            System.out.println("7  - Buscar Autor por Nombre");
            System.out.println("8  - Buscar Libro por ISBN");
            System.out.println("9  - Buscar Libro por Título");
            System.out.println("10 - Buscar Libro/s por Autor");
            System.out.println("11 - Buscar libro/s por Editorial");
            System.out.println("12 - Sección Prestamos y Clientes");*/
            System.out.println("0  - Salir");
            System.out.println("");
            System.out.print("Ingrese la opción: ");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    crearPrestamo();
                    break;
                case 2:
                    listarPrestamo();
                    break;    
                case 3:
                    cS.listarCliente();
                    break;    
                case 4:
                    devolverPrestamo();
                    break;    
/*                case 5:
                    lS.crearLibro();
                    break;    
                case 6:
                    lS.listarLibro();
                    break;    
                case 7:
                    aS.listarAutorNombre();
                    break;
                case 8:
                    lS.listarLibroISBN();
                    break;
                case 9:
                    lS.listarLibroTitulo();
                    break;    
                case 10:
                    lS.listarLibroAutor();
                    break; 
                case 11:
                    lS.listarLibroEditorial();
                    break;   
                case 12:
                    pS.menuPrestamo();
                    break;  */
                case 0:  
                    salir = false;
                    break;
            }
        } while (salir);
        
    }
    
    public void crearPrestamo(){
        Date fprestamo = new Date();
        Cliente c = cS.menuCliente();
        Libro l = lS.menuLibro();        
        pD.guardarPrestamo(new Prestamo(fprestamo,null, l, c));
        
    }
    
    public void devolverPrestamo(){
        Date fdevolucion = new Date();
        Cliente c = cS.menuCliente();
        Libro l = lS.menuLibro();        
        pD.reemplazarPrestamo(new Prestamo());
        
    }
    
    public void listarPrestamo(){
        List<Prestamo> prestamo = pD.listaPrestamo();
        System.out.println("");
        System.out.printf("%-6s %-10S %-10s %-20s %-20s\n", "ID", "Fecha Inicial", "Fecha Final", "Titulo del Libro"
                            , "Cliente");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Prestamo p : prestamo) {
            System.out.printf("%-6s %-10S %-10s %-20s %-20s\n", p.getId(), p.getFechaPrestamo(), p.getFechaDevolucion()
                    , p.getLibro().getTitulo(), (p.getCliente().getNombre() + " " + p.getCliente().getApellido()));
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------"); 
    }
    
    
}
