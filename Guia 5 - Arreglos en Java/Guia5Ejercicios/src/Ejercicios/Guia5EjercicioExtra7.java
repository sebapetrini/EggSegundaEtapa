/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando Մ1֡1Յ
Análogamente, la sucesión del número 3 es Մ1֡2Յ,
Y la del 5 es Մ2֡3Յ,
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente
link: https://quantdare.com/numeros-de-fibonacci/
 */
public class Guia5EjercicioExtra7 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci que desea ver: ");
        int n = Leer.nextInt();
        if (n > 1){
            int[] vector = new int[n];
            Fibo(vector);
            System.out.println("La serie de los " + n + " primeros numeros de la sucesión de Fibonacci son:");
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + ", ");      
            }
        }else
                System.out.println("La sucesión requerida es: 0");         
    }
    public static void Fibo(int[] vec) {
        int anterior = 1;
        int posterior = 1;
        int aux = 0;
        for (int i = 0; i < vec.length; i++) {
            vec[i] = anterior;
            aux = anterior + posterior;
            anterior = posterior;
            posterior = aux;
        }       
    }
}
