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
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.

*/

public class ExtrasEjercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número a transformar entre 1 y 10: ");
        int num;
        do {
            num = leer.nextInt();
        } while (num<=0 || num >=11);
        switch(num){
            case 1:
                System.out.println("El numero romane de " + num + " es: I");
                break;
            case 2:
                System.out.println("El numero romane de " + num + " es: II");
                break;
            case 3:
                System.out.println("El numero romane de " + num + " es: III");
                break;
            case 4:
                System.out.println("El numero romane de " + num + " es: IV");
                break;
            case 5:
                System.out.println("El numero romane de " + num + " es: V");
                break;
            case 6:
                System.out.println("El numero romane de " + num + " es: VI");
                break;
            case 7:
                System.out.println("El numero romane de " + num + " es: VII");
                break;
            case 8:
                System.out.println("El numero romane de " + num + " es: VIII");
                break;
            case 9:
                System.out.println("El numero romane de " + num + " es: IX");
                break;
            case 10:
                System.out.println("El numero romane de " + num + " es: X");
                break;
        }
    }
}
