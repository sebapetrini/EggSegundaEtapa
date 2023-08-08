/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ayrton
 */
public class alquilerServicios
{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler()
    {

        Barco barco = new Barco();
        Barco barco1 = new BarcoMotor();
        Barco barco2 = new Velero();
        Barco barco3 = new Yate();

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese n documento: ");
        int dni = leer.nextInt();
        System.out.println("Ingrese la fecha de alquiler: ");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Date fechaAlquiler = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Ingrese la fecha de devolucion: ");
        int diaDev = leer.nextInt();
        int mesDev = leer.nextInt();
        int anioDev = leer.nextInt();
        Date fechaDevolucion = new Date(anioDev - 1900, mesDev - 1, diaDev);
        System.out.println("En que posicion se encuentra? ");
        int posicion = leer.nextInt();
        System.out.println("Que tipo de barco desea alquilar? ");
        System.out.println("1. Barco");
        System.out.println("2. Barco motor");
        System.out.println("3. Velero");
        System.out.println("4. Yate digo");

        int opcion = leer.nextInt();
        switch (opcion)
        {
            case 1:

                barco.crearBarco();

                break;

            case 2:

                barco = barco1.crearBarco();

                break;

            case 3:

                barco = barco2.crearBarco();

                break;

            case 4:

                barco = barco3.crearBarco();

                break;
            default:
                throw new AssertionError();
        }

        return new Alquiler(nombre, dni, fechaAlquiler, fechaDevolucion, posicion, barco);

    }

    public int calcularDias(Alquiler alquiler)
    {
        return (int) ((alquiler.getFechaDevolucion().getTime() - alquiler.getFechaAlquiler().getTime())
                / 86400000);

        //1000ms*60s*60m*24h = 86.400.000 segun Cori
    }

    /* public double valorModulo(Alquiler alquiler)
    {
        double modulo = alquiler.getBarco().getEslora() * 10;

        if (alquiler.getBarco() instanceof Yate)
        {
            System.out.println("Yate");
            Yate y = (Yate) alquiler.getBarco();

            return modulo + y.getPotencia() + y.getCamarotes();

        } else if (alquiler.getBarco() instanceof BarcoMotor)
        {
            System.out.println("Barco Motor");
            BarcoMotor bM = (BarcoMotor) alquiler.getBarco();

            return modulo + bM.getPotencia();

        } else if (alquiler.getBarco() instanceof Velero)
        {
            System.out.println("Velero");
            Velero v = (Velero) alquiler.getBarco();

            System.out.println(v.calcularAlquiler(alquiler));
            return v.calcularAlquiler(alquiler);

        } else
        {

            System.out.println("Barco");

            return modulo;
        }
    }*/
    public double calcularAlquiler(Alquiler alquiler)
    {
        double modulo = alquiler.getBarco().getEslora() * 10;

        if (alquiler.getBarco() instanceof Yate)
        {
            System.out.println("Yate");
            Yate y = (Yate) alquiler.getBarco();

            return y.calcularAlquiler(alquiler);

        } else if (alquiler.getBarco() instanceof BarcoMotor)
        {
            System.out.println("Barco Motor");
            BarcoMotor bM = (BarcoMotor) alquiler.getBarco();

            return bM.calcularAlquiler(alquiler);

        } else if (alquiler.getBarco() instanceof Velero)
        {
            System.out.println("Velero");
            Velero v = (Velero) alquiler.getBarco();

            System.out.println(v.calcularAlquiler(alquiler));
            return v.calcularAlquiler(alquiler);

        } else
        {

            System.out.println("Barco");

            return modulo;
        }

    }

}
