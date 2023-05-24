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
public class Operacion {
     private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
 
    public void CrearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1=leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese el segundo numero: ");
        numero2=leer.nextDouble();        
    }
    
    public double Suma(){
        return numero1+numero2;
    }
    
    public double Resta(){
        return numero1-numero2;
    }
    
    public double Multiplicar(){
        double resultado;
        if (numero1==0 || numero2==0){
            System.out.println("uno de los numeros tiene valor cero ");
            resultado=0;
        }else {
            resultado=numero1*numero2;
        }
        return resultado;        
    }
    
    public double Dividir(){
        double resultado;
        if (numero2==0){
            System.out.println("ERROR, no se puede realizar la ");
            resultado=0;
        }else{
            resultado=numero1/numero2;
        }
        return resultado;  
    }
}
