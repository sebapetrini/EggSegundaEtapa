/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Crear un programa que dado un número determine si es par o impar
*/
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero= leer.nextInt();
        if (numero%2 == 0)
            System.out.println("El número ingresado es par");
        else
            System.out.println("El número ingresado es impar");
    
    }
}