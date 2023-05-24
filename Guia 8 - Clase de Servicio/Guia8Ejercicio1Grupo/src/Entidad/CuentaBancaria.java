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
public class CuentaBancaria {
    private int numcuenta;
    private long dni;
    private double saldo;
    
    public CuentaBancaria() {
    }
    
    public CuentaBancaria(final int numcuenta, final long dni, final double saldo) {
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldo = saldo;
    }
    
    public int getNumcuenta() {
        return this.numcuenta;
    }
    
    public long getDni() {
        return this.dni;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setNumcuenta(final int numcuenta) {
        this.numcuenta = numcuenta;
    }
    
    public void setDni(final long dni) {
        this.dni = dni;
    }
    
    public void setSaldo(final double saldo) {
        this.saldo = saldo;
    }
}

