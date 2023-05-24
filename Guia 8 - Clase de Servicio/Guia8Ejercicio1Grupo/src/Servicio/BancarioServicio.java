/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author soporte
 */

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class BancarioServicio
{
    private Scanner sc;
    
    public BancarioServicio() {
        this.sc = new Scanner(System.in);
    }
    
    public CuentaBancaria craearCuenta() {
        System.out.println("Cree su cuenta bancaria");
        System.out.println("==============================");
        System.out.println("Ingrese el numero de la cuenta");
        int numcuenta = this.sc.nextInt();
        System.out.println("==============================");
        System.out.println("Ingrese el DNI ");
        long dni = this.sc.nextLong();
        System.out.println("==============================");
        System.out.println("Ingrese saldo inicial");
        double saldo = sc.nextDouble();
        return new CuentaBancaria(numcuenta, dni, saldo);
    }
    
    public void ingresar( CuentaBancaria cuenta, double cantidad) {
        double saldo = cuenta.getSaldo();
        saldo += cantidad;
        cuenta.setSaldo(saldo);
    }
    
    public void retirar(final CuentaBancaria cuenta, final double cantidad) {
        double saldo = cuenta.getSaldo();
        if (cantidad <= saldo) {
            saldo -= cantidad;
            cuenta.setSaldo(saldo);
        }
        else {
            System.out.println("No se puede retirar esa cantidad. El saldo actual es de: " + saldo);
            cuenta.setSaldo(0.0);
        }
    }
    
    public void extraccionRapido( CuentaBancaria cuenta) {
        double saldo = cuenta.getSaldo();
        if (saldo == 0.0) {
            System.out.println("No se puede realizar extraccion rapida. El saldo de la cuenta es $0000. ");
        }
        else {
            double limite = saldo * 0.2;
            saldo -= limite;
            cuenta.setSaldo(saldo);
        }
    }
    
    public void consultarSaldo(final CuentaBancaria cuenta) {
        System.out.println("Su saldo actual es: " + cuenta.getSaldo());
        cuenta.getSaldo();
    }
    
    public void consultarDatos(final CuentaBancaria cuenta) {
        System.out.println("Numero de la cuenta: " + cuenta.getNumcuenta());
        System.out.println("DNI del cliente: " + cuenta.getDni());
        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());
    }
}