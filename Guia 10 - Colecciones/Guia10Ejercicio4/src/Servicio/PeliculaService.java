

package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PeliculaService {
    Scanner Leer;

    public PeliculaService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Pelicula crearPelicula(){
        System.out.print("Ingrese el título de la película: ");
        String titulo = Leer.next();
        System.out.print("Ingrese el nombre del Director: ");
        String director= Leer.next();
        System.out.print("Ingrese la duración de la película: ");
        Double duracion=Leer.nextDouble();
        return new Pelicula(titulo, director, duracion);
    }
    
    public void imprimirPeliculas(ArrayList<Pelicula> p){
        System.out.println("===================================================");
        System.out.println("               Linta de Películas");
        System.out.println("==Título=============Director============Duración==");
        for (Pelicula peli : p) {
            System.out.println(peli.getTítulo() + "   " + peli.getDirector() + "   " + peli.getDuracion());
        }      
    }
    public void imprimirPeliculasLargas(ArrayList<Pelicula> p){
        System.out.println("===================================================");
        System.out.println("               Linta de Películas");
        System.out.println("==Título=============Director============Duración==");
        for (Pelicula peli : p) {
            if (peli.getDuracion()>1)
                System.out.println(peli.getTítulo() + "   " + peli.getDirector() + "   " + peli.getDuracion());
        }      
    }
    
    public void ordenarPeliculaMenoraMayor(ArrayList<Pelicula> p){
        p.sort((pa,pb)->pa.getDuracion().compareTo(pb.getDuracion()));
        imprimirPeliculas(p);
    }
    public void ordenarPeliculaMayoraMenor(ArrayList<Pelicula> p){
        p.sort((pa,pb)->pb.getDuracion().compareTo(pa.getDuracion()));
        imprimirPeliculas(p);
    }
    public void ordenarPeliculaTitulo(ArrayList<Pelicula> p){
        p.sort((pa,pb)->pa.getTítulo().compareTo(pb.getTítulo()));
        imprimirPeliculas(p);
    }
    public void ordenarPeliculaDirector(ArrayList<Pelicula> p){
        p.sort((pa,pb)->pa.getDirector().compareTo(pb.getDirector()));
        imprimirPeliculas(p);
    }
    
            
          
    
//    public static Comparator<Pelicula> cp = new Comparator<Pelicula>(){
//    @Override
//    public int compare(Pelicula p1, Pelicula p2){
//        return p1.getDuracion().compareTo(p2.getDuracion());
//    }
//    };
    
}
