/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicios.servicioLava;
import Servicios.servicioTele;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayrton
 */
public class Guia12Ejercicio02
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Electrodomestico> lista = new ArrayList();

        servicioLava servicioLavadora = new servicioLava();
        servicioTele servicioTelevisor = new servicioTele();
        int opcion;
        double pTotal = 0d;
        double pTotalT = 0d;
        double pTotalL = 0d;

        do
        {
            System.out.println("Que electrodomestico desea ingresar a la lista?");
            System.out.println("1. Lavadora");
            System.out.println("2. Televisor");
            System.out.println("3. Salir");
            opcion = leer.nextInt();

            switch (opcion)
            {
                case 1:

                    lista.add(servicioLavadora.crearLavadora());

                    break;

                case 2:

                    lista.add(servicioTelevisor.crearTelevisor());
                    break;

            }

        } while (opcion != 3);

        for (Electrodomestico elec : lista)
        {
            if (elec instanceof Televisor)
            {
                servicioTelevisor.precioFinalTelevisor((Televisor) elec);
                servicioTelevisor.mostrar(elec);
                pTotalT += elec.getPrecio();
                pTotal += elec.getPrecio();

            }
            if (elec instanceof Lavadora)
            {

                servicioLavadora.precioFinal(elec);
                servicioLavadora.mostrar(elec);
                pTotalL += elec.getPrecio();
                pTotal += elec.getPrecio();

            }

        }
        
        System.out.println("Precio Total:" + pTotal);
        System.out.println("Precio Total:" + pTotalL);
        System.out.println("Precio Total:" + pTotalT);

    }

}
