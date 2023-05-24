/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
public class Guia5EjercicioExtra3 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el largo del vector: ");
        int n = Leer.nextInt();
        int[] vector = new int[n];
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVector(int[] vec) {
        Random numAleatorio = new Random();
        for (int i = 0; i < vec.length; i++) {
            vec[i] = numAleatorio.nextInt(100+1);    
            //vector[i] = (int)(Math.random()*100);            
        }        
    }
    public static void imprimirVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Vector[" + i + "]: " + vec[i]);            
        }
    }
}
