package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.AutorDAO;
import Persistencia.EditorialDAO;
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
    EditorialDAO eD;
    AutorDAO aD;
    AutorService aS;
    EditorialService eS;

    public LibroService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
        lD = new LibroDAO();
        eD = new EditorialDAO();
        aD = new AutorDAO();
        aS = new AutorService();
        eS = new EditorialService();
    }

    public void crearLibro() {
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
        } while (!(op.equals("S") || op.equals("N")));
        Autor a = aS.menuAutor();
        Editorial e = eS.menuEditorial();
        lD.guardarLibro(new Libro(isbn, titulo, anio, cant, 0, cant, op.equals("S"), a, e));
    }

    public void listarLibro() {
        List<Libro> l = lD.listaLibro();
        System.out.println("LISTA DE LIBROS");
        System.out.println("");
        System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", "ISBN", "ALTA", "ANIO", "EJEMPLARES",
                 "EJEMPLARES PRESTADOS", "EJEMPLARES RESTANTES", "TITULO", "AUTOR", "EDITORIAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Libro libro : l) {
            System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", libro.getIsbn(), libro.getAlta(),
                    libro.getAnio(), libro.getEjemplares(), libro.getEjemplaresPrestados(), libro.getEjemplaresRestantes(),
                    libro.getTitulo(), libro.getAutor().getNombre(), libro.getEditorial().getNombre());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void listarLibrosDisponibles() {
        List<Libro> l = lD.listaLibro();
        System.out.println("LISTA DE LIBROS");
        System.out.println("");
        System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", "ISBN", "ALTA", "ANIO", "EJEMPLARES",
                 "EJEMPLARES PRESTADOS", "EJEMPLARES RESTANTES", "TITULO", "AUTOR", "EDITORIAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Libro libro : l) {
            if (libro.getEjemplaresRestantes()>0) {
                System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", libro.getIsbn(), libro.getAlta(),
                        libro.getAnio(), libro.getEjemplares(), libro.getEjemplaresPrestados(), libro.getEjemplaresRestantes(),
                        libro.getTitulo(), libro.getAutor().getNombre(), libro.getEditorial().getNombre());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void listarLibroISBN() {
        System.out.print("Ingrese el ISBN del libro: ");
        Long isbn = Leer.nextLong();
        Libro l = lD.buscarLibro(isbn);
        System.out.println("Los datos del Libro son: ");
        System.out.println("ISBN: " + l.getIsbn() + " Titulo: " + l.getTitulo() + " Año: " + l.getAnio() + " Alta: " + l.getAlta() + " Autor: " + l.getAutor().getNombre() + " Editorial: " + l.getEditorial().getNombre());
    }

    public void listarLibroTitulo() {
        System.out.print("Ingrese el Título del libro: ");
        String titulo = Leer.next();
        Libro l = lD.buscarLibro(titulo);
        System.out.println("Los datos del Libro son: ");
        System.out.println("ISBN: " + l.getIsbn() + " Titulo: " + l.getTitulo() + " Año: " + l.getAnio() + " Alta: " + l.getAlta() + " Autor: " + l.getAutor().getNombre() + " Editorial: " + l.getEditorial().getNombre());
    }

    public void listarLibroAutor() {
        System.out.print("Ingrese el nombre del Autor: ");
        String aNom = Leer.next();
        List<Libro> l = lD.listaLibroAutor(aNom);
        System.out.println("");
        System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", "ISBN", "ALTA", "ANIO", "EJEMPLARES",
                 "EJEMPLARES PRESTADOS", "EJEMPLARES RESTANTES", "TITULO", "AUTOR", "EDITORIAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Libro libro : l) {
            System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", libro.getIsbn(), libro.getAlta(),
                    libro.getAnio(), libro.getEjemplares(), libro.getEjemplaresPrestados(), libro.getEjemplaresRestantes(),
                    libro.getTitulo(), libro.getAutor().getNombre(), libro.getEditorial().getNombre());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void listarLibroEditorial() {
        System.out.print("Ingrese el nombre de la Editorial: ");
        String eNom = Leer.next();
        List<Libro> l = lD.listaLibroEditorial(eNom);
        System.out.println("");
        System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", "ISBN", "ALTA", "ANIO", "EJEMPLARES",
                 "EJEMPLARES PRESTADOS", "EJEMPLARES RESTANTES", "TITULO", "AUTOR", "EDITORIAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Libro libro : l) {
            System.out.printf("%-5s %-7S %-7s %-11s %-21s %-21s %-30s %-10s %-5s\n", libro.getIsbn(), libro.getAlta(),
                    libro.getAnio(), libro.getEjemplares(), libro.getEjemplaresPrestados(), libro.getEjemplaresRestantes(),
                    libro.getTitulo(), libro.getAutor().getNombre(), libro.getEditorial().getNombre());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
