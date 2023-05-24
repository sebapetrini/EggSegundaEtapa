/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author Ayrton
 */
public class ArregloService
{

    public void inicializarA(double[] A)
    {

        for (int i = 0; i < A.length; i++)
        {
            A[i] = Math.random() * 100;
        }

    }

    public void mostrarA(double[] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            System.out.println(A[i]);
        }

    }

    public void OrdenarA(double[] A)
    {
        Arrays.sort(A);
        double[] aux = new double[A.length];

        for (int i = 0; i < A.length; i++)
        {
            aux[i] = A[(A.length - 1) - i];
        }
        System.arraycopy(aux, 0, A, 0, A.length);

    }

    public void InicializarB(double[] A, double[] B)
    {
        //Arraycopy (Vector de origen, a partir de posicion, Arreglo2, Desde, Cantidad de elementos)
        System.arraycopy(A, 0, B, 0, 10);

        //Arrays fill(Arreglo, desde posicion, hasta posicion, valor a agregar)
        Arrays.fill(B, 10, 20, 0.5);

    }

}
