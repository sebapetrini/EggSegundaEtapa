/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ayrton
 */
public class Televisor extends Electrodomestico
{

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor()
    {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, String color, String consumoEnergetico, double peso)
    {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion()
    {
        return resolucion;
    }

    public void setResolucion(double resolucion)
    {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT()
    {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT)
    {
        this.sintonizadorTDT = sintonizadorTDT;
    }

}
