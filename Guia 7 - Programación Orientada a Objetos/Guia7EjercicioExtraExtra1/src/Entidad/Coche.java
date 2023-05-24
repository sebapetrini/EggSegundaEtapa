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
public class Coche {
     public String marca;
    public String modelo;
    public double precio;


    public Coche() {
    }
    
    public void carga_coche(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la marca: ");
        marca = leer.nextLine();
        System.out.println("Ingrese el modelo: ");
        modelo = leer.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = leer.nextDouble();
      
    }
    
    public void imprimir_coche(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(precio);
        
    }
    
    
}
