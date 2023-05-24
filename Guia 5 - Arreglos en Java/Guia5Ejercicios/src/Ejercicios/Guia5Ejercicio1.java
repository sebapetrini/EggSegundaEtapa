package Ejercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
1. Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente
 */
public class Guia5Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
            
        }
        
   /*     
        for (int x: vector){
            System.out.println(x);
        }
     */      
    
    }

}
