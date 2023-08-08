/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Potencia en CV para barcos a motor.
 *
 * @author Ayrton
 */
public class BarcoMotor extends Barco
{

    protected double potencia;

    public BarcoMotor()
    {
    }

    public BarcoMotor(double potencia, String matricula, double eslora, int fabricado)
    {
        super(matricula, eslora, fabricado);
        this.potencia = potencia;
    }

    public double getPotencia()
    {
        return potencia;
    }

    public void setPotencia(double potencia)
    {
        this.potencia = potencia;
    }

    @Override
    public String toString()
    {
        return "BarcoMotor{" + "potencia=" + potencia + '}';
    }

    @Override
    public Barco crearBarco()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();

        System.out.println("Ingrese la potencia del barco motor:");

        this.setPotencia(leer.nextInt());

        return new BarcoMotor(this.getPotencia(), super.getMatricula(), super.getEslora(), super.getFabricado());

    }

    @Override
    public double calcularAlquiler(Alquiler alquiler)
    {

        BarcoMotor bM = (BarcoMotor) alquiler.getBarco();
        System.out.println("Potencia: " + bM.getPotencia());
        return super.calcularAlquiler(alquiler) + bM.getPotencia() * 10; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularDias(Alquiler alquiler)
    {
        return super.calcularDias(alquiler); //To change body of generated methods, choose Tools | Templates.
    }

}
