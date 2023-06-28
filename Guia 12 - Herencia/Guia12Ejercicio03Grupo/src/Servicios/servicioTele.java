/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Electrodomestico;
import Entidad.Televisor;

/**
 *
 * @author Ayrton
 */
public class servicioTele extends servicioElec
{

    public Televisor crearTelevisor()
    {
        System.out.println("Ingrese los datos del Televisor:");
        Electrodomestico n = crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas: ");
        double resolucion = leer.nextDouble();
        String opcion;
        do
        {
            System.out.println("Tiene sintonizador TDT S/N");
            opcion = leer.next().toUpperCase().substring(0, 1);

        } while (!opcion.equals("S") || opcion.equals("N"));

        //opcion.equals("S") = si <opcion> es igual a "S", es VERDADERO siendo <opcion> de tipo String. De lo contrario es FALSO
        return new Televisor(resolucion, opcion.equals("S"), n.getPrecio(), n.getColor(), n.getConsumoEnergetico(), n.getPeso());

    }

    public void precioFinalTelevisor(Televisor n)
    {
        precioFinal(n);
        if (n.getResolucion() > 40)
        {
            n.setPrecio(n.getPrecio() * 1.3);

        }
        if (n.isSintonizadorTDT())
        {
            n.setPrecio(n.getPrecio() + 500);
        }

    }

    public void mostrar(Televisor n)
    {
        super.mostrar(n);
        System.out.println("Resolucion: ");
        System.out.println(n.getResolucion());
        System.out.println("Sintonizador TDT: " + n.isSintonizadorTDT());
    }

}
