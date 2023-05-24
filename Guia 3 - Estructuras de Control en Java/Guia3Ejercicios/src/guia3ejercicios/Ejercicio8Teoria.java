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
public class Ejercicio8Teoria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una Nota de 0 al 10:");
        int respuesta = leer.nextInt();
        while (respuesta < 0 || respuesta > 10) {
            System.out.println("La nota no es válida, ingrese nuevamente");
            respuesta = leer.nextInt();
        }
     }
    
}
