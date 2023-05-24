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
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.

*/

public class Guia4Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas que desea evaluar: ");
        int cantpersonas = leer.nextInt();
        pidePersonas(cantpersonas);
    }
    public static void pidePersonas(int cant){
        Scanner leer2 = new Scanner(System.in);
        String nombre, opc;
        int edad;
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese el Nombre: ");
            nombre = leer2.next();
            System.out.print("Ingrese la edad: ");
            edad = leer2.nextInt();
            if (edad >= 18)
                System.out.println(nombre + " Es Mayor de Edad!!!");
            else
                System.out.println(nombre + " Es Mayor de Edad!!!");
            System.out.print("Desea continuar (No para cortar): ");
            opc = leer2.next();
            if (opc.equalsIgnoreCase("no")) break;
        }
        
    }
}
