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
Una obra social tiene tres clases de socios:
    ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
        descuento en todos los tipos de tratamientos.
    ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
        descuento para los mismos tratamientos que los socios del tipo A.
    ○ Los socios que menos aportan, los de tipo ‘C’, no reciben
        descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.

*/

public class ExtrasEjercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la Obra Social Egg!!!!!!");
        System.out.println("");
        System.out.print("Ingrese el Tipo de Socio: ");
        char letra = leer.next().charAt(0);
        String socio = String.valueOf(letra);
        System.out.print("Ingrese el valor del tratamiento: ");
        double valor = leer.nextDouble();
        switch (socio) {
            case "a":
            case "A":
                
                break;
            default:
                throw new AssertionError();
        
                
        }
       
    }
}
