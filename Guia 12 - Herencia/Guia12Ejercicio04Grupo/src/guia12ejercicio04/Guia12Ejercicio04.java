/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio04;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author Ayrton
 */
public class Guia12Ejercicio04
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Circulo c = new Circulo(50);
        Rectangulo r = new Rectangulo(30, 50);

        System.out.println("Area: " + c.calcularArea() + " Perimetro: " + c.calcularPerimetro());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Area: " + r.calcularArea() + " Perimetro: " + r.calcularPerimetro());

    }

}
