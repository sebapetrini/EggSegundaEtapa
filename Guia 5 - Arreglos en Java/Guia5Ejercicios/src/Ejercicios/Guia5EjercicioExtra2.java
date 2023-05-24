/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos)
 */
public class Guia5EjercicioExtra2 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el largo del vector: ");
        int n = Leer.nextInt();
        int[] vector = new int[n];
        int[] vector2 = new int[n];
        rellenarVector(vector);
        rellenarVector(vector2);
        boolean igual = true;
        for (int i = 0; i < vector2.length; i++) {
            if (vector[i] != vector2[i]){
                igual = false;
                System.out.println("Los vectores no son igules, en el indice [" + i + "] tiene valores diferentes!!");
                break;
            }             
        }
        if (igual) 
            System.out.println("Los vectores son iguales!!!!!");
    }
    public static void rellenarVector(int[] vec) {
        Random numAleatorio = new Random();
        for (int i = 0; i < vec.length; i++) {
            vec[i] = numAleatorio.nextInt(100+1);    
            //vector[i] = (int)(Math.random()*100);            
        }        
    }
    
}
