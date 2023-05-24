

package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PersonaService {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.print("Ingrese el nombre de la Persona: ");
        String p = Leer.next();
        System.out.print("Ingrese el día de nacimiento: ");
        int dia;
        do {
            dia = Leer.nextInt();
        } while (dia<1 || dia>31);
        
        System.out.print("Ingrese el mes de nacimiento: ");
        int mes;
        do {
            mes = Leer.nextInt();
        } while (mes<1 || mes>12);
        System.out.print("Ingrese el anio de nacimiento: ");
        int anio;
        do {
            anio = Leer.nextInt();
        } while (anio<1900 || anio>2023);
        Date f = new Date(anio - 1900, mes - 1, dia);
        return new Persona(p, f);
    }
    
    public int calcularEdad(Persona p){
        Date factual = new Date();
        long dif = factual.getTime() - p.getFnacimiento().getTime();
        return (int) (dif / ((1000L*60*60*24)*365)); 
    }
    
    public boolean menorQue(Persona p, int edad){
        return (calcularEdad(p)<edad);
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre:              " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFnacimiento().toLocaleString());
    }
    
    
}
