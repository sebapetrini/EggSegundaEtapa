/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pablo Barberis
 */
public abstract class Edificio {
    protected double ancho;
    protected double largo;
    protected double alto;

    public Edificio() {
    }

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }
    
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();
}
