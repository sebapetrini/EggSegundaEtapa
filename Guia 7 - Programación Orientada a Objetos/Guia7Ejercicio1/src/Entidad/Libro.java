/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Libro {
    
    private int isbn;
    private String Título;
    private String Autor;
    private int npaginas;

    public Libro() {
    }

    public Libro(int isbn, String Título, String Autor, int npaginas) {
        this.isbn = isbn;
        this.Título = Título;
        this.Autor = Autor;
        this.npaginas = npaginas;
        
    }
    
    public void cargarLibro(){
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el ISBN: ");
        isbn = Leer.nextInt() ;
        System.out.print("Ingrese el Titulo del Libro:");
        Título = Leer.next();
        System.out.print("Ingrese el Autor del Libro:");
        Autor = Leer.next();
        System.out.print("Ingrese la cantidad de páginas del Libro:");
        npaginas = Leer.nextInt();
    }
    
    public void imprimirLibro(){
        System.out.println("El ISBN: " + isbn);
        System.out.println("El Titulo del Libro:" + Título);
        System.out.println("El Autor del Libro:" + Autor);
        System.out.println("La cantidad de páginas del Libro:" + npaginas);
  
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    
}
