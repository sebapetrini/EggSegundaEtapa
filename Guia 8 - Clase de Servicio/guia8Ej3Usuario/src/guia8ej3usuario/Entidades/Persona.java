/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3usuario.Entidades;

/**
 *
 * @author CDRCONS02
 */
public class Persona {

    private int edad;
    private String nombre;
    private String genero;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(int edad, String nombre, String genero, double peso, double altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
                                  
                          
            
}
