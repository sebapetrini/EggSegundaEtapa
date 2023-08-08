/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * su matrícula, su eslora en metros y año de fabricación.
 *
 * @author Ayrton
 */
public class Barco
{

    protected String matricula;
    protected double eslora;
    protected int fabricado;

    public Barco()
    {
    }

    public Barco(String matricula, double eslora, int fabricado)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricado = fabricado;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public double getEslora()
    {
        return eslora;
    }

    public void setEslora(double eslora)
    {
        this.eslora = eslora;
    }

    public int getFabricado()
    {
        return fabricado;
    }

    public void setFabricado(int fabricado)
    {
        this.fabricado = fabricado;
    }

    @Override
    public String toString()
    {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fabricado=" + fabricado + '}';
    }

    public Barco crearBarco()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la matricula: ");
        matricula = leer.next();
        System.out.println("Ingrese la eslora: ");
        eslora = leer.nextDouble();
        System.out.println("Ingrese el anio de fabricacion: ");
        fabricado = leer.nextInt();

        return new Barco(matricula, eslora, fabricado);

    }

    public double valorModulo()
    {

        return eslora * 10;

    }

    public int calcularDias(Alquiler alquiler)
    {
        return (int) ((alquiler.getFechaDevolucion().getTime() - alquiler.getFechaAlquiler().getTime())
                / 86400000);

        //1000ms*60s*60m*24h = 86.400.000 segun Cori
    }

    public double calcularAlquiler(Alquiler alquiler)
    {

        return calcularDias(alquiler) * valorModulo();

    }

}
