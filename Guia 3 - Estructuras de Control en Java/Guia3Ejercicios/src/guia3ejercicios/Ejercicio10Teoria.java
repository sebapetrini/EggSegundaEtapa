/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio10Teoria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un número: ");
            numero = leer.nextInt();
            System.out.print(numero + " ");
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
     }
}
