/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.ParDeNumeros;

/**
 *
 * @author Ayrton
 */
public class ParDeNumerosService
{

    public void MostrarValores(ParDeNumeros nums)
    {
        //Método mostrarValores que muestra cuáles son los dos números guardados.
        System.out.println(nums.getNum1() + " " + nums.getNum2());

    }

    public double devolverMayor(ParDeNumeros nums)
    {
        //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

        return Math.max(nums.getNum1(), nums.getNum2());
    }

    public double calcularPotencia(ParDeNumeros nums)
    {
        //Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.

        /*Math.round(Math.max(nums.getNum1(), nums.getNum2())) Aca se redondea el valor maximo entre 
        los atributos y se utiliza por segunda vez para redondear el minimo*/
        return Math.pow(Math.round(Math.max(nums.getNum1(), nums.getNum2())), Math.round(Math.min(nums.getNum1(), nums.getNum2())));

    }

    public double calculaRaiz(ParDeNumeros nums)
    {

        //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
        return Math.sqrt(Math.abs(Math.min(nums.getNum1(), nums.getNum2())));

    }

}
