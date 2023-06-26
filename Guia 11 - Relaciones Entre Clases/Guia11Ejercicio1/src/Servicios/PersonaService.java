

package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PersonaService {
    Scanner Leer;

    public PersonaService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Persona crearPersona(Perro p){
        System.out.print("Ingrese el nombre de la Persona: ");
        String nombre = Leer.next();
        System.out.println("Ingrese el apellido de la Persona: ");
        String apellido= Leer.next();
        System.out.print("Ingrese la esas de la Persona: ");
        Integer edad = Leer.nextInt();
        System.out.print("Ingrese el documento de la Persona: ");
        Integer documento = Leer.nextInt();
        return new Persona(nombre, apellido, edad, documento, p);
    }

    public Persona crearPersona(){
        PerroService pS = new PerroService();
        System.out.print("Ingrese el nombre de la Persona: ");
        String nombre = Leer.next();
        System.out.println("Ingrese el apellido de la Persona: ");
        String apellido= Leer.next();
        System.out.print("Ingrese la edad de la Persona: ");
        Integer edad = Leer.nextInt();
        System.out.print("Ingrese el documento de la Persona: ");
        Integer documento = Leer.nextInt();
        return new Persona(nombre, apellido, edad, documento, pS.crearPerro());
    }
    
    public Persona crearPersonaSola(){       
        System.out.print("Ingrese el nombre de la Persona: ");
        String nombre = Leer.next();
        System.out.println("Ingrese el apellido de la Persona: ");
        String apellido= Leer.next();
        System.out.print("Ingrese la edad de la Persona: ");
        Integer edad = Leer.nextInt();
        System.out.print("Ingrese el documento de la Persona: ");
        Integer documento = Leer.nextInt();
        return new Persona(nombre, apellido, edad, documento, new Perro());
    }
    
    public void asignaPerro(Persona p, Perro perro){
        p.setPerro(perro);
    }

    public void mostrarPersona(Persona p){
        PerroService pS = new PerroService();
        System.out.println("---------------------------------------");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Documento: " + p.getDocumento());
        System.out.println("----El Perro de " + p.getNombre() + "----");
        pS.mostrarPerro(p.getPerro());
    }
    
    
}
