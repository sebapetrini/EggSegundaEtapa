/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextraextra3;

import Entidad.Mascota;
import java.util.Scanner;

/**
 *
 3) Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y un método para mostrar por pantalla la información de la mascota.
Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.

 * 
 * @author soporte
 */
public class Guia7EjercicioExtraExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese la raza: ");
        String raza = leer.next();        
        System.out.println("Ingrese el tipo: ");
        String tipo = leer.next();
                
        Mascota m = new Mascota(nombre,edad,raza,tipo);     
        m.informacion_mascota();        
        m.cumplirAnios();        
        m.informacion_mascota();
       
        
    }
    
}
