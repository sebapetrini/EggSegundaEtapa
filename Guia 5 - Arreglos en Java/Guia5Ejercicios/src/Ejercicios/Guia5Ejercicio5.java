/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = ՞AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa). 
 */
public class Guia5Ejercicio5 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        

        
 /*       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]:");
                matriz[i][j] = Leer.nextInt();
            }
        }*/
        boolean anti = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != (matriz[j][i] * (-1))) 
                    anti = false;                
            }            
        }
        if (anti)  
            System.out.println("La matriz dada es antisimétrica!!!!!");
        else
            System.out.println("La matriz dada es NO antisimétrica!!!!!");
    }  
    
}
