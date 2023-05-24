/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;


/**
 Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido

 */
public class Guia5Ejercicio2 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = Leer.nextInt();
        int[] vector = new int[n];
        Random numAleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numAleatorio.nextInt(100+1);    
            //vector[i] = (int)(Math.random()*100);            
        }
        System.out.print("Que número desea encontrar en el vector?(0-100): ");
        int num = Leer.nextInt();
        int recurrencia = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num && recurrencia == 0){ 
                System.out.println("El número se encontró en la posición [" + i + "]");
                recurrencia = 1;
            }else if (vector[i] == num)
                System.out.println("El número se repite en [" + i + "]");
            
        }
        
    }    
    
}
