/*
 * 1. Calcular y mostrar el promedio de notas de todo el curso.
 *
 * 2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
 * nota mayor al promedio del curso.
 *
 * 3. Por último, deberemos mostrar todos los estudiantes con una nota mayor al
 * promedio.
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 
 */

public class EstudianteServicio {

    public Estudiante crearAlumno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la nota: ");
        double nota = sc.nextDouble();
        return new Estudiante(nombre, nota);
    }

    public double calcularMostrarPromedio(Estudiante[] vector) {
        double suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i].getNota();
        }
        return suma / vector.length;
    }

    public void mostrarEstudiante(Estudiante[] vector) {
        double promedio = calcularMostrarPromedio(vector);
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota() > promedio) {
                contador++;
            }
        }
        String[] estudiante = new String[contador];
        contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota() > promedio) {
                estudiante[contador] = vector[i].getNombre();
                contador++;
            }
        }        
        System.out.println("L@s mayor/es al promedio/s son" + Arrays.toString(estudiante));
        System.out.println("Los promedios de notas son: "+calcularMostrarPromedio(vector));
    }
}
