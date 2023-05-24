/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class PersonaServicio {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("======================================================================");
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = Leer.next();
        System.out.print("Ingrese la edad de la persona: ");
        int edad = Leer.nextInt();
        System.out.println("Ingrese el Sexo de la Persona: ");
        char sexo;
        do {           
            System.out.print("H-Hombre - M-Mujer - O-Otro: ");
            sexo = Leer.next().toUpperCase().charAt(0);      
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        System.out.print("Ingrese el peso de la persona: ");        
        double peso = Leer.nextDouble();
        System.out.print("Ingrese la altura de la persona: ");
        double altura = Leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);        
    }
    public boolean esMayorDeEdad(Persona p){
        return (p.getEdad()>=18);
    }
    
    public int calcularIMC(Persona p){
        double imc = p.getPeso()/Math.pow(p.getAltura(), 2);
        if (imc < 20)
            return -1;
        else if (imc >= 20 && imc >=25)
            return 0;
        else
            return 1;
    }
}
