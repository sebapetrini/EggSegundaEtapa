/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

*/
package guia2ejercicios;
import java.util.Scanner;
/**
 *
 * @author Soporte
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese una frase para trabajarla: ");
        String frase = Leer.nextLine();
        System.out.println("Su frase en minúsculas es: " + frase.toLowerCase());
        System.out.println("Su frase en mayúsculas es: " + frase.toUpperCase());
    }
    
}
