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
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String
*/

public class ExtrasEjercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        char letra = leer.next().charAt(0);
        String caso = String.valueOf(letra);
        if (caso.equalsIgnoreCase("A") || caso.equalsIgnoreCase("E") || caso.equalsIgnoreCase("I") || caso.equalsIgnoreCase("O") || caso.equalsIgnoreCase("U") )
            System.out.println("Es una vocal!!!!!");
        else
            System.out.println("No es una Vocal!!!!");
    
         

    }
}