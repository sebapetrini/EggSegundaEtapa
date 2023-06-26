/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

/**
 *
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 */
public class Guia11Ejercicio01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro perro1 = new Perro("chiquito", "Beagle", 6, "gigante", Boolean.FALSE);
        Perro perro2 = new Perro("grandote", "chihuaha", 3, "chiquito", Boolean.FALSE);
        Persona p1 = new Persona("Anibal", "Pepito", 35, 54321789);
        Persona p2 = new Persona("William", "Ramirez", 60, 9654987);

        System.out.println("Ingrese el nombre del perro que quiera adoptar: ");
        String nombreP = leer.next();
        if (perro1.getNombre().equals(nombreP) && !perro1.isAdoptado())
        {
            System.out.println("Quien desea adoptar este perro? ");
            String nombre = leer.next();
            if (nombre.equals(p1.getNombre()))
            {
                perro1.setAdoptado(true);
                System.out.println("Usted ha adoptado ha " + perro1.getNombre());
                p1.setPerro(perro1);

            } else if (nombre.equals(p2.getNombre()))
            {
                perro1.setAdoptado(true);
                System.out.println("Usted ha adoptado ha " + perro1.getNombre());
                p2.setPerro(perro1);

            }

        } else if (perro2.getNombre().equals(nombreP) && !perro2.isAdoptado())
        {
            System.out.println("Quien desea adoptar este perro? ");
            String nombre = leer.next();
            if (nombre.equals(p1.getNombre()))
            {
                perro2.setAdoptado(true);
                System.out.println("Usted ha adoptado ha " + perro2.getNombre());
                p1.setPerro(perro2);

            }
            if (nombre.equals(p2.getNombre()))
            {
                perro2.setAdoptado(true);
                System.out.println("Usted ha adoptado ha " + perro2.getNombre());
                p2.setPerro(perro2);

            }
        }

        System.out.println(p1.toString() + p2.toString());

    }

}
