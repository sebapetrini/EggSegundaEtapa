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
public class Lavadora extends Electrodomestico
{

    private double carga;

    public Lavadora()
    {
    }

    public Lavadora(double carga, double precio, String color, String consumoEnergetico, double peso)
    {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga()
    {
        return carga;
    }

    public void setCarga(double carga)
    {
        this.carga = carga;
    }
    
    

}
