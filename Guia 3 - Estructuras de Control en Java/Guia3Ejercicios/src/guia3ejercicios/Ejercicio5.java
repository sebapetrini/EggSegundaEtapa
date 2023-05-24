/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
*/

package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número límite: ");
        int limite = leer.nextInt();
        int suma = 0;
        int numero;
        do{
            System.out.print("Ingrese un número a sumar: ");
            numero = leer.nextInt();
            suma = suma + numero;
        }while(suma <= limite );
        System.out.println("La suma resultó " + suma + " y el límite era " + limite);
    
    }        
}
