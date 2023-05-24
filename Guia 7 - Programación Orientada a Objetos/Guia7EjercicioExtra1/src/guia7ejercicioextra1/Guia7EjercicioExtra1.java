/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra1;

import Entidad.Cancion;
import java.util.Scanner;

/**
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 * 
 * 
 */
public class Guia7EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion c = new Cancion();
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el título de la canción: ");
        c.setTitulo(Leer.next());
        System.out.print("Ingrese el autor de la Canción: ");
        c.setAutor(Leer.next());
        
        System.out.println("El Título es: " + c.getTitulo() + "      El Autor: " + c.getAutor());
    }
    
}
