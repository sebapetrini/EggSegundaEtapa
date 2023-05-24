/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class Estudiante {
    
    private String nombre;
private int edad;
private double nota_media;

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

public double calculo_nota_media(){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese nombre: ");
    nombre = leer.nextLine();
    System.out.println("Ingrese su edad: ");
    edad = leer.nextInt();
    System.out.println("Ingrese nota 1: ");
    double nota1 = leer.nextDouble();
    System.out.println("Ingrese nota 2: ");
    double nota2 = leer.nextDouble();
    nota_media = ((nota1+nota2)/2);    
    return nota_media;
}

    public void mostrar_estudiantes_aprobados(){
        
        if(nota_media>6){
            System.out.println(nombre + ": " + nota_media );            
        }
        
    }
  
    
            
        
    
}
