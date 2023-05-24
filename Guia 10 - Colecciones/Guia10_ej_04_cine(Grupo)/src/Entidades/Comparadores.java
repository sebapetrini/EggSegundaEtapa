/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Pablo Barberis
 */
public class Comparadores {
    
    public static Comparator<Pelicula> comparador = (Pelicula p1, Pelicula p2) -> p1.getHoras().compareTo(p2.getHoras());
    public static Comparator<Pelicula> comparadorTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
    public static Comparator<Pelicula> comparadorDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
    
    
}
