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
public class Electrodomestico
{

    private double precio;
    private String color;
    private String consumoEnergetico;
    private double peso;

    public Electrodomestico()
    {
    }

    public Electrodomestico(double precio, String color, String consumoEnergetico, double peso)
    {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getConsumoEnergetico()
    {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico)
    {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    

}
