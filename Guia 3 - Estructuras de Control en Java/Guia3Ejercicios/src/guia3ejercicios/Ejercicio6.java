/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
ՄS/NՅ? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú

Menú
1 Sumar
2 Restar
3 Multiplicar
4 Dividir
5 Salir


*/
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio6 {
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
                    System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("El resultado de " + num1 + " - " + num2 + " es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("El resultado de " + num1 + " x " + num2 + " es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + (num1/num2));
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
    
}
