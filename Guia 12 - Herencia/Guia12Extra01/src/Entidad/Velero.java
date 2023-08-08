/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Ayrton
 */
public class Velero extends Barco
{

    private int mastil;

    public Velero()
    {
    }

    public Velero(int mastil, String matricula, double eslora, int fabricado)
    {
        super(matricula, eslora, fabricado);
        this.mastil = mastil;
    }

    public int getMastil()
    {
        return mastil;
    }

    public void setMastil(int mastil)
    {
        this.mastil = mastil;
    }

    @Override
    public String toString()
    {
        return "Velero{" + "mastil=" + mastil + '}' + "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fabricado=" + fabricado + '}';
    }

    @Override
    public double calcularAlquiler(Alquiler alquiler)
    {

        Velero v = (Velero) alquiler.getBarco();
        System.out.println("Mastil: " + v.getMastil());

        return super.calcularAlquiler(alquiler) + (v.getMastil() * 100);
    }

    @Override
    public int calcularDias(Alquiler alquiler)
    {
        return super.calcularDias(alquiler);
    }

    @Override
    public Barco crearBarco()
    {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();

        System.out.println("Ingrese la cantidad de mastiles: ");
        this.setMastil(leer.nextInt());

        return new Velero(this.getMastil(), super.matricula, super.eslora, super.fabricado);
    }

}
