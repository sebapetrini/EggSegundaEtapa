/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
public class Guia5Ejercicio3 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = Leer.nextInt();
        int[] vector = new int[n];
        Random numAleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numAleatorio.nextInt(100000);                          
        }
        int[] dig = new int[5];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>0 && vector[i]<10)
                dig[0]++;
            else if (vector[i]>9 && vector[i]<100)
                dig[1]++;
            else if (vector[i]>99 && vector[i]<1000)
                dig[2]++;
            else if (vector[i]>999 && vector[i]<10000)
                dig[3]++;
            else if (vector[i]>9999 && vector[i]<100000)
                dig[4]++;
        }
        for (int i = 0; i < dig.length; i++) {
            System.out.println("La cantidad de numeros de " + (i+1) + "digitos es: " + dig[i] );        
        }
    }  
    
}
