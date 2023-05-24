/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9
* 
Por ejemplo:
2 7 6
9 5 1
4 3 8
 */
public class Guia5Ejercicio6 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "] (del 1 al 9):");
                do{
                    matriz[i][j] = Leer.nextInt();
                }while (matriz[i][j]<0 || matriz[i][j]>10);
            }
        }
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][0];            
        }
        int fila = 0;
        int columna = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        boolean magica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                fila += matriz[i][j];
                columna += matriz[j][i];
                if (j == i)
                    diagonal1 += matriz[i][j];
                else if (j+i == 2)
                    diagonal2 += matriz[i][j];
            }
            if (fila != suma)
                magica = false;
            else if (columna != suma)
                 magica = false;
            fila = 0;
            columna = 0;
        }
        if (magica)
            System.out.println("La matriz ingresada es magica!!!!!");
        else
            System.out.println("La matriz ingresada NO es magica!!!!!");    
    }  
    
}
