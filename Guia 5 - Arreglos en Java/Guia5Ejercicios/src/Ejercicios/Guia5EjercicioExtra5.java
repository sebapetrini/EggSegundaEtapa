/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
public class Guia5EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el largo de la matriz: ");
        int n = Leer.nextInt();
        System.out.print("Ingrese el ancho de la matriz: ");
        int m = Leer.nextInt();
        int[][] matriz = new int[n][m];
        rellenarMatriz(matriz);
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];  
                System.out.print(matriz[i][j] + "  ");
            }            
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
    public static void rellenarMatriz(int[][] mat) {
        Random numAleatorio = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = numAleatorio.nextInt(100+1);                
            }                
        }        
    }
}
