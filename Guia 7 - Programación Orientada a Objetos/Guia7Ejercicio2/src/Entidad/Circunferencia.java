/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = leer.nextDouble();                
    }
    
    public double area(){
        double calculo = (3.1416*Math.pow(radio,2));   // Math.PI  para devolver el pi 
        return calculo;
    }
        
    public double perimetro(){
        double perimetro = 2*Math.PI*radio;
        return perimetro;       
    }    
    
}
