/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextraextra1;

import Entidad.Coche;

/**
 *
 1) Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.

 * 
 * @author soporte
 */
public class Guia7EjercicioExtraExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche a = new Coche();
        Coche b = new Coche();
        Coche c = new Coche();
        
        a.carga_coche();
        b.carga_coche();
        c.carga_coche();
        
        System.out.println("Coche A: ");
        a.imprimir_coche();
        System.out.println("Coche B: ");
        b.imprimir_coche();
        System.out.println("Coche C: ");
        c.imprimir_coche();
        
        
        
    }
    
}
