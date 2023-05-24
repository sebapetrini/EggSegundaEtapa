/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Servicio.ArregloService;

/**
 *
 * @author Ayrton
 */
public class Ejercicio3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double[] A = new double[50];
        double[] B = new double[20];
        
        ArregloService s = new ArregloService();
        
        System.out.println("Iniciar A");
        s.inicializarA(A);
        System.out.println("Mostrar A");
        s.mostrarA(A);
        System.out.println("Ordenar A");
        s.OrdenarA(A);
        System.out.println("Mostrar A ordenado de mayor de menor");
        s.mostrarA(A);
        System.out.println("Inicializar B");
        s.InicializarB(A, B);
        System.out.println("Mostrar B");
        s.mostrarA(B);
        
        
        
        
        
    }

}
