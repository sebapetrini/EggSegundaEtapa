/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Potencia en CV y número de camarotes para yates de lujo.
 *
 * @author Ayrton
 */
public class Yate extends BarcoMotor
{

    private int camarotes;

    public Yate(int camarotes, double potencia, String matricula, double eslora, int fabricado)
    {
        super(potencia, matricula, eslora, fabricado);
        this.camarotes = camarotes;
    }

    public Yate()
    {
    }

    public int getCamarotes()
    {
        return camarotes;
    }

    public void setCamarotes(int camarotes)
    {
        this.camarotes = camarotes;
    }

    @Override
    public String toString()
    {
        return "Yate{" + "camarotes=" + camarotes + '}';
    }

    @Override
    public int calcularDias(Alquiler alquiler)
    {
        return super.calcularDias(alquiler); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularAlquiler(Alquiler alquiler)
    {

        Yate y = (Yate) alquiler.getBarco();
        System.out.println("Cantidad de camarotes: " + y.getCamarotes());

        return super.calcularAlquiler(alquiler) + (y.getCamarotes() * 20); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Barco crearBarco()
    {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Ingrese la cantidad de camarotes: ");
        this.setCamarotes(leer.nextInt());

        return new Yate(camarotes, potencia, matricula, eslora, fabricado); //To change body of generated methods, choose Tools | Templates.
    }

}
