/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Soporte
 *
 */
/* 
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDEՅ, y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().

*/
 

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int cont1 = 0;
        int cont2 = 0;
        do {
            System.out.println("Ingrese una secuencia de RS232");
            cadena = leer.next();
        //    if (((cadena.startsWith("X")) && (cadena.endsWith("O"))) && (cadena.length()==5))
               if (((cadena.substring(0,1).equals("X")) && (cadena.substring(4,5).equals("O"))) && (cadena.length()==5))
                cont1++;
            else
                cont2++;
            
        } while (!(cadena.equals("&&&&&")));
        System.out.println("Se leyeron " + cont1 + " secuencias correctas");
        System.out.println("Se leyeron " + cont2 + " secuencias incorrectas");
        
    }
}
