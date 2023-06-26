/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author CDRCONS02
 */
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
    @Override
    public void alimentarse() {
        System.out.println("El gato de nombre " + super.nombre + " edad " + super.edad + " raza " + super.raza);
        super.alimentarse(); 
    }
    
    
}
