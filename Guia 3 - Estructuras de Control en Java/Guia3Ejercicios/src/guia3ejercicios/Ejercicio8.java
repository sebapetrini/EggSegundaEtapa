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
/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *

*/

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de caracteres por lado: ");
        int lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if ((i == 0 ) || (i == (lado - 1)) || (j == 0) || (j == (lado - 1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        
        
    }    
}
