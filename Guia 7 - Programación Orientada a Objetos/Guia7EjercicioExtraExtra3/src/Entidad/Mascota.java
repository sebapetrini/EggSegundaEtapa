/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author soporte
 */
public class Mascota {
     private String nombre;
    private int edad;
    private String raza;
    private String tipo;

    public Mascota(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void informacion_mascota(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(raza);
        System.out.println(tipo);       
    }

    public void cumplirAnios(){
        edad++;
    }    
    
}
