/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia ՄArea=〖
π*radio〗^2Յ.
e) Método perimetro(): para calcular el perímetro
ՄPerimetro=2*π*radio).

 */
public class Guia7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero de radio: ");
        Circunferencia c = new Circunferencia(leer.nextDouble());
        
        System.out.println("El area de la circunferencia es: " + c.area());
        System.out.println("El perimetro de la circunferencia es: " + c.perimetro());        
    }    
}
       
    
    
    

