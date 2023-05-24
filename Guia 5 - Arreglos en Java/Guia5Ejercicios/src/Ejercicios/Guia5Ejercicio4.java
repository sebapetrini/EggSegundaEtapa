/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
public class Guia5Ejercicio4 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
  
       
        
        int[][] matrizTranspuesta = new int[4][4];
        Random numAleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numAleatorio.nextInt(100);                
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];                
            }            
        }
        System.out.println("Matriz Original         Matriz Transpuesta");
        String aux = "";
        String aux2 = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                aux2 += matrizTranspuesta[i][j] + "  "; 
                aux +=  matriz[i][j] + "  ";             
            }
            System.out.println(aux + "         " + aux2);
            aux = "";
            aux2 = "";
        }
    }  
    
}
