/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

*/

public class Guia4Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un nú,mero para analizar si es primo: ");
        int numero = leer.nextInt();
        System.out.println("El numero " + numero + " es primo??? " + primo(numero));
    }
   
    public static boolean primo(int num){
        
        if (num<1) 
            return false;
        else if (num == 1)
            return true;
        else{
             boolean resultado = true;
            for (int i = 2; i < num/2 + 1; i++ ) {
                  if (num%i == 0){
                    resultado = false;
                    break;
                  }
            }
           return resultado;
        }
    
    }
}
