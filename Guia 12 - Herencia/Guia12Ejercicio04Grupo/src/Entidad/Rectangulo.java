/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Servicios.calculosFormas;

/**
 *
 * @author Ayrton
 */
public class Rectangulo implements calculosFormas
{

    private double base;
    private double altura;

    public Rectangulo()
    {
    }

    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public double calcularArea()
    {

        return base * altura;
    }

    @Override
    public double calcularPerimetro()
    {
        return (base + altura) * 2;
    }

}
