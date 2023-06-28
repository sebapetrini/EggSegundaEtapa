/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Electrodomestico;
import java.util.Scanner;

/**
 * • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
 * correcta, sino es correcta usara la letra F por defecto. Este método se debe
 * invocar al crear el objeto y no será visible.
 *
 * • Método comprobarColor(String color): comprueba que el color es correcto, y
 * si no lo es, usa el color blanco por defecto. Los colores disponibles para
 * los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
 * el objeto y no será visible.
 *
 *
 *
 * • Metodo crearElectrodomestico(): le pide la información al usuario y llena
 * el electrodoméstico, también llama los métodos para comprobar el color y el
 * consumo. Al precio se le da un valor base de $1000.
 *
 * • Método precioFinal(): según el consumo energético y su tamaño, aumentará el
 * valor del precio. Esta es la lista de precios:
 *
 * @author Ayrton
 */
public class servicioElec
{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String comprobarConsumoEnergetico(String consumoEnergetico)
    {

        switch (consumoEnergetico.toUpperCase())
        {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":

                return consumoEnergetico;
            default:
                return "F";
        }
    }

    public String comprobarColor(String color)
    {

        switch (color.toUpperCase())
        {
            case "BLANCO":
            case "NEGRO":
            case "ROJO":
            case "AZUL":
            case "GRIS":

                return color;
            default:
                return "BLANCO";
        }
    }

    public Electrodomestico crearElectrodomestico()
    {
        System.out.println("Ingrese el consumo energetico:");
        String consumo = leer.next();
        System.out.println("Ingrese el color:");
        String color = leer.next();
        System.out.println("Ingrese el peso: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese el precio: ");
        double precio = leer.nextDouble() + 1000;

        return new Electrodomestico(precio, comprobarColor(color), comprobarConsumoEnergetico(consumo), peso);

    }

    public void precioFinal(Electrodomestico n)
    {
        if (n.getPeso() >= 1 & n.getPeso() <= 19)
        {
            n.setPrecio(n.getPrecio() + 100);
        }
        if (n.getPeso() >= 20 & n.getPeso() <= 49)
        {
            n.setPrecio(n.getPrecio() + 500);
        }
        if (n.getPeso() >= 50 & n.getPeso() <= 79)
        {
            n.setPrecio(n.getPrecio() + 800);
        }
        if (n.getPeso() >= 80)
        {
            n.setPrecio(n.getPrecio() + 1000);
        }

        switch (n.getConsumoEnergetico().toUpperCase())
        {
            case "A":

                n.setPrecio(n.getPrecio() + 1000);
                break;

            case "B":
                n.setPrecio(n.getPrecio() + 800);
                break;

            case "C":
                n.setPrecio(n.getPrecio() + 600);
                break;
            case "D":
                n.setPrecio(n.getPrecio() + 500);
                break;
            case "E":
                n.setPrecio(n.getPrecio() + 300);
                break;
            case "F":
                n.setPrecio(n.getPrecio() + 100);
                break;

        }

    }

    public void mostrar(Electrodomestico n)
    {
        System.out.println("Precio: " + n.getPrecio());
        System.out.println("Peso: " + n.getPeso());
        System.out.println("Color: " + n.getColor());
        System.out.println("Consumo energetico" + n.getConsumoEnergetico());
    }

}
