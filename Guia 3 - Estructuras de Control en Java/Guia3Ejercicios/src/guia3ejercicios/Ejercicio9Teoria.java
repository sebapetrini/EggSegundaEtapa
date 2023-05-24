/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
*/

package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio9Teoria {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int cont = 1;
        int suma = 0;
        do{
            System.out.print("Ingrese el número " + cont + ":");
            numero = leer.nextInt();    
            if (numero == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }else if (numero > 0){
                suma = suma + numero;
            }
            cont++;
        }while (cont <= 20);
        System.out.println("La suma de los número ingresados es: " + suma);

        
     }
    
}

/*

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int contador = 1;
        int numero;

        System.out.println("El siguiente programa le solicitara 20 numeros para luego sumarlos. Si el numero es negativo, no se sumara. Si es igual a 0 el programa saldra antes y hara la suma");

        do {
            System.out.println("ingrese el numero " + contador);

           numero = leer.nextInt();

           if(numero == 0){
            break;
           }

           if(numero < 0){
            contador++;
            continue;
           }else{
            suma = suma + numero;
           }

           contador++;

        } while (contador <= 20);


        if(contador == 1){
            System.out.println("No se ha ingresado ningun numero valido");
        }else{
            System.out.println("La suma de los numeros ingresados es " + suma);
        }
    }
}
*/
