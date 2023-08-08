

package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
//import Persistencia.AutorDAO;
//import Persistencia.EditorialDAO;
import Persistencia.LibroDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class LibroService {
    Scanner Leer;
    LibroDAO lD;
    AutorService aS;
    EditorialService eS;
    
    public LibroService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
        lD = new LibroDAO();
        aS = new AutorService();
        eS = new EditorialService();
    }
    
    public void crearLibro(){
        System.out.print("Ingrese el ISBN del libro: ");
        Long isbn = Leer.nextLong();
        System.out.print("Ingrese el título del Libro: ");
        String titulo = Leer.next();
        System.out.print("Ingrese el año del libro: ");
        int anio = Leer.nextInt();
        System.out.print("Ingrese la cantidad de ejemplares: ");
        int cant = Leer.nextInt();
        String op;
        do {
            System.out.print("El libro esta de alta (S/N): ");
            op = Leer.next().toUpperCase().substring(0, 1);
        } while (!( op.equals("S") || op.equals("N")));
        Autor a = aS.menuAutor();
        Editorial e = eS.menuEditorial();
        lD.guardarLibro(new Libro(isbn,titulo, anio, cant, 0, cant, op.equals("S"), a , e));
    }
    
    public Libro crearLibroNuevo(){
        System.out.print("Ingrese el ISBN del libro: ");
        Long isbn = Leer.nextLong();
        System.out.print("Ingrese el título del Libro: ");
        String titulo = Leer.next();
        System.out.print("Ingrese el año del libro: ");
        int anio = Leer.nextInt();
        System.out.print("Ingrese la cantidad de ejemplares: ");
        int cant = Leer.nextInt();
        String op;
        do {
            System.out.print("El libro esta de alta (S/N): ");
            op = Leer.next().toUpperCase().substring(0, 1);
        } while (!( op.equals("S") || op.equals("N")));
        Autor a = aS.menuAutor();
        Editorial e = eS.menuEditorial();
        Libro l = new Libro(isbn,titulo, anio, cant, 0, cant, op.equals("S"), a , e);
        lD.guardarLibro(l);
        return l;
    }
    
    public void listarLibro(){
        List<Libro> l = lD.listaLibro();
        System.out.println("");
        System.out.printf("%-10s %-6S %-5s %-11s %-12s %-12s %-26s %-22s %-5s\n", "ISBN", "ALTA", "ANIO", "EJEMPLARES"
                            , "E. PRESTADOS", "E. RESTANTES", "TITULO","AUTOR","EDITORIAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Libro libro : l) {
            System.out.printf("%-10s %-6S %-5s %-11s %-12s %-12s %-26s %-22s %-5s\n", libro.getIsbn(), libro.getAlta(), 
                            libro.getAnio(),libro.getEjemplares(),libro.getEjemplaresPrestados(),libro.getEjemplaresRestantes(),
                            libro.getTitulo(),libro.getAutor().getNombre(),libro.getEditorial().getNombre());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------"); 
    }
    
    public void listarLibroISBN(){
        System.out.print("Ingrese el ISBN del libro: ");
        Long isbn = Leer.nextLong();
        Libro l = lD.buscarLibro(isbn);
        System.out.println("Los datos del Libro son: ");
        System.out.println("ISBN: " + l.getIsbn() + " Titulo: " + l.getTitulo() + " Año: " + l.getAnio() + " Alta: " + l.getAlta() + " Autor: " + l.getAutor().getNombre() + " Editorial: " + l.getEditorial().getNombre());
    }
    
    public void listarLibroTitulo(){
        System.out.print("Ingrese el Título del libro: ");
        String titulo = Leer.next();
        Libro l = lD.buscarLibro(titulo);
        System.out.println("Los datos del Libro son: ");
        System.out.println("ISBN: " + l.getIsbn() + " Titulo: " + l.getTitulo() + " Año: " + l.getAnio() + " Alta: " + l.getAlta() + " Autor: " + l.getAutor().getNombre() + " Editorial: " + l.getEditorial().getNombre());
    }
    
    public void listarLibroAutor(){
        System.out.print("Ingrese el nombre del Autor: ");
        String aNom = Leer.next();
        List<Libro> l = lD.listaLibroAutor(aNom);
        System.out.println("");
        System.out.printf("%-10s %-6S %-5s %-11s %-12s %-12s %-26s %-22s %-5s\n", "ISBN", "ALTA", "ANIO", "EJEMPLARES"
                            , "E. PRESTADOS", "E. RESTANTES", "TITULO","AUTOR","EDITORIAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Libro libro : l) {
            System.out.printf("%-10s %-6S %-5s %-11s %-12s %-12s %-26s %-22s %-5s\n", libro.getIsbn(), libro.getAlta(), 
                            libro.getAnio(),libro.getEjemplares(),libro.getEjemplaresPrestados(),libro.getEjemplaresRestantes(),
                            libro.getTitulo(),libro.getAutor().getNombre(),libro.getEditorial().getNombre());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------"); 
    }
    
    public void listarLibroEditorial(){
        System.out.print("Ingrese el nombre de la Editorial: ");
        String eNom = Leer.next();
        List<Libro> l = lD.listaLibroEditorial(eNom);
        System.out.println("");
        System.out.printf("%-10s %-6S %-5s %-11s %-12s %-12s %-26s %-22s %-5s\n", "ISBN", "ALTA", "ANIO", "EJEMPLARES"
                            , "E. PRESTADOS", "E. RESTANTES", "TITULO","AUTOR","EDITORIAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Libro libro : l) {
            System.out.printf("%-10s %-6S %-5s %-11s %-12s %-12s %-26s %-22s %-5s\n", libro.getIsbn(), libro.getAlta(), 
                            libro.getAnio(),libro.getEjemplares(),libro.getEjemplaresPrestados(),libro.getEjemplaresRestantes(),
                            libro.getTitulo(),libro.getAutor().getNombre(),libro.getEditorial().getNombre());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------"); 
    }
    
    public void prestarLibro(Libro l){
        l.setEjemplaresRestantes(l.getEjemplaresRestantes()-1);
        l.setEjemplaresPrestados(l.getEjemplaresPrestados()+1);
        lD.reemplazarLibro(l);       
    }
    
    public void devolverLibro(Libro l){
        l.setEjemplaresRestantes(l.getEjemplaresRestantes()+1);
        l.setEjemplaresPrestados(l.getEjemplaresPrestados()-1);
        lD.reemplazarLibro(l);              
    }
    
    public Libro menuLibro(){
        Libro result = null;
        boolean salir = true;
        int op;
        do {
            System.out.println("Elija la opción: ");
            System.out.println("1 - Listar Libros");
            System.out.println("2 - Elegir Libro por ISBN");
            System.out.println("3 - Elegir Libro por Titulo");
            System.out.println("4 - Ingresar un nuevo Libro");
            System.out.println("5 - Salir sin hacer operación");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    listarLibro();
                    break;
                case 2:
                    Long lISBN = Leer.nextLong();
                    result = lD.buscarLibro(lISBN);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Libro no encontrado!!!!");
                    break;    
                case 3:
                    System.out.print("Ingrese el Titulo del Libro: ");
                    String lTit = Leer.next();
                    result = lD.buscarLibro(lTit);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Libro no encontrado!!!!");
                    break;    
                case 4:
                    result = crearLibroNuevo();
                    salir = false;
                    break;      
                 case 5:
                    salir = false;
                    break;    
            }
        } while (salir);
        return result;
    }
}
