/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;

import java.util.Scanner;

/**
Ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
public class TeoriaEjercicio14 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[6];
        for (int i = 0; i < Equipo.length; i++) {
             System.out.print("Ingrese el nombre del integrante " + (i + 1 ) + ": ");
             Equipo[i] = leer.next();             
         }
    }
}
