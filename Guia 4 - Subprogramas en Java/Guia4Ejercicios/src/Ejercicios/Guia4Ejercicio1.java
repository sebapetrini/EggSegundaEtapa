/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia4Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int menu;
        String confirm;
        boolean salir = true;
        do{
            
            System.out.println("  MENU");
            System.out.println("1 Sumar");
            System.out.println("2 Restar");
            System.out.println("3 Multiplicar");
            System.out.println("4 Dividir");
            System.out.println("5 Salir");
            System.out.println("");
            System.out.print("Ingrese una opción: ");
            menu = leer.nextInt();
            switch(menu){
                case 1:
                    System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + Suma(num1,num2));
                    break;
                case 2:
                    System.out.println("El resultado de " + num1 + " - " + num2 + " es: " + Resta(num1,num2));
                    break;
                case 3:
                    System.out.println("El resultado de " + num1 + " x " + num2 + " es: " + Multiplicacion(num1,num2));
                    break;
                case 4:
                    double res = Division(num1,num2);
                    System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + res);
                    break;
                case 5:
                    String menu2;
                    do {
                        System.out.print("¿Está seguro que desea salir del programa S/N?");
                        menu2= leer.next();
                    }while (!(menu2.equalsIgnoreCase("S") || menu2.equalsIgnoreCase("N")));
                    if (menu2.equalsIgnoreCase("S")){
                        System.out.println("Hasta pronto!!!!");
                        salir = false;
                    }                         
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese nuevamente una: ");
            }
            
        }while(salir);
       
    
    }        
    
    public static int Suma(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }
    public static int Resta(int n1, int n2) {
        int resultado = n1 - n2;
        return resultado;
    }
    public static int Multiplicacion(int n1, int n2) {
        int resultado = n1 * n2;
        return resultado;
    }
    public static double Division(double n1, double n2) {
        double resultado = n1 / n2;
        return resultado;
    }
    
}
