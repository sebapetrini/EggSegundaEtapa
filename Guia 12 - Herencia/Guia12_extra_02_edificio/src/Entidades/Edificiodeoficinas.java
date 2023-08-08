/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class Edificiodeoficinas extends Edificio{
    private int oficinas;
    private int personas;
    private int pisos;

    public Edificiodeoficinas(int oficinas, int personas, int pisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public Edificiodeoficinas() {
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    
    
    
    @Override
    public double calcularSuperficie() {
        return ancho*largo*pisos;                      
    }

    @Override
    public double calcularVolumen() {
    return ancho*largo*alto;
    }
    
    
}
