/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 * 
 * @author Soporte
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      
    public void cargar_empleado(){
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre del empleado: ");
        this.nombre = Leer.next();
        System.out.print("Ingrese la edad del empleado: ");
        this.edad = Leer.nextInt();
        System.out.print("Ingrese el salario del empleado: ");
        this.salario = Leer.nextDouble();     
    }
    
    public void calcular_aumento(){
        
        if (edad>30)
            System.out.println("El aumento de sueldo del empleado sería: " + (salario*0.10));
        else
            System.out.println("El aumento de sueldo del empleado sería: " + (salario*0.05));
    }
    
    
}
