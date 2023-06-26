
package guia11ejercicio1;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.PerroService;
import Servicios.PersonaService;

/**
 *
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 * @author Sebastián A. Petrini
 */

public class Guia11Ejercicio1 {
   
    public static void main(String[] args) {
        PersonaService pS = new PersonaService();
        PerroService mS = new PerroService();
        Persona p1 = pS.crearPersona();
        Persona p2 = pS.crearPersona();
        
        Persona p3 = pS.crearPersonaSola();
        Persona p4 = pS.crearPersonaSola();
        
        Perro m1 = mS.crearPerro();
        Perro m2 = mS.crearPerro();
        
        pS.asignaPerro(p3, m1);
        pS.asignaPerro(p4, m2);
    }

}
