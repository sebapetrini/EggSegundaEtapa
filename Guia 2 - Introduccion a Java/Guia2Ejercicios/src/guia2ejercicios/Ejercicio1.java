/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/
package guia2ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el primer numero a sumar: ");
        int num1 = Leer.nextInt();
        System.out.print("Ingrese el segundo numero a sumar: ");
        int num2 = Leer.nextInt();
        System.out.println("La suma de los números es: " + (num1 + num2));
        
    }
    
}
