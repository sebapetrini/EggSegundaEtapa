/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
public class Guia5EjercicioExtra1 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el largo del vector: ");
        int n = Leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el valor [" + i + "] del vector: ");
            vector[i] = Leer.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];            
        }
        System.out.println("La suma de los datos del vector es: " + suma);
    }
}
