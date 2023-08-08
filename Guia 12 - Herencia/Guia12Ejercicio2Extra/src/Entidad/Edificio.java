/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Edificio con los siguientes atributos: ancho, alto y largo.
 *
 * @author Ayrton
 */
public class Edificio
{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio()
    {
    }

    public Edificio(double ancho, double alto, double largo)
    {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho()
    {
        return ancho;
    }

    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }

    public double getAlto()
    {
        return alto;
    }

    public void setAlto(double alto)
    {
        this.alto = alto;
    }

    public double getLargo()
    {
        return largo;
    }

    public void setLargo(double largo)
    {
        this.largo = largo;
    }

    public Edificio crearEdificio()
    {
        System.out.println("Ingrese el ancho del edificio");
        ancho = leer.nextDouble();
        System.out.println("Ingrese el alto del edificio: ");
        alto = leer.nextDouble();
        System.out.println("Ingrese el largo del edificio: ");
        largo = leer.nextDouble();

        return new Edificio(ancho, alto, largo);

    }

}
