/*


La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
2
 */
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author D-Saya
 */
public class EstudianteServicio {

    public Estudiante crearAlumno() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la nota del alumno");
        double nota = leer.nextDouble();

        return new Estudiante(nombre, nota);

    }

    public double calcularPromedio(Estudiante[] vector) {
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i].getNota();
        }

        return suma / vector.length;

    }

    /*2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso*/
    public String[] nombres(Estudiante[] vector) {
        int contador = 0;
        double promedio = calcularPromedio(vector);
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getNota() > promedio) {
                contador++;

            }

        }

        String[] estudiantes = new String[contador];
        contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota() > promedio) {
                estudiantes[contador] = vector[i].getNombre();
                contador++;

            }

        }

        return estudiantes;

    }

    /*3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.*/
    
    
    public void mostrar(String[] Estudiante){
        for (int i = 0; i < Estudiante.length; i++) {
            System.out.println("El estudiante " +  Estudiante[i] + " supera el promedio");
        }
        
    }
    
}
