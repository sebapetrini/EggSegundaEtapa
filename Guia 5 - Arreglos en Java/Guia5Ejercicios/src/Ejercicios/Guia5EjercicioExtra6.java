/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.

* Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
public class Guia5EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        char[][] sopa = new char[20][20];
        System.out.println("ingrese 5 palabras de 3 a 5 caracteres para completar la sopa de letras: "); 
        String[] pal = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra " + (i+1) + ":");
            do{               
                pal[i] = Leer.next();
            }while ((pal[i].length() < 3) || (pal[i].length() > 5));            
        }
     
        
        
    }
}

/*

//UBICO LAS PALABRAS
        for (int i = 0; i < 5; i++) {
            f = (int) (Math.random() * 20);
            c = (int) (Math.random() * 15);
            for (int j = 0; j < palabras[cont].length(); j++) {
                matriz[f][c] = palabras[cont].substring(j, j + 1);
            c++;
            
            }
            cont++;
        }




public static void ingresarPalabraEnMatriz(String[] palabra, String[][] matriz) {
        int f, c, ind = 0;
        do {
            f = (int) (Math.random() * 20);
            c = (int) (Math.random() * 16);
            for (int j = 0; j < palabra[ind].length(); j++) {
                matriz[f][c] = palabra[ind].substring(j, j + 1);
                c++;
            }
            ind++;
        } while (ind < palabra.length);



*/


