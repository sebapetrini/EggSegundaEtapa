

package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ParDeNumerosService {
    
    public void mostrarValores(ParDeNumeros n){
        System.out.println("El primer número es: " + n.getNum1() + " El Segundo número es: "+ n.getNum2());
    }
    
    public void devolverMayor(ParDeNumeros n){
        if (n.getNum1() > n.getNum2())
            System.out.println("El mayor es el primer número ("+ n.getNum1() + "), ya que el segundo es: "+ n.getNum2());
        else if (n.getNum2() > n.getNum1())
          System.out.println("El mayor es el segundo número ("+ n.getNum2() + "), ya que el primero es: "+ n.getNum1());
        else
            System.out.println("Los número son iguales");
    }
    
    public void calcularPotencia(ParDeNumeros n){
        if (n.getNum1() > n.getNum2())
            System.out.println("La potencia del primer numero elevado a la del segundo es: " + Math.pow(Math.round(n.getNum1()), Math.round(n.getNum2())));
        else if (n.getNum2() > n.getNum1())
            System.out.println("La potencia del segundo numero elevado a la del primero es: " + Math.pow(Math.round(n.getNum2()), Math.round(n.getNum1())));
        else
            System.out.println("La potencia del primer numero elevado a la del segundo es (ya que los números son iguales): " + Math.pow(Math.round(n.getNum1()), Math.round(n.getNum2())));
    }
    public void calculaRaiz(ParDeNumeros n){
        if (n.getNum1() > n.getNum2())
            System.out.println("La Raiz cuadrada del segundo numero: " + Math.sqrt(Math.abs(n.getNum2())));
        else if (n.getNum2() > n.getNum1())
            System.out.println("La Raiz cuadrada del primer numero: " + Math.sqrt(Math.abs(n.getNum1())));
        else
            System.out.println("La Raiz cuadrada del primer numero (porque son iguales: " + Math.sqrt(Math.abs(n.getNum1())));
    }
}
