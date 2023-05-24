/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.

*/
package guia2ejercicios;
import java.util.Scanner;
/**
 *
 * @author Soporte
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner Leer = new Scanner(System.in).useDelimiter("\n");
       System.out.print("Ingrese su nombre: ");
       String nombre = Leer.next();
        System.out.println("Su nombre es: " + nombre + " Bienvenido!!!!");
    }
    
}
