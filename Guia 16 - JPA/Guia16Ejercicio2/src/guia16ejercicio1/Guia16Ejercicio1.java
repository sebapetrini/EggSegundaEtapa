
package guia16ejercicio1;


import Servicios.AutorService;
import Servicios.EditorialService;
import Servicios.LibroService;
import Servicios.PrestamoService;
import java.util.Scanner;



/**
 *
 * @author Sebastián A. Petrini
 */

public class Guia16Ejercicio1 {
   
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        /*LibroService lS = new LibroService();
        AutorService aS = new AutorService();
        EditorialService eS = new EditorialService();*/
        PrestamoService pS = new PrestamoService();
        
        pS.menuPrestamo();
        //pS.crearPrestamo();

        /*int op;
        boolean salir = true;
        do {
            System.out.println("Menú Principal");
            System.out.println("1  - Ingresar un nuevo Autor");
            System.out.println("2  - Listar Autores");
            System.out.println("3  - Ingresar una nueva Editorial");
            System.out.println("4  - Listar Editoriales");
            System.out.println("5  - Ingresar un nuevo Libro");
            System.out.println("6  - Listar Libros");
            System.out.println("7  - Buscar Autor por Nombre");
            System.out.println("8  - Buscar Libro por ISBN");
            System.out.println("9  - Buscar Libro por Título");
            System.out.println("10 - Buscar Libro/s por Autor");
            System.out.println("11 - Buscar libro/s por Editorial");
            System.out.println("0  - Salir");
            System.out.println("");
            System.out.print("Ingrese la opción: ");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    aS.crearAutor();
                    break;
                case 2:
                    aS.listarAutor();
                    break;    
                case 3:
                    eS.crearEditor();
                    break;    
                case 4:
                    eS.listarEditorial();
                    break;    
                case 5:
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
                case 0:  
                    salir = false;
                    break;
            }
        } while (salir);*/
    }
}
