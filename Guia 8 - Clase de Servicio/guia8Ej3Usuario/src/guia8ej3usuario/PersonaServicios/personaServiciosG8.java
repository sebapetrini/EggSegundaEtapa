/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3usuario.PersonaServicios;

import guia8ej3usuario.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author CDRCONS02
 */
public class personaServiciosG8 {

    Persona p = new Persona();
    Scanner leer = new Scanner(System.in);
    boolean mayores[];
    Persona grupo[];
    int imc[];

    public personaServiciosG8() {
    }

    /*creo los arreglos / el arreglo del tipo persona guarda objetos no importa el tipo
     */
    public Persona[] crearPersona() {

        grupo = new Persona[4];

        for (int i = 0; i < grupo.length; i++) {
            grupo[i] = new Persona(); //Creamos un objeto por cada ingreso

            System.out.println(" Ingrese su nombre ");
            grupo[i].setNombre(leer.nextLine());

            System.out.println(" Ingrese su edad ");
            grupo[i].setEdad(leer.nextInt());

            System.out.println(" Ingrese su peso ");
            grupo[i].setPeso(leer.nextDouble());

            System.out.println(" Ingrese su altura ");
            grupo[i].setAltura(leer.nextDouble());

            boolean g = true;

            do {
                System.out.println(" Ingrese su genero: F, M, O (otro) ");
                String genero;
                genero = leer.next();
                if (genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("O")) {
                    grupo[i].setGenero(genero);
                } else;
                System.out.println(" El genero ingresado es erroneo");
                //g = false;

            } while (g = false);

        }
        return grupo;
    }

    public boolean[] esMayorDeEdad() {
        mayores = new boolean[4];
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i].getEdad() > 18) {
                mayores[i] = true;
            } else {
                mayores[i] = false;
            }
        }
        return mayores;
    }

    public int[] calcularIMC() {
        imc = new int[4];
        for (int i = 0; i < grupo.length; i++) {
            if ((grupo[i].getPeso() / Math.pow(grupo[i].getAltura(), 2) > 25)) {
                imc[i] = 1;
            } else if ((grupo[i].getPeso() / Math.pow(grupo[i].getAltura(), 2)) <= 20) {
                imc[i] = -1;

            } else {
                imc[i] = 0;
            }

        }
        return imc;

    }
}
