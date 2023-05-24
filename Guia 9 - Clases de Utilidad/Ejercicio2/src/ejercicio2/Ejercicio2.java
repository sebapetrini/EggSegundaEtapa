/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidad.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author Ayrton
 */
public class Ejercicio2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ParDeNumeros nums = new ParDeNumeros();

        ParDeNumerosService ns = new ParDeNumerosService();

        ns.MostrarValores(nums);

        System.out.println("El mayor es " + ns.devolverMayor(nums));
        
        System.out.println("La potencia entre el mayor numero y el menor es " + ns.calcularPotencia(nums));
        
        System.out.println("La raiz cuadrada del menor valor es "+ ns.calculaRaiz(nums));

    }

}
