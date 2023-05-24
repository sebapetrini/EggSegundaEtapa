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
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas

*/


public class ExtrasEjercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos a convertir: ");
        int min = leer.nextInt();
        int dias = min / 1440;
        min = min - (dias * 1440);
        int horas = min / 60;
        min = min - (horas * 60);
        System.out.println("Esos minutos reon: " + dias + " Días, " + horas + " Horas, " + min + " Minutos");
    
    }    
}
