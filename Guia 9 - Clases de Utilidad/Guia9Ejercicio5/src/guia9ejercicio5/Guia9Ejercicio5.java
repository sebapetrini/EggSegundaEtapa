
package guia9ejercicio5;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento ՄTipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 * 
 * @author Sebastián A. Petrini
 */

public class Guia9Ejercicio5 {
   
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p = ps.crearPersona();
        System.out.println("La edad de la Persona es: " + ps.calcularEdad(p));
        System.out.println("¿la persona es menor a 40 años? " + ps.menorQue(p, 40));
        ps.mostrarPersona(p);
    }

}
