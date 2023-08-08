package guia_13_ej_05_adivinarnumero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
public class Guia_13_ej_05_adivinarNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont = 0;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(499) + 1;
        int num = 0;
        System.out.println(numeroAleatorio);
        do {
            try {
                cont++;
                System.out.println("Ingrese un numero");
                num = leer.nextInt();
                if (num < numeroAleatorio) {
                    System.out.println("El numero a adivinar es mas alto");
                } else if (num > numeroAleatorio) {
                    System.out.println("El numero a adivinar es mas bajo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresaste una letra, Cabezon");
                leer.next();
            }
        } while (num != numeroAleatorio);
        System.out.println("Te llevo: "+cont+" intentos");
    }
    
}
