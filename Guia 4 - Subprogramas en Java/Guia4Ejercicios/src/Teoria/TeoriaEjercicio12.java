/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
/*

Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.

*/


public class TeoriaEjercicio12 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();
        
        EsMultiplo(numero1, numero2);
        
     }
     public static void EsMultiplo(int num1, int num2) {
         
         if (num1%num2 == 0)
             System.out.println("el primer número es múltiplo del segundo");
         else
             System.out.println("el primer número NO es múltiplo del segundo");
     }

}
