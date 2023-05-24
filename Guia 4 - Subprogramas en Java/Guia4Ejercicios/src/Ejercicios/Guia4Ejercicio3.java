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
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void)
El cambio de divisas es:
    i. * 0.86 libras es un 1 €
    ii. * 1.28611 $ es un 1 €
    iii. * 129.852 yenes es un 1 €

*/
public class Guia4Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una cantidad de Euros a convertir: ");
        double dinero = leer.nextDouble();
        System.out.println("Menu de conversión, elija una opcion:");
        System.out.println("D - Dólares\n"
                + "Y - Yenes\n"
                + "L - Libras\n");
        String opc = leer.next();
        cambio(dinero,opc);
    }
    public static void cambio(double euros, String moneda){
        switch (moneda.toLowerCase()) {
            case "d":
                System.out.println("La equivalencia en Dolares es: " + (euros * 1.28));
                break;
            case "y":
                System.out.println("La equivalencia en Yenes es: "  + (euros * 129.85));
                break;
            case "l":
                System.out.println("La equivalencia en Libras es: "  + (euros * 0.86));
                break;
            default:
                System.out.println("Error en el ingreso de la moneda!!!!!!!");
        }
    
    }
}
