/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).

*/
package guia2ejercicios;
import java.util.Scanner;
/**
 *
 * @author Soporte
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        System.out.print("Ingrese los grados centígrados que desea convertir en Fahrenheit: ");
        double grados = Leer.nextDouble();
        double Fahrenheit = 32 + (9 * grados / 5);
        System.out.println("La equivalencia en grados Fahrenheit es: " + Fahrenheit);
        
    }
    
}
