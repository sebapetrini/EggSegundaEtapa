/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import java.util.Scanner;

/**
 * • Método crearLavadora (): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos el atributo propio de la lavadora.
 *
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en
 * $500, si la carga es menor o igual, no se incrementará el precio. Este método
 * debe llamar al método padre y añadir el código necesario. Recuerda que las
 * condiciones que hemos visto en la clase Electrodoméstico también deben
 * afectar al precio.
 */
public class servicioLava extends servicioElec
{

    //Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Lavadora crearLavadora()
    {
        System.out.println("Ingrese los datos de la Lavadora:");
        Electrodomestico n = crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga: ");
        double carga = leer.nextDouble();

        return new Lavadora(carga, n.getPrecio(), n.getColor(), n.getConsumoEnergetico(), n.getPeso());

    }

    //si tienen el mismo nombre hay que utilizar super.
    public void precioFinal(Lavadora n)
    {
        super.precioFinal(n);
        if (n.getCarga() > 30)
        {
            n.setPrecio(n.getPrecio() + 500);
        }

    }

    /*   public void precioFinalLavadora(Lavadora n)
    {
        precioFinal(n);
        if (n.getCarga() > 30)
        {
            n.setPrecio(n.getPrecio() + 500);
        }

    }*/
    public void mostrar(Lavadora n)
    {
        super.mostrar(n);
        System.out.println("Carga: " + n.getCarga());

    }
}
