/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().

*/
package guia2ejercicios;
import java.util.Scanner;
/**
 *
 * @author Soporte
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese un número para trabajar: ");
        int num = Leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("Los resultados son: Doble " + doble + " - El triple " + triple + " - La raiz cuadrada " + raiz);
    }
    
}
