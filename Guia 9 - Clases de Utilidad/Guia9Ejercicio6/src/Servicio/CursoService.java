

package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class CursoService {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(Curso c){
        String[] a = new String[c.getAlumnos().length];
        for (int i = 0; i < c.getAlumnos().length; i++) {
            System.out.print("Ingrese el nombre del Alumno "+(i+1) + ": ");
            a[i] = Leer.next();
        }
        c.setAlumnos(a);
    }
    
    public void crearCurso(Curso c){
        System.out.print("Ingrese el nombre del curso: ");
        c.setNombreCurso(Leer.next());
        System.out.print("Ingrese la catidad de horas diarias: ");
        c.setCantidadHorasPorDia(Leer.nextInt());
        System.out.print("Ingrese la cantidad de dias a la senama: ");
        c.setCantidadDiasPorSemana(Leer.nextInt());
        System.out.print("Ingrese el turno del curso M/T: ");
        char turno;
        do {
            turno = Leer.next().toUpperCase().charAt(0);
        } while (turno != 'M' && turno !='T');
        c.setTurno(turno);
        System.out.print("Ingrese el precio de la hora del Curso: ");
        c.setPrecioPorHora(Leer.nextDouble());
        cargarAlumnos(c);        
    }
    
    public void calcularGananciaSemanal(Curso c){
        double ganancia = c.getCantidadDiasPorSemana()*c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getAlumnos().length;
        System.out.println("La Ganancia semanal del curso es: " + ganancia);
        
    }
}
