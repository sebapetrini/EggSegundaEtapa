

package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class AlumnoService {
    Scanner Leer; 

    public AlumnoService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Alumno crearAlumno(){
        System.out.print("Ingrese el nombre del alumno: ");
        String nom = Leer.next();
        ArrayList<Double> nota = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            nota.add(Leer.nextDouble());
        }        
        return new Alumno(nom, nota);
    }
    
    public double notaFinal(Alumno a){
        double suma = 0;
        for (int i = 0; i < a.getNota().size(); i++) {
            suma += a.getNota().get(i);
        }
        return suma/3;
    }
    
    public void buscarAlumno(ArrayList<Alumno> a){
        System.out.print("Ingrese el alumno a calcular el promedio: ");
        String nom = Leer.next();
        boolean existe = false;
        for (Alumno a1 : a) {
            if (a1.getNombre().equals(nom)){
                System.out.println("La nota final del Alumno " + nom + ": " + notaFinal(a1));
                existe = true;
            }
        }
        if (!existe)
            System.out.println("El alumno ingresado no esta en la lista!!!"); 
    }
}
