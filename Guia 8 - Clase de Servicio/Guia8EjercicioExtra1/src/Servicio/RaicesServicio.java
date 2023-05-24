/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
* 
 * 
 * @author soporte
 */
public class RaicesServicio {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public Raices cargarRaices(){
        System.out.print("Ingrese el coeficiente A:");
        double a = Leer.nextDouble();
        System.out.print("Ingrese el coeficiente B:");
        double b = Leer.nextDouble();
        System.out.print("Ingrese el coeficiente C:");
        double c = Leer.nextDouble();
        return new Raices(a,b,c);
    }
    /*
    a) Método getDiscriminante(): devuelve el valor del discriminante
    (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    */
    public double getDiscriminante(Raices r){
        return (Math.pow(r.getCoeficienteB(),2)-4*r.getCoeficienteA()*r.getCoeficienteC());        
    }
    /*
    b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
    soluciones, para que esto ocurra, el discriminante debe ser mayor o
    igual que 0.
    */
    public boolean tieneRaices(Raices r){
        return (getDiscriminante(r)>0);        //return (getDiscriminante(r)>=0);
    }
    /*
    c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
    única solución, para que esto ocurra, el discriminante debe ser igual
    que 0.
    */
    public boolean tieneRaiz(Raices r){
        return (getDiscriminante(r)==0);        
    }
    /*
    d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
    imprime las 2 posibles soluciones.
    */
    public void obtenerRaices(Raices r){
        if (tieneRaices(r)){
            System.out.println("La Raiz 1 es: " + ((-r.getCoeficienteB() + Math.sqrt(getDiscriminante(r))) / 2*r.getCoeficienteA()));
            System.out.println("La Raiz 2 es: " + ((-r.getCoeficienteB() - Math.sqrt(getDiscriminante(r)))/ 2*r.getCoeficienteA()));
        }else
            System.out.println("No tiene raices!!!");   
    }
    /*
    e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
    una única raíz. Es en el caso en que se tenga una única solución
    posible.
    */
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r))
            System.out.println("La única Raiz es: " + (-r.getCoeficienteB() / 2*r.getCoeficienteA()));
        else
            System.out.println("No tiene raices o no tiene una sola solución!!!");
    }
    /*
    f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
    y mostrará por pantalla las posibles soluciones que tiene nuestra
    ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    que devuelvan nuestros métodos y en caso de no existir solución, se
    mostrará un mensaje.
    */
    public void calcular(Raices r){
        if (tieneRaiz(r))
            obtenerRaiz(r);
        else if (tieneRaices(r))
            obtenerRaices(r);
        else
            System.out.println("No Existe solucion posible....");        
    }
}
