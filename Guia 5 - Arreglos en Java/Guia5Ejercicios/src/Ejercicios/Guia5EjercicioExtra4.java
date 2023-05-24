/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
     Primer trabajo práctico evaluativo 10%
     Segundo trabajo práctico evaluativo 15%
     Primer Integrador 25%
     Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
public class Guia5EjercicioExtra4 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int[][] notas = new int[10][4];
        String[] alumnos = new String[10];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del " + (i+1) + "* alumno: ");
            alumnos[i] = Leer.next();
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Ingrese la nota del primer TP: ");
                        break;
                    case 1:
                        System.out.print("Ingrese la nota del segundo TP: ");
                        break;
                    case 2:
                        System.out.print("Ingrese la nota del primer Integrador: ");
                        break;
                    case 3:
                        System.out.print("Ingrese la nota del Segundo Integrador: ");
                        break;                  
                }
                do{
                    notas[i][j] = Leer.nextInt();
                }while (notas[i][j] < 0 || notas[i][j] > 10);                
            }           
        }
        double[] promedios = new double[10];
        for (int i = 0; i < promedios.length; i++) {
            promedios[i] = (notas[i][0] * 0.10) + (notas[i][1] * 0.15) + (notas[i][2] * 0.25) + (notas[i][3] * 0.50);   
        }
        int aprob = 0;
        int desap =0;
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 7)
                aprob++;
            else
                desap++;            
        }
        System.out.println("La cantidad de desaprobados es: " + desap);
        System.out.println("La cantidad de aprobados es: " + aprob);
        
        for (int i = 0; i < promedios.length; i++) {
            System.out.println(alumnos[i] + ": " + promedios[i]);            
        }
    }
}
