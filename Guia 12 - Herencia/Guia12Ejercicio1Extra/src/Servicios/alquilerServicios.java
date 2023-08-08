
package Servicios;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 */

public class alquilerServicios
{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler()
    {
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese número de documento: ");
        int dni = leer.nextInt();
        System.out.println("Ingrese la fecha de alquiler: ");
        System.out.print("Día: ");
        int dia;
        do {
            dia = leer.nextInt();
        } while (dia<1 || dia>31);
        System.out.print("Mes: ");
        int mes;
        do {
            mes = leer.nextInt();
        } while (mes<1 || mes>12);
        System.out.print("Año: ");
        int anio;
        do {
            anio = leer.nextInt();
        } while (anio<1900 || anio>2023);
        Date fechaAlquiler = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Ingrese la fecha de devolucion: ");
        System.out.print("Día: ");
        do {
            dia = leer.nextInt();
        } while (dia<1 || dia>31);
        System.out.print("Mes: ");
        do {
            mes = leer.nextInt();
        } while (mes<1 || mes>12);
        System.out.print("Año: ");
        do {
            anio = leer.nextInt();
        } while (anio<1900 || anio>2023);
        Date fechaDevolucion = new Date(anio - 1900, mes - 1, dia);
        System.out.println("En que posicion se va a amarrar? ");
        int posicion = leer.nextInt();        
        System.out.println("Para que tipo de embarcación desea alquilar el espacio? ");
        System.out.println("1. Barco");
        System.out.println("2. Barco motor");
        System.out.println("3. Velero");
        System.out.println("4. Yate");
        int opcion;
        do {
            opcion = leer.nextInt();
        } while (opcion<1 || opcion > 4);
        Alquiler alquiler = new Alquiler(nombre, dni, fechaAlquiler, fechaDevolucion, posicion, new Barco());
        switch (opcion) {
            case 1:
                {
                    BarcoService bS = new BarcoService();
                    alquiler.setBarco(bS.crearBarco());                  
                    break;
                }
            case 2:
                {
                    BarcoMotorService bS = new BarcoMotorService();
                    alquiler.setBarco(bS.crearBarcoMotor());
                    break;
                } 
            case 3:
                {
                    VeleroService bS = new VeleroService();
                    alquiler.setBarco(bS.crearVelero());
                    break;
                }
            default:
                {
                    YateService bS = new YateService();
                    alquiler.setBarco(bS.crearYate());
                    break;
                }
        }
        return alquiler;
    }

    public int calcularDias(Alquiler alquiler)
    {
        return (int) ((alquiler.getFechaDevolucion().getTime() - alquiler.getFechaAlquiler().getTime())
                / 86400000);

        //1000ms*60s*60m*24h = 86.400.000 segun Cori
    }

    public double valorModulo(Alquiler alquiler)
    {
        double modulo = alquiler.getBarco().getEslora() * 10;

        if (alquiler.getBarco() instanceof Yate)
        {
            Yate y = (Yate) alquiler.getBarco();

            return modulo + y.getPotencia() + y.getCamarotes();

        } else if (alquiler.getBarco() instanceof BarcoMotor)
        {
            BarcoMotor bM = (BarcoMotor) alquiler.getBarco();

            return modulo + bM.getPotencia();

        } else if (alquiler.getBarco() instanceof Velero)
        {
            Velero v = (Velero) alquiler.getBarco();
            return modulo + v.getMastil();

        } else
        {
            return modulo;
        }
    }

    public double calcularAlquiler(Alquiler alquiler)
    {
        return calcularDias(alquiler) * valorModulo(alquiler);
    }

}
