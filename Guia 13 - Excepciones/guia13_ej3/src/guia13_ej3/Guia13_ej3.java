/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13_ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones


 */
public class Guia13_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        try {
//        String num1 = leer.next();
//        String num2 = leer.next();
//        int num3 = leer.nextInt();
//        
//        int numaInt = Integer.parseInt(num1);
//        int numaInt2 = Integer.parseInt(num2);
//        
//       double division = numaInt/numaInt2;
//        System.out.println(division);
//        } catch (NumberFormatException e) {
//            System.out.println("El dato ingresado no es un numero: " + e.toString());
//        }
//        catch (ArithmeticException e) {
//            System.out.println("No se puede dividir por cero " + e.toString());
//        }
//        catch (InputMismatchException e) {
//            System.out.println("No corresponde a un caracter " + e.toString());
//        }

        /*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/
        int num = (int) (Math.random() * 500 + 1);
        int num2 = 0;
        int cont = 0;
        System.out.println(num);

        do {
            try {
                System.out.println("Ingresa un numero");
                cont++;
                num2 = leer.nextInt();

                
                
                if (num2 < num) {
                    System.out.println("Error,el numero es mas alto");

                } else if (num2 > num) {
                    System.out.println("Error, el numero es más bajo");

                }
            }
             catch (InputMismatchException e) {
                 leer.nextLine();
                 System.out.println("El dato ingresado no es valido: " + e.toString());
                
            
             } 

        } while (num2 != num);
        
        System.out.println("Adivinaste en: " + cont + "intentos");
    }

}
