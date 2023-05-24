/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 * 
 * 
 * @author Soporte
 */
public class Cuenta {
    
    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar_datos(){
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre del cliente: ");
        titular = Leer.next();
        System.out.print("Ingrese el Saldo de la cuenta: ");
        saldo = Leer.nextDouble();               
    }
    
    public void retirar_dinero(){
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        double retiro;
        System.out.println("Saldo actualde la cuenta: " + saldo);
        System.out.print("Ingrese la cantidad de dinero que quiere retirar: ");
        retiro = Leer.nextDouble();
        if (retiro <= saldo){
            saldo -= retiro;
            System.out.println("Retiro realizado, su saldo actual es: " + saldo);
        }else
            System.out.println("Su saldo es " + saldo + " No es suficiente para retirar " + retiro);
    }
    
    
    
}
